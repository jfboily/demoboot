package com.jfboily.demoboot.services;

import com.jfboily.demoboot.data.entities.Client;
import com.jfboily.demoboot.data.repos.ClientRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepo clientRepo;

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public List<Client> getAll() {
        return clientRepo.findAll();
    }

    public Client getById(Integer id) {
        return clientRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public Client create(Client client) {
        // validations
        if (client.getNaissance().isAfter(LocalDate.now())) {
            throw new RuntimeException("Bad date");
        }

        if (client.getNom().length() < 1) {
            throw new RuntimeException("Bad name");
        }

        return clientRepo.save(client);
    }
}
