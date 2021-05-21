package findtheunknown;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


//this class was made to display the game but haven't developed yet.


public  class DisplayGUI {

          //panels and displays for image
           JFrame window;
           Container con;
           JPanel picturePanel;
           JLabel pictureLabel;
           ImageIcon image;


    public static void main(String[] args) {

        new DisplayGUI();

    }

    public DisplayGUI() {

       //sizes and displacements
        window = new JFrame();
        //Exit on X
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //FULL SCREEN
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //window.setUndecorated(true);

        //background color
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        con = window.getContentPane();

        picturePanel = new JPanel();
        //size and placement x is horizontal and y is vertical
        picturePanel.setBounds(10,10,500,300);
        //background color
        picturePanel.setBackground(Color.lightGray);
        //adding panel
        con.add(picturePanel);


        pictureLabel = new JLabel();

        //getting the image from Images directory
        image = new ImageIcon(".Images/ftu.png");

        //calling the Image method
        pictureLabel.setIcon(image);
        picturePanel.add(pictureLabel);


        window.setVisible(true);
    }
}