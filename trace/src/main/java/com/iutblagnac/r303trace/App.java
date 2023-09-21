package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
	
	/**
	 * La fonction main qui appelle les m�thodes de App
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
     * La version non param�tr� de la m�thode hello()
     * 
     * @return String contenant toujours la chaine de charact�res : Hello World!
     * 
     */

    public static String hello() {
        return  "Hello World!" ;
    }

    /**
     * La version param�tr� de la m�thode hello()
     * 
     * @param param la chaine de caract�res qu'on veut affich�
     * 
     * @return la chaine de caract�re pass� en param�tres
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
