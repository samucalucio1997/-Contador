package com.curso.config.Service;

import java.util.List;
import java.util.Optional;

import com.curso.config.Model.ClubMember;

public interface ClubMemberIS {
    ClubMember cadastrarAssociado(ClubMember membro);

    boolean removerAssociado(Long id);  

    List<ClubMember> ListarAssociados();

    Optional<ClubMember> findClubMember(String name);

    ClubMember findById(Long id);

    boolean AtualizarPlano(Long id);/*id referente ao 
    
    associado que deseja atualizar seu plano
*/}
