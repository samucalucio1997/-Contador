package com.curso.config.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.config.Model.ClubMember;
import com.curso.config.Repository.ClubMemberRepository;

@Service
public class ClubMemberService implements ClubMemberIS{
    @Autowired
    private ClubMemberRepository clubMemberRepository;

    @Override
    public boolean cadastrarAssociado(ClubMember membro) {
        // TODO Auto-generated method stub
        if(!clubMemberRepository.existsById(membro.getId())){
            clubMemberRepository.save(membro);
            return true;
        }else{
             throw new IllegalArgumentException("the element already exist");
        }
        
    }

    @Override
    public boolean removerAssociado(Long id) {
        // TODO Auto-generated method stub
        if(clubMemberRepository.findById(id)!=null){
            clubMemberRepository.deleteById(id);
            return true;
        }else{
            throw new NoSuchElementException();
        }
     }

    @Override
    public List<ClubMember> ListarAssociados() {
         return clubMemberRepository.findAll();
    }

    @Override
    public boolean AtualizarPlano(Long id) {
        
        if(clubMemberRepository.findById(id)!=null){
             clubMemberRepository.save(clubMemberRepository.findById(id).orElseThrow());
             return true;
        }else{
          throw new NoSuchElementException();
        }
    }

    

}
