import javax.swing.JOptionPane;
import java.util.Scanner;

class myJOptionPaneClass
{
    public static void main(String[]args){
       double num1, num2, numSum;
       String num1Str, num2Str, numSumStr;
       
       num1Str = JOptionPane.showInputDialog("Enter a number : ");
       num1 = Double.parseDouble(num1Str);
       
       num2Str = JOptionPane.showInputDialog(" Enter a second number: ");
       num2 = Double.parseDouble(num2Str);
       
       numSum = num1 + num2;
       numSumStr = "Number Sum = " +numSum;
       JOptionPane.showMessageDialog( null, numSumStr, "Number Sum", JOptionPane.INFORMATION_MESSAGE);
    }
}
