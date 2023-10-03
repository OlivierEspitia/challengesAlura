package principal;

import javax.swing.JOptionPane;
import conversorMonedas.function;


public class Principal {
    public static void main (String[] args) {

        function currency = new function();
    
        while(true) {

            String optionSelected = (JOptionPane.showInputDialog(null, "Pick a conversion type:", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Pick one")).toString();

            switch(optionSelected) {
            case "Conversor de Moneda":
                String userInput = JOptionPane.showInputDialog("Enter amount to convert: ");
                if(ValidarNumero(userInput)) {
                    double userAmount = Double.parseDouble(userInput);
                    currency.ConvertirMonedas(userAmount);

                    int userResponse = JOptionPane.showConfirmDialog(null,"Want to convert again?");
                    if (JOptionPane.OK_OPTION == userResponse){
                        System.out.println("You chose YES");
                    } else {
                        JOptionPane.showMessageDialog(null, "Exiting program");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid value");
                }
                break;
            }
        }
    }
           
    public static boolean ValidarNumero(String userInput) {
        try {
            double userNumber = Double.parseDouble(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
