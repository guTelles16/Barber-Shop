/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barbershop.Controller;

import com.mycompany.barbershop.Controller.Helper.LoginHelper;
import com.mycompany.barbershop.Model.Usuario;
import com.mycompany.barbershop.View.Login;

/**
 *
 * @author gustavo
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema() {
        // Obtém o Usuario da View
        Usuario usuario = helper.obterModelo();
        
        // Pesquisa o Usuario no banco de dados
        // Se usuário e senha for o mesmo que o guardado no banco de dados, direciona para o Menu Principal
        // Se não, mostra uma mensagem de invalidez ao usuário.
    }
    
    public void fizTarefa() {
        System.out.println("Busquei algo do banco de dados!");
        this.view.exibeMensagem("Executei o fiz tarefa!");
    }
    
}
