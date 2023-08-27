package com.curso.config.Service;

import java.util.List;

import com.curso.config.Model.ClubMember;

public interface ClubMemberIS {
    boolean cadastrarAssociado(ClubMember membro);

    boolean removerAssociado(Long id);

    List<ClubMember> ListarAssociados();

    boolean AtualizarPlano(Long id);/*id referente ao 
    
    associado que deseja atualizar seu plano
*/}
