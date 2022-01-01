package com.test.test.Repository;

import com.test.test.Model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel,Integer> {
    //login
    AdminModel findByUsernameAndPassword(String username , String password);
    //save
    AdminModel save(AdminModel adminModel);
}
