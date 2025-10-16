import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe implements ActionListener {
    JFrame frame;
    JButton[] buttons = new JButton[9];
    JButton restart;
    JLabel status;
    int turn = 1; // 1 = X turn, 0 = O turn
    String X = "X";
    String O = "O";

    TicTacToe() {
        frame = new JFrame("Tic Tac Toe Game");
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create 9 buttons for the board
        int x = 100, y = 100;
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton(" ");
            buttons[i].setBounds(x, y, 60, 60);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 24));
            buttons[i].addActionListener(this);
            frame.add(buttons[i]);

            x += 70;
            if ((i + 1) % 3 == 0) {
                x = 100;
                y += 70;
            }
        }

        // Restart button
        restart = new JButton("Restart");
        restart.setBounds(140, 340, 120, 40);
        restart.addActionListener(this);
        frame.add(restart);

        // Status label
        status = new JLabel("Player X's Turn");
        status.setBounds(120, 30, 250, 40);
        status.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(status);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle restart button first
        if (e.getSource() == restart) {
            resetGame();
            return;
        }

        // Handle board clicks
        JButton clicked = (JButton) e.getSource();
        if (!clicked.getText().equals(" ")) return;

        // Set symbol based on turn
        if (turn % 2 != 0) {
            clicked.setText(X);
            status.setText("Player O's Turn");
        } else {
            clicked.setText(O);
            status.setText("Player X's Turn");
        }

        clicked.setEnabled(false);
        turn++;

        // Check winner after 5 moves
        if (turn >= 6) {
            if (checkWinner(X)) {
                status.setText("Player X Wins!");
                endGame();
                return;
            }
            if (checkWinner(O)) {
                status.setText("Player O Wins!");
                endGame();
                return;
            }
        }

        // If all cells filled and no winner → Draw
        if (turn > 9 && !checkWinner(X) && !checkWinner(O)) {
            status.setText("It's a Draw!");
            endGame();
        }
    }

    // Winner check logic
    boolean checkWinner(String player) {
        int[][] combos = {
            {0,1,2}, {3,4,5}, {6,7,8},   // rows
            {0,3,6}, {1,4,7}, {2,5,8},   // columns
            {0,4,8}, {2,4,6}             // diagonals
        };
        for (int[] c : combos) {
            if (buttons[c[0]].getText().equals(player) &&
                buttons[c[1]].getText().equals(player) &&
                buttons[c[2]].getText().equals(player)) {
                // Highlight winning buttons
                buttons[c[0]].setBackground(Color.GREEN);
                buttons[c[1]].setBackground(Color.GREEN);
                buttons[c[2]].setBackground(Color.GREEN);
                return true;
            }
        }
        return false;
    }

    // Disable all buttons after game ends
    void endGame() {
        for (JButton b : buttons) {
            b.setEnabled(false);
        }
    }
    
    // Reset game state
    void resetGame() {
        for (JButton b : buttons) {
            b.setText(" ");
            b.setEnabled(true);
            b.setBackground(null);
        }
        turn = 1;
        status.setText("Player X's Turn");
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
