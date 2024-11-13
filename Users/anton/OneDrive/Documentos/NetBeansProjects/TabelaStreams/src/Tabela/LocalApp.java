/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
package Tabela;

import java.util.List;

public class LocalApp {
    public static void main ( String[] args ) {

        List<Pessoas> pessoa = new Pessoas().listaPessoas();
        pessoa.forEach(Pessoas -> System.out.println(Pessoas));
        
        System.out.println("@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@");
        
        pessoa.stream().filter(Pessoas -> Pessoas.getSexo().equals("Feminino"))
                .forEach(System.out::println);

    }
}
