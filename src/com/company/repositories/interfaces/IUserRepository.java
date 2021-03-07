package com.company.repositories.interfaces;

import com.company.entities.Stone;

import java.util.List;

public interface IUserRepository {
    boolean createUser(Stone stone);
    Stone getStone(int id);
    List<Stone> getAllStones();
}