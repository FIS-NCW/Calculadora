
package calculadoramodelos;

import javax.swing.JOptionPane;


public class Calculadora {
    
    private double ans;
    
    public Calculadora(){
        this.ans=0;
    }
    
    public double suma(double a, double b){
        ans= (a+b);
        return ans;
    }
    public double resta(double a, double b){
        ans= (a-b);
        return ans;
    }
    public double multiplicacion(double a, double b){
        ans= (a*b);
        return ans;
    }
    public double division(double a, double b){
        if(b!=0){
          ans= (a/b); 
          return ans;
        }else{
            JOptionPane.showMessageDialog(null, "No se puede divir por cero.");
            return Double.POSITIVE_INFINITY;
        }
        
        
    }

    public double getAns() {
        return ans;
    }

    public void setAns(double ans) {
        this.ans = ans;
    }
    
    
}
