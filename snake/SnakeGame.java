package org.snake;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    public SnakeGame() {
    // The initScreen method creates a new ScreenPanel.     
        initScreen();
    }
    
    private void initScreen() {
        
        add(new ScreenPanel());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
    	// Creates a new thread so our GUI can process itself
        EventQueue.invokeLater(() -> {
            JFrame frame = new SnakeGame();
            frame.setVisible(true);
        });
    }
}
