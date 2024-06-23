import javax.swing.*;

public class YesNoQuestionsApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Yes/No Questions Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setVisible(true);

            int response1 = JOptionPane.showConfirmDialog(frame, "Do you like programming?",
                    "Question 1", JOptionPane.YES_NO_OPTION);
            int response2 = JOptionPane.showConfirmDialog(frame, "Do you like Java?",
                    "Question 2", JOptionPane.YES_NO_OPTION);

            String resultMessage = getString(response1, response2);

            JOptionPane.showMessageDialog(frame, resultMessage);
        });
    }

    private static String getString(int response1, int response2) {
        String resultMessage;
        if (response1 == JOptionPane.YES_OPTION && response2 == JOptionPane.YES_OPTION) {
            resultMessage = "Great! You like both programming and Java!";
        } else if (response1 == JOptionPane.YES_OPTION && response2 == JOptionPane.NO_OPTION) {
            resultMessage = "You like programming but not Java!";
        } else if (response1 == JOptionPane.NO_OPTION && response2 == JOptionPane.YES_OPTION) {
            resultMessage = "You like Java but not programming!";
        } else {
            resultMessage = "You don't like programming or Java!";
        }
        return resultMessage;
    }
}
