import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

/*
<applet code="JTreeDemo2" width=400 height=200>
</applet>
*/


public class JTreeDemo2 extends JApplet
{
	public JTreeDemo2()
	{
		Container ct = getContentPane();


		this.setLayout(new BorderLayout());

		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Options");


		//creating subtree of "A"

		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		root.add(a);

		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
		a.add(a1);

		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
		a.add(a2);

		//Creating sub tree of "B"

		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		root.add(b);

		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
		b.add(b1);

		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
		b.add(b2);

		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
		b.add(b3);

		DefaultMutableTreeNode c = new DefaultMutableTreeNode("C");
		b1.add(c);

		//Crete tree
		JTree tree = new JTree(root);

		//add tree to a scroll pane

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane jsp = new JScrollPane(tree,v,h);

		// Add scroll pane to the content pane

		ct.add(jsp, BorderLayout.CENTER);		
	}
	

}

