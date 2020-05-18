package com.practica1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import javax.swing.*;

import java.util.Scanner;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class Cuenta 
{

    private int clv_usuario;
    private String nombre_usuario;
    private String pass_usuario;
    private String tipo_usuario;
    private int idCarrera;
    private int nivel_ads;
    private String contrato; 

    public Cuenta(int clv_usuario,String nombre_usuario,String pass_usuario,String tipo_usuario,int idCarrera,int nivel_ads,String contrato){

        this.clv_usuario = clv_usuario;
        this.nombre_usuario = nombre_usuario;
        this.pass_usuario = pass_usuario;
        this.tipo_usuario = tipo_usuario;
        this.idCarrera = idCarrera;
        this.nivel_ads = nivel_ads;
        this.contrato = contrato;
    }

    public int getClv_usuario() {
        return clv_usuario;
    }

    public void setClv_usuario(int clv_usuario) {
        this.clv_usuario = clv_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuarioo(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera= idCarrera;
    }

    public int getNivel_ads() {
        return nivel_ads;
    }

    public void setNivel_ads(int nivel_ads) {
        this.nivel_ads= nivel_ads;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }







}
