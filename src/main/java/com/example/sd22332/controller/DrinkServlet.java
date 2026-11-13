package com.example.sd22332.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.sd22332.model.Drink;
import com.example.sd22332.repository.DrinkRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "DrinkServletServlet", value = "/drink/hien-thi")
public class DrinkServlet extends HttpServlet {

    DrinkRepo drinkRepo = new DrinkRepo();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Drink> drinks = drinkRepo.getDrinks();
        request.setAttribute("listDrink", drinks);
        request.getRequestDispatcher("/drink.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}