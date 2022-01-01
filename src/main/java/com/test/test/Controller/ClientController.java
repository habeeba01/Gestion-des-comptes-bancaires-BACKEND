package com.test.test.Controller;

import com.test.test.Model.ClientModel;
import com.test.test.Model.OperationModel;
import com.test.test.Service.ClientService;
import com.test.test.Service.CompteService;
import com.test.test.Service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    private ClientService clientService ;
    @Autowired
    private OperationService operationService ;
    @Autowired
    private CompteService compteService ;

    @GetMapping ("/email/{email}/password/{password}")
    public int findByEmailAndPassword(@PathVariable String email , @PathVariable String password){
       ClientModel clientModel = new ClientModel() ;
        if(clientModel.getEmail().equals(email) && clientModel.getPassword().equals(password))
            //return clientService.findByEmailAndPassword(email, password);
            return 1 ;
        else
            return 0;
    }
   /* @GetMapping("/")
    public String check(Model model,String code , @RequestParam(name="page", defaultValue="0") int page,
                        @RequestParam(name="size", defaultValue="5") int size){
        model.addAttribute("codeDuCompte", code);
        try{
            CompteModel cp = operationService.check(code);
            model.addAttribute("compte", cp);
            Page<OperationModel> pageOperations= operationService.listOperation(code, page, size);
            model.addAttribute("listOperations", pageOperations.getContent());
            int[] pages = new int [pageOperations.getTotalPages()];
            model.addAttribute("pages",pages);
        } catch (Exception e) {
            model.addAttribute("exception",e);
        }
        return "compte";
    }*/
    //save
    @PostMapping("/typeOperation/{typeOperation}/codeCompte/{codeCompte}/montant/{montant}/codeCompte2/{codeCompte2}")
    public String save(@RequestBody @PathVariable String typeOperation,@PathVariable Long codeCompte,@PathVariable double montant,@PathVariable Long codeCompte2){
        switch (typeOperation) {
            case "V":
                operationService.versement(codeCompte, montant);
            case "R":
                operationService.retrait(codeCompte, montant);
            case "VIR":
                operationService.virement(codeCompte, codeCompte2, montant);
        }
        return "virement effectué";
    }
    //display
    @GetMapping("/display")
    public List<OperationModel> findAll() {
        return operationService.findAll();
    }
}
