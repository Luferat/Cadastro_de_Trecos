package Control;

import javax.swing.JOptionPane;

public class PopUps {

    public static void showError(String error) {
        // Exibe caixa de diálogo com mensagem de erro        
        JOptionPane.showMessageDialog(
                null,
                error,
                "Oooops!",
                JOptionPane.ERROR_MESSAGE
        );

        // Encerra o aplicativo
        System.exit(0);
    }

    public static void showAlert(String alert) {

        // Exibe caixa de diálogo com mensagem de erro        
        JOptionPane.showMessageDialog(
                null,
                alert,
                "Oooops!",
                JOptionPane.WARNING_MESSAGE
        );

    }

}