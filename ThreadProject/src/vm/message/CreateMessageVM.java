package vm.message;
import java.util.EnumSet;
import java.util.Random;

import javax.swing.DefaultListModel;

public class CreateMessageVM {
	
	public static void Createid(DefaultListModel<String> listModelInput,String NameVM) {
		
		String Mes;
		Random rand = new Random();
		
		int ValueCalMes = 1+rand.nextInt(9);
		
		EventVM eventValue = null;
		
		switch (ValueCalMes) {
		case 1: Mes="Send Message As : "+NameVM+" \t Id is :[["+eventValue.Mes1.getId()+"]] \t Kind : "+eventValue.Mes1.getKind()+" \r \t"+eventValue.Mes1.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
		        break;
		        
		case 2: Mes="Send Message As : "+NameVM+" \t Id is :[["+eventValue.Mes2.getId()+"]] \t Kind : "+eventValue.Mes2.getKind()+" \r \t"+eventValue.Mes2.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
		        break;
		        
		case 3: Mes="Send Message As : "+NameVM+" \t Id is :[["+eventValue.Mes3.getId()+"]] \t Kind : "+eventValue.Mes3.getKind()+" \r \t"+eventValue.Mes3.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
		        break;
		        
		case 4: Mes="Send Message As : "+NameVM+" \t Id is :"+eventValue.Mes4.getId()+" \t Kind : "+eventValue.Mes4.getKind()+" \r \t"+eventValue.Mes4.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
		        break;
		        
		case 5: Mes="Send Message As : "+NameVM+" \t Id is :"+eventValue.Mes5.getId()+" \t Kind : "+eventValue.Mes5.getKind()+" \r \t"+eventValue.Mes5.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
				break;
		        
		case 6: Mes="Send Message As : "+NameVM+" \t Id is :"+eventValue.Mes6.getId()+" \t Kind : "+eventValue.Mes6.getKind()+" \r \t"+eventValue.Mes6.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
				break;
				
		case 7: Mes="Send Message As : "+NameVM+" \t Id is :"+eventValue.Mes7.getId()+" \t Kind : "+eventValue.Mes7.getKind()+" \r \t"+eventValue.Mes7.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
				break;
				
		case 8: Mes="Send Message As : "+NameVM+" \t Id is :"+eventValue.Mes8.getId()+" \t Kind : "+eventValue.Mes8.getKind()+" \r \t"+eventValue.Mes8.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
				break;

		case 9: Mes="Send Message As : "+NameVM+" \t Id is :"+eventValue.Mes9.getId()+" \t Kind : "+eventValue.Mes9.getKind()+" \r \t"+eventValue.Mes9.getMessage();
				addTolist.GetMesAddtolist(listModelInput,Mes);
				break;

		default:Mes="Out Of Range";
				addTolist.GetMesAddtolist(listModelInput,"ValueCalMes : "+ValueCalMes);
				addTolist.GetMesAddtolist(listModelInput,Mes);
		        break;
		}
		
//		for (EventVM eventValue : EventVM.values()) {
//			Mes="Send Message As : "+NameVM+" \t Id is :"+eventValue.getId()+" \t Kind : "+eventValue.getKind()+" \r \t"+eventValue.getMessage();
//			addTolist.GetMesAddtolist(listModelInput,Mes);
//		}
	}

}
