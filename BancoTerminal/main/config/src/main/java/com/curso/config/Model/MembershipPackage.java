package com.curso.config.Model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MembershipPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Tipo_de_pacote")
    private Pacote packageName;
    @Column(name = "Valor_do_pacote", precision = 13, scale = 2)
    private BigDecimal packageValue;
    @Column(name = "beneficios")
    private String benefits;

    public Long getId() {
        return id;
    }

    public Pacote getPackageName() {
        return packageName;
    }

    public void setPackageName(Pacote packageName) {
        this.packageName = packageName;
    }

    public BigDecimal getPackageValue() {
        return packageValue;
    }

    public void setPackageValue(BigDecimal packageValue) {
        this.packageValue = packageValue;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

}
