package com.learn2code2.Shopp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NameService {
    @Value("${name}")
    private String name;

    public NameService() {
    }

    @PostConstruct
    public void sayMyName()
    {
        System.out.println(name);
    }
}
