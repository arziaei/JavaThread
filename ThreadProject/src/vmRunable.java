import javax.swing.DefaultListModel;

public class vmRunable implements Runnable {
	
	private DefaultListModel<String> listModelInput;
	private String NameVM;
	private boolean StateThread=false;
	private int Counter=1;
	
	
	public vmRunable(DefaultListModel<String> listModelInput, String nameVM) {
		super();
		this.listModelInput = listModelInput;
		NameVM = nameVM;
	}

	@Override
	public void run() {
		try {
				while (StateThread) {
					synchronized (new Object()) {
						//addTolist.GetMesAddtolist(getListModelInput(), "Run Thread");
						CreateMessageVM.Createid(getListModelInput(),getNameVM());
						Thread.sleep(1500);
						++Counter;
					}

				}
			} catch (Exception e) {
				vmThread.currentThread().interrupt();
				CreateMessageVM.Createid(getListModelInput(), getNameVM());
			}

	}


	public DefaultListModel<String> getListModelInput() {
		return listModelInput;
	}


	public void setListModelInput(DefaultListModel<String> listModelInput) {
		this.listModelInput = listModelInput;
	}


	public String getNameVM() {
		return NameVM;
	}


	public void setNameVM(String nameVM) {
		NameVM = nameVM;
	}
	
	public boolean isStateThread() {
		return StateThread;
	}


	public void setStateThread(boolean stateThread) {
		StateThread = stateThread;
	}

	public int getCounter() {
		return Counter;
	}

	public void setCounter(int counter) {
		Counter = counter;
	}
	
	

}
