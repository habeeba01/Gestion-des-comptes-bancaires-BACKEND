package com.test.test.Service;

import com.test.test.Model.AdminModel;
import com.test.test.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository ;
    //
    public AdminModel findByUsernameAndPassword(String username , String password){
            return adminRepository.findByUsernameAndPassword(username, password);
    }
    //
    public AdminModel save(AdminModel adminModel){
        return adminRepository.save(adminModel);
    }
}
