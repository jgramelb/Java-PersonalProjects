/*
 * Budget.java 
 * Author: Jeannie Ramelb
 * 
 * 
 * Budget GUI to monitor Jeannie's monthly spending habits
 */

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;


public class Budget extends JFrame {
	private JTextField txtIncome;
	private JTextField txtRent;
	private JTextField txtLoans;
	private JTextField txtCar;
	private JTextField txtGas;
	private JTextField txtInsurance;
	private JTextField txtRotary;
	private JTextField txtFun;
	private JTextField txtTravel;
	private JTextField txtMiscEtc;
	private JTextField txtGym;
	
	private JLabel lblOutputTotalExpenses;
	private JLabel lblOutputRemainingBudget;
	
	private String messageExpenses = "";
	private String messageRemainingBudget = "";
	
	
	//Method to reset the GUI fields to appear as it is when you run the code
	public void reset() {
		
		txtIncome.setText(null);
		txtRent.setText(null);
		txtLoans.setText(null);
		txtCar.setText(null);
		txtGas.setText(null);
		txtInsurance.setText(null);
		txtGym.setText(null);
		txtRotary.setText(null);
		txtFun.setText(null);
		txtTravel.setText(null);
		txtMiscEtc.setText(null); 

		
		messageExpenses = "Enter in your expenses above and click Calculate!";
		lblOutputTotalExpenses.setText(messageExpenses);
		
		messageRemainingBudget = " ";
		lblOutputRemainingBudget.setText(messageRemainingBudget);
	}
	

	//Method to calculate the expenses
	public void calculateExpenses() {
		
		//Take the texts from the text fields
		String incomeStr = txtIncome.getText();
		String costRentStr = txtRent.getText();
		String costLoansStr = txtLoans.getText();
		String costCarStr = txtCar.getText();
		String costGasStr = txtGas.getText();
		String costInsuranceStr = txtInsurance.getText();
		String costGymStr = txtGym.getText();
		String costRotaryStr = txtRotary.getText();
		String costFunStr = txtFun.getText();
		String costTravelStr = txtTravel.getText();
		String costMiscEtcStr = txtMiscEtc.getText();
		
		try {
			//Parse the text and make it a integer
			int income = Integer.parseInt(incomeStr);
			int costRent = Integer.parseInt(costRentStr);
			int costLoans = Integer.parseInt(costLoansStr);
			int costCar = Integer.parseInt(costCarStr);
			int costGas = Integer.parseInt(costGasStr);
			int costInsurance = Integer.parseInt(costInsuranceStr);
			int costGym = Integer.parseInt(costGymStr);
			int costRotary = Integer.parseInt(costRotaryStr);
			int costFun = Integer.parseInt(costFunStr);
			int costTravel = Integer.parseInt(costTravelStr);
			int costMiscEtc = Integer.parseInt(costMiscEtcStr);
			
			//Total Expenses
			int costTotalExpenses = costRent + costLoans + costCar + costGas + costInsurance + costGym + costRotary + costFun + costTravel+ costMiscEtc;
			messageExpenses = "Total Expenses is: $" + costTotalExpenses;
			//Remaining Budget
			int remainingBudget = income - costTotalExpenses;
			messageRemainingBudget = "Remaining Budget is : $" + remainingBudget;
			//
		
		}
		catch (Exception e) {
			//If there is anything besides whole numbers like symbols or letters, ask user to enter whole numbers.
			messageExpenses = "Please enter whole numbers";
		}
		finally {
			//show expenses & remaining budget once calculated
			lblOutputTotalExpenses.setText(messageExpenses);
			lblOutputRemainingBudget.setText(messageRemainingBudget);
		}		
	}
	
	
	
