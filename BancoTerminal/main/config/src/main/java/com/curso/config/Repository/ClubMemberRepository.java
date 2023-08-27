package com.curso.config.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.config.Model.ClubMember;

public interface ClubMemberRepository extends JpaRepository<ClubMember,Integer> {
    
}
