package com.jfboily.demoboot.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BatchService {

    @Scheduled(cron = "* * * * * *")
    public void supprimeVieuxClient() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("SUPP VIEUX CLIENTS");
    }
}

