package com.company.controllers;

import com.company.entities.Stone;
import com.company.repositories.interfaces.IUserRepository;

import java.util.List;

public class UserController {
    private final IUserRepository repo;

    public UserController(IUserRepository repo) {
        this.repo = repo;
    }

    public String createUser(String name, String surname, String gender) {
        boolean male = (gender.toLowerCase().equals("male"));
        Stone user = new Stone(Stone_name, price_in_gr);

        boolean created = repo.createUser(user);

        return (created ? "User was created!" : "User creation was failed!");
    }

    public String getUser(int id) {
        Stone user = repo.getStone(id);

        return (user == null ? "User was not found!" : user.toString());
    }

    public String getAllUsers() {
        List<Stone> users = repo.getAllStones();

        return users.toString();
    }
}