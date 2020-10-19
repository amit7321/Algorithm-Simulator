import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.FlowLayout;

public class AlgorithmSimulator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlgorithmSimulator frame = new AlgorithmSimulator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlgorithmSimulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		// code for the home panel
		
		JPanel p1Home = new JPanel();
		p1Home.setLayout(null);
		contentPane.add(p1Home, "t1");
		
		//code for the label "Algorithm Simulator" of the home panel 
		
		JLabel lb1 = new JLabel("    Algorithm Simulator");
		lb1.setForeground(new Color(153, 51, 0));
		lb1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lb1.setBounds(189, 194, 454, 57);
		p1Home.add(lb1);
		
		// code for the JButton "Start" in Home panel 
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1=(CardLayout)(contentPane.getLayout());    /* code for the card Layout */				                                                              
				c1.show(contentPane,"t2");
			}
		});
		
		// adding Start button 
		btnStart.setForeground(new Color(255, 102, 51));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnStart.setBackground(new Color(240, 230, 140));
		btnStart.setBounds(203, 370, 150, 57);
		p1Home.add(btnStart);
		
		
		// adding Start button in the home panel
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(255, 127, 80));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnExit.setBounds(437, 370, 129, 57);
		p1Home.add(btnExit);
		
		JPanel p2Input = new JPanel();
		p2Input.setLayout(null);
		contentPane.add(p2Input, "t2");
		
		JLabel lbInput = new JLabel("Enter the numbers");
		lbInput.setForeground(new Color(255, 102, 51));
		lbInput.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbInput.setBounds(291, 36, 238, 33);
		p2Input.add(lbInput);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 95, 733, 289);
		p2Input.add(scrollPane);
		
		JTextArea taInput = new JTextArea();
		scrollPane.setViewportView(taInput);
		taInput.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 23));
		taInput.setBackground(new Color(255, 218, 185));
		
		
		// clicking the "bubble Sort" button simulation page arrive
		JButton btnBubble = new JButton("Bubble Sort");
		btnBubble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2=(CardLayout)(contentPane.getLayout());
				c2.show(contentPane,"t3");
				
			}
		});
		btnBubble.setForeground(new Color(255, 51, 51));
		btnBubble.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBubble.setBackground(new Color(204, 255, 255));
		btnBubble.setBounds(45, 433, 140, 58);
		p2Input.add(btnBubble);
		
		
		// clicking the "Insertion Sort" button simulation page arrive
		JButton btnInsertion = new JButton("Insertion\r\n Sort");
		btnInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c3=(CardLayout)(contentPane.getLayout());
				c3.show(contentPane,"t4");
			}
		});
		btnInsertion.setForeground(new Color(255, 51, 51));
		btnInsertion.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnInsertion.setBackground(new Color(204, 255, 255));
		btnInsertion.setBounds(291, 433, 163, 58);
		p2Input.add(btnInsertion);
		
		
		// clicking the "Selection Sort" button simulation page arrive
		JButton btnSelection = new JButton("Selection Sort\r\n");
		btnSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c4=(CardLayout)(contentPane.getLayout());
				c4.show(contentPane,"t5");
			}
		});
		btnSelection.setForeground(new Color(255, 51, 51));
		btnSelection.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSelection.setBackground(new Color(204, 255, 255));
		btnSelection.setBounds(555, 433, 163, 58);
		p2Input.add(btnSelection);
		
		// code for the "clear" button
 		JButton btnInputClear = new JButton("Clear");
		btnInputClear.setForeground(new Color(220, 20, 60));
		btnInputClear.setBackground(new Color(135, 206, 235));
		btnInputClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInputClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taInput.setText(null);
			}
		});
		btnInputClear.setBounds(45, 36, 89, 33);
		p2Input.add(btnInputClear);
		
		// code for "Exit" button in input page
		JButton btnInputExit = new JButton("Exit");
		btnInputExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnInputExit.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnInputExit.setBounds(658, 36, 89, 33);
		p2Input.add(btnInputExit);
		
		// Panel for bubble sort simulation
		JPanel p3Bubble = new JPanel();
		p3Bubble.setLayout(null);
		p3Bubble.setBorder(new LineBorder(new Color(0, 191, 255)));
		contentPane.add(p3Bubble, "t3");
		
		JScrollPane spBubble = new JScrollPane();
		spBubble.setBounds(10, 84, 761, 366);
		p3Bubble.add(spBubble);
		
		JTextArea taBubble = new JTextArea();
		taBubble.setBackground(new Color(255, 228, 225));
		spBubble.setViewportView(taBubble);
		taBubble.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 23));
		
		//  by clicking ascending order button it will start bubble sort simulation in in ascending order
		
		JButton btnSimuBubble = new JButton("Ascending Order");
		btnSimuBubble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// code for the ascending order of bubble sort
				
				
			    String bubble=taInput.getText();
				String intString[]=bubble.split(" ");
				int bubbleArr[]=new int[intString.length];
				for(int i=0;i<bubbleArr.length;i++) {
					bubbleArr[i]=Integer.parseInt(intString[i]);
				}
				 int n = bubbleArr.length;
				 
				 taBubble.append("  Passes in ascending order" + "\n");
			        for (int i = 0; i < n-1; i++) {
			        	boolean swap=false;
			            for (int j = 0; j < n-i-1; j++) {
			                if (bubbleArr[j] > bubbleArr[j+1])
			                {
			                   
			                    int temp = bubbleArr[j];
			                    bubbleArr[j] = bubbleArr[j+1];
			                    bubbleArr[j+1] = temp;
			                    swap=true;
			                }			           
			         
			            }
			            if(swap==false)
			            	break;
			            
			            
			            String strArr[]=new String[bubbleArr.length];
			            taBubble.append("  Pass "+(i+1)+": ");
			            for (int k=0; k<n; k++) {				            	
			            	strArr[k]=String.valueOf(bubbleArr[k]);		            	
				            taBubble.append(strArr[k]+" ");
			             }
			            taBubble.append("\n");
			        }
			        
			        
	            }
			
			            	
			            
			       
			        
		        
				
		  
		});
		btnSimuBubble.setForeground(new Color(153, 51, 51));
		btnSimuBubble.setBackground(new Color(153, 255, 153));
		btnSimuBubble.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSimuBubble.setBounds(44, 479, 291, 45);
		p3Bubble.add(btnSimuBubble);
		
		//  "Back" button for bubble sort simulation panel
		
		JButton btnBackBubble = new JButton("Back");
		btnBackBubble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c7=(CardLayout)(contentPane.getLayout());
				c7.show(contentPane,"t2");
			}
		});
		btnBackBubble.setBackground(new Color(255, 255, 204));
		btnBackBubble.setForeground(new Color(255, 102, 102));
		btnBackBubble.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBackBubble.setBounds(682, 28, 89, 38);
		p3Bubble.add(btnBackBubble);
		
	//  by clicking descending order button it will start bubble sort simulation in in descending order
		
		
		JButton btnDesSimuBubble = new JButton("Descending Order");
		btnDesSimuBubble.setForeground(new Color(255, 0, 0));
		btnDesSimuBubble.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDesSimuBubble.setBackground(new Color(255, 165, 0));
		btnDesSimuBubble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// // code for the descending order of bubble sort
				
				String bubbleDes=taInput.getText();
				String intString4[]=bubbleDes.split(" ");
				int bubbleDesArr[]=new int[intString4.length];
				for(int i=0;i<bubbleDesArr.length;i++) {
					bubbleDesArr[i]=Integer.parseInt(intString4[i]);
				}
				 int n = bubbleDesArr.length;
				 taBubble.append("  Passes in descending order" + "\n");
			        for (int i = 0; i < n; i++) {
			        	boolean swap=false;
			            for (int j = 1; j < (n-i); j++) {
			                if (bubbleDesArr[j-1] < bubbleDesArr[j])
			                {
			                   
			                    int temp = bubbleDesArr[j-1];
			                    bubbleDesArr[j-1] = bubbleDesArr[j];
			                    bubbleDesArr[j] = temp;
			                    swap=true;
			                }			           
			         
			            }
			            if(swap==false)
			            	break;
			          
			            String strArr4[]=new String[bubbleDesArr.length];
			            taBubble.append("  Pass "+(i+1)+": ");
			            for (int k=0; k<n; k++) {				            	
			            	strArr4[k]=String.valueOf(bubbleDesArr[k]);		            	
				            taBubble.append(strArr4[k]+" ");
			             }
			            taBubble.append("\n");
			        }
			        
			}
		});
		btnDesSimuBubble.setBounds(480, 479, 291, 45);
		p3Bubble.add(btnDesSimuBubble);
		
		
		// "clear" button will clear simulation test area
		JButton button = new JButton("Clear");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taBubble.setText(null);
			}
		});
		button.setForeground(new Color(220, 20, 60));
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBackground(new Color(135, 206, 235));
		button.setBounds(10, 32, 89, 33);
		p3Bubble.add(button);
		
		JButton btnOp1 = new JButton("More");
		btnOp1.setForeground(new Color(165, 42, 42));
		btnOp1.setBackground(new Color(255, 218, 185));
		btnOp1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout m1=(CardLayout)(contentPane.getLayout());
				m1.show(contentPane, "opt1");
			}
		});
		btnOp1.setBounds(566, 28, 89, 38);
		p3Bubble.add(btnOp1);
		//pOpBubble.setLayout(p3Bubble,"opt1");
		
		// Code for Insertion sort panel
		
		JPanel p4Insertion = new JPanel();
		p4Insertion.setLayout(null);
		p4Insertion.setBorder(new LineBorder(new Color(0, 191, 255)));
		contentPane.add(p4Insertion, "t4");
		
		JScrollPane spInsertion = new JScrollPane();
		spInsertion.setBounds(10, 67, 767, 382);
		p4Insertion.add(spInsertion);
		
		JTextArea taInsertion = new JTextArea();
		taInsertion.setBackground(new Color(255, 228, 225));
		spInsertion.setViewportView(taInsertion);
		taInsertion.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 23));
		
	//  by clicking asscending order button it will start insertion sort simulation in in ascending order
		JButton btnSimuInsertion = new JButton("Ascending Order");
		btnSimuInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// code for the ascending order of insertion sort
				
				   String insertion=taInput.getText();
				    
					String intString1[]=insertion.split(" ");
					int insertionArr[]=new int[intString1.length];
					for(int i=0;i<insertionArr.length;i++) {
						insertionArr[i]=Integer.parseInt(intString1[i]);
					}
					 int n = insertionArr.length;
					    int tmp;
					    taInsertion.append("  Passes in ascending order " + "\n");
				        for (int i = 0; i < n; i++) {
				            for (int j = i; j > 0; j--) {
				                if (insertionArr[j] < insertionArr[j - 1]) {
				                    tmp = insertionArr[j];
				                    insertionArr[j] = insertionArr[j - 1];
				                    insertionArr[j - 1] = tmp;
				                }
				            }
				            String strArr1[]=new String[insertionArr.length];
				            taInsertion.append("  Pass "+(i+1)+": ");
				            for (int k=0; k<n; k++) {				            	
				            	strArr1[k]=String.valueOf(insertionArr[k]);		            	
					            taInsertion.append(strArr1[k]+" ");
				            }
				            taInsertion.append("\n");
				        }
				      
			}
		});
		btnSimuInsertion.setForeground(new Color(153, 51, 51));
		btnSimuInsertion.setBackground(new Color(153, 255, 153));
		btnSimuInsertion.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSimuInsertion.setBounds(25, 476, 291, 45);
		p4Insertion.add(btnSimuInsertion);
		
		// "back" button for the panel
		
		JButton btnBackInsertion = new JButton("Back");
		btnBackInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c8=(CardLayout)(contentPane.getLayout());
				c8.show(contentPane,"t2");
			}
		});
		btnBackInsertion.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBackInsertion.setForeground(new Color(204, 51, 51));
		btnBackInsertion.setBackground(new Color(255, 255, 204));
		btnBackInsertion.setBounds(679, 23, 98, 33);
		p4Insertion.add(btnBackInsertion);
		
		JButton btnInsertionClear = new JButton("Clear");
		btnInsertionClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taInsertion.setText(null);
			}
		});
		btnInsertionClear.setForeground(new Color(220, 20, 60));
		btnInsertionClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsertionClear.setBackground(new Color(135, 206, 235));
		btnInsertionClear.setBounds(25, 23, 89, 33);
		p4Insertion.add(btnInsertionClear);
		
	//  by clicking descending order button it will start insertion sort simulation in in descending order
		JButton btnDesInsertion = new JButton("Descending Order");
		btnDesInsertion.setForeground(new Color(139, 0, 0));
		btnDesInsertion.setBackground(new Color(233, 150, 122));
		btnDesInsertion.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		// code for the descending order of insertion sort

		btnDesInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String insertionDes=taInput.getText();
			    
				String intString5[]=insertionDes.split(" ");
				int insertionDesArr[]=new int[intString5.length];
				for(int i=0;i<insertionDesArr.length;i++) {
					insertionDesArr[i]=Integer.parseInt(intString5[i]);
				}
				 int n = insertionDesArr.length;
				    int tmp;
				   taInsertion.append("  Passes in descending order " + "\n");
			        for (int i = 0; i < n; i++) {
			            for (int j = i+1; j <n ; j++) {
			                if (insertionDesArr[i] < insertionDesArr[j]) {
			                    tmp = insertionDesArr[i];
			                    insertionDesArr[i] = insertionDesArr[j];
			                    insertionDesArr[j] = tmp;
			                }
			            }
			            String strArr7[]=new String[insertionDesArr.length];
			            taInsertion.append("  Pass "+(i+1)+": ");
			            for (int k=0; k<n; k++) {				            	
			            	strArr7[k]=String.valueOf(insertionDesArr[k]);		            	
				            taInsertion.append(strArr7[k]+" ");
			            }
			            taInsertion.append("\n");
			        }
			}
		});
		btnDesInsertion.setBounds(451, 478, 291, 40);
		p4Insertion.add(btnDesInsertion);
		
		JButton btnOpInsertion = new JButton("More");
		btnOpInsertion.setForeground(new Color(165, 42, 42));
		btnOpInsertion.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOpInsertion.setBackground(new Color(255, 218, 185));
		btnOpInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout m3=(CardLayout)(contentPane.getLayout());
				m3.show(contentPane,"opt2");
				
			}
		});
		btnOpInsertion.setBounds(556, 23, 98, 33);
		p4Insertion.add(btnOpInsertion);
		
		JPanel p5Selection = new JPanel();
		p5Selection.setLayout(null);
		p5Selection.setBorder(new LineBorder(new Color(0, 191, 255)));
		contentPane.add(p5Selection, "t5");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 74, 767, 385);
		p5Selection.add(scrollPane_1);
		
		JTextArea taSelection = new JTextArea();
		taSelection.setBackground(new Color(255, 218, 185));
		scrollPane_1.setViewportView(taSelection);
		taSelection.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 23));
		
		JButton btnSimuSelection = new JButton("Ascending Order");
		
		// code for the ascending order of selection sort

		btnSimuSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String selection=taInput.getText();
		
					String intString2[]=selection.split(" ");
					int selectionArr[]=new int[intString2.length];
					for(int i=0;i<selectionArr.length;i++) {
						selectionArr[i]=Integer.parseInt(intString2[i]);
					}
					 int n = selectionArr.length;
					 taSelection.append("  Passes in ascending order" +"\n");
					 for (int i = 0; i < n-1; i++)
				        {
				         
				            int min_idx = i;
				            for (int j = i+1; j < n; j++) {
				                if (selectionArr[j] < selectionArr[min_idx])
				                    min_idx = j;
				 
				            int temp = selectionArr[min_idx];
				            selectionArr[min_idx] = selectionArr[i];
				            selectionArr[i] = temp;
				            }

				            String strArr7[]=new String[selectionArr.length];
				            taSelection.append("  Pass "+(i+1)+": ");
				            for (int k=0; k<n; k++) {				            	
				            	strArr7[k]=String.valueOf(selectionArr[k]);		            	
					            taSelection.append(strArr7[k]+" ");
				           
					           
				         }
				            
				            taSelection.append("\n"); 
				          
				        }     
				        
			     }

			
		});
		btnSimuSelection.setForeground(new Color(153, 51, 51));
		btnSimuSelection.setBackground(new Color(153, 255, 153));
		btnSimuSelection.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSimuSelection.setBounds(23, 492, 291, 45);
		p5Selection.add(btnSimuSelection);
		
		JButton btnBackSelection = new JButton("Back");
		btnBackSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c10=(CardLayout)(contentPane.getLayout());
				c10.show(contentPane,"t2");
			}
		});
		btnBackSelection.setForeground(new Color(153, 51, 51));
		btnBackSelection.setBackground(new Color(255, 255, 204));
		btnBackSelection.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBackSelection.setBounds(688, 24, 89, 39);
		p5Selection.add(btnBackSelection);
		
		JButton btnSelectionDes = new JButton("Descending Order");
		btnSelectionDes.setBackground(new Color(221, 160, 221));
		btnSelectionDes.setForeground(new Color(139, 69, 19));
		btnSelectionDes.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		// code for the descending order of selection sort

		btnSelectionDes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectionDes=taInput.getText();
				
				String intString9[]=selectionDes.split(" ");
				int selectionDesArr[]=new int[intString9.length];
				for(int i=0;i<selectionDesArr.length;i++) {
					selectionDesArr[i]=Integer.parseInt(intString9[i]);
				}
				 int n = selectionDesArr.length;
				 taSelection.append(" Passes in descending order" +"\n");
				 for (int i = 0; i <n-1; i++)
			        {
			         
			            int min_idx = i;
			            for (int j = i+1; j < n; j++) {
			                if (selectionDesArr[j] > selectionDesArr[min_idx])
			                    min_idx = j;
			 
			            int temp = selectionDesArr[min_idx];
			            selectionDesArr[min_idx] = selectionDesArr[i];
			            selectionDesArr[i] = temp;
			            }

			            String strArr7[]=new String[selectionDesArr.length];
			            taSelection.append(" Pass "+(i+1)+": ");
			            for (int k=0; k<n; k++) {				            	
			            	strArr7[k]=String.valueOf(selectionDesArr[k]);		            	
				            taSelection.append(strArr7[k]+" ");
			           
				           
			         }
			            
			            taSelection.append("\n"); 
			          
			        }     
			
			}
		});
		btnSelectionDes.setBounds(477, 495, 260, 38);
		p5Selection.add(btnSelectionDes);
		
		JButton button_1 = new JButton("Clear");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taSelection.setText(null);
			}
		});
		button_1.setForeground(new Color(220, 20, 60));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBackground(new Color(135, 206, 235));
		button_1.setBounds(39, 27, 89, 33);
		p5Selection.add(button_1);
		
		JButton btnNewButton = new JButton("More");
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout m5=(CardLayout)(contentPane.getLayout());
				m5.show(contentPane,"opt3");
			}
		});
		btnNewButton.setBounds(581, 24, 89, 39);
		p5Selection.add(btnNewButton);
		
		JPanel pOpBubble = new JPanel();
		pOpBubble.setBorder(new LineBorder(new Color(0, 191, 255)));
		contentPane.add(pOpBubble, "opt1");
		pOpBubble.setLayout(null);
		
		JButton btnOpback1 = new JButton("Back");
		btnOpback1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOpback1.setForeground(new Color(165, 42, 42));
		btnOpback1.setBackground(new Color(255, 218, 185));
		btnOpback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout b1=(CardLayout)(contentPane.getLayout());
				b1.show(contentPane,"t3");
			}
		});
		btnOpback1.setBounds(677, 11, 100, 39);
		pOpBubble.add(btnOpback1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 61, 767, 487);
		pOpBubble.add(tabbedPane);
		
		JPanel p1m1Algo = new JPanel();
		tabbedPane.addTab("Algorithm", null, p1m1Algo, null);
		tabbedPane.setForegroundAt(0, new Color(255, 69, 0));
		tabbedPane.setBackgroundAt(0, Color.LIGHT_GRAY);
		p1m1Algo.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 762, 459);
		p1m1Algo.add(scrollPane_2);
		
		JTextPane tp1m1 = new JTextPane();
		tp1m1.setEditable(false);
		tp1m1.setText("k = n ( n=number of sortable items )\r\nwhile k != 0 do\r\n          t = 0\r\n          for j=1 to k-1 do\r\n                    if x[ j ] > x[ j+1 ] then \r\n                                        x[ j ]  <--> x[ j+1 ] \r\n                                         t=j\r\n          k=t");
		tp1m1.setBackground(new Color(255, 222, 173));
		scrollPane_2.setViewportView(tp1m1);
		tp1m1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JPanel p1m2 = new JPanel();
		p1m2.setBorder(new LineBorder(new Color(0, 191, 255)));
		tabbedPane.addTab("C++", null, p1m2, null);
		tabbedPane.setForegroundAt(1, new Color(255, 99, 71));
		tabbedPane.setBackgroundAt(1, new Color(255, 222, 173));
		p1m2.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 762, 459);
		p1m2.add(scrollPane_3);
		
		JTextPane txtpnOptimizedImplementation = new JTextPane();
		txtpnOptimizedImplementation.setEditable(false);
		scrollPane_3.setViewportView(txtpnOptimizedImplementation);
		txtpnOptimizedImplementation.setText("\r\n// Optimized implementation of Bubble sort \r\n#include <stdio.h> \r\n  \r\nvoid swap( int *xp, int *yp ) \r\n{ \r\n    int temp = *xp; \r\n    *xp = *yp; \r\n    *yp = temp; \r\n} \r\n  \r\n// An optimized version of Bubble Sort \r\nvoid bubbleSort( int arr[], int n ) \r\n{ \r\n   int i, j; \r\n   bool swapped; \r\n   for ( i = 0; i < n-1; i++ ) \r\n   { \r\n     swapped = false; \r\n     for ( j = 0; j < n-i-1; j++ ) \r\n     { \r\n        if (arr[j] > arr[j+1]) \r\n        { \r\n           swap( &arr[ j ], &arr[ j+1 ] ); \r\n           swapped = true; \r\n        } \r\n     } \r\n  \r\n     // IF no two elements were swapped by inner loop, then break \r\n     if (swapped == false) \r\n        break; \r\n   } \r\n} \r\n  \r\n/* Function to print an array */\r\nvoid printArray(int arr[], int size) \r\n{ \r\n    int i; \r\n    for (i=0; i < size; i++) \r\n        printf(\"%d \", arr[i]); \r\n    printf(\"n\"); \r\n} \r\n  \r\n// Driver program to test above functions \r\nint main() \r\n{ \r\n    int arr[] = {64, 34, 25, 12, 22, 11, 90}; \r\n    int n = sizeof( arr )/sizeof(arr[ 0 ]); \r\n    bubbleSort(arr, n); \r\n    printf(\"Sorted array: \\n\"); \r\n    printArray(arr, n); \r\n    return 0; \r\n}");
		txtpnOptimizedImplementation.setBackground(new Color(255, 222, 173));
		txtpnOptimizedImplementation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JPanel m1p3 = new JPanel();
		m1p3.setBackground(new Color(255, 222, 173));
		m1p3.setBorder(new LineBorder(new Color(0, 191, 255)));
		tabbedPane.addTab("Java", null, m1p3, null);
		tabbedPane.setForegroundAt(2, new Color(255, 99, 71));
		m1p3.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 762, 459);
		m1p3.add(scrollPane_4);
		
		JTextPane txtpnOptimizedJava = new JTextPane();
		txtpnOptimizedJava.setEditable(false);
		txtpnOptimizedJava.setText("// Optimized java implementation \r\n// of Bubble sort \r\nimport java.io.*; \r\n  \r\nclass GFG  \r\n{ \r\n    // An optimized version of Bubble Sort \r\n    static void bubbleSort(int arr[], int n) \r\n    { \r\n        int i, j, temp; \r\n        boolean swapped; \r\n        for (i = 0; i < n - 1; i++)  \r\n        { \r\n            swapped = false; \r\n            for (j = 0; j < n - i - 1; j++)  \r\n            { \r\n                if (arr[j] > arr[ j + 1 ])  \r\n                { \r\n                    // swap arr[ j ] and arr[ j+1 ] \r\n                    temp = arr[ j ]; \r\n                    arr[ j ] = arr[ j + 1 ]; \r\n                    arr[ j + 1 ] = temp; \r\n                    swapped = true; \r\n                } \r\n            } \r\n  \r\n            // IF no two elements were  \r\n            // swapped by inner loop, then break \r\n            if (swapped == false) \r\n                break; \r\n        } \r\n    } \r\n  \r\n    // Function to print an array  \r\n    static void printArray(int arr[], int size) \r\n    { \r\n        int i; \r\n        for (i = 0; i < size; i++) \r\n            System.out.print(arr[i] + \" \"); \r\n        System.out.println(); \r\n    } \r\n  \r\n    // Driver program \r\n    public static void main( String args[] ) \r\n    { \r\n        int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; \r\n        int n = arr.length; \r\n        bubbleSort(arr, n); \r\n        System.out.println(\"Sorted array: \"); \r\n        printArray(arr, n); \r\n    } \r\n}");
		scrollPane_4.setViewportView(txtpnOptimizedJava);
		txtpnOptimizedJava.setBackground(new Color(255, 218, 185));
		txtpnOptimizedJava.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Python", null, panel, null);
		tabbedPane.setForegroundAt(3, new Color(255, 69, 0));
		panel.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 762, 459);
		panel.add(scrollPane_5);
		
		JTextPane txtpnPythonOptimized = new JTextPane();
		txtpnPythonOptimized.setEditable(false);
		txtpnPythonOptimized.setBackground(new Color(255, 218, 185));
		txtpnPythonOptimized.setForeground(new Color(0, 0, 0));
		txtpnPythonOptimized.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		scrollPane_5.setViewportView(txtpnPythonOptimized);
		txtpnPythonOptimized.setText("# Python3 Optimized implementation \r\n# of Bubble sort \r\n  \r\n# An optimized version of Bubble Sort \r\ndef bubbleSort(arr): \r\n    n = len(arr) \r\n   \r\n    # Traverse through all array elements \r\n    for i in range(n): \r\n        swapped = False\r\n  \r\n        # Last i elements are already \r\n        #  in place \r\n        for j in range(0, n-i-1): \r\n   \r\n            # traverse the array from 0 to \r\n            # n-i-1. Swap if the element  \r\n            # found is greater than the \r\n            # next element \r\n            if arr[ j ] > arr[ j+1 ] : \r\n                arr[ j ], arr[ j+1 ] = arr[ j+1 ], arr[ j ] \r\n                swapped = True\r\n  \r\n        # IF no two elements were swapped \r\n        # by inner loop, then break \r\n        if swapped == False: \r\n            break\r\n           \r\n# Driver code to test above \r\narr = [64, 34, 25, 12, 22, 11, 90] \r\n   \r\nbubbleSort(arr) \r\n   \r\nprint (\"Sorted array :\") \r\nfor i in range(len(arr)): \r\n    print (\"%d\" %arr[i],end=\" \") ");
		
		JPanel pOpInsertion = new JPanel();
		contentPane.add(pOpInsertion, "opt2");
		pOpInsertion.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(165, 42, 42));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBackground(new Color(255, 218, 185));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout b4=(CardLayout)(contentPane.getLayout());
				b4.show(contentPane,"t4");
			}
		});
		btnBack.setBounds(675, 21, 102, 35);
		pOpInsertion.add(btnBack);
		
		JTabbedPane tabedPaneInsertion = new JTabbedPane(JTabbedPane.TOP);
		tabedPaneInsertion.setBounds(10, 73, 767, 477);
		pOpInsertion.add(tabedPaneInsertion);
		
		JPanel panel_1 = new JPanel();
		tabedPaneInsertion.addTab("Alogrithm", null, panel_1, null);
		tabedPaneInsertion.setForegroundAt(0, new Color(255, 69, 0));
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 0, 762, 449);
		panel_1.add(scrollPane_6);
		
		JTextPane txtpnStep = new JTextPane();
		txtpnStep.setText("Step 1 \u2212 If it is the first element, it is already sorted. return 1;\r\nStep 2 \u2212 Pick next element\r\nStep 3 \u2212 Compare with all elements in the sorted sub-list\r\nStep 4 \u2212 Shift all the elements in the sorted sub-list that is greater than the \r\n                value to be sorted\r\nStep 5 \u2212 Insert the value\r\nStep 6 \u2212 Repeat until list is sorted");
		txtpnStep.setBackground(new Color(255, 222, 173));
		txtpnStep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		scrollPane_6.setViewportView(txtpnStep);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 191, 255)));
		tabedPaneInsertion.addTab("C++", null, panel_2, null);
		tabedPaneInsertion.setForegroundAt(1, new Color(255, 69, 0));
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 0, 762, 449);
		panel_2.add(scrollPane_7);
		
		JTextPane txtpnCProgram = new JTextPane();
		scrollPane_7.setViewportView(txtpnCProgram);
		txtpnCProgram.setText("\r\n// C program for insertion sort \r\n#include <stdio.h> \r\n#include <math.h> \r\n  \r\n/* Function to sort an array using insertion sort*/\r\nvoid insertionSort(int arr[], int n) \r\n{ \r\n   int i, key, j; \r\n   for (i = 1; i < n; i++) \r\n   { \r\n       key = arr[i]; \r\n       j = i-1; \r\n  \r\n       /* Move elements of arr[0..i-1], that are \r\n          greater than key, to one position ahead \r\n          of their current position */\r\n       while (j >= 0 && arr[j] > key) \r\n       { \r\n           arr[j+1] = arr[j]; \r\n           j = j-1; \r\n       } \r\n       arr[j+1] = key; \r\n   } \r\n} \r\n  \r\n// A utility function to print an array of size n \r\nvoid printArray(int arr[], int n) \r\n{ \r\n   int i; \r\n   for (i=0; i < n; i++) \r\n       printf(\"%d \", arr[i]); \r\n   printf(\"\\n\"); \r\n} \r\n  \r\n  \r\n  \r\n/* Driver program to test insertion sort */\r\nint main() \r\n{ \r\n    int arr[] = {12, 11, 13, 5, 6}; \r\n    int n = sizeof(arr)/sizeof(arr[0]); \r\n  \r\n    insertionSort(arr, n); \r\n    printArray(arr, n); \r\n  \r\n    return 0; \r\n} ");
		txtpnCProgram.setBackground(new Color(255, 222, 173));
		txtpnCProgram.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 191, 255)));
		panel_3.setForeground(new Color(255, 69, 0));
		tabedPaneInsertion.addTab("Java", null, panel_3, null);
		tabedPaneInsertion.setForegroundAt(2, new Color(255, 69, 0));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(0, 0, 762, 449);
		panel_3.add(scrollPane_8);
		
		JTextPane txtpnCProgram_1 = new JTextPane();
		txtpnCProgram_1.setText("\r\n// Java program for implementation of Insertion Sort \r\nclass InsertionSort \r\n{ \r\n    /*Function to sort array using insertion sort*/\r\n    void sort(int arr[]) \r\n    { \r\n        int n = arr.length; \r\n        for (int i=1; i<n; ++i) \r\n        { \r\n            int key = arr[i]; \r\n            int j = i-1; \r\n  \r\n            /* Move elements of arr[0..i-1], that are \r\n               greater than key, to one position ahead \r\n               of their current position */\r\n            while (j>=0 && arr[j] > key) \r\n            { \r\n                arr[j+1] = arr[j]; \r\n                j = j-1; \r\n            } \r\n            arr[j+1] = key; \r\n        } \r\n    } \r\n  \r\n    /* A utility function to print array of size n*/\r\n    static void printArray(int arr[]) \r\n    { \r\n        int n = arr.length; \r\n        for (int i=0; i<n; ++i) \r\n            System.out.print(arr[i] + \" \"); \r\n  \r\n        System.out.println(); \r\n    } \r\n  \r\n    // Driver method \r\n    public static void main(String args[]) \r\n    {         \r\n        int arr[] = {12, 11, 13, 5, 6}; \r\n  \r\n        InsertionSort ob = new InsertionSort();         \r\n        ob.sort(arr); \r\n          \r\n        printArray(arr); \r\n    } \r\n}");
		scrollPane_8.setViewportView(txtpnCProgram_1);
		txtpnCProgram_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		txtpnCProgram_1.setBackground(new Color(255, 218, 185));
		
		JPanel panel_4 = new JPanel();
		tabedPaneInsertion.addTab("Python", null, panel_4, null);
		tabedPaneInsertion.setForegroundAt(3, new Color(255, 69, 0));
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(0, 0, 762, 449);
		panel_4.add(scrollPane_9);
		
		JTextPane txtpnPythonProgram = new JTextPane();
		txtpnPythonProgram.setText("\r\n# Python program for implementation of Insertion Sort \r\n  \r\n# Function to do insertion sort \r\ndef insertionSort(arr): \r\n  \r\n    # Traverse through 1 to len(arr) \r\n    for i in range(1, len(arr)): \r\n  \r\n        key = arr[i] \r\n  \r\n        # Move elements of arr[0..i-1], that are \r\n        # greater than key, to one position ahead \r\n        # of their current position \r\n        j = i-1\r\n        while j >=0 and key < arr[j] : \r\n                arr[j+1] = arr[j] \r\n                j -= 1\r\n        arr[j+1] = key \r\n  \r\n  \r\n# Driver code to test above \r\narr = [12, 11, 13, 5, 6] \r\ninsertionSort(arr) \r\nfor i in range(len(arr)): \r\n    print (\"%d\" %arr[i])");
		txtpnPythonProgram.setBackground(new Color(255, 218, 185));
		txtpnPythonProgram.setForeground(new Color(0, 0, 0));
		txtpnPythonProgram.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		scrollPane_9.setViewportView(txtpnPythonProgram);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 191, 255)));
		tabedPaneInsertion.addTab("C#", null, panel_5, null);
		tabedPaneInsertion.setForegroundAt(4, new Color(255, 69, 0));
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(0, 0, 762, 449);
		panel_5.add(scrollPane_10);
		
		JTextPane txtpnCProgram_2 = new JTextPane();
		scrollPane_10.setViewportView(txtpnCProgram_2);
		txtpnCProgram_2.setText("// C# program for implementation of Insertion Sort \r\nusing System; \r\n  \r\nclass InsertionSort \r\n{ \r\n  \r\n    // Function to sort array  \r\n    // using insertion sort/ \r\n    void sort(int[] arr) \r\n    { \r\n        int n = arr.Length; \r\n        for (int i = 1; i < n; ++i) \r\n        { \r\n            int key = arr[i]; \r\n            int j = i - 1; \r\n  \r\n            // Move elements of arr[0..i-1], \r\n            // that are greater than key,  \r\n            // to one position ahead of \r\n            // their current position \r\n            while (j >= 0 && arr[j] > key) \r\n            { \r\n                arr[j + 1] = arr[j]; \r\n                j = j - 1; \r\n            } \r\n            arr[j + 1] = key; \r\n        } \r\n    } \r\n  \r\n    // A utility function to print \r\n    // array of size n \r\n    static void printArray(int[] arr) \r\n    { \r\n        int n = arr.Length; \r\n        for (int i = 0; i < n; ++i) \r\n            Console.Write(arr[i] + \" \"); \r\n  \r\n        Console.Write(\"\\n\"); \r\n    } \r\n  \r\n    // Driver Code \r\n    public static void Main() \r\n    {      \r\n        int[] arr = {12, 11, 13, 5, 6}; \r\n        InsertionSort ob = new InsertionSort();      \r\n        ob.sort(arr); \r\n        printArray(arr); \r\n    } \r\n} ");
		txtpnCProgram_2.setBackground(new Color(255, 218, 185));
		txtpnCProgram_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JPanel pOpSelection = new JPanel();
		contentPane.add(pOpSelection, "opt3");
		pOpSelection.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(new Color(165, 42, 42));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout m6=(CardLayout)(contentPane.getLayout());
				m6.show(contentPane,"t5");
			}
		});
		btnNewButton_1.setBounds(688, 22, 89, 34);
		pOpSelection.add(btnNewButton_1);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 67, 767, 494);
		pOpSelection.add(tabbedPane_1);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Algorithm", null, panel_6, null);
		tabbedPane_1.setForegroundAt(0, new Color(255, 69, 0));
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(0, 0, 762, 466);
		panel_6.add(scrollPane_11);
		
		JTextPane txtpnStep_1 = new JTextPane();
		txtpnStep_1.setText("Step 1 \u2212 Set MIN to location 0\r\nStep 2 \u2212 Search the minimum element in the list\r\nStep 3 \u2212 Swap with value at location MIN\r\nStep 4 \u2212 Increment MIN to point to next element\r\nStep 5 \u2212 Repeat until list is sorted");
		txtpnStep_1.setBackground(new Color(255, 218, 185));
		txtpnStep_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		scrollPane_11.setViewportView(txtpnStep_1);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("C++", null, panel_7, null);
		tabbedPane_1.setForegroundAt(1, new Color(255, 69, 0));
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(0, 0, 762, 466);
		panel_7.add(scrollPane_12);
		
		JTextPane txtpnCProgramFor = new JTextPane();
		txtpnCProgramFor.setBackground(new Color(255, 218, 185));
		txtpnCProgramFor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		scrollPane_12.setViewportView(txtpnCProgramFor);
		txtpnCProgramFor.setText(" C program for implementation of selection sort \r\n#include <stdio.h> \r\n  \r\nvoid swap(int *xp, int *yp) \r\n{ \r\n    int temp = *xp; \r\n    *xp = *yp; \r\n    *yp = temp; \r\n} \r\n  \r\nvoid selectionSort(int arr[], int n) \r\n{ \r\n    int i, j, min_idx; \r\n  \r\n    // One by one move boundary of unsorted subarray \r\n    for (i = 0; i < n-1; i++) \r\n    { \r\n        // Find the minimum element in unsorted array \r\n        min_idx = i; \r\n        for (j = i+1; j < n; j++) \r\n          if (arr[j] < arr[min_idx]) \r\n            min_idx = j; \r\n  \r\n        // Swap the found minimum element with the first element \r\n        swap(&arr[min_idx], &arr[i]); \r\n    } \r\n} \r\n  \r\n/* Function to print an array */\r\nvoid printArray(int arr[], int size) \r\n{ \r\n    int i; \r\n    for (i=0; i < size; i++) \r\n        printf(\"%d \", arr[i]); \r\n    printf(\"\\n\"); \r\n} \r\n  \r\n// Driver program to test above functions \r\nint main() \r\n{ \r\n    int arr[] = {64, 25, 12, 22, 11}; \r\n    int n = sizeof(arr)/sizeof(arr[0]); \r\n    selectionSort(arr, n); \r\n    printf(\"Sorted array: \\n\"); \r\n    printArray(arr, n); \r\n    return 0; \r\n}");
		
		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("Java", null, panel_8, null);
		tabbedPane_1.setForegroundAt(2, new Color(255, 69, 0));
		panel_8.setLayout(null);
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(0, 0, 762, 466);
		panel_8.add(scrollPane_13);
		
		JTextPane txtpnJavaProgram = new JTextPane();
		txtpnJavaProgram.setEnabled(true);
		txtpnJavaProgram.setEditable(false);
		scrollPane_13.setViewportView(txtpnJavaProgram);
		txtpnJavaProgram.setBackground(new Color(255, 218, 185));
		txtpnJavaProgram.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		txtpnJavaProgram.setText("\r\n// Java program for implementation of Selection Sort \r\nclass SelectionSort \r\n{ \r\n    void sort(int arr[]) \r\n    { \r\n        int n = arr.length; \r\n  \r\n        // One by one move boundary of unsorted subarray \r\n        for (int i = 0; i < n-1; i++) \r\n        { \r\n            // Find the minimum element in unsorted array \r\n            int min_idx = i; \r\n            for (int j = i+1; j < n; j++) \r\n                if (arr[j] < arr[min_idx]) \r\n                    min_idx = j; \r\n  \r\n            // Swap the found minimum element with the first \r\n            // element \r\n            int temp = arr[min_idx]; \r\n            arr[min_idx] = arr[i]; \r\n            arr[i] = temp; \r\n        } \r\n    } \r\n  \r\n    // Prints the array \r\n    void printArray(int arr[]) \r\n    { \r\n        int n = arr.length; \r\n        for (int i=0; i<n; ++i) \r\n            System.out.print(arr[i]+\" \"); \r\n        System.out.println(); \r\n    } \r\n  \r\n    // Driver code to test above \r\n    public static void main(String args[]) \r\n    { \r\n        SelectionSort ob = new SelectionSort(); \r\n        int arr[] = {64,25,12,22,11}; \r\n        ob.sort(arr); \r\n        System.out.println(\"Sorted array\"); \r\n        ob.printArray(arr); \r\n    }");
		
		JPanel panel_9 = new JPanel();
		tabbedPane_1.addTab("Python", null, panel_9, null);
		tabbedPane_1.setForegroundAt(3, new Color(255, 99, 71));
		panel_9.setLayout(null);
		
		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(0, 0, 762, 466);
		panel_9.add(scrollPane_14);
		
		JTextPane txtpnPythonProgram_1 = new JTextPane();
		txtpnPythonProgram_1.setText("# Python program for implementation of Selection \r\n# Sort \r\nimport sys \r\nA = [64, 25, 12, 22, 11] \r\n  \r\n# Traverse through all array elements \r\nfor i in range(len(A)): \r\n      \r\n    # Find the minimum element in remaining  \r\n    # unsorted array \r\n    min_idx = i \r\n    for j in range(i+1, len(A)): \r\n        if A[min_idx] > A[j]: \r\n            min_idx = j \r\n              \r\n    # Swap the found minimum element with  \r\n    # the first element         \r\n    A[i], A[min_idx] = A[min_idx], A[i] \r\n  \r\n# Driver code to test above \r\nprint (\"Sorted array\") \r\nfor i in range(len(A)): \r\n    print(\"%d\" %A[i]),");
		scrollPane_14.setViewportView(txtpnPythonProgram_1);
		txtpnPythonProgram_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		txtpnPythonProgram_1.setBackground(new Color(255, 218, 185));
		
		JPanel panel_10 = new JPanel();
		tabbedPane_1.addTab("C#", null, panel_10, null);
		tabbedPane_1.setForegroundAt(4, new Color(255, 99, 71));
		panel_10.setLayout(null);
		
		JScrollPane scrollPane_15 = new JScrollPane();
		scrollPane_15.setBounds(0, 0, 762, 466);
		panel_10.add(scrollPane_15);
		
		JTextPane txtpnCProgram_3 = new JTextPane();
		txtpnCProgram_3.setText("\r\n// C# program for implementation  \r\n// of Selection Sort \r\nusing System; \r\n  \r\nclass GFG \r\n{  \r\n    static void sort(int []arr) \r\n    { \r\n        int n = arr.Length; \r\n  \r\n        // One by one move boundary of unsorted subarray \r\n        for (int i = 0; i < n - 1; i++) \r\n        { \r\n            // Find the minimum element in unsorted array \r\n            int min_idx = i; \r\n            for (int j = i + 1; j < n; j++) \r\n                if (arr[j] < arr[min_idx]) \r\n                    min_idx = j; \r\n  \r\n            // Swap the found minimum element with the first \r\n            // element \r\n            int temp = arr[min_idx]; \r\n            arr[min_idx] = arr[i]; \r\n            arr[i] = temp; \r\n        } \r\n    } \r\n  \r\n    // Prints the array \r\n    static void printArray(int []arr) \r\n    { \r\n        int n = arr.Length; \r\n        for (int i=0; i<n; ++i) \r\n            Console.Write(arr[i]+\" \"); \r\n        Console.WriteLine(); \r\n    } \r\n  \r\n    // Driver code  \r\n    public static void Main() \r\n    { \r\n        int []arr = {64,25,12,22,11}; \r\n        sort(arr); \r\n        Console.WriteLine(\"Sorted array\"); \r\n        printArray(arr); \r\n    } \r\n  \r\n}");
		txtpnCProgram_3.setBackground(new Color(255, 218, 185));
		txtpnCProgram_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		scrollPane_15.setViewportView(txtpnCProgram_3);
	}
}
