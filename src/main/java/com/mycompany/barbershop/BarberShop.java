/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.barbershop;

import com.mycompany.barbershop.Model.Cliente;
import com.mycompany.barbershop.Model.Servico;
import com.mycompany.barbershop.Model.Usuario;

/**
 *
 * @author gustavo
 */
public class BarberShop {

    public static void main(String[] args) {
        String nome = "Roberto";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "Barba", 25);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Roberto", 'M', "1140028922", "Rua Paulo Coelho, 33");
        System.out.println(cliente);
        
        Usuario usuario = new Usuario(1, "Barbeiro", "senha");
        System.out.println(usuario);
    }
}