	public Budget() {
		setTitle("Jeannie's Budget GUI");
		getContentPane().setLayout(null);
		
		
		
		JLabel lblJeanniesBudget = new JLabel("Jeannie's Budget");
		lblJeanniesBudget.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeanniesBudget.setFont(new Font("Cooper Black", Font.PLAIN, 28));
		lblJeanniesBudget.setBounds(12, 0, 408, 50);
		getContentPane().add(lblJeanniesBudget);
		
		txtIncome = new JTextField();
		txtIncome.setText("");
		txtIncome.setBounds(226, 61, 140, 22);
		getContentPane().add(txtIncome);
		txtIncome.setColumns(10);
		
		JLabel lblMonthlyNetIncome = new JLabel("Monthly Net Income");
		lblMonthlyNetIncome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMonthlyNetIncome.setBounds(80, 63, 155, 16);
		getContentPane().add(lblMonthlyNetIncome);
		
		txtRent = new JTextField();
		txtRent.setText("");
		txtRent.setColumns(10);
		txtRent.setBounds(226, 90, 140, 22);
		getContentPane().add(txtRent);
		
		JLabel lblRent = new JLabel("Rent");
		lblRent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRent.setBounds(80, 92, 155, 16);
		getContentPane().add(lblRent);
		
		txtLoans = new JTextField();
		txtLoans.setText("");
		txtLoans.setColumns(10);
		txtLoans.setBounds(226, 125, 140, 22);
		getContentPane().add(txtLoans);
		
		JLabel lblLoans = new JLabel("Loans");
		lblLoans.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoans.setBounds(80, 125, 155, 16);
		getContentPane().add(lblLoans);
		
		txtCar = new JTextField();
		txtCar.setText("");
		txtCar.setColumns(10);
		txtCar.setBounds(226, 160, 140, 22);
		getContentPane().add(txtCar);
		
		JLabel lblCar = new JLabel("Car");
		lblCar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCar.setBounds(80, 160, 155, 16);
		getContentPane().add(lblCar);
		
		txtGas = new JTextField();
		txtGas.setText("");
		txtGas.setColumns(10);
		txtGas.setBounds(226, 195, 140, 22);
		getContentPane().add(txtGas);
		
		JLabel lblGas = new JLabel("Gas");
		lblGas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGas.setBounds(80, 195, 155, 16);
		getContentPane().add(lblGas);
		
		txtInsurance = new JTextField();
		txtInsurance.setText("");
		txtInsurance.setColumns(10);
		txtInsurance.setBounds(226, 230, 140, 22);
		getContentPane().add(txtInsurance);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInsurance.setBounds(80, 230, 155, 16);
		getContentPane().add(lblInsurance);
		
		txtRotary = new JTextField();
		txtRotary.setText("");
		txtRotary.setColumns(10);
		txtRotary.setBounds(226, 300, 140, 22);
		getContentPane().add(txtRotary);
		
		JLabel lblRotary = new JLabel("Rotary");
		lblRotary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRotary.setBounds(80, 302, 155, 16);
		getContentPane().add(lblRotary);
		
		txtFun = new JTextField();
		txtFun.setText("");
		txtFun.setColumns(10);
		txtFun.setBounds(226, 332, 140, 22);
		getContentPane().add(txtFun);
		
		JLabel lblFun = new JLabel("Fun");
		lblFun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFun.setBounds(80, 334, 155, 16);
		getContentPane().add(lblFun);
		
		txtTravel = new JTextField();
		txtTravel.setText("");
		txtTravel.setColumns(10);
		txtTravel.setBounds(226, 370, 140, 22);
		getContentPane().add(txtTravel);
		
		JLabel lblTravel = new JLabel("Travel");
		lblTravel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTravel.setBounds(80, 372, 155, 16);
		getContentPane().add(lblTravel);
		
		txtMiscEtc = new JTextField();
		txtMiscEtc.setText("");
		txtMiscEtc.setColumns(10);
		txtMiscEtc.setBounds(226, 408, 140, 22);
		getContentPane().add(txtMiscEtc);
		
		JLabel lblMiscEtc = new JLabel("Misc./Etc.");
		lblMiscEtc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMiscEtc.setBounds(80, 410, 155, 16);
		getContentPane().add(lblMiscEtc);
		
		//Calculate Button
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateExpenses();
			}
		});
		btnCalculate.setBounds(175, 481, 97, 25);
		getContentPane().add(btnCalculate);
		
		lblOutputTotalExpenses = new JLabel("Enter in your expenses above and click calculate!");
		lblOutputTotalExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutputTotalExpenses.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOutputTotalExpenses.setBounds(12, 439, 408, 40);
		getContentPane().add(lblOutputTotalExpenses);
		
		lblOutputRemainingBudget = new JLabel(" ");
		lblOutputRemainingBudget.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutputRemainingBudget.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOutputRemainingBudget.setBounds(12, 505, 408, 40);
		getContentPane().add(lblOutputRemainingBudget);
		
		//Reset Button
		JButton btnReset = new JButton("Reset!");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
				
			}
		});
		btnReset.setBounds(175, 559, 97, 25);
		getContentPane().add(btnReset);
		
		txtGym = new JTextField();
		txtGym.setText("");
		txtGym.setColumns(10);
		txtGym.setBounds(226, 265, 140, 22);
		getContentPane().add(txtGym);
		
		JLabel lblGym = new JLabel("Gym");
		lblGym.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGym.setBounds(80, 265, 155, 16);
		getContentPane().add(lblGym);
	}

	public static void main(String[] args) {
	
		Budget budgetGUI = new Budget();
	    budgetGUI.reset();
	    budgetGUI.setSize(new Dimension(450,650));
	    budgetGUI.setVisible(true);
	}
}
