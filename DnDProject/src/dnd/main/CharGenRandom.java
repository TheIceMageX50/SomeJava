package dnd.main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CharGenRandom 
{
	private static void addComponentsToPane(Container pane) 
	{
		pane.setLayout(new GridBagLayout()) ;
		
		GridBagConstraints c = new GridBagConstraints() ;
		c.fill = GridBagConstraints.HORIZONTAL ;
		
		JLabel label = new JLabel("Character Name:") ;
		c.gridx = 0;
		c.ipadx = 30 ;
		c.gridy = 0 ;
		c.ipady = 5 ;
		pane.add(label,c) ;
		
		JTextField text = new JTextField() ;
		c.gridx = 1;
		c.gridy = 0 ;
		text.setPreferredSize(new Dimension(100,20)) ;
		pane.add(text,c) ;
		
		label = new JLabel("Level:") ;
		c.gridx = 0;
		c.gridy = 1 ;
		pane.add(label,c) ;
		
		JTextField text2 = new JTextField() ;
		c.gridx = 1;
		c.gridy = 1 ;
		text.setPreferredSize(new Dimension(100,20)) ;
		pane.add(text2,c) ;
		
		label = new JLabel("Race:") ;
		c.gridx = 0;
		c.gridy = 2 ;
		pane.add(label,c) ;
		
		String[] races = {"Human", "Dwarf", "Elf", "Gnome", "Half-Elf", "Half-Orc", "Halfling"} ;
		JComboBox raceList = new JComboBox(races) ;
		c.gridx = 1 ;
		c.gridy = 2 ;
		pane.add(raceList,c) ;
		
		label = new JLabel("Class:") ;
		c.gridx = 0 ;
		c.gridy = 3 ;
		pane.add(label,c) ;
		
		String[] classes = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Ranger", "Rogue", 
							"Paladin", "Sorcerer", "Wizard"} ;
		JComboBox classList = new JComboBox(classes) ;
		c.gridx = 1 ;
		c.gridy = 3 ;
		pane.add(classList,c) ;
		
		label = new JLabel("Size:") ;
		c.gridx = 0 ;
		c.gridy = 4 ;
		pane.add(label,c) ;
		
		String[] sizes = {"Diminutive", "Tiny", "Small", "Medium", "Large", "Huge", "Colossal", "Gargantuan"} ;
		JComboBox sizeList = new JComboBox(sizes) ;
		c.gridx = 1 ;
		c.gridy = 4 ;
		pane.add(sizeList,c) ;
		
		label = new JLabel("Unarmoured:") ;
		c.gridx = 0 ;
		c.gridy = 5 ;
		pane.add(label,c) ;
		
		JCheckBox box1 = new JCheckBox() ;
		c.gridx = 1 ;
		c.gridy = 5 ;
		pane.add(box1,c) ;
		
		label = new JLabel("Unarmed:") ;
		c.gridx = 0 ;
		c.gridy = 6 ;
		pane.add(label,c) ;
		
		JCheckBox box2 = new JCheckBox() ;
		c.gridx = 1 ;
		c.gridy = 6 ;
		pane.add(box2,c) ;
		
		JButton button = new JButton("Cancel") ;
		c.gridx = 0 ;
		c.gridy = 7 ;
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0) ;
			}
			
		}) ;
		pane.add(button,c) ;
		
		button = new JButton("Generate") ;
		c.gridx = 1 ;
		c.gridy = 7 ;
		pane.add(button,c) ;
	}
	
	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Random Character");
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
