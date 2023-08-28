package com.curso.config.Controller;

import java.net.URI;

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
           var ClubMemberCreated = clubMemberIS.cadastrarAssociado(member);
           URI Location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
           .buildAndExpand(ClubMemberCreated.getId()).toUri();
           return ResponseEntity.created(Location).body(ClubMemberCreated);
    }

}
