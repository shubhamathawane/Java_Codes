import java.awt.*;

class WorkshopRegistration extends Frame
 	{

 				public WorkshopRegistration()
 					{

 						setLayout(null);

 						Font f = new Font("Arial",Font.PLAIN,16);
 						this.setFont(f);


 						Label h1 = new Label("Workshop Registration");
 						h1.setBounds(30,30,5000,35);
 						Font h1font = new Font("Arial", Font.BOLD,22);
 						h1.setFont(h1font);
 						h1.setBackground(new Color(162, 203, 187));


 						Choice maction = new Choice();
 						maction.setBounds(320,35,150,25);
 						maction.setBackground(new Color(162, 203, 187));
 						maction.add("More Actions");
 						maction.add("Edit");
 						maction.add("About");
 						maction.add("Settings");




 						
 						Label footer = new Label(" _________ ");
 						footer.setBounds(0,700,5000,55);
 						footer.setBackground(new Color(227, 227, 227));

 						Button btn = new Button("Submit");
 						btn.setBounds(550,700,150,25);
 						btn.setBackground(new Color(162, 203, 187));
 						btn.setForeground(Color.white);
 						Font fbtn = new Font("Arial",Font.BOLD,16);
 						btn.setFont(fbtn);

 						Button btn2 = new Button("Reset");
 						btn2.setBounds(730,700,150,25);
 						btn2.setBackground(new Color(162, 203, 187));
 						btn2.setForeground(Color.white);
 						Font fbtn2 = new Font("Arial",Font.BOLD,16);
 						btn2.setFont(fbtn2);


 						Label h2 = new Label("Register now while seats are available!");
 						h2.setBounds(30,68,300,25);
 						Font h2font = new Font("Arial", Font.PLAIN,16);
 						h2.setFont(h2font);

 						Label fname = new Label("First Name *");
 						fname.setBounds(30,100,150,30);
 						TextField tfname = new TextField();
 						tfname.setBounds(300,100,280,25);


 						Label lname = new Label("Last Name *");
 						lname.setBounds(30,150,150,25);
 						TextField tflname = new TextField();
 						tflname.setBounds(300,150,280,25);


 						Label cmpinfo = new Label("Company Institution *");
 						cmpinfo.setBounds(30,200,150,25);
 						TextField tfcm = new TextField();
 						tfcm.setBounds(300,200,280,25);	

 						Label txaddress = new Label("Address");
 						txaddress.setBounds(30,250,150,25);
 						TextArea ta = new TextArea();
 						ta.setBounds(300,250,280,180);


 						Label city = new Label("City");
 						city.setBounds(30,460,150,25);
 						TextField tfcity = new TextField();
 						tfcity.setBounds(300,460,280,25);
		
 						Label lbst = new Label("State/Province/Region");
 						lbst.setBounds(30,510,190,25);
 						Choice st = new Choice();
 						st.setBounds(300,510,280,25);

 						Label lbcn = new Label("Country");
 						lbcn.setBounds(30,560,150,25);
 						Choice cn = new Choice();
 						cn.setBounds(300,560,280,25);

 						Label email = new Label("Email *");
 						email.setBounds(30,610,150,25);
 						TextField tfemail = new TextField();
 						tfemail.setBounds(300,610,280,25);

 						Label pn = new Label("Phone Number *");
 						pn.setBounds(30,660,150,25);
 						TextField tfpn = new TextField();
 						tfpn.setBounds(300,660,280,25);

 						Font flunch = new Font("Airal",Font.BOLD,17);
 						Label lunch = new Label("Lunch");
 						lunch.setFont(flunch);
 						lunch.setBounds(620,80,150,25);

 						



 						Label lbmp = new Label("Meal Preference");
 						lbmp.setBounds(620,130,150,25);
 						Choice mp = new Choice();
 						mp.setBounds(900,130,280,25);

 						mp.add("Vegetarain");
 						mp.add("Non-veg");
 						mp.add("Both");

 						Label payDetail = new Label("Payment Details");
 						payDetail.setBounds(620,180,150,25);
 						Font fpay = new Font("Arial", Font.BOLD,16);
 						payDetail.setFont(fpay);


 						Label payd = new Label ("Payment Mode");
 						payd.setBounds(620,230,150,25);

 						//checkboxes

 						Checkbox ch1 = new Checkbox("Cash");
 						ch1.setBounds(900,230,280,25);
 						Checkbox ch2 = new Checkbox("Cheque");
 						ch2.setBounds(900,260,280,25);	
 						Checkbox ch3 = new Checkbox("Demand Draft");
 						ch3.setBounds(900,290,280,25);

 						Label dd = new Label("DD Cheque No.");
 						dd.setBounds(620,340,170,25);
 						TextField tfdd = new TextField();
 						tfdd.setBounds(900,340,280,25);

 						Label dbn = new Label("Draw On (Bank Name)");
 						dbn.setBounds(620,390,170,25);
 						TextField tfdbn = new TextField();
 						tfdbn.setBounds(900,390,280,25);

 						Label pyat = new Label("Payble At");
 						pyat.setBounds(620,440,170,25);
 						TextField tfpyat = new TextField();
 						tfpyat.setBounds(900,440,280,25);
 						


 						Label remark = new Label("Remark");
 						remark.setBounds(620,490,150,25);
 						TextArea ta2 = new TextArea();
 						ta2.setBounds(900,490,280,150);


 						cn.add("-Select-");
 						cn.add("India");
 						cn.add("Us");
 						cn.add("Uk");
 						cn.add("Russi");


 						st.add("-Select-");
 						st.add("Maharashtra");
 						st.add("Goa");
 						st.add("Kolkatta");
 						st.add("Madya Pradesh");
 						st.add("Jammu & Kashmir");

 						

 						


 						add(maction);
 						add(tfname);
 						add(st);
 						add(cn);
 						add(mp);
 						add(fname);
 						add(tflname);
 						add(lname);
 						add(city);
 						add(ta);
 						add(cmpinfo);
 						add(tfcm);
 						add(txaddress);
 						add(city);
 						add(tfcity);
 						add(lbst);
 						add(lbcn);
 						add(pn);
 						add(tfpn);
 						add(email);
 						add(tfemail);
 						add(lunch);
 						add(mp);
 						add(lbmp);
 						add(payDetail);
 						add(payd);
 						//add(chb);
 						add(ch1);
 						add(ch2);
 						add(ch3);
 						add(dd);
 						add(tfdd);
 						add(dbn);
 						add(tfdbn);
 						add(pyat);
 						add(tfpyat);
 						add(remark);
 						add(ta2);
 						add(h1);
 						add(h2);
 						add(btn);
 						add(btn2);
 						add(footer);

 						

 					}


 		public static void main(String[] args) 
 			{		

 			WorkshopRegistration wr = new WorkshopRegistration();
 			wr.setSize(2000,1080);
 			wr.setVisible(true);

 			}

  	}