package com.example.jwt.token.services;

import com.example.jwt.token.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User(UUID.randomUUID().toString(), "Soumik Roy", "soumik@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Adi Roy", "adi@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Immy Roy", "immy@gmail.com"));
    }

    public List<User> getList() {
        return list;
    }
}
