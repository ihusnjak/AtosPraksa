package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdminReports extends MenuElement {

	String opType = null;
	
	public AdminReports(String menuName, ArrayList<MenuElement> listOfSubMenus) {
		super(menuName, listOfSubMenus);
		// TODO Auto-generated constructor stub
	}

	public AdminReports(String menuName, ArrayList<MenuElement> listOfSubMenus, String string2) {
		super(menuName, listOfSubMenus);
		this.opType = string2;
		// TODO Auto-generated constructor stub
	}

	public AdminReports(String menuName, ArrayList<MenuElement> listOfSubMenus, String string2, MenuElement parent) {
		super(menuName, listOfSubMenus);
		this.opType = string2;
		this.parent = parent;
		isExecutorElement = true;
	}

	@Override
	public MenuElement performMenuAction() {
		switch(opType) {
		case "1":
			System.out.println("Sortiranje po radnom mjestu: \n-------------");
			Map<String, List<Zaposlenik>> zaposleniciGrouped =
				    TestCode.zaposlenici.stream().collect(Collectors.groupingBy(w -> w.radnoMjesto));
			zaposleniciGrouped.forEach((key, value) -> System.out.println(key + ":" + value));
			System.out.println("-------------");
			break;
		case "2":
			System.out.println("Utroseno vrijeme po osobi: \n-------------");
			
			break;
		case "3":
			System.out.println("Najduze otvoren zadatak: \n-------------");
			Zadaci zadatakZaPrint = TestCode.zadaci.get(0);
			for(Zadaci zadatak : TestCode.zadaci) {
				if(zadatak.getStartDateTime() < zadatakZaPrint.getStartDateTime()) {
					zadatakZaPrint = zadatak;
				}
			}
			System.out.println(zadatakZaPrint + "Task opened: " + new Date(zadatakZaPrint.getStartDateTime()));
			break;
		}
		return parent;
	}

}
