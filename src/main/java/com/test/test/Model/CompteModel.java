package com.test.test.Model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
public class CompteModel implements Serializable {
   // @Id @GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid", strategy = "uuid")
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeCompte;
    @Column
    private double solde;
    @OneToOne
    @JoinColumn(name="code")
    private ClientModel client;
    @Column @OneToMany @JoinColumn(name="numero")
    private List<OperationModel> operations;

    public CompteModel(double solde, ClientModel client, List<OperationModel> operations) {
       // this.id = id;
        this.solde = solde;
        this.client = client;
        this.operations = operations;
    }

    public CompteModel() {
    }

    public Long getCodeCompte() {
        return codeCompte;
    }

    public void setCodeCompte(Long codeCompte) {
        this.codeCompte = codeCompte;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Collection<OperationModel> getOperations() {
        return operations;
    }

    public void setOperations(List<OperationModel> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "CompteModel{" +
                "id=" + codeCompte +
                ", solde=" + solde +
                ", operations=" + operations +
                '}';
    }

}
