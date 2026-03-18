/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barbershop;

import com.mycompany.barbershop.View.Login;

/**
 *
 * @author gustavo
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void fizTarefa() {
        System.out.println("Busquei algo do banco de dados!");
        this.view.exibeMensagem("Executei o fiz tarefa!");
    }
    
}
