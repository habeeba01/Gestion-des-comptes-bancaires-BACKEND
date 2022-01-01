package com.test.test.Service;

import com.test.test.Model.CompteModel;
import com.test.test.Model.OperationModel;
import org.springframework.data.domain.Page;

public interface BanqueService {
    //
   void versement(Long code , double montant);
    //
    void retrait(Long code , double montant);
    //
    void virement(Long code1, Long code2, double montant);
    //consulter
    CompteModel check(Long code);
    //
    Page<OperationModel> list(Long codeCompte, int page, int size);
}
