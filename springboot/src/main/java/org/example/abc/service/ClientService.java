package org.example.abc.service;

import org.example.abc.Repository.ClientRepository;
import org.example.abc.enity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    //新增客户基本信息
    public Client addClientBasicInformation(Client client) {
        return clientRepository.save(client);
    }

    //获取全部客户基本信息
    public List<Client> getAllClientBasicInformation() {
        return clientRepository.findAll();
    }


}
