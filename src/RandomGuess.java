import javax.swing.*;

public class RandomGuess {

    public static void main (String[] args) {
//        System.out.println("Hello World");
        JOptionPane.showMessageDialog( null, "This number is " + (1+(int)(Math.random()*10)));
    }
}
