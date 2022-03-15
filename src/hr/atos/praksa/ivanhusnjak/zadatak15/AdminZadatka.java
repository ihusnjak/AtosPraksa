package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.util.ArrayList;

import hr.atos.praksa.ivanhusnjak.zadatak15.Zadaci.StatusZadatka;
import hr.atos.praksa.ivanhusnjak.zadatak15.Zadaci.TipZadatka;

public class AdminZadatka extends MenuElement {

	String opType = null;

	public AdminZadatka(String menuName, ArrayList<MenuElement> listOfSubMenus, String opType) {
		super(menuName, listOfSubMenus);
		this.opType = opType;
		// TODO Auto-generated constructor stub
	}

	public AdminZadatka(String menuName, ArrayList<MenuElement> listOfSubMenus) {
		super(menuName, listOfSubMenus);
		// TODO Auto-generated constructor stub
	}

	public AdminZadatka(String menuName, ArrayList<MenuElement> listOfSubMenus, String opType, MenuElement parent) {
		super(menuName, listOfSubMenus);
		this.opType = opType;
		this.parent = parent;
		isExecutorElement = true;
	}

	@Override
	public MenuElement performMenuAction() {
		// TODO Auto-generated method stub
		switch (opType) {
		case "c":
			System.out.println("Kreiranje zadatka:\n----------------------");
			System.out.print("Unesite naziv zadatka:");
			String name = scanner.nextLine();
			System.out.print("Unesite opis zadatka:");
			String description = scanner.nextLine();
			System.out.print("Unesite tip zadatka - brojcani unos 1) BUG 2) TASK :");
			TipZadatka tip = null;
			try {
				int unos = Integer.parseInt(scanner.nextLine());
				switch (unos) {
				case 1:
					tip = TipZadatka.BUG;
					break;
				case 2:
					tip = TipZadatka.TASK;
					break;
				default:
					tip = TipZadatka.BUG;
				}
			} catch (Exception e) {
				System.out.println("Krivi unos");
			}
			System.out.print("Unesite kompleksnost zadatka - brojcani unos od 1 do 10 :");
			int kompleksnost = 1;
			try {
				kompleksnost = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Krivi unos");
			}
			Zadaci zadatak = new Zadaci(name, description, null, tip, null, kompleksnost, 0, System.currentTimeMillis(), 0);
			TestCode.zadaci.add(zadatak);
			
			break;
		case "r":
			System.out.println("Postojeci zadaci:\n--------------");
			for (int i = 0; i < TestCode.zadaci.size(); i++) {
				System.out.println((i + 1) + ". " + TestCode.zadaci.get(i).toString());
			}
			break;
		case "u":
			System.out.println("Postojeci zadaci:\n--------------");
			for (int i = 0; i < TestCode.zadaci.size(); i++) {
				System.out.println((i + 1) + ". " + TestCode.zadaci.get(i).toString());
			}
			boolean wereGood = false;
			int choice = -1;
			while(!wereGood) {
				System.out.println("Koji zadatak zelite izmjeniti (unesi broj):");
				String strChoice = scanner.nextLine();
				try {
					if((choice = Integer.parseInt(strChoice)) > 0 && choice < TestCode.zadaci.size()+1) {
						wereGood = true;
					}
				} catch(Exception e) {
					System.out.println("Krivi unos");
				}
			}
			System.out.println("Unesi nove podatke za " + TestCode.zadaci.get(choice - 1).toString());
			System.out.print("Unesite naziv zadatka:");
	        TestCode.zadaci.get(choice - 1).setName(scanner.nextLine());
	        System.out.print("Unesite opis:");
	        TestCode.zadaci.get(choice - 1).setDescription(scanner.nextLine());
	        System.out.print("Izmjena tipa, unesite 1 za BUG ili 2 za TASK");
	        int choiceForType = scanner.nextInt();
	        if(choiceForType == 1) {
	        	TestCode.zadaci.get(choice - 1).setType(TipZadatka.BUG);
	        } else if(choiceForType == 2) {
	        	TestCode.zadaci.get(choice - 1).setType(TipZadatka.TASK);
	        }
	        System.out.print("Izmjenite status - 1) OPEN 2) IN PROGRESS 3) CLOSED");
	        int choiceForStatus = scanner.nextInt();
	        if(choiceForStatus == 1) {
	        	TestCode.zadaci.get(choice - 1).setStatus(StatusZadatka.OPEN);
	        	TestCode.zadaci.get(choice - 1).setStartDateTime(System.currentTimeMillis());
	        	break;
	        } else if(choiceForStatus == 2) {
	        	TestCode.zadaci.get(choice - 1).setStatus(StatusZadatka.IN_PROGRESS);
	        	break;
	        } else if(choiceForStatus == 3) {
	        	TestCode.zadaci.get(choice - 1).setStatus(StatusZadatka.CLOSED);
	        	TestCode.zadaci.get(choice - 1).setEndDateTime(System.currentTimeMillis());
	        }
	        System.out.print("Izmjena kompleksnosti, brojcano od 1 do 10");
	        TestCode.zadaci.get(choice - 1).setComplexity(scanner.nextInt());
	        System.out.println("Usješna izmjena podataka!");
			break;
		case "d":
			System.out.println("Obrisi zadatak:");
			System.out.println("Postojeci zadaci:\n--------------");
			for (int i = 0; i < TestCode.zadaci.size(); i++) {
				System.out.println((i + 1) + ". " + TestCode.zadaci.get(i).toString());
			}
			boolean wereGood2 = false;
			int choice2 = -1;
			while(!wereGood2) {
				System.out.println("Koji zadatak zelite obrisati (unesi broj):");
				String strChoice = scanner.nextLine();
				try {
					if((choice2 = Integer.parseInt(strChoice)) > 0 && choice2 < TestCode.zadaci.size()+1) {
						wereGood2 = true;
					}
				} catch(Exception e) {
					System.out.println("Krivi unos");
				}
			}
			System.out.println("Uspjesno ste obrisali : " + TestCode.zadaci.get(choice2 - 1).toString());
			TestCode.zadaci.remove(choice2 - 1);
			break;
		case "uu":
			System.out.println("Postojeci zadaci:\n--------------");
			for (int i = 0; i < TestCode.zadaci.size(); i++) {
				System.out.println((i + 1) + ". " + TestCode.zadaci.get(i).toString() + "\n--------------");
			}
			System.out.println("Postojeci zaposlenici:\n--------------");
			for(int i=0;i<TestCode.zaposlenici.size();i++) {
				System.out.println( (i+1) + ". " + TestCode.zaposlenici.get(i).toString() + "\n--------------");
			}
			boolean wereGood3 = false;
			int choice3 = -1;
			int choice4 = -1;
			while(!wereGood3) {
				System.out.println("Odaberite zaposlenika i zadatk na koji ga zelite dodjeliti: ");
			System.out.println("Unesite redni broj zaposlenika:");
			String imeZaposlenika = scanner.nextLine();
			System.out.println("Unesite redni broj zadatka:");
			String imeZadatka = scanner.nextLine(); 
			try {
				if(((choice3 = Integer.parseInt(imeZaposlenika)) > 0 && choice3 < TestCode.zaposlenici.size() + 1) 
						&& ((choice4 = Integer.parseInt(imeZadatka)) > 0 && choice4 < TestCode.zadaci.size() + 1)) {
					TestCode.zadaci.get(choice4 -1).pplOnTask.add(TestCode.zaposlenici.get(choice3 -1));
					TestCode.zadaci.get(choice4 -1).setStatus(StatusZadatka.IN_PROGRESS);
					System.out.println("OK");
					wereGood3 = true;
				}
			} catch(Exception e) {
				System.out.println("Krivi unos");
			}
			}
			
			break;
		}
		return parent;
	}

}
