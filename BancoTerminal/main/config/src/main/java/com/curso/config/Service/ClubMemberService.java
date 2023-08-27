package com.curso.config.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.config.Repository.ClubMemberRepository;

@Service
public class ClubMemberService {
    @Autowired
    private ClubMemberRepository clubMemberRepository;

    

}
