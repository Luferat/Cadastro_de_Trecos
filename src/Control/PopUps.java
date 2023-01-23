package Control;

import javax.swing.JOptionPane;

public class PopUps {

    public static void showError(String error) {
        // Exibe caixa de diálogo com mensagem de erro        
        JOptionPane.showMessageDialog(
                null,
                "Ocorreram erros: \n\n" + error,
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

    public static int showConfirm(String title, String message) {

        // Texto dos botões do popup
        Object[] options = {"Sim", "Não"};

        // Cria caixa de diálogo popup
        int dialogButton = JOptionPane.showOptionDialog(
                null,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]
        );

        return dialogButton;

    }

}
