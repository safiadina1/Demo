package pkgclass.demo;
    import javax.swing.*;

public class ClassDemo {
    private static float getFloatInput(String message) {
        return Float.parseFloat(JOptionPane.showInputDialog(message));
    }
    private static void calculator() {
        float firstNumber = getFloatInput("Please enter the first number");
        String operation = JOptionPane.showInputDialog("Please enter the operation");
        float secondNumber = getFloatInput("Please enter the second number");

        float result = 0;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;

            case "-":
                result = firstNumber - secondNumber;
                break;

            case "/":
                result = firstNumber / secondNumber;
                break;

            case "*":
                result = firstNumber * secondNumber;
                break;

            default:
                JOptionPane.showMessageDialog(null, "Wrong operation!!!");
                System.exit(0);
        }

        String message = firstNumber + " " + operation + " " + secondNumber + " = " + result;
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        try {
            calculator();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong Operation!!!");
        }
    }
}

    
    

