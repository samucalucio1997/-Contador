package com.curso.config.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.config.Model.MembershipPackage;

public interface MembershipPackageRepository extends JpaRepository<MembershipPackage,Long>{
    
}
