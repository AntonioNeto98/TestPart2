/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tabela;

import java.util.List;

/**
 *
 * @author anton
 */

public class Pessoas {

    

    private String Nome;


    private String Sexo;


    public Pessoas () {}

    public Pessoas (String Nome, String Sexo) {


        this.Nome = Nome;
        this.Sexo = Sexo;


    }


    public String getNome() {
        return this.Nome;
    }


    public void setNome(String Nome) {
        this.Nome = Nome;
    }


    public String getSexo() {
        return this.Sexo;
    }


    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }


    public List<Pessoas> listaPessoas () {


        Pessoas pessoa1 = new Pessoas ("Dexter", "Masculino");
        Pessoas pessoa2 = new Pessoas ("Roberto","Masculino");
        Pessoas pessoa3 = new Pessoas ("Ana","Feminino");
        Pessoas pessoa4 = new Pessoas ("Jessica","Feminino");
        Pessoas pessoa5 = new Pessoas ("Sabrina","Feminino");
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5);


    }

    @Override
    public String toString() {
        return "" + "Nome=" + Nome + ", Sexo=" + Sexo + '.';
    }

}