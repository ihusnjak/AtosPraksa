package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;



public class TestCode {

	public static ArrayList<Zaposlenik> zaposlenici = new ArrayList<Zaposlenik>();
	public static ArrayList<Zadaci> zadaci = new ArrayList<Zadaci>();
	public static Zaposlenik loggedInUser;
	
	public void execute() {
		loadZaposlenika();
		
		MenuElement login = new Login("Login", null);	
		MenuElement mainMenu = new MainMenu("MainMenu", null);
		login.getListOfSubMenus().add(mainMenu);
		MenuElement adminUsera = new AdminZaposlenika("Administracija Usera", null);
		MenuElement adminZadat = new AdminZadatka("Administracija Zadataka", null);
		MenuElement izvjestaji = new AdminReports("Izvjestaji",null);
		
		mainMenu.getListOfSubMenus().add(adminUsera);
		mainMenu.getListOfSubMenus().add(adminZadat);
		mainMenu.getListOfSubMenus().add(izvjestaji);
		mainMenu.setParent(login);
		
		// Administracija usera
		MenuElement createUsera = new AdminZaposlenika("Kreiraj Usera", null, "c", adminUsera);
		MenuElement readUsera = new AdminZaposlenika("Citaj Usera", null, "r", adminUsera);
		MenuElement updateUsera = new AdminZaposlenika("Izmijeni Usera", null, "u", adminUsera);
		MenuElement deleteUsera = new AdminZaposlenika("Obrisi Usera", null, "d", adminUsera);
		adminUsera.getListOfSubMenus().add(createUsera);
		adminUsera.getListOfSubMenus().add(readUsera);
		adminUsera.getListOfSubMenus().add(updateUsera);
		adminUsera.getListOfSubMenus().add(deleteUsera);
		adminUsera.setParent(mainMenu);
		
		// Administracija Zadataka
		MenuElement createZad = new AdminZadatka("Kreiraj Zadatak", null, "c", adminZadat);
		MenuElement readZad = new AdminZadatka("Citaj Zadatak", null, "r", adminZadat);
		MenuElement updateZad = new AdminZadatka("Izmijeni Zadatak", null, "u", adminZadat);
		MenuElement deleteZad = new AdminZadatka("Obrisi Zadatak", null, "d", adminZadat);
		MenuElement appendZad = new AdminZadatka("Dodjeli Zadatak zaposleniku", null, "uu", adminZadat);
		adminZadat.getListOfSubMenus().add(createZad);
		adminZadat.getListOfSubMenus().add(readZad);
		adminZadat.getListOfSubMenus().add(updateZad);
		adminZadat.getListOfSubMenus().add(deleteZad);
		adminZadat.getListOfSubMenus().add(appendZad);
		adminZadat.setParent(mainMenu);
		
		// izvjestaji
		MenuElement izvjestaj1 = new AdminReports("Radnici po radnom mjestu", null, "1", izvjestaji);
		MenuElement izvjestaj2 = new AdminReports("Utroseno vrijeme po osobi", null, "2", izvjestaji);
		MenuElement izvjestaj3 = new AdminReports("Najduze otvoren zadatak", null, "3", izvjestaji);
		izvjestaji.getListOfSubMenus().add(izvjestaj1);
		izvjestaji.getListOfSubMenus().add(izvjestaj2);
		izvjestaji.getListOfSubMenus().add(izvjestaj3);
		izvjestaji.setParent(mainMenu);
		
		// begin the execution
		MenuElement executionItem = login;
		boolean execute = true;
		while(execute) {
			if(executionItem.isExecutorElement) {
				executionItem = executionItem.performMenuAction();
			} else {
				executionItem = executionItem.displayAndChooseMenu();
			}
			if(executionItem == null) {
				execute = false;
			}
		}
		
	}
	
	private void loadZaposlenika() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"UsersDB"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println("read:" + line);
				Zaposlenik z = new Zaposlenik(line);
				zaposlenici.add(z);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getTime());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis());
		
		TestCode myCode = new TestCode();
		myCode.execute();
	}

}
