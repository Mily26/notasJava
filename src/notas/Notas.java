/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milagros
 */
public class Notas {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> resultado = new ArrayList<Integer>();
        for(int i = 0; i < grades.size(); i++) {
            int actual = grades.get(i);
            int multiplo5 = (int) (Math.floor(actual/5) + 1) * 5;
            if(actual < 38){
                resultado.add(actual);
            } else if(multiplo5 - actual < 3) {
                resultado.add(multiplo5);
            } else {
                resultado.add(actual);
            }
            
        }
        return resultado;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> notas = new ArrayList<Integer>();
        notas.add(4);
        notas.add(73);
        notas.add(67);
        notas.add(38);
        notas.add(33);
        
        List<Integer> resultado = gradingStudents(notas);
        

    }
    
}
