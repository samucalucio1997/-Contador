package com.curso.config.Controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.curso.config.Model.ClubMember;
import com.curso.config.Service.ClubMemberIS;

@RestController
@RequestMapping("/club")
public class ClubController {

    @Autowired
    private AuthenticationManager AuthenticationManager;

    private ClubMemberIS clubMemberIS;

    public ClubController(ClubMemberIS clubMemberIS) {
        this.clubMemberIS = clubMemberIS;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClubMember> GetMember(@PathVariable Long id) {
        var resp = clubMemberIS.findById(id);
     return ResponseEntity.ok(resp);
    }
    @PostMapping
    public ResponseEntity<ClubMember> PostMember(@RequestBody ClubMember member){
        UsernamePasswordAuthenticationToken memberauth =  new UsernamePasswordAuthenticationToken(member.getName(), member.isPaymentStatus());
        Authentication authentication = (Authentication) this.AuthenticationManager.authenticate(memberauth);  
        
        var memberfinal = authentication.getRealm();
        var ClubMemberCreated = clubMemberIS.cadastrarAssociado(member);
           URI Location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
           .buildAndExpand(ClubMemberCreated.getId()).toUri();
           return ResponseEntity.created(Location).body(ClubMemberCreated);
    }

}
