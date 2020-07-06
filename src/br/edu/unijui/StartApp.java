package br.edu.unijui;

import java.util.ArrayList;
import java.util.Locale;

public class StartApp {

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        System.out.println(Locale.getDefault());
    }
    
}
