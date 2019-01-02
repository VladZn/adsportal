package ru.geekbrains.vlad.rest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.geekbrains.vlad.service.AdService;

import static org.junit.Assert.*;

/**
 * @author Vladislav Zinchenko
 * 27.12.2018
 */
public class AdRestControllerTest {

    @Autowired
    private AdService service;

    @Test
    public void getAll() {

    }

    @Test
    public void findById() {
        //Assert.assertEquals();
    }
}