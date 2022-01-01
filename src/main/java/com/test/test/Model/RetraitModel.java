package com.test.test.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
@DiscriminatorValue("R")
public class RetraitModel extends OperationModel implements Serializable {
    public RetraitModel(Date dateOperation, double montant, CompteModel c) {
        super(dateOperation, montant, c);
    }

    public RetraitModel() {
    }
}
