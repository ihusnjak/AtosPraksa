package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.util.ArrayList;

public class Login extends MenuElement {

	
	public Login(String menuName, ArrayList<MenuElement> listOfSubMenus) {
		super(menuName, listOfSubMenus);
		isExecutorElement = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public MenuElement performMenuAction() {
		MenuElement retMenu = null;
		System.out.print("Welcome to zadaci & korisnici admin program.");
		//String loginUser = null;
		
		boolean isValidUser = false; 
		while(!isValidUser) {
			System.out.print("Enter username:");
			String name = scanner.nextLine();

			Zaposlenik myValidUser = findUser(name);
			isValidUser = true;
		
			if(isValidUser) {
				retMenu = listOfSubMenus.get(0);
				TestCode.loggedInUser = myValidUser;
			} else {
				System.out.println("invalid user, please enter information again!");
			}
		}
        
        return retMenu;
	}

	private Zaposlenik findUser(String name) {
		Zaposlenik foundUser = null;
		
		for(Zaposlenik a : TestCode.zaposlenici) {
			if(a.ime.equals(name)) {
				foundUser = a;
				break;
			}
		}
		
		return foundUser;
	}

}
