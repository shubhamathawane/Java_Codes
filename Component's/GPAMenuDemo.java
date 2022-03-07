import java.awt.*;

class GPAMenuDemo extends Frame
{
	public GPAMenuDemo()
	{
		MenuBar mb = new MenuBar();							//Created a menu strip


		Menu menu1 = new Menu("File");						//Then we create menus 
		Menu m2 = new Menu("Edit");							//menus to be appear on the menu bar 
		Menu m3 = new Menu("View");							//After adding menus on menu bar , we should add the items of menu on menu

		mb.add(menu1);										//Adding the Menu's on MeneBar using the object of Menus's 
		mb.add(m2);											// Adding object of Menu on MenuBar mb.add(menu1)
		mb.add(m3);

		Menu submenu = new Menu("Files");					//For adding the submenu we have to creat a separete menu for making it submenu
		MenuItem si1 = new MenuItem("New");					//Creaing the items in that submenu we've creating earlier 
		MenuItem si2 = new MenuItem("Open");

		m3.add(submenu);									//Adding the submenu in main menu  
		submenu.add(si1);									// Adding items in submenu using the object of submenu : submenu.add(object of submenu)
		submenu.add(si2);

		menu1.add(submenu);									// Adding submenu on the main menu

		MenuItem mi6 = new MenuItem("Undo");
		MenuItem mi7 = new MenuItem("Cut");
		MenuItem mi8 = new MenuItem("Paste");
		MenuItem mi9 = new MenuItem("Delete");

		m2.add(mi6);m2.add(mi7);m2.add(mi8);m2.add(mi9);

		MenuItem mi10 = new MenuItem("Zoom");
		m3.add(mi10);

		TextArea t1 = new TextArea();
		add(t1);


		setMenuBar(mb);

	}
	
	public static void main(String[] args) {
		GPAMenuDemo md = new GPAMenuDemo();
		md.setSize(400,400);
		md.setVisible(true);
		md.setTitle("Demonstrating Menu");

	}
	
}