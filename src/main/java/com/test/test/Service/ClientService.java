package com.test.test.Service;

import com.test.test.Model.ClientModel;
import com.test.test.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository ;

    //auth
    public ClientModel findByEmailAndPassword(String email , String password){
        return clientRepository.findByEmailAndPassword(email,password);
    }
    //add client
    public ClientModel save(ClientModel clientModel){
        return clientRepository.save(clientModel);
    }
    //modify client
   /*public ClientModel update(ClientModel clientModel) {
        ClientModel client=clientRepository.findById(clientModel.getCode()).orElse(null);
        clientModel.setCode(client.getCode());
        return clientRepository.save(clientModel);
    }*/
    //delete client
    public Long deleteById(Long code) {
        ClientModel clientModel=clientRepository.findById(code).orElse(null);
        clientRepository.delete(clientModel);
        return code;
    }
    //display all
    public List<ClientModel> findAll() {
        return clientRepository.findAll();
    }
}
