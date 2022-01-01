package com.test.test.Model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OP",discriminatorType=DiscriminatorType.STRING,length=3)
public abstract class OperationModel implements Serializable {
    //attribut
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    protected  Long numero;
    @Column
    protected Date dateOperation;
    @Column
    protected double montant;
    @ManyToOne
    @JoinColumn(name="code")
    protected CompteModel compteModel;
    //


    public OperationModel(Date dateOperation, double montant, CompteModel compteModel) {
       // this.numero = numero;
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.compteModel = compteModel;
    }

    public OperationModel() {
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public CompteModel getCompteModel() {
        return compteModel;
    }

    public void setCompteModel(CompteModel compteModel) {
        this.compteModel = compteModel;
    }

    @Override
    public String toString() {
        return "OperationModel{" +
                "numero=" + numero +
                ", dateOperation=" + dateOperation +
                ", montant=" + montant +
                ", compteModel=" + compteModel +
                '}';
    }
}
