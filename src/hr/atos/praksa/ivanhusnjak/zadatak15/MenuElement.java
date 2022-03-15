package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuElement {
	String menuName;
	ArrayList<MenuElement> listOfSubMenus;
	boolean isExecutorElement = false;
	MenuElement parent;
	static Scanner scanner = new Scanner(System.in);

	public MenuElement(String menuName, ArrayList<MenuElement> listOfSubMenus) {
		this.menuName = menuName;
		if(listOfSubMenus != null)
			this.listOfSubMenus = listOfSubMenus;
		else 
			this.listOfSubMenus = new ArrayList<MenuElement>();
		this.parent = null;
	}

	public MenuElement getParent() {
		return parent;
	}

	public void setParent(MenuElement parent) {
		this.parent = parent;
		listOfSubMenus.add(parent);
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public ArrayList<MenuElement> getListOfSubMenus() {
		return listOfSubMenus;
	}

	public void setListOfSubMenus(ArrayList<MenuElement> listOfSubMenus) {
		this.listOfSubMenus = listOfSubMenus;
	}

	// does menu presentation (text) + selection (choose number) -> returns number chosen
	public MenuElement displayAndChooseMenu() {

		System.out.println("Menu for " + this.menuName);
		for(int i=0; i<listOfSubMenus.size(); i++) {
			System.out.println(i+1 + "." + listOfSubMenus.get(i).getMenuName());
		}
		boolean wereGood = false;
		int choice = -1;
		while(!wereGood) {
			System.out.print("Enter menu choice (number):");
			String strChoice = scanner.nextLine();
			try {
				if((choice = Integer.parseInt(strChoice)) > 0 && choice < listOfSubMenus.size()+1) {
					wereGood = true;
				}
			} catch(Exception e) {
				System.out.println("Krivi unos");
			}
		}
		// moramo znati parenta da se vratimo nazad, choice>lista.size je trenutno null :)
		return listOfSubMenus.get(choice-1);
	}

	public abstract MenuElement performMenuAction();
	
}


