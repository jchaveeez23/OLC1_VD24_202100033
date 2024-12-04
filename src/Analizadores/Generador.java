/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores;

/**
 *
 * @author cokei
 */
public class Generador {
    public static void main(String[] args) {

        try {
            String ruta = "src/Analizadores/";
            String[] opcFlex = {ruta + "lexer.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            //String[] opcCUP = {"-destdir", ruta, "-parser", "parser", ruta + "parser.cup"};
            //java_cup.Main.main(opcCUP);       
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
