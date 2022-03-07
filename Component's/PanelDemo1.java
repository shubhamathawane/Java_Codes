import java.awt.*;


class PanelDemo1 extends Panel
	{
		public PanelDemo1()
		{

		    setLayout(null);


			Font f =  new Font ("Arial", Font.BOLD,17);
			this.setFont(f);

			this.setForeground(new Color(63, 61, 61));

		
			Label header = new Label("Tuition Registration");
			header.setBounds(00,40,500,37);
			Font hf = new Font("Arial", Font.BOLD, 25);
			header.setFont(hf);
			header.setBackground(new Color(230, 103, 96));
			header.setForeground(Color.white);

			Label fill = new Label("Fill the Details Below");
			fill.setBounds(40,90,500,37);
			Font ffont = new Font("Arial",Font.PLAIN,23);
			fill.setFont(ffont);

			Label line = new Label("....................................................................................................................................................................................");
			line.setBounds(0,120,500,20);
			line.setForeground(new Color(202, 198, 198));




			Label name = new Label("Name");
			name.setBounds(40,140,150,25);


			TextField tfname = new TextField();
			tfname.setBounds(40,170,140,25);
			tfname.setForeground(new Color(202, 198, 198));

			TextField tflname = new TextField();
			tflname.setBounds(200,170,250,25);
			tflname.setForeground(new Color(202, 198, 198));

			Label fname = new Label("First");
			fname.setBounds(40,200,150,25);
			fname.setForeground(new Color(138, 135, 134));
			Font namefont =  new Font ("Arial", Font.PLAIN,17);
			fname.setFont(namefont);	



			Label lname = new Label("Last");
			lname.setBounds(200,200,150,25);
			lname.setForeground(new Color(138, 135, 134));
			Font lnamefont =  new Font ("Arial", Font.PLAIN,17);
			lname.setFont(lnamefont);

			
			Label dep = new Label("Department");
			dep.setBounds(40,230,150,25);
			TextField deptf = new TextField();
			deptf.setBounds(40,260,250,25);

			Label uc = new Label("Univercity/Collage Name");
			uc.setBounds(40,290,150,25);
			TextField untf = new TextField();
			untf.setBounds(40,320,250,25);

			Label deg = new Label("Degree Pursued");
			deg.setBounds(40,350,150,25);
			TextField degtf = new TextField();
			degtf.setBounds(40,380,250,25);

			Label cost = new Label("Cost per Credit");
			cost.setBounds(40,420,150,25);
			Label rs = new Label("Rs.");
			rs.setBounds(40,450,30,25);

			TextField costtf =  new TextField();
			costtf.setBounds(70,450,95,25);
			Label dot = new Label(".");
			dot.setBounds(165,450,25,25);
			TextField costtf2 = new TextField();
			costtf2.setBounds(175,450,50,25);



			Button btn1 = new Button("Reset");
			btn1.setBounds(40,500,150,25);
			btn1.setBackground(new Color(230, 103, 96));
			btn1.setForeground(Color.white);


			Button btn2 = new Button("Submit");
			btn2.setBounds(250,500,150,25);
			btn2.setBackground(new Color(230, 103, 96));
			btn2.setForeground(Color.white);


			TextField tf1 = new TextField();
			TextField tf2 = new TextField();




			

			add(btn1);
			add(btn2);
			add(tf1);
			add(tf2);
			add(fname);
			add(lname);
			add(costtf);
			add(costtf2);
			add(tfname);
			add(tflname);
			add(dep);
			add(deptf);
			add(uc);
			add(untf);
			add(deg);
			add(cost);
			add(header);
			add(fill);
			add(line);
			add(name);
			add(degtf);
			add(rs);
			add(dot);

		}

}
