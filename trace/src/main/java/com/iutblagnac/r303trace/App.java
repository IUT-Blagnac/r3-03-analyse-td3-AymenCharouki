package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
	
	/**
	 * La fonction main qui appelle les méthodes de App
	 * 
	 * @param args
	 * 
	 */
    public static void main( String[] args )
    {
        System.out.println(hello());
        System.out.println(hello("Aymen Charouki TP3"));
    }
    
    /**
     * La version non paramètré de la méthode hello()
     * 
     * @return String contenant toujours la chaine de charactères : Hello World!
     * 
     */

    public static String hello() {
        return  "Hello World!" ;
    }

    /**
     * La version paramètré de la méthode hello()
     * 
     * @param param la chaine de caractères qu'on veut affiché
     * 
     * @return la chaine de caractère passé en paramètres
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
