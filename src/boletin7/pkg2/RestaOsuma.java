
package boletin7.pkg2;

import javax.swing.JOptionPane;

public class RestaOsuma {
    public short num1;
    public short num2;
    
    public void RestOsuma(){
        }
    
    public void RestOsuma(short n1,short n2){
        this.num1=n1;
        this.num2=n2;
    }
      public short pedirDato(){
        String respuesta = JOptionPane.showInputDialog("Introduce dato");
        short b = Short.parseShort(respuesta);
        return b;
    }
      public void comparacion (short num1, short num2){
        if (num1>=num2){
            
            JOptionPane.showMessageDialog(null, "1º-2º= " + (num1-num2));
        }
        else{
            JOptionPane.showMessageDialog(null, "1º+2º= " + (num1+num2));
            }
        }
      }


        

