package com.test.test.Repository;
import com.test.test.Model.CompteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<CompteModel, Long> {
    //add
    CompteModel save(CompteModel compteModel);
}
