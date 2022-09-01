package program1;
import javax.swing.JOptionPane;
public class DiologBox {

	public static void main(String[] args) {
	
		
		
		JOptionPane.showMessageDialog(null, "Welcome");

	      String name = JOptionPane.showInputDialog("What is your name? ");
	      String sirname = JOptionPane.showInputDialog("What is your Sirname? ");
	      
		System.out.println(name.substring(5,6));
		JOptionPane.showMessageDialog(null,name+sirname);
		JOptionPane.showMessageDialog(null,name.toUpperCase());
		System.out.println(sirname.toUpperCase());
		JOptionPane.showMessageDialog(null,(name.concat(sirname)).toUpperCase());
		
		// TODO Auto-generated method stub

	}

}
