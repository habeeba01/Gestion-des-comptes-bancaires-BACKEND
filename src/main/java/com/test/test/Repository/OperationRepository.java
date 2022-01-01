package com.test.test.Repository;
import com.test.test.Model.OperationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<OperationModel,Long> {
  @Query("Select o from OperationModel o where o.compteModel.codeCompte = :x order by o.dateOperation DESC")
  Page<OperationModel> list(@Param("x") Long codeCompte, Pageable pageable);
}
