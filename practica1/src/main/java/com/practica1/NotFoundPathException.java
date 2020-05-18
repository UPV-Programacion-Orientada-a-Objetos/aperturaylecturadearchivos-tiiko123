package com.practica1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class NotFoundPathException extends Exception
{
    public NotFoundPathException() {
        super();
    }

    public NotFoundPathException(String s) {
        super(s);
    }
}
