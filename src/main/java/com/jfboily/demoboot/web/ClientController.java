package com.jfboily.demoboot.web;

import com.jfboily.demoboot.data.entities.Client;
import com.jfboily.demoboot.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Client> getAllClients() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @PostMapping("")
    public Client createClient(@RequestBody Client client) {
        return service.create(client);
    }
}
