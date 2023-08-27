package com.curso.config.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MembershipPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Tipo_de_pacote")
    private String packageName;
    @Column(name = "Valor_do_pacote")
    private double packageValue;
    @Column(name = "beneficios")
    private String benefits;
    
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public double getPackageValue() {
        return packageValue;
    }

    public void setPackageValue(double packageValue) {
        this.packageValue = packageValue;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    
}
