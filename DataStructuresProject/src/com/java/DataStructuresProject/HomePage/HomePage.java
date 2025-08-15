package com.java.DataStructuresProject.HomePage;
import com.java.DataStructuresProject.Queue.Queue;
import com.java.DataStructuresProject.SingleLinkedList.SingleLinkedList;
import com.java.DataStructuresProject.Arrays.Arrays;
import com.java.DataStructuresProject.CircularQueue.CircularQueue;
import com.java.DataStructuresProject.DoubleLinkedList.DoubleLinkedList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
//import javax.swing.JPanel;
//import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.java.DataStructuresProject.Stack.Stack;
public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}
	public JFrame getFrame() {
	    return frame;
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(218, 10, 209, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays arrayWindow = new Arrays();
				arrayWindow.getFrame().setVisible(true);
			}
		});
		array.setFont(new Font("Tahoma", Font.BOLD, 18));
		array.setBounds(25, 60, 269, 60);
		frame.getContentPane().add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stack stackWindow = new Stack();
				stackWindow.getFrame().setVisible(true);
			}
		});
		stack.setFont(new Font("Tahoma", Font.BOLD, 18));
		stack.setBounds(336, 60, 264, 60);
		frame.getContentPane().add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Queue queuewindow = new Queue();
				queuewindow.getFrame().setVisible(true);
			}
		});
		queue.setFont(new Font("Tahoma", Font.BOLD, 18));
		queue.setBounds(30, 162, 264, 60);
		frame.getContentPane().add(queue);
		
		JButton circularqueue = new JButton("CIRCULAR QUEUE");
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CircularQueue CircularQueuewindow = new CircularQueue();
				CircularQueuewindow.getFrame().setVisible(true);
			}
		});
		circularqueue.setFont(new Font("Tahoma", Font.BOLD, 18));
		circularqueue.setBounds(336, 162, 264, 60);
		frame.getContentPane().add(circularqueue);
		
		JButton singlelinkedlist = new JButton("SINGLE LINKED LIST");
		singlelinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SingleLinkedList SingleLinkedListwindow = new SingleLinkedList();
				SingleLinkedListwindow.getFrame().setVisible(true);
			}
		});
		singlelinkedlist.setFont(new Font("Tahoma", Font.BOLD, 18));
		singlelinkedlist.setBounds(30, 272, 264, 60);
		frame.getContentPane().add(singlelinkedlist);
		
		JButton doublelinkedlist = new JButton("DOUBLE LINKED LIST");
		doublelinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoubleLinkedList DoubleLinkedListwindow = new DoubleLinkedList();
				DoubleLinkedListwindow.getFrame().setVisible(true);
			}
		});
		doublelinkedlist.setFont(new Font("Tahoma", Font.BOLD, 18));
		doublelinkedlist.setBounds(336, 272, 264, 60);
		frame.getContentPane().add(doublelinkedlist);
	}
}
