package org.example.abc.controller;

import org.example.abc.common.Result;
import org.example.abc.enity.Client;
import org.example.abc.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@CrossOrigin(origins = "http://localhost:5173")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/client/getAllClientsBasicInformation")
    public Result getAllClientsBasicInformation(){
        System.out.println("123");
        List<Client> clients = clientService.getAllClientBasicInformation();
        return Result.success(clients);
    }
}
