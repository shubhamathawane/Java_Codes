import java.awt.*;

class CalculatorGUI extends Frame
	{
		public CalculatorGUI()
			{
			
				setLayout(null);

				Font f = new Font("Arial", Font.PLAIN,17);
				this.setFont(f);

				Label title = new Label("Calculator");
				title.setBounds(220,35,150,25);
				
				String s1 = "Enter First Number";
				Label lb1 = new Label(s1);
				lb1.setBounds(100,80,150,25);
				Label lb2 = new Label("Enter Second Number");
				lb2.setBounds(100,140,170,25);
				Label lb3 = new Label("Result is : ");
				lb3.setBounds(100,250,100,25);
		
				Button btn1 = new Button("ADD");
				btn1.setBounds(100,200,80,25);
				Button btn2 = new Button("SUB");
				btn2.setBounds(200,200,80,25);
				Button btn3 = new Button("Multiply");
				btn3.setBounds(300,200,80,25);
				Button btn4 = new Button("Divide");
				btn4.setBounds(400,200,65,25);				

				TextField tf1 = new TextField();
				tf1.setBounds(300,80,160,25);
				TextField tf2 = new TextField();
				tf2.setBounds(300,140,160,25);
				TextField tf3 = new TextField();
				tf3.setBounds(300,250,160,25);
				
				add(title);								
				add(lb1);
				add(lb2);
				add(lb3);
				add(tf1);
				add(tf2);
				add(tf3);
				add(btn1);
				add(btn2);
				add(btn3);
				add(btn4);
			
}				

	public static void main(String args[])
			{
			
				CalculatorGUI cg = new CalculatorGUI();
				cg.setSize(500,400);
				cg.setTitle("CalculatorGUI");
				cg.setVisible(true);
				
			}
	
}
	