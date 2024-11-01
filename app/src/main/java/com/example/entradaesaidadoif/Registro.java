package com.example.entradaesaidadoif;

import java.util.ArrayList;
import java.util.*;
import android.widget.*;

public class Registro {

    private String nome;
    private String cpf;
    private Date data;

    private static list<Registro> listaRegistro = new ArrayList<>();

    public static void cadastrar(String nome, String cpf){
        Registro reg = new Registro();
        reg.setNome(nome);
        reg.setCpf(cpf);
        reg.getData(new Date());
        listaRegistro.add(reg);
    }//cadastrar

    public static void limparTudo(){
        listaRegistro = new ArrayList<>()
    }//limpaTudo



    /////////////////Get e set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public static list<Registro> getListaRegistro() {
        return listaRegistro;
    }

    public static void setListaRegistro(list<Registro> listaRegistro) {
        Registro.listaRegistro = listaRegistro;
    }
}//class
