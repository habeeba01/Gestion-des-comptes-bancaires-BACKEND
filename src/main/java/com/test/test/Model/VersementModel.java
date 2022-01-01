package com.test.test.Model;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;


@Entity
@DiscriminatorValue("V")
public class VersementModel extends OperationModel implements Serializable {
    public VersementModel(Date dateOperation, double montant, CompteModel c) {
        super(dateOperation, montant, c);
    }
    public VersementModel() {
    }
}
