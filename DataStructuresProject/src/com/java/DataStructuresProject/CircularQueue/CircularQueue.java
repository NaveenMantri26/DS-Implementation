package com.java.DataStructuresProject.CircularQueue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CircularQueue {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
    int size;
    int[] Q ;
    int r=-1;
    int f=-1;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue window = new CircularQueue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CircularQueue() {
		initialize();
	}
	public JFrame getFrame() {
	    return frame;
	}

	 void Enqueue(int elem) {
	        if ((r + 1) % size == f) {
	        	JOptionPane.showMessageDialog(frame,"Insertion Not Possible As Queue Is Full");
	        } else {
	            if (r == -1 && f == -1) {
	                r = f = 0;
	            } else {
	                r = (r + 1) % size;
	            }
	            Q[r] = elem;
	            JOptionPane.showMessageDialog(frame,"Element " + elem + " Inserted Into The Queue");
	        }
	    }
	public void Dequeue()
	{
		if (r == -1 && f == -1) {
			JOptionPane.showMessageDialog(frame,"Queue Is Empty It Cannot Be Deleted");
        } else if (r == f) {
        	JOptionPane.showMessageDialog(frame,"Element deleted " + Q[f]);
            Q[f] = 0;
            r = f = -1;
        } else {
            JOptionPane.showMessageDialog(frame,"Element deleted " + Q[f]);
            Q[f] = 0;
            f = (f + 1) % size;
        }
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 633, 414);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JButton btnSize = new JButton("SIZE");
			btnSize.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean validInput=false;
					while(!validInput)
						{
						String input=JOptionPane.showInputDialog(frame,"Enter the size upto 20 ");
						 if(input == null)
						   {
							   break;
						   }
						try
						{
							size = Integer.parseInt(input);
							if(size>=1 && size<=20)
							{
							  textField.setText(Integer.toString(size));
							  validInput=true;
							}
							else
							{
								JOptionPane.showMessageDialog(frame,"Please enter a valid number below 20");
							}
						}
						catch(NumberFormatException ex)
						{
							JOptionPane.showMessageDialog(frame,"Please Enter Numeric value");
						}
					}
				}
			});
			btnSize.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnSize.setBounds(28, 69, 114, 40);
			frame.getContentPane().add(btnSize);
			
			JLabel lblDataStructure = new JLabel("QUEUE DATA STRUCTURE");
			lblDataStructure.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblDataStructure.setBounds(170, 10, 263, 40);
			frame.getContentPane().add(lblDataStructure);
			
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField.setColumns(10);
			textField.setBounds(184, 70, 239, 34);
			frame.getContentPane().add(textField);
			
			JButton create = new JButton("CREATE");
			create.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = textField.getText().trim();
					try
					{
						 size = Integer.parseInt(input);
						if(size>=1)
						{
							Q = new int[size];
							for(int i=0;i<=size-1;i++)
							{
								Q[i]=0;
							}
							JOptionPane.showMessageDialog(frame, "Queue with size " + size + " got created");
						}
						else
						{
							JOptionPane.showMessageDialog(frame, "Please enter a valid number");
						}
					}catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog(frame, "Please enter a numeric size first!");
					}
				}
			});
			create.setFont(new Font("Tahoma", Font.BOLD, 20));
			create.setBounds(460, 67, 124, 40);
			frame.getContentPane().add(create);
			
			JButton element = new JButton("ELEMENT");
			element.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean validInput = false;
					while(!validInput)
					{
						String input = JOptionPane.showInputDialog(frame,"Enter The Element");
					try
					{
		                if(input == null)
		                {
		                	break;
		                }
		                int num=Integer.parseInt(input);
		                if(num>=0)
		                {
		                	textField_1.setText(input);
							validInput = true;
		                }
//		                else
//		                {
//		                	JOptionPane.showMessageDialog(frame,"Please Enter A Valid number");
//		                }
					}
					catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog(frame, " Please Enter The Numeric Value");
					}
				}
				}
			});
			element.setFont(new Font("Tahoma", Font.BOLD, 20));
			element.setBounds(21, 136, 127, 40);
			frame.getContentPane().add(element);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_1.setColumns(10);
			textField_1.setBounds(159, 138, 290, 34);
			frame.getContentPane().add(textField_1);
			
			JButton btnEnqueue = new JButton("ENQUEUE");
			btnEnqueue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input= textField_1.getText().trim();
					int elem = Integer.parseInt(input);
					Enqueue(elem);
				}
			});
			btnEnqueue.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnEnqueue.setBounds(471, 136, 135, 40);
			frame.getContentPane().add(btnEnqueue);
			
			JButton btnDequeue = new JButton("DEQUEUE");
			btnDequeue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Dequeue();
				}
			});
			btnDequeue.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDequeue.setBounds(221, 201, 135, 40);
			frame.getContentPane().add(btnDequeue);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_2.setColumns(10);
			textField_2.setBounds(27, 275, 415, 34);
			frame.getContentPane().add(textField_2);
			
			JButton display = new JButton("DISPLAY");
			display.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        if (r == -1 && f == -1) {
			            JOptionPane.showMessageDialog(frame, "Queue is not yet created");
			            return;
			        }

			        StringBuilder result = new StringBuilder();
			        int i = f;
			        while (true) {
			            result.append(Q[i]).append(" ");

			            if (i == r) break; 
			            i = (i + 1) % size;
			        }

			        textField_2.setText(result.toString().trim());
			    }
			});
			display.setFont(new Font("Tahoma", Font.BOLD, 20));
			display.setBounds(468, 269, 124, 40);
			frame.getContentPane().add(display);
			
			JButton btnback = new JButton("Back");
			btnback.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					com.java.DataStructuresProject.HomePage.HomePage home = new com.java.DataStructuresProject.HomePage.HomePage();
					home.getFrame().setVisible(true);
				}
			});
			btnback.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnback.setBounds(228, 327, 124, 40);
			frame.getContentPane().add(btnback);
	}
}
