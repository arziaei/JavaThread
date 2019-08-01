import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import javax.swing.event.ChangeEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import javax.swing.JScrollBar;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				setVisible(false);
			    dispose();
			    System.exit(0); 
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel<String> listModel = new DefaultListModel<>();  
		
	//addTolist.GetMesAddtolist(listModel, "---------------------------------------------- Start Prj------------------------------------------------------------------");
		
		JPanel panelVM1 = new JPanel();
		panelVM1.setBounds(22, 13, 224, 35);
		contentPane.add(panelVM1);
		
		JButton buttonVM1 = new JButton("VM 1");
		vmRunable runvm1 = actionPerformed.SetactionPerformedbutton(buttonVM1,listModel,"VM1(Run manually)");
		buttonVM1.setVerticalAlignment(SwingConstants.TOP);
		panelVM1.add(buttonVM1);
		
		JRadioButton rdbtnStartVM1 = new JRadioButton("Start");
		rdbtnStartVM1.setName("rdbtnStartVM1");
		actionPerformed.radioButtonStartmode(rdbtnStartVM1,listModel, runvm1);
		rdbtnStartVM1.setMnemonic('T');
		panelVM1.add(rdbtnStartVM1);
		
		JRadioButton rdbtnStopVM1 = new JRadioButton("Stop");
		rdbtnStopVM1.setName("rdbtn_StopVM1");
		actionPerformed.radioButtonStopmode(rdbtnStopVM1,listModel ,runvm1);
		rdbtnStopVM1.setMnemonic('S');
		
		rdbtnStopVM1.setSelected(true);
		panelVM1.add(rdbtnStopVM1);
		
		new SetgroupRB(rdbtnStartVM1, rdbtnStopVM1);
				
		JPanel panelVM2 = new JPanel();
		panelVM2.setBounds(22, 65, 224, 35);
		contentPane.add(panelVM2);
		
		JButton buttonVM2 = new JButton("VM 2");
		vmRunable runvm2 = actionPerformed.SetactionPerformedbutton(buttonVM2,listModel,"VM2(Run manually)");
		actionPerformed.SetactionPerformedbutton(buttonVM2,listModel,"VM2");
		buttonVM2.setVerticalAlignment(SwingConstants.TOP);
		panelVM2.add(buttonVM2);
		
		JRadioButton rdbtnStartVM2 = new JRadioButton("Start");
		rdbtnStartVM2.setName("rdbtnStartVM2");
		actionPerformed.radioButtonStartmode(rdbtnStartVM2,listModel,runvm2);
		panelVM2.add(rdbtnStartVM2);
		
		JRadioButton rdbtnStopVM2 = new JRadioButton("Stop");
		rdbtnStopVM2.setName("rdbtn_StopVM2");
		actionPerformed.radioButtonStopmode(rdbtnStopVM2,listModel,runvm2);
		rdbtnStopVM2.setSelected(true);
		panelVM2.add(rdbtnStopVM2);
		
		new SetgroupRB(rdbtnStartVM2, rdbtnStopVM2);
		
		JPanel panelVM3 = new JPanel();
		panelVM3.setBounds(22, 113, 224, 35);
		contentPane.add(panelVM3);
		
		JButton buttonVM3 = new JButton("VM 3");
		vmRunable runvm3 = actionPerformed.SetactionPerformedbutton(buttonVM3,listModel,"VM3(Run manually)");
		actionPerformed.SetactionPerformedbutton(buttonVM3,listModel,"VM3");
		buttonVM3.setVerticalAlignment(SwingConstants.TOP);
		panelVM3.add(buttonVM3);
		
		JRadioButton rdbtnStartVM3 = new JRadioButton("Start");
		rdbtnStartVM3.setName("rdbtnStartVM3");
		actionPerformed.radioButtonStartmode(rdbtnStartVM3,listModel,runvm3);
		panelVM3.add(rdbtnStartVM3);
		
		JRadioButton rdbtnStopVM3 = new JRadioButton("Stop");
		rdbtnStopVM3.setName("rdbtn_StopVM3");
		actionPerformed.radioButtonStopmode(rdbtnStopVM3,listModel,runvm3);
		rdbtnStopVM3.setMnemonic('S');
		
		rdbtnStopVM3.setSelected(true);
		panelVM3.add(rdbtnStopVM3);
		
		new SetgroupRB(rdbtnStartVM3, rdbtnStopVM3);

		JPanel panelVM4 = new JPanel();
		panelVM4.setBounds(22, 165, 224, 35);
		contentPane.add(panelVM4);
		
		JButton buttonVM4 = new JButton("VM 4");
		vmRunable runvm4 = actionPerformed.SetactionPerformedbutton(buttonVM4,listModel,"VM4(Run manually)");
		actionPerformed.SetactionPerformedbutton(buttonVM4,listModel,"VM4");
		buttonVM4.setVerticalAlignment(SwingConstants.TOP);
		panelVM4.add(buttonVM4);
		
		JRadioButton rdbtnStartVM4 = new JRadioButton("Start");
		rdbtnStartVM4.setName("rdbtnStartVM4");
		actionPerformed.radioButtonStartmode(rdbtnStartVM4,listModel,runvm4);
		panelVM4.add(rdbtnStartVM4);
		
		JRadioButton rdbtnStopVM4 = new JRadioButton("Stop");
		rdbtnStopVM4.setName("rdbtn_StopVM4");
		actionPerformed.radioButtonStopmode(rdbtnStopVM4,listModel,runvm4);
		rdbtnStopVM4.setMnemonic('S');
		
		rdbtnStopVM4.setSelected(true);
		panelVM4.add(rdbtnStopVM4);
		
		new SetgroupRB(rdbtnStartVM4, rdbtnStopVM4);
		
		JPanel panelVM5 = new JPanel();
		panelVM5.setBounds(22, 217, 224, 35);
		contentPane.add(panelVM5);
		
		JButton buttonVM5 = new JButton("VM 5");
		vmRunable runvm5 = actionPerformed.SetactionPerformedbutton(buttonVM5,listModel,"VM5(Run manually)");
		actionPerformed.SetactionPerformedbutton(buttonVM5,listModel,"VM5");
		buttonVM5.setVerticalAlignment(SwingConstants.TOP);
		panelVM5.add(buttonVM5);
		
		JRadioButton rdbtnStartVM5 = new JRadioButton("Start");
		rdbtnStartVM5.setName("rdbtnStartVM5");
		actionPerformed.radioButtonStartmode(rdbtnStartVM5,listModel,runvm5);
		panelVM5.add(rdbtnStartVM5);
		
		JRadioButton rdbtnStopVM5 = new JRadioButton("Stop");
		rdbtnStopVM5.setName("rdbtn_StopVM5");
		actionPerformed.radioButtonStopmode(rdbtnStopVM5,listModel,runvm5);
		rdbtnStopVM5.setMnemonic('S');
		
		rdbtnStopVM5.setSelected(true);
		panelVM5.add(rdbtnStopVM5);
		
		new SetgroupRB(rdbtnStartVM5, rdbtnStopVM5);
		
//		JPanel panelShowMessage = new JPanel();
//		FlowLayout fl_panelShowMessage = (FlowLayout) panelShowMessage.getLayout();
//		panelShowMessage.setBounds(1, 275, 735, 420);
//		contentPane.add(panelShowMessage);
	
        JList<String> list = new JList<>(listModel);
        list.setValueIsAdjusting(true);
		list.setBounds(10, 275, 735, 390); 
		contentPane.add(list);
		//panelShowMessage.add(list);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 275, 735, 390);
		contentPane.add(scrollPane);
		//panelShowMessage.add(scrollPane);
		scrollPane.setViewportView(list);
			
	}
}
