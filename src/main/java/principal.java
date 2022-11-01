import javax.swing.*;

public class principal {
    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new RegistroUsuario();
                frame.setSize(500,500);
                frame.setVisible(true);

            }
        });
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            JFrame frame = new Ingreso();
            frame.setSize(700,700);
            frame.setVisible(true);

        }
    });

    }
}
