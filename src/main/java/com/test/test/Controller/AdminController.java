package com.test.test.Controller;

import com.test.test.Model.AdminModel;
import com.test.test.Model.ClientModel;
import com.test.test.Model.CompteModel;
import com.test.test.Service.AdminService;
import com.test.test.Service.ClientService;
import com.test.test.Service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService ;
    @Autowired
    private ClientService clientService;
    @Autowired
    private CompteService compteService ;

    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/username/{username}/password/{password}")
    public int findByUsernameAndPassword(@PathVariable String username ,@PathVariable String password){
       if(username.equals("admin") && password.equals("admin")) {
           adminService.findByUsernameAndPassword(username, password);
           return 1;
       }else
           return 0;
    }
    //add admin
    @PostMapping("/save")
    public AdminModel save(@RequestBody AdminModel adminModel){
        return adminService.save(adminModel);
    }
    //add client
    @PostMapping("/addclient")
    public ClientModel save(@RequestBody ClientModel clientModel) {
        return clientService.save(clientModel);
    }
    //add client
    @PostMapping("/addcompte")
    public CompteModel save(@RequestBody CompteModel compteModel) {
        return compteService.save(compteModel);
    }
    //update a client
   /* @PutMapping("/update")
    public ClientModel update(@RequestBody ClientModel clientModel) {
        return clientService.update(clientModel);
    }*/
    //supprimer un client by his code
   @DeleteMapping("/{code}")
    public Long deleteById(@PathVariable Long code){
        return clientService.deleteById(code);
    }
    //afficher tous les clients
    @GetMapping("/display")
    public List<ClientModel> findAll() {
        return clientService.findAll();
    }
}
