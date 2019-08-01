package vm.message;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import vm.thread.vmRunable;

public class actionPerformed {

	JRadioButton Rb;
	DefaultListModel<String> ListModelInput;
	String NameVM;
	JButton B;

	public static void radioButtonStopmode(JRadioButton rb, DefaultListModel<String> listModelInput,
			vmRunable runvm) {
		rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb.isSelected()) {
					runvm.setStateThread(false);
					String NameVM = rb.getName();
					listModelInput.addElement(NameVM.substring(NameVM.length() - 8) + " \t\t" + java.time.LocalTime.now());
					listModelInput.addElement("---------Number of thread executions : "+String.valueOf(runvm.getCounter()));
				}
			}
		});
	}
	
	public static void radioButtonStartmode(JRadioButton rb, DefaultListModel<String> listModelInput,
			vmRunable runvm) {
		rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rb.isSelected()) {
					runvm.setStateThread(true);
					String NameVM = rb.getName();
					listModelInput.addElement(NameVM.substring(NameVM.length() - 8) + " \t\t" + java.time.LocalTime.now());
					
				}	
			}
		});
	}

	public static vmRunable SetactionPerformedbutton(JButton b, DefaultListModel<String> listModelInput, String NameVM) {
		final vmRunable runvm = new vmRunable(listModelInput, NameVM);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//runvm.setStateThread(true);	
				new Thread(runvm).start();

			}
		});

		return runvm;
	}

}
