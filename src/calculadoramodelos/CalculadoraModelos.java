package calculadoramodelos;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class CalculadoraModelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

        int opcion;
        double primerDigito;
        double segundoDigito;
        double resultado=0;
       
        do {
            primerDigito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer dígito."));
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la operación deseada."
                    + "\n 1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División"));
            segundoDigito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo dígito."));

            switch (opcion) {
                case 1:
                    resultado = miCalculadora.suma(primerDigito, segundoDigito);
                    miCalculadora.setAns(0);
                    break;
                case 2:
                    resultado = miCalculadora.resta(primerDigito, segundoDigito);
                    miCalculadora.setAns(0);
                    break;
                case 3:
                    resultado = miCalculadora.multiplicacion(primerDigito, segundoDigito);
                    miCalculadora.setAns(0);
                    break;
                case 4:
                    resultado = miCalculadora.division(primerDigito, segundoDigito);
                    miCalculadora.setAns(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
            
            JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);

        } while (opcion != 5);

    }

}
