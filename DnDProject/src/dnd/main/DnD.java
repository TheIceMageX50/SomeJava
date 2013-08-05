package dnd.main;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DnD 
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    static boolean isCharGen1Open = false ;
    

    public static void addComponentsToPane(Container pane) {
       JLabel label;
       JButton button ;
    	
    	if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }       

        label = new JLabel("Stats table");
        

        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label, c);

        button = new JButton("Player 1");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 1;
        c.gridy = 0;
        button.addActionListener(new ActionListener() //Start of code for  Player1 button ActionListener
        {

        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        		if(isCharGen1Open == false) {
        			CharGenInit.main(null) ;
        			isCharGen1Open = true ;  
        		}
        	}
        	
        }
        ) ; //End of code [...]
        pane.add(button, c);

        button = new JButton("Player 2");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("Player 3");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 3;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("Player 4");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 4;
        c.gridy = 0;
        pane.add(button, c);
        
        // ---------------------------------------------------------------------------------
        
        button = new JButton("Hitpoints");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("Hp: 100");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("Hp: 100");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("Hp: 100");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 3;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("Hp: 100");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 4;
        c.gridy = 1;
        pane.add(button, c);

        // ---------------------------------------------------------------------------------
        
        button = new JButton("AC");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(button, c);

        button = new JButton("AC: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(button, c);

        button = new JButton("AC: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(button, c);

        button = new JButton("AC: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 3;
        c.gridy = 2;
        pane.add(button, c);

        button = new JButton("AC: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 4;
        c.gridy = 2;
        pane.add(button, c);
        
        // ---------------------------------------------------------------------------------

        button = new JButton("Size");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(button, c);

        button = new JButton("Size: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(button, c);

        button = new JButton("Size: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 2;
        c.gridy = 3;
        pane.add(button, c);

        button = new JButton("Size: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 3;
        c.gridy = 3;
        pane.add(button, c);

        button = new JButton("Size: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 4;
        c.gridy = 3;
        pane.add(button, c);
        
        // ---------------------------------------------------------------------------------
        
        button = new JButton("Class");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(button, c);

        button = new JButton("Class: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 1;
        c.gridy = 4;
        pane.add(button, c);

        button = new JButton("Class: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 2;
        c.gridy = 4;
        pane.add(button, c);

        button = new JButton("Class: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 3;
        c.gridy = 4;
        pane.add(button, c);

        button = new JButton("Class: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 4;
        c.gridy = 4;
        pane.add(button, c);
        
        // ---------------------------------------------------------------------------------
        
        button = new JButton("Alignment");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 0;
        c.gridy = 5;
        pane.add(button, c);

        button = new JButton("Alignment: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 1;
        c.gridy = 5;
        pane.add(button, c);

        button = new JButton("Alignment: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 2;
        c.gridy = 5;
        pane.add(button, c);

        button = new JButton("Alignment: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 3;
        c.gridy = 5;
        pane.add(button, c);

        button = new JButton("Alignment: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 4;
        c.gridy = 5;
        pane.add(button, c);
        
        // ---------------------------------------------------------------------------------
        
        button = new JButton("Race");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 0;
        c.gridy = 6;
        pane.add(button, c);

        button = new JButton("Race: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 1;
        c.gridy = 6;
        pane.add(button, c);

        button = new JButton("Race: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 2;
        c.gridy = 6;
        pane.add(button, c);

        button = new JButton("Race: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 3;
        c.gridy = 6;
        pane.add(button, c);

        button = new JButton("Race: ?");
        c.weightx = 0.2;
        c.weighty =  1 / 7 ;
        c.gridx = 4;
        c.gridy = 6;
        pane.add(button, c);

        /*
        button = new JButton("Long-Named Button 4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button, c);
         */

        /*
        button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        pane.add(button, c);
         */
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("DnDGrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
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