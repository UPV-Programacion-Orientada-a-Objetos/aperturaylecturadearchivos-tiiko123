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
public class App 
{
    public static void main( String[] args )
    {

       
        Archivos archivos = new Archivos();
        archivos.cargarTxt();

        /*

        try{
            System.out.println("ola");
            File f = new File("plantilla.txt");
            BufferedReader bf = new BufferedReader(new FileReader(String.valueOf(f.getAbsolutePath().substring(0,f.getAbsolutePath().indexOf("plantilla"))+"src\\main\\resources\\Txt\\plantilla.txt")));
            String bfRead;
            while((bfRead = bf.readLine())!= null){
                System.out.println(bfRead);

            }
        }catch(FileNotFoundException e){
            System.out.println("nnose pudo");

        }catch(Exception e){
            System.out.println("oliiiii");
        }*/
    }
}
