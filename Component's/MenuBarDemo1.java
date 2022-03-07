import java.awt.*;
import java.awt.event.KeyEvent;

class MenuBarDemo1 extends Frame
{

	public MenuBarDemo1(){

			MenuBar mb = new MenuBar();
			// Base is created


			Menu m1 =  new Menu("File");
			Menu m2 =  new Menu("Edit");
			Menu m3 =  new Menu("Format");
			Menu m4 =  new Menu("View");
			Menu m5 =  new Menu("Help");

			mb.add(m1);
			mb.add(m2);
			mb.add(m3);
			mb.add(m4);
			mb.add(m5);

			//Menu has been created and added in MenuBar.


			MenuItem mi1 = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
			MenuItem mi2 = new MenuItem("New Window", new MenuShortcut(KeyEvent.VK_N,true));
			MenuItem mi3 = new MenuItem("Open...", new MenuShortcut(KeyEvent.VK_O));
			MenuItem mi4 = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
			MenuItem mi5 = new MenuItem("Save As...", new MenuShortcut(KeyEvent.VK_S,true));
			MenuItem mi6 = new MenuItem("Page Setup");
			MenuItem mi7 = new MenuItem("Print", new MenuShortcut(KeyEvent.VK_P));
			MenuItem mi8 = new MenuItem("Exit");

			m1.add(mi1); m1.add(mi2);m1.add(mi3);m1.add(mi4);m1.add(mi5); m1.add(mi6);m1.add(mi7);m1.add(mi8);


			MenuItem mi21 = new MenuItem("Undo", new MenuShortcut(KeyEvent.VK_Z));
			MenuItem mi22 = new MenuItem("Cut", new MenuShortcut(KeyEvent.VK_X));
			MenuItem mi23 = new MenuItem("Copy", new MenuShortcut(KeyEvent.VK_X));
			MenuItem mi24 = new MenuItem("Past", new MenuShortcut(KeyEvent.VK_V));
			MenuItem mi25 = new MenuItem("Delete");
			MenuItem mi26 = new MenuItem("Search with being..", new MenuShortcut(KeyEvent.VK_E));
			MenuItem mi27 = new MenuItem("Find", new MenuShortcut(KeyEvent.VK_F));
			MenuItem mi28 = new MenuItem("Find Next");
			MenuItem mi29 = new MenuItem("Find Previous");
			MenuItem mi30 = new MenuItem("Replace", new MenuShortcut(KeyEvent.VK_H));
			MenuItem mi31 = new MenuItem("Go To", new MenuShortcut(KeyEvent.VK_G));
			MenuItem mi32 = new MenuItem("Select All", new MenuShortcut(KeyEvent.VK_A) );
			MenuItem mi33= new MenuItem("Time/Date");

			m2.add(mi21);m2.add(mi22);m2.add(mi23);m2.add(mi24);m2.add(mi25);
			m2.add(mi26);m2.add(mi27);m2.add(mi28);m2.add(mi29);m2.add(mi30);
			m2.add(mi31);m2.add(mi32);m2.add(mi33);

			CheckboxMenuItem cmi = new CheckboxMenuItem("Word Wrap");
			MenuItem fmi1 = new MenuItem("Font");
			m3.add(cmi); m3.add(fmi1);

			

			Menu subm = new Menu("Zoom");
			MenuItem miv2 = new MenuItem("Status Bar");


			MenuItem submi = new MenuItem("Zoom In");
			MenuItem submi2 = new MenuItem("Zoom Out");
			MenuItem submi3 = new MenuItem("Restore Default Zoom");
			
			subm.add(submi);subm.add(submi2);subm.add(submi3);


			m4.add(subm); m4.add(miv2);

			//Adding these items in submenu using the object of First menu
			


			MenuItem helpmi = new MenuItem("View Help");
			MenuItem helpmi2 = new MenuItem("Send Feedback");
			MenuItem helpmi3 = new MenuItem("About Notepad");

			m5.add(helpmi);m5.add(helpmi2); m5.add(helpmi3);

			TextArea ta = new TextArea();
			Font f = new Font("Nirmal UI",Font.PLAIN,18);
			ta.setFont(f);
			add(ta);



			setMenuBar(mb);

	}

	public static void main(String[] ags)
	{

		MenuBarDemo1 md1 = new MenuBarDemo1();
		md1.setSize(400,400);
		md1.setVisible(true);
		md1.setTitle("Untitled- Notepad");




	}

}