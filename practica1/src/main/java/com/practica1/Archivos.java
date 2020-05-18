package com.practica1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import javax.swing.*;
import java.awt.*;

import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Archivos 
{



    public void cargarTxt(){
            try{
            System.out.println("ola");
            File f = new File("plantilla.txt");
            BufferedReader bf = new BufferedReader(new FileReader(String.valueOf(f.getAbsolutePath().substring(0,f.getAbsolutePath().indexOf("plantilla"))+"src\\main\\resources\\Txt\\plantilla.txt")));
            String bfRead;
            while((bfRead = bf.readLine())!= null){
                System.out.println(bfRead);
            }
        }catch(FileNotFoundException e){//Error pro si no encuentra el archivo en la ruta
            System.out.println("Error al encontrar el archivo");
            cargarExcel();

        }catch(Exception e){//Error por si la ruta no coincide
            System.out.println("Error en la ruta");
            cargarExcel();
        }

    }

    public void cargarExcel(){
            String rutaArchivo = "C:\\Users\\fran1\\Desktop\\Practicas\\practica1\\pruebaExcel.xlsx";
            String hoja = "Hoja1";
            boolean primeraVuelta = false;;
    
            String prestamoConsulta="",disponibilidad="";

    
    
            File f = new File("pruebaExcel.xlsx");

            System.out.println(f.getAbsolutePath());

            try (FileInputStream file = new FileInputStream(new File(String.valueOf(f.getAbsolutePath())))) {
                // leer archivo excel
                XSSFWorkbook worbook = new XSSFWorkbook(file);
                //throw new NotFoundPathException("Sólo se pueden almacenar números pares");

                //obtener la hoja que se va leer
                XSSFSheet sheet = worbook.getSheetAt(0);
                //obtener todas las filas de la hoja excel
                Iterator<Row> rowIterator = sheet.iterator();
    
                Row row;
                // se recorre cada fila hasta el final
                
                while (rowIterator.hasNext()) {

                    if(primeraVuelta == false ){
                        row = rowIterator.next();
                        primeraVuelta = true;
                    }else{
                        row = rowIterator.next();

                    Iterator<Cell> cellIterator = row.cellIterator();
                    Cell cell;
                    while (cellIterator.hasNext()) {
                        cell = cellIterator.next();

                        try{
                            System.out.print("\t"+cell.getStringCellValue());
                        }catch(Exception e){
                    

                            System.out.print("\t"+cell.getNumericCellValue());

                        }
                        
                    }
                    System.out.println("\n");
                    } 
                }
    
                
            }catch(FileNotFoundException e){//Error pro si no encuentra el archivo en la ruta
                System.out.println("Error al encontrar el archivo");
                rutaManualTxT();
            } catch (Exception e) {
                System.out.println("Error al encontrar el archivo");
                rutaManualTxT();
               

            }
    }

    public void rutaManualTxT(){
        
        Scanner captura = new Scanner(System.in);
        System.out.println("Escribir la ruta del archivo txt");
        System.out.println("Ejemplo");
        System.out.println("C:\\Users\\fran1\\Desktop\\Practicas\\practica1\\prueba.txt");
        String obtenerRuta;
        obtenerRuta = captura.next();
        try{
        System.out.println(obtenerRuta);


        StringBuilder stringBuilder = new StringBuilder(obtenerRuta);
		// Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
		String invertida = stringBuilder.reverse().toString();
        System.out.println((invertida.substring(0,invertida.indexOf("\\"))).substring(0,invertida.indexOf(".")));

      
        stringBuilder = new StringBuilder((invertida.substring(0,invertida.indexOf("\\"))).substring(0,invertida.indexOf(".")));
        String correcta = stringBuilder.toString();
        System.out.println(correcta+"a");
        if(correcta.equals("txt")){
            System.out.println("iku");
        try{
            BufferedReader bf = new BufferedReader(new FileReader(obtenerRuta));
            String bfRead;
            while((bfRead = bf.readLine())!= null){
                System.out.println(bfRead);
            }
        }catch(FileNotFoundException e){//Error pro si no encuentra el archivo en la ruta
            System.out.println("Ruta incorrecta");


        }catch(Exception e){//Error por si la ruta no coincide
            System.out.println("Ruta incorrecta");


        }
    }else{
        rutaManualExcel(obtenerRuta);

    }
}catch(Exception e){
    System.out.println("Error al colocar la ruta");
}
    }

    public void rutaManualExcel(String obtenerRuta){
        boolean primeraVuelta = false;;
    
        String prestamoConsulta="",disponibilidad="";

        File f = new File("pruebaExcel2.xlsx");
        System.out.println("aaaaaaaaaaaaaaaa"+obtenerRuta);

        


        
        try (FileInputStream file = new FileInputStream(new File(obtenerRuta))) {
            // leer archivo excel
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            //throw new NotFoundPathException("Sólo se pueden almacenar números pares");

            //obtener la hoja que se va leer
            XSSFSheet sheet = worbook.getSheetAt(0);
            //obtener todas las filas de la hoja excel
            Iterator<Row> rowIterator = sheet.iterator();

            Row row;
            // se recorre cada fila hasta el final
            
            while (rowIterator.hasNext()) {

                if(primeraVuelta == false ){
                    row = rowIterator.next();
                    primeraVuelta = true;
                }else{
                    row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();
                Cell cell;
                while (cellIterator.hasNext()) {  
                     cell = cellIterator.next();

                    try{
                        System.out.print("\t"+cell.getStringCellValue());
                    }catch(Exception e){
                

                        System.out.print("\t"+cell.getNumericCellValue());

                    }
                }
                System.out.println("\n");
                } 
            }

            
        }catch(FileNotFoundException e){//Error pro si no encuentra el archivo en la ruta
            System.out.println("Error final jajasakskask q krazy");
            
        } catch (Exception e) {
            System.out.println("Error final jajasakskask q krazy");
           

        }
    }
}

