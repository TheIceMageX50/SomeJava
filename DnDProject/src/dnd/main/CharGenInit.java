package dnd.main;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants ;

public class CharGenInit
{
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = false;
    final static boolean RIGHT_TO_LEFT = false;
    

    public static void addComponentsToPane(Container pane) {
       JLabel label;
       JButton button ;
       JTextField text ;
      
    	if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }
        
        label = new JLabel("Enter your character's name");
        
        //label.setPreferredSize(new Dimension(200, 20)) ;
        label.setHorizontalAlignment(SwingConstants.CENTER) ;
        
        //c.weighty = 1 ;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(label, c);
        
        text = new JTextField("") ;
        //text.setPreferredSize(new Dimension(200, 20)) ;
        //c.weighty = 1;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(text, c);
        
        button = new JButton("Random") ;
        //c.weighty = 0.25;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(button, c);
        
        button = new JButton("OK") ;
        //c.weighty = 0.25;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(button, c);
        
        button = new JButton("Load") ;
        //c.weighty = 0.25;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(button, c);
        
        button = new JButton("Cancel") ;
        //c.weighty = 0.25;
        c.gridx = 3;
        c.gridy = 2;
        pane.add(button, c);
    }
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Enter Character Name");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowListener()
		 {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		 } ) ;

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setSize(new Dimension(390,90)) ;
        frame.setVisible(true);
        frame.setResizable(false) ;
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}