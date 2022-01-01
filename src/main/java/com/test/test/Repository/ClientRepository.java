package com.test.test.Repository;

import com.test.test.Model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {
    //find
   ClientModel findByEmailAndPassword(String email, String password);
    //add
   ClientModel save(ClientModel clientModel);
    //update
  //  ClientModel update(ClientModel clientModel);
    //delete
    void deleteById(Long id);
}
