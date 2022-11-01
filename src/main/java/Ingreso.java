import javax.swing.*;

public class Ingreso extends JFrame{

    private JPanel panel2;
    private JTextField textNombre;
    private JTextField textApellidos;
    private JTextField textMatricula;
    private JTextField textColorBicicleta;
    private JComboBox comboBox1TipoBici;
    private JTextField textHoraIngreso;
    private JButton ingresarButton;
    private JButton salirButton;

    public Ingreso(){
        super("Ingreso Bicicleta");
        setContentPane(panel2);
    }
}
