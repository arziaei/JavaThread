package vm.message;
import javax.swing.DefaultListModel;

public class AddTolist {
	public static void GetMesAddtolist(DefaultListModel<String> listModelInput,String st) {
		
		listModelInput.addElement(st);
	}

}
