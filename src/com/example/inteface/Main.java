package com.example.inteface;

import com.example.implementacion.CocheCRUDImpl;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
