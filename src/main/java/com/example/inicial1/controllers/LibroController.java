package com.example.inicial1.controllers;


import com.example.inicial1.entities.Libro;

import com.example.inicial1.services.LibroServiceImpl;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {

}
