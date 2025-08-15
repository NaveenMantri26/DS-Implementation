package com.java.DataStructuresProject.SingleLinkedList;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SingleLinkedList {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList window = new SingleLinkedList();
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
	public SingleLinkedList() {
		initialize();
	}
	
	public JFrame getFrame()
	{
		return frame;
	}
	
	class Node
    {
 	   int data;
 	   Node nl;
    }
    int size=0;
    static Node first = null;
    
    public void insertRear(int elem)
	    {
	       Node n = new Node();
	        n.data = elem;
	        n.nl = null;
	        if(first==null)
	        {
	            first=n;
	        }
	        else if(first.nl==null)
	        {
	            first.nl=n;
	        }
	        else{
	            Node temp=first;
	            while(temp.nl!=null)
	            {
	                temp=temp.nl;
	            }
	            temp.nl=n;
	        }
	        size++;
	    }
    
    public void insertFront(int elem)
	    {
	        Node n = new Node();
	        n.data = elem;
	        n.nl = null;
	        if(first==null)
	        {
	            first=n;
	        }
	        else{
	            n.nl=first;
	            first=n;
	        }
	        size++;
	    }
    
    public void insertAtPosition(int elem,int pos)
	    {
	    	if(pos<1||pos>size+1)
	    	{
	    		JOptionPane.showMessageDialog(frame,"Invalid Position");
	    		return;
	    	}
	    	if(pos==1)
	    	{
	    		insertFront(elem);
	    	}
	    	else if(pos==size+1)
	    	{
	    		insertRear(elem);
	    	}
	    	else
	    	{
	    		Node n = new Node();
	    		n.data=elem;
	    		n.nl=null;
	    		Node temp=first;
	    		for(int i=1;i<pos-1;i++)
	    		{
	    			temp=temp.nl;
	    		}
	    		n.nl=temp.nl;
	    	    temp.nl=n;
	    	    size++;
	    	}
	    }
    
    public void deleteAtPosition(int pos)
	    {
	    	if(pos<1||pos>size)
	    	{
	    		JOptionPane.showMessageDialog(frame,"Invalid Position");
	    		return;
	    	}
	    	if(pos==1)
	    	{
	    		deleteFront();
	    	}
	    	else if(pos==size)
	    	{
	    		deleteRear();
	    	}
	    	else
	    	{
	    		Node temp=first;
	    		for(int i=1;i<pos-1;i++)
	    		{
	    			temp=temp.nl;
	    		}
	    		temp.nl=temp.nl.nl;
	    		size--;
	    	}
	    }
    
    public void deleteRear()
	    {
	        if(first==null)
	        {
	        	JOptionPane.showMessageDialog(frame,"Deletion not possible");
	        }
	        else if(first.nl==null)
	        {
	        	JOptionPane.showMessageDialog(frame,"Element Deleted is"+first.data);
	        }
	        else
	        {
	            Node temp = first;
	            while(temp.nl.nl!=null)
	            {
	                temp=temp.nl;
	            }
	            JOptionPane.showMessageDialog(frame,"Element Deleted is "+temp.nl.data);
	            temp.nl.nl=null;
	            temp.nl=null;
	        }
	    }
    
    public void deleteFront()
	    {
	        if(first==null)
	        {
	        	JOptionPane.showMessageDialog(frame,"Deletion not possible");
	        }
	        else if(first.nl==null)
	        {
	        	JOptionPane.showMessageDialog(frame,"Element Deleted is"+first.data);
	        }
	        else{
	        	JOptionPane.showMessageDialog(frame,"Element Deleted is "+first.data);
	            first=first.nl;
	            
	        }
	    }
    
    public void displayForward()
	    {
	        if(first==null)
	        {
	        	JOptionPane.showMessageDialog(frame,"Display not possible");
	        }
	        else if(first.nl==null)
	        {
	        	textField_8.setText(Integer.toString(first.data));
	        }
	        else{
	            Node temp = first;
	            StringBuilder sb = new StringBuilder();
	            while(temp!=null)
	            {
	            	 sb.append(temp.data).append(" ");
	                temp=temp.nl;
	            }
	            textField_8.setText(sb.toString().trim());
	        }
	    }
	    public void displayReverse()
	    {
	         if(first==null)
	        {
	        	JOptionPane.showMessageDialog(frame,"Display not possible");
	        }
	        else if(first.nl==null)
	        {
	        	textField_9.setText(Integer.toString(first.data));
	        }
	        else{
	        	StringBuilder sb = new StringBuilder();
	            Node temp = first;
	            int count=0;
	            while(temp!=null)
	            {
	            	count++;
	                temp=temp.nl;
	            }
	            temp=first;
	            int i=count-1;
	            int arr[]=new int[count];
	            while(temp!=null)
	            {
	                arr[i]=temp.data;
	                i--;
	                temp = temp.nl;
	                
	            }
	            for (int val : arr) {
	                sb.append(val).append(" ");
	            }
	            textField_9.setText(sb.toString().trim());
	        }
	    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 662, 648);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblDoubleLinkedList = new JLabel("SINGLE LINKED LIST DATA STRUCTURE");
			lblDoubleLinkedList.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblDoubleLinkedList.setBounds(106, 22, 423, 40);
			frame.getContentPane().add(lblDoubleLinkedList);
			
			JButton btnInsertfront = new JButton("INSERTFRONT");
			btnInsertfront.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = textField.getText();
					int elem = Integer.parseInt(input);
					JOptionPane.showMessageDialog(frame, +elem+" is Inserted At Front");
					insertFront(elem);
				}
			});
			btnInsertfront.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnInsertfront.setBounds(403, 85, 178, 40);
			frame.getContentPane().add(btnInsertfront);
			
			JButton btnInsertrear = new JButton("INSERTREAR");
			btnInsertrear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = textField_1.getText();
					int elem = Integer.parseInt(input);
					JOptionPane.showMessageDialog(frame, +elem+" is Inserted At Rear");
					insertRear(elem);
				}
			});
			btnInsertrear.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnInsertrear.setBounds(403, 146, 178, 40);
			frame.getContentPane().add(btnInsertrear);
			
			JButton element = new JButton("ELEMENT");
			element.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog(frame, "Enter The Number To Insert");
				textField.setText(input);
				}
			});
			element.setFont(new Font("Tahoma", Font.BOLD, 20));
			element.setBounds(31, 85, 127, 40);
			frame.getContentPane().add(element);
			
			JButton element_1 = new JButton("ELEMENT");
			element_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = JOptionPane.showInputDialog(frame, "Enter The Number To Insert");
					textField_1.setText(input);
				}
			});
			element_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			element_1.setBounds(31, 145, 127, 40);
			frame.getContentPane().add(element_1);
			
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField.setColumns(10);
			textField.setBounds(168, 91, 219, 34);
			frame.getContentPane().add(textField);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_1.setColumns(10);
			textField_1.setBounds(168, 146, 219, 34);
			frame.getContentPane().add(textField_1);
			
			JButton element_2 = new JButton("ELEMENT");
			element_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = JOptionPane.showInputDialog(frame, "Enter The Number To Insert");
					textField_2.setText(input);
				}
			});
			element_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			element_2.setBounds(31, 211, 127, 40);
			frame.getContentPane().add(element_2);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_2.setColumns(10);
			textField_2.setBounds(168, 216, 85, 34);
			frame.getContentPane().add(textField_2);
			
			JButton position = new JButton("POS");
			position.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = JOptionPane.showInputDialog(frame, "Enter The Pos To Insert");
					textField_3.setText(input);
				}
			});
			position.setFont(new Font("Tahoma", Font.BOLD, 20));
			position.setBounds(263, 211, 83, 40);
			frame.getContentPane().add(position);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_3.setColumns(10);
			textField_3.setBounds(356, 217, 85, 34);
			frame.getContentPane().add(textField_3);
			
			JButton btnInsert = new JButton("INSERT");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = textField_2.getText();
					int elem = Integer.parseInt(input);
					String input2 = textField_3.getText();
					int pos = Integer.parseInt(input2);
					JOptionPane.showMessageDialog(frame, +elem+" is Inserted At Pos"+pos);
					insertAtPosition(elem,pos);
				}
			});
			btnInsert.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnInsert.setBounds(451, 211, 158, 40);
			frame.getContentPane().add(btnInsert);
			
			JButton btnDeletefront = new JButton("DELETEFRONT");
			btnDeletefront.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					deleteFront();
				}
			});
			btnDeletefront.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDeletefront.setBounds(89, 303, 178, 40);
			frame.getContentPane().add(btnDeletefront);
			
			JButton btnDeletefront_1 = new JButton("DELETEREAR");
			btnDeletefront_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					deleteRear();
				}
			});
			btnDeletefront_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDeletefront_1.setBounds(332, 303, 178, 40);
			frame.getContentPane().add(btnDeletefront_1);
			
			JButton position_1 = new JButton("POS");
			position_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = JOptionPane.showInputDialog(frame, "Enter The Position To Delete");
					textField_7.setText(input);
				}
			});
			position_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			position_1.setBounds(89, 397, 83, 40);
			frame.getContentPane().add(position_1);
			
			textField_7 = new JTextField();
			textField_7.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_7.setColumns(10);
			textField_7.setBounds(230, 402, 85, 34);
			frame.getContentPane().add(textField_7);
			
			JButton btnDelete = new JButton("DELETE");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = textField_7.getText();
					int pos = Integer.parseInt(input);
					JOptionPane.showMessageDialog(frame,"Element is Deleted At Pos "+pos);
					deleteAtPosition(pos);
				}
			});
			btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDelete.setBounds(371, 397, 158, 40);
			frame.getContentPane().add(btnDelete);
			
			textField_8 = new JTextField();
			textField_8.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_8.setColumns(10);
			textField_8.setBounds(26, 463, 381, 34);
			frame.getContentPane().add(textField_8);
			
			textField_9 = new JTextField();
			textField_9.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField_9.setColumns(10);
			textField_9.setBounds(26, 520, 381, 34);
			frame.getContentPane().add(textField_9);
			
			JButton btnback = new JButton("Back");
			btnback.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose(); 
					com.java.DataStructuresProject.HomePage.HomePage home = new com.java.DataStructuresProject.HomePage.HomePage();
					home.getFrame().setVisible(true);
				}
			});
			btnback.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnback.setBounds(263, 564, 114, 40);
			frame.getContentPane().add(btnback);
			
			JButton btnDisplayfrwd = new JButton("DISPLAYFRWD");
			btnDisplayfrwd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayForward();
				}
			});
			btnDisplayfrwd.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDisplayfrwd.setBounds(427, 463, 202, 40);
			frame.getContentPane().add(btnDisplayfrwd);
			
			JButton btnDisplayrev = new JButton("DISPLAYREV");
			btnDisplayrev.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayReverse();
				}
			});
			btnDisplayrev.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDisplayrev.setBounds(427, 515, 202, 40);
			frame.getContentPane().add(btnDisplayrev);
	}

}
