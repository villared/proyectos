package com.test;

/**
 * Hello world!
 *
 */
public class HolaMundo 
{
    private String saludo = null;
	
	public HolaMundo(String saludo){
		setSaludo(saludo);
	}
    
    public static void main(String[] args)
    {
        System.out.println(new HolaMundo("Hola Mundo de Git y Maven!"));
    }
	
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
}//fin de class