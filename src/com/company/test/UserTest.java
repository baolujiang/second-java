package com.company.test;

import com.company.User;
import jdk.nashorn.internal.ir.annotations.Ignore;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        user=new User(1,"Bob");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        user=null;
    }

    @org.junit.jupiter.api.Test
    @Ignore
    void getId() {
        assertEquals(1,user.getId());
    }

    @org.junit.jupiter.api.Test
    void setId() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Bob", user.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void sayHello() {
    }
}