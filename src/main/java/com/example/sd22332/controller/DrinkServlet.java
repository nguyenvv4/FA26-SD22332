package com.example.sd22332.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.sd22332.model.Drink;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "DrinkServletServlet", value = "/drink/hien-thi")
public class DrinkServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink(1, "Coca", 10000, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Coca-Cola_logo.svg/2560px-Coca-Cola_logo.svg.png", "Nước ngọt có gas", 1, null));
        drinks.add(new Drink(2, "Pepsi", 10000, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Coca-Cola_logo.svg/2560px-Coca-Cola_logo.svg.png", "Nước ngọt có gas", 1, null));
        drinks.add(new Drink(3, "7up", 10000, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Coca-Cola_logo.svg/2560px-Coca-Cola_logo.svg.png", "Nước ngọt có gas", 1, null));
        request.setAttribute("listDrink",drinks);
        request.getRequestDispatcher("/drink.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}