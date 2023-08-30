package com.curso.config.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.curso.config.Model.ClubMember;
import com.curso.config.Repository.ClubMemberRepository;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private ClubMemberIS clubMemberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Optional<ClubMember> user = clubMemberRepository.findClubMember(username);
        return user.get();
        // throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }
    
}
