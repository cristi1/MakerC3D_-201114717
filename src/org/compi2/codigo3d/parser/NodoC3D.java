package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etqV;
    private String etqF;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String etqV, String etqF){
        this.etqV = etqV;
        this.etqF = etqF;
    }
    
    public NodoC3D(String etqV, String etqF, String temp){
        this.etqV = etqV;
        this.etqF = etqF;
        this.cad = temp;
    }
    
    public String getEtqV(){
        return etqV;
    }
    
    public String getEtqF(){
        return etqF;
    }
    
    public String getCad(){
        return cad;
    }
        
}
