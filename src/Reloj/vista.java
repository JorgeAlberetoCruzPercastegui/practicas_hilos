package Reloj;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author PERCASTEGUI
 */
public class vista extends JFrame{
    
    
    JTextField proceso,canguro,perro,gato;
    JButton iniciar;
    
    public vista ()
    {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setLayout(new AbsoluteLayout());
    this.setSize(400,200);
    this.setTitle("Carrera");
    menu();
    }
    
    public void menu()
    {
    canguro= new JTextField();
    canguro.setText("");
    this.getContentPane().add(canguro, new AbsoluteConstraints(20,40,60,80));
    
    perro= new JTextField();
    perro.setText("");
    this.getContentPane().add(perro, new AbsoluteConstraints(20,40,60,80));
    
    gato= new JTextField();
    gato.setText("");
    this.getContentPane().add(gato, new AbsoluteConstraints(20,40,60,80));
    
    iniciar = new JButton();
    iniciar.setText("Iniciar");
    this.getContentPane().add(iniciar, new AbsoluteConstraints(40,60,80,100));
    }
}
