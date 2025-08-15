package com.java.DataStructuresProject.Stack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	int[] s;
	int top=-1;
	int elem;
	int size;
	int num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack window = new Stack();
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
	public Stack() {
		initialize();
	}
	public JFrame getFrame() {
	    return frame;
	}
	
	public void push(int elem,int size)
	{
		if(top==size-1)
		{
			JOptionPane.showMessageDialog(frame,"Stack Is Full Push Not Happen");
		}
		else
		{
			top++;
			s[top]=elem;
			JOptionPane.showMessageDialog(frame,"Element "+elem+" Pushed To The Stack");
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			JOptionPane.showMessageDialog(frame,"Stack Is Empty Pop Not Happen");
		}
		else
		{
			JOptionPane.showMessageDialog(frame,"Element Deleted Is "+s[top]);
			s[top]=0;
			top--;
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
		
		JLabel lblStackDataStructure = new JLabel("STACK DATA STRUCTURE");
		lblStackDataStructure.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStackDataStructure.setBounds(174, 10, 263, 40);
		frame.getContentPane().add(lblStackDataStructure);
		
		JButton btnSize = new JButton("SIZE");
		btnSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validInput = false;
				while(!validInput)
				{
				   String input = JOptionPane.showInputDialog(frame,"Enter The value from(1 to 9):");
				   
				   if(input == null)
				   {
					   break;
				   }
				   try
				   {
					   size = Integer.parseInt(input);
					   if(size>=1&&size<=9)
					   {
						   textField.setText(Integer.toString(size));
						   validInput = true;
					   } else {
                           JOptionPane.showMessageDialog(frame, "Please enter a valid number between 1 and 9!");
                       }
				   }
				   catch(NumberFormatException ex)
				   {
					   JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a numeric value.");
				   }
				   
				}
			}
		});
		btnSize.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSize.setBounds(28, 69, 114, 40);
		frame.getContentPane().add(btnSize);
		
		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText().trim();
				try
				{
					 size = Integer.parseInt(input);
					if(size>=1&& size<=9)
					{
						s = new int[size];
						for(int i=0;i<=size-1;i++)
						{
							s[i]=0;
						}
						JOptionPane.showMessageDialog(frame, "Array with size " + size + " got created");
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "Please enter a valid number between 1 and 9!");
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
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(184, 70, 239, 34);
		frame.getContentPane().add(textField);
		JButton element = new JButton("ELEMENT");
		element.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean inputValid=false;
				while(!inputValid)
				{	
					String input=JOptionPane.showInputDialog(frame,"Enter The Value From [0 to 9]:");
		        try
		        {
					if(input==null)
					{
						break;
					}
					num = Integer.parseInt(input);
					if(num>=0)
					{
					  textField_1.setText(Integer.toString(num));
					  inputValid = true;
					   }
//					else 
//					  {
//                        JOptionPane.showMessageDialog(frame, "Please enter a valid number between 0 and 9!");
//                    }
		        }
		        catch(NumberFormatException ex)
		        {
		        	JOptionPane.showMessageDialog(frame,"Please Enter Numeric Value");
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
		textField_1.setBounds(159, 138, 317, 34);
		frame.getContentPane().add(textField_1);
		
		JButton Push = new JButton("PUSH");
		Push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1=Integer.parseInt(textField_1.getText().trim());
				int size1=Integer.parseInt(textField.getText().trim());
				push(number1,size1);
			}
				
		});
		Push.setFont(new Font("Tahoma", Font.BOLD, 20));
		Push.setBounds(493, 136, 113, 40);
		frame.getContentPane().add(Push);
		
		JButton delete = new JButton("POP");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pop();
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		delete.setBounds(221, 201, 124, 40);
		frame.getContentPane().add(delete);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(27, 275, 415, 34);
		frame.getContentPane().add(textField_2);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s ==null)
				{
					JOptionPane.showMessageDialog(frame,"Stack is not yet created");
					return;
				}
				StringBuilder result = new StringBuilder();
				for(int i=0;i<=s.length-1;i++)
				{
					result.append(s[i]).append(" ");
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
		btnback.setBounds(221, 327, 114, 40);
		frame.getContentPane().add(btnback);
	}
}
