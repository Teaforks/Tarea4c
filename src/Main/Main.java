package Main;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author teafo
 */
class Main extends JFrame{
    public Main(){
        JLabel lblSaludo = new JLabel("Hola Mundo.");
        JLabel lblSaludo2 = new JLabel("¿Qué tal estás?.");
        JLabel lblSaludo3 = new JLabel("¡Espero que bien! ¡Yo estoy genial!");
        add(lblSaludo);
        add(lblSaludo2);
        add(lblSaludo3);
        lblSaludo.setBounds(2,28,116,24);
        lblSaludo2.setBounds(2,50,116,24);
        lblSaludo3.setBounds(2,67,116,24);
        this.setSize(400,300);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        Main main=new Main();
    }  
}