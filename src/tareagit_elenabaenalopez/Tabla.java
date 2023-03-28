/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareagit_elenabaenalopez;

/**
 *
 * @author Elena Baena Lopez
 */
public class Tabla {

    private int num;

    public Tabla(int num) {
        this.num = num;
    }
    
    public int getNum(){
        return this.num;
    }
 
    public String tablaDeMultiplicar( ){
        StringBuilder tabla = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            int resultado = this.num*i;
            tabla.append(this.num +"*"+i+"="+resultado+"\n");
        }
        return tabla.toString();
    }

}
