package com.java.DataStructuresProject.Arrays;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class Arrays {
    static int[] arr = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arrays window = new Arrays();
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
	public Arrays() {
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
		frame.setBounds(100, 100, 630, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel array = new JLabel("ARRAY DATA STRUCTURE");
		array.setFont(new Font("Tahoma", Font.BOLD, 20));
		array.setBounds(145, 10, 263, 40);
		frame.getContentPane().add(array);
		
		
		JButton btnSize = new JButton("SIZE");
        btnSize.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean validInput = false;

                while (!validInput) {
                    String input = JOptionPane.showInputDialog(frame, "Enter the size (1 to 9):");

                    if (input == null) {
                        break; // User cancelled
                    }

                    try {
                        int size = Integer.parseInt(input);

                        if (size >= 1 && size <= 9) {
                            textField.setText(Integer.toString(size));
                            validInput = true;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Please enter a valid number between 1 and 9!");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a numeric value.");
                    }
                }
            }
        });

		btnSize.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSize.setBounds(21, 56, 114, 40);
		frame.getContentPane().add(btnSize);
		
		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String sizeText = textField.getText().trim();
		        
		        try {
		            int size = Integer.parseInt(sizeText);
		            if (size >= 1 && size <= 9) {
		            	arr = new int[size];  // initialize array
		            	for (int i = 0; i < size; i++) {
		            	    arr[i] = 0; // initialize all positions with 0
		            	}
		                JOptionPane.showMessageDialog(frame, "Array with size " + size + " got created");
//		                int[] arr = new int[size]; // You can use this array as needed
		            } else {
		                JOptionPane.showMessageDialog(frame, "Please enter a valid number between 1 and 9!");
		            }
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(frame, "Please enter a numeric size first!");
		        }
		    }
		});

		create.setFont(new Font("Tahoma", Font.BOLD, 20));
		create.setBounds(412, 56, 124, 40);
		frame.getContentPane().add(create);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(155, 60, 239, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton element = new JButton("ELEMENT");
		element.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 boolean validInput = false;
	                while (!validInput) {
	                    String input = JOptionPane.showInputDialog(frame, "Enter the size (1 to 9):");

	                    if (input == null) {
	                        break; // User cancelled
	                    }

	                    try {
	                        int size = Integer.parseInt(input);

	                        if (size >= 0) {
	                            textField_1.setText(Integer.toString(size));
	                            validInput = true;
	                        } else {
	                            JOptionPane.showMessageDialog(frame, "Please enter a valid number between 1 and 9!");
	                        }
	                    } catch (NumberFormatException ex) {
	                        JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a numeric value.");
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
		textField_1.setBounds(158, 136, 114, 34);
		
		frame.getContentPane().add(textField_1);
		
		JButton position = new JButton("POS");
		position.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 boolean validInput = false;

	                while (!validInput) {
	                    String input = JOptionPane.showInputDialog(frame, "Enter the size (1 to 9):");

	                    if (input == null) {
	                        break; // User cancelled
	                    }

	                    try {
	                        int size = Integer.parseInt(input);

	                        if (size >= 0 && size <= 9) {
	                            textField_2.setText(Integer.toString(size));
	                            validInput = true;
	                        } else {
	                            JOptionPane.showMessageDialog(frame, "Please enter a valid number between 1 and 9!");
	                        }
	                    } catch (NumberFormatException ex) {
	                        JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a numeric value.");
	                    }
	                }
			}
		});
		position.setFont(new Font("Tahoma", Font.BOLD, 20));
		position.setBounds(282, 136, 79, 40);
		frame.getContentPane().add(position);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(369, 136, 114, 34);
		frame.getContentPane().add(textField_2);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String elementText = textField_1.getText().trim();
		        String positionText = textField_2.getText().trim();

		        try {
		            int element = Integer.parseInt(elementText);
		            int position = Integer.parseInt(positionText);

		            if (arr == null) {
		                JOptionPane.showMessageDialog(frame, "Please create the array first!");
		                return;
		            }

		            if (position >= 0 && position < arr.length) {
		                arr[position] = element;
		                JOptionPane.showMessageDialog(frame, "Element " + element + " inserted at position " + position);
		            } else {
		                JOptionPane.showMessageDialog(frame, "Position out of bounds!");
		            }
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values!");
		        }
		    }
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 20));
		insert.setBounds(493, 136, 113, 40);
		frame.getContentPane().add(insert);
		
		JButton position_1 = new JButton("POS");
		position_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        boolean validInput = false;

		        while (!validInput) {
		            String input = JOptionPane.showInputDialog(frame, "Enter the position (0 to " + (arr != null ? arr.length - 1 : 8) + "):");

		            if (input == null) {
		                break;
		            }

		            try {
		                int pos = Integer.parseInt(input);
		                if (arr == null) {
		                    JOptionPane.showMessageDialog(frame, "Array not created yet!");
		                    break;
		                }

		                if (pos >= 0 && pos < arr.length) {
		                    textField_3.setText(Integer.toString(pos));
		                    validInput = true;
		                } else {
		                    JOptionPane.showMessageDialog(frame, "Position out of bounds.");
		                }
		            } catch (NumberFormatException ex) {
		                JOptionPane.showMessageDialog(frame, "Please enter a numeric position.");
		            }
		        }
		    }
		});
		position_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		position_1.setBounds(97, 203, 79, 40);
		frame.getContentPane().add(position_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(208, 208, 114, 34);
		frame.getContentPane().add(textField_3);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String posText = textField_3.getText().trim();

		        try {
		            int pos = Integer.parseInt(posText);
		            if (arr == null) {
		                JOptionPane.showMessageDialog(frame, "Please create the array first!");
		                return;
		            }

		            if (pos >= 0 && pos < arr.length) {
		                arr[pos] = 0;
		                JOptionPane.showMessageDialog(frame, "Element at position " + pos + " deleted!");
		            } else {
		                JOptionPane.showMessageDialog(frame, "Position out of bounds.");
		            }
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(frame, "Enter a valid numeric position.");
		        }
		    }
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		delete.setBounds(352, 203, 124, 40);
		frame.getContentPane().add(delete);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(27, 275, 415, 34);
		frame.getContentPane().add(textField_4);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (arr == null) {
		            JOptionPane.showMessageDialog(frame, "Array not created yet!");
		            return;
		        }

		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < arr.length; i++) {
		            result.append(arr[i]).append(" ");
		        }

		        textField_4.setText(result.toString().trim());
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