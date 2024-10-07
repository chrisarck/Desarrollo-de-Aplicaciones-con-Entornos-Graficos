/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carosito;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author andra
 */
public class Carosito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mouse();
    }
    
    public static void mouse(){
        JFrame f = new JFrame();
        PanelClick c = new PanelClick();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(c);
        f.pack();
        f.setVisible(true);
    }
    
    public static void botonLabel(){
        JFrame fra = new JFrame();
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.setSize(500,500);
        Componentes l = new Componentes();
        fra.add(l);
        fra.pack();
        fra.setVisible(true);
    }
    
    
    public static void circuloDibujar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame x: ");
        double x = scan.nextDouble();
        System.out.println("Dame y: ");
        double y = scan.nextDouble();
        System.out.println("Dame el radio: ");
        double radio = scan.nextDouble();
        System.out.println("Dame cuantos: ");
        int cuantos = scan.nextInt();
        
        JFrame fra = new JFrame();
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.setSize(500,500);
        Lienzo l = new Lienzo(x, y, radio, cuantos);
        fra.add(l);
        fra.pack();
        fra.setVisible(true);
    }
    
    public static void tableroDibujar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame x: ");
        double x = scan.nextDouble();
        System.out.println("Dame y: ");
        double y = scan.nextDouble();
        System.out.println("Dame el lado: ");
        double lado = scan.nextDouble();
        System.out.println("Dame las filas: ");
        int filas = scan.nextInt();
        
        JFrame fra = new JFrame();
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.setSize(500,500);
        Lienzo l = new Lienzo(x, y, lado, filas);
        fra.add(l);
        fra.pack();
        fra.setVisible(true);
        
    }
    
}
