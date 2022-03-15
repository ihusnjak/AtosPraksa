package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdminZaposlenika extends MenuElement {

	String opType = null;

	public AdminZaposlenika(String menuName, ArrayList<MenuElement> listOfSubMenus) {
		super(menuName, listOfSubMenus);
		// TODO Auto-generated constructor stub
	}

	public AdminZaposlenika(String menuName, ArrayList<MenuElement> listOfSubMenus, String opType) {
		super(menuName, listOfSubMenus);
		this.opType = opType;
		isExecutorElement = true;
	}

	public AdminZaposlenika(String menuName, ArrayList<MenuElement> listOfSubMenus, String opType, MenuElement parent) {
		super(menuName, listOfSubMenus);
		this.opType = opType;
		this.parent = parent;
		isExecutorElement = true;
	}

	public void saveToDB() {
		System.out.println("Saving users to file DB");
		File myFile = new File("UsersDB");
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter(myFile);
			for (Zaposlenik z : TestCode.zaposlenici) {
				myWriter.write(z.toString().toCharArray());
				myWriter.write("\n".toCharArray());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (myWriter != null)
				try {
					myWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

	@Override
	public MenuElement performMenuAction() {
		// TODO Auto-generated method stub
		switch (opType) {
		case "c":
			System.out.println("Kreiranje zaposlenika:\n----------------------");
			System.out.print("Unesite ime:");
			String name = scanner.nextLine();
			System.out.print("Unesite prezime:");
			String surname = scanner.nextLine();
			System.out.print("Unesite radno mjesto:");
			String workplace = scanner.nextLine();
			System.out.print("Unesite OIB:");
			String oib = scanner.nextLine();
			Zaposlenik employeeToBeCreated = new Zaposlenik(name, surname, workplace, oib);
			TestCode.zaposlenici.add(employeeToBeCreated);
			saveToDB();
			break;
		case "r":
			System.out.println("Postojeci zaposlenici:\n--------------");
			for (int i = 0; i < TestCode.zaposlenici.size(); i++) {
				System.out.println((i + 1) + ". " + TestCode.zaposlenici.get(i).toString());
			}
			break;
		case "u":
			System.out.println("Postojeci zaposlenici:\n--------------");
			for (int i = 0; i < TestCode.zaposlenici.size(); i++) {
				System.out.println((i + 1) + ". " + TestCode.zaposlenici.get(i).toString());
			}
			// kojeg zelite izmijeniti, pa izmjena.. jel..
			boolean wereGood = false;
			int choice = -1;
			while (!wereGood) {
				System.out.println("Kojeg zaposlenika zelite izmjeniti (unesi broj):");
				String strChoice = scanner.nextLine();
				try {
					if ((choice = Integer.parseInt(strChoice)) > 0 && choice < TestCode.zaposlenici.size() + 1) {
						wereGood = true;
					}
				} catch (Exception e) {
					System.out.println("Krivi unos");
				}
			}
			System.out.println("Unesi nove podatke za " + TestCode.zaposlenici.get(choice - 1).toString());
			System.out.print("Unesite ime:");
			TestCode.zaposlenici.get(choice - 1).setIme(scanner.nextLine());
			System.out.print("Unesite prezime:");
			TestCode.zaposlenici.get(choice - 1).setPrezime(scanner.nextLine());
			System.out.print("Unesite radno mjesto:");
			TestCode.zaposlenici.get(choice - 1).setRadnoMjesto(scanner.nextLine());
			System.out.print("Unesite OIB:");
			TestCode.zaposlenici.get(choice - 1).setOib(scanner.nextLine());
			System.out.println("Usješna izmjena podataka!");
			saveToDB();
			break;
		case "d":
			System.out.println("Existing users:\n--------------");
			for (int i = 0; i < TestCode.zaposlenici.size(); i++) {
				System.out.println((i + 1) + ". " + TestCode.zaposlenici.get(i).toString());
			}
			boolean wereGood2 = false;
			int choice2 = -1;
			while (!wereGood2) {
				System.out.println("Kojeg zaposlenika zelite obrisati (unesi broj):");
				String strChoice = scanner.nextLine();
				try {
					if ((choice2 = Integer.parseInt(strChoice)) > 0 && choice2 < TestCode.zaposlenici.size() + 1) {
						wereGood2 = true;
					}
				} catch (Exception e) {
					System.out.println("Krivi unos");
				}
			}
			System.out.println("Uspjesno ste obrisali : " + TestCode.zaposlenici.get(choice2 - 1).toString());
			TestCode.zaposlenici.remove(choice2 - 1);
			saveToDB();
			break;
		}
		return parent;
	}

}
