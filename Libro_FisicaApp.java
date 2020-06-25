/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro_fisicaapp;

/**
 *
 * @author FERNANDO PADILLA
 */
class Libro_Fisica{
    
    /* Atributos */
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
    
    /* Constructor */
    public Libro_Fisica(int pCodigo, String pTitulo, String pAutor, int pAnio_Edicion){
        codigo = pCodigo;
        titulo = pTitulo;
        autor = pAutor;
        anio_edicion = pAnio_Edicion;
    }
    
    /*Metodos */
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    
    public void setAnio_Edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    
    }
    public int getAnio_Edicion(){
        return anio_edicion;
    }
    
    @Override
    public String toString(){
        return "El codigo del libro es: "+codigo+" , con titulo: "+titulo+
                ", el autor del libro es: "+autor+" y el anio de edicion es: "
                +anio_edicion+".";
    }
}

public class Libro_FisicaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos
        Libro_Fisica libro1=new Libro_Fisica(123,"Curso de Física General ","Savéliev",1888);
        Libro_Fisica libro2=new Libro_Fisica(456,"Fisica Conceptual","Paul G. Hewitt", 1867);
        Libro_Fisica libro3=new Libro_Fisica(789,"Fisica para Ingenieria","Hnas Ohanian",1899);
        
        // Mostramos su estado 
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        
        //Modificamos el Atributo Anio_Edicion libro1
        libro1.setAnio_Edicion(1870);
        
        //Comparamos quien tiene mas antiguedad
        if (libro1.getAnio_Edicion()<libro2.getAnio_Edicion()){
            System.out.println(libro1.getTitulo()+" tiene mas años de antiguedad");
            }else{
            System.out.println(libro2.getTitulo()+" tiene mas años de antiguedad");
            
        }
    }
}
