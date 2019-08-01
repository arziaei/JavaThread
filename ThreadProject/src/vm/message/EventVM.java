package vm.message;

public enum EventVM {
	Mes1(100,"ErrorVM","The power of the machine is disconnected"),
	Mes2(101,"ErrorVM","Money is over"),
	Mes3(102,"ErrorVM","Machine connection to server is disconnected"),
	Mes4(200,"CusMes","Customer information read"),
	Mes5(201,"CusMes","The customer's money balance was paid"),
	Mes6(202,"CusMes","Customer card information was received"),
	Mes7(203,"CusMes","Enter password again"),
	Mes8(300,"ErrorCus","Incorrect password"),
	Mes9(301,"ErrorCus","Account balance is not enough");
	
	private final int Id;
	private final String Kind;
	private final String Message;
	
	private EventVM(int id, String kind, String message) {
		Id = id;
		Kind = kind;
		Message = message;
	}

	public int getId() {
		return Id;
	}

	public String getKind() {
		return Kind;
	}

	public String getMessage() {
		return Message;
	}
	
}
