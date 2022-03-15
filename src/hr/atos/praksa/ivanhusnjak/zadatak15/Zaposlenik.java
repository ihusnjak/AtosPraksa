package hr.atos.praksa.ivanhusnjak.zadatak15;

import java.util.StringTokenizer;



public class Zaposlenik {
	String ime,prezime,radnoMjesto,oib;
	
	public Zaposlenik(String ime, String prezime, String radnoMjesto, String oib) {
		this.ime=ime;
		this.prezime=prezime;
		this.radnoMjesto=radnoMjesto;
		this.oib=oib;
	}
	
	public Zaposlenik(String inliner) {
		StringTokenizer tokenizer = new StringTokenizer(inliner, ";");
		if(tokenizer.countTokens()>0) {
			this.ime=tokenizer.nextToken();
			this.prezime=tokenizer.nextToken();
			this.radnoMjesto=tokenizer.nextToken();
			this.oib=tokenizer.nextToken();
		}
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getRadnoMjesto() {
		return radnoMjesto;
	}

	public void setRadnoMjesto(String radnoMjesto) {
		this.radnoMjesto = radnoMjesto;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}
	
	public String toString() {
		return ime + ";" +prezime + ";" + radnoMjesto + ";" + oib;
	}
	
	public String getRights() {
		String rights="";
		// arc, dev, test, other
		if("arc".equals(radnoMjesto)) {
			rights+="cr";
		} else if("dev".equals(radnoMjesto) || "test".equals(radnoMjesto)) {
			rights+="r";
		} else if("admin".equals(radnoMjesto)) {
			rights+="crud";
		} else rights="r";
		return rights;
	}
}
