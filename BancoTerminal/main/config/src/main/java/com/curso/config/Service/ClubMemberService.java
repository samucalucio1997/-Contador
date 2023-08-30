package com.curso.config.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.config.Model.ClubMember;
import com.curso.config.Repository.ClubMemberRepository;

@Service
public class ClubMemberService implements ClubMemberIS{
    @Autowired
    private ClubMemberRepository clubMemberRepository;

    @Override
    public ClubMember cadastrarAssociado(ClubMember membro) {
        // TODO Auto-generated method stub
        if(!clubMemberRepository.existsById(membro.getId())){
            return 
            clubMemberRepository.save(membro);
        }else{
             throw new IllegalArgumentException("the element already exist");
        }
        
    }

    @Override
    public boolean removerAssociado(Long id) {
        // TODO Auto-generated method stub
        if(clubMemberRepository.existsById(id)){
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

    @Override
    public ClubMember findById(Long id) {
        
        if(clubMemberRepository.existsById(id)){
           
            return clubMemberRepository.findById(id).orElseThrow();
        }
         else{
        throw new IllegalArgumentException("Not exist this clubMember");
         }
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<ClubMember> findClubMember(String name) {
        // TODO Auto-generated method stub
        List<ClubMember> members = clubMemberRepository.findAll();
        Optional<ClubMember> membro = members.stream().filter(n -> n.getName().equals(name)).findFirst(); 
        return membro;
        // throw new UnsupportedOperationException("Unimplemented method 'findClubMember'");
    }

    

}
