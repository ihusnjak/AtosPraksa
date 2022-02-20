# Atos_praksa Ivan Husnjak

01)	Instaliraj program Eclipse. Na stranici http://www.eclipse.org/downloads/ nalazi se popis različitih alata iz Eclipse porodice. Za pripremu prakse bit će dovoljan Eclipse Standard. Odaberi verziju operacijskog sustava koji koristiš i preuzmi alat. Eclipse se ne instalira, nego jednostavno „raspakira“ na željenu lokaciju.

02)	Kreiraj Java projekt i nazovi ga PripremaPrakse_<ImePrezime>, pri čemu <ImePrezime> trebate zamijeniti svojim imenom i prezimenom (npr. PripremaPrakse_IvanHorvat)

  03)	Kreiraj tzv. "Hello World" aplikaciju tj. aplikaciju koja će nakon pokretanja na konzolu ispisati riječi "Hello World, ovo je prva java aplikacija.".

  04)	Kreiraj program koji ima definirano polje pet različitih cjelobrojnih vrijednosti. Program treba provjeriti je li svaka od pet vrijednosti paran ili neparan broj i da li je višekratnik od jednog od idučih brojeva: 3, 5 ili 11, te ispisati poruku na konzolu u obliku „XY je paran broj“ ili „XY je neparan broj“ te „XY je višekratnik od 3 “ (ili 5 ili 11, zamijeniti broj u tekstu).

  05)	Kreiraj program koji ima definiran početak i kraj intervala te jedan brojač. Neka početak intervala bude manji od 10, a kraj intervala veći od 100. Program treba provjeriti jesu li početak i kraj intervala ispravno definirani te ispisati poruku o pogrešci ukoliko nisu. Ukoliko jesu program treba za svaki broj u zadanom intervalu napraviti sljedeće:
* ukoliko je broj manji ili jednak 18, brojač treba povećati za 4
* ukoliko je broj veći od 18, brojač treba umanjiti za 1
* ukoliko je broj djeljiv s 20, treba prekinuti procesuiranje tog broja i prijeći na sljedeći
* ukoliko je broj jednak ili veći od 75, treba prekinuti procesuiranje intervala te ispisati vrijednost brojača

  06)	Kreiraj program koji će koristeći for petlje automatizirati ispis tablice množenja u ovom obliku:
  
![tablica](https://user-images.githubusercontent.com/38016928/154270236-26ec29cc-ff1f-4c6f-a82f-6ef833680920.JPG)
  
  Umjesto "Ime" treba ispisati ime uneseno s konzole i pri tome pripaziti da zadnje slovo imena bude poravnato s desnim rubom tablice.
  
07)	Kreiraj program koji će ispisati koliko ima brojeva djeljivih sa 6 u intervalu između neka dva prirodna broja unesena s konzole.

  08)	Kreiraj program koji će s konzole učitati redni broj mjeseca u nekoj prijestupnoj godini. Napraviti provjeru je li uneseni redni broj mjeseca ispravan (ne postoji npr. 15. mjesec), a zatim ispisati kalendar tog mjeseca u obliku:
  
![mj](https://user-images.githubusercontent.com/38016928/154270696-c1684b0b-11ff-4f1a-af82-c3191e268cba.JPG)
  
  Pretpostavlja se kako prvi u mjesecu pada na ponedjeljak. Također, treba ispisati onoliko dana koliko ih taj mjesec po klasičnom kalendaru doista ima.
  
09)	Luka je vaš dobar prijatelj. Nedavno vam je spomenuo kako bi volio imati grafičko rješenje prikaza njegovog troška struje njegove „krušne“ peći kroz godinu (on je naime pizza majstor i ima svoj restoran). Račun mu stalno varira, ali nikada ne prelazi 4500kn. Prvo ste mu rekli da još ne znate raditi grafički prikaz u Javi, ali vam je bilo žao ne ponuditi mu nikakvo rješenje pa ste na papiru nacrtali ovakav graf i rekli da znanje za napraviti ovakav prikaz imate:
  
![tab](https://user-images.githubusercontent.com/38016928/154271119-be973699-e070-4914-8958-199c9c722727.JPG)
  
Također ste mu pojasnili kako će morati unijeti plaću za svaki pojedini mjesec, a onda će program iscrtati graf. Upozorili ste ga kako će vrijednosti plaće biti aproksimirane. Primjerice mjesečna plaća koja iznosi od 1501kn pa sve do 2500kn, na grafu će biti obilježena iksićem uz vrijednost 2000kn. On se naposljetku složio s vašim prijedlogom i od srca zahvalio. Stoga kreirajte program kojim ćete pomoći Luki.
  
10)	Kreiraj java program koji će pretražiti sve datoteke s ekstenzijama "csv" i "txt" unutar jednog direktorija (foldera) kako bi provjerio nalazi li se u njima definirana tekstualna fraza. Nazive datoteka u kojima se fraza nalazi, ispisat će na konzolu. Putanju direktorija za pretraživanje kao i tekstualnu frazu treba unijeti s konzole.
Popis klasa koje bi mogle biti korisne:
java.io.File (za manipuliranje datotekama / direktorijima)
java.io.BufferedReader (za čitanje sadržaja datoteke)
java.lang.String (za manipulaciju sa tekstom)
Fraza usput može biti regular expression.

  11)	Kreiraj program koji će omogućiti interakciju s korisnikom na jednom od tri ponuđena jezika. Interakcija se treba sastojati od nekoliko međusobno izmijenjenih poruka. Prijevodi na pojedini jezik trebaju biti dostupni unutar java properties datoteka za svaki jezik odvojeno.
  
  12)	Napraviti program koji će omogućiti korisniku ispis statistike broja pojedinih riječi unutar datoteke koju odabere. Riječi trebaju biti poredane po abecedi i treba ignorirati velika/mala slova. Ispod se nalazi primjer ispisa:
U datoteci XX nalaze se sljedece rijeci:

![rijeci](https://user-images.githubusercontent.com/38016928/154271789-51c3307e-30b4-4f77-bd92-763215073e83.JPG)
  
  13)	Kreiraj program koji se sastoji od jedne klase i sučelja koje klasa nasljeđuje. Sučelje treba definirati dvije različite metode po vlastitom izboru. 

  14)	Kreiraj program kojim će korisnik izračunati površinu ispod neke krivulje opisane funkcijom y=f(x)=A*funk(x)+B od neke početne do krajnje točke (T1,T2). Izračun izvesti numeričkom metodom. Ulazni parametri su A, B, T1i T2 te funkcija koja može biti sinus, kosinus, tangens ili kotangens. Pri rješavanju zadatka obavezno koristiti više klasa i(li) sučelja te nasljeđivanje.

15)	Za jednu tvrtku potrebno je napraviti demo aplikaciju u kojoj će moći raditi administraciju zaposlenika te njihbovih radnih zadataka. Ovo su im najbitniji podatci:
  
- **Zaposlenici**
 * ime
 * prezime
 * radno mjesto
 * oib

  
- **Zadaci**
* naziv
* opis
* osoba (1..n) koja radi na zadatku
* tip (bug, task)
* trenutni status (otvoren, zatvoren, u tijeku)
* kompleksnost (broj)
* potrošeno vrijeme (sati)
* početni datum i vrijeme
* završni datum i vrijeme
* (napomena, početak i završetak ne znače nužno da je potrošeno vrijeme njihova razlika)
Potrebno je omogućiti administraciju na nekoliko razina tj. potrebno je definirati korisnička prava korisnika aplikacije po grupama: "admin", "superuser" i "user" tako da se omoguće sljedeće akcije:
*	kreiranje zadataka i zaposlenika (admin, superuser)
*	izlistanje zadataka i zaposlenika (admin, superuser, user)
*	izmjena zadataka i zaposlenika (admin)
*	brisanje zadataka i zaposlenika (admin)
Naposljetku aplikacija mora omogućiti kreiranje izvještaja:
*	po radnom mjestu tj. koliko radnika radi na pojedinom radnom mjestu
*	utrošeno vrijeme po osobi
*	najduže otvoren zadatak
  
Izvještaje mogu kreirati samo korisnici s admin ili superuser pravima.
Sučelje za komunikaciju s korisnicima neka bude konzola, a podaci se trebaju spremati u tekstualne datoteke ili bazu podataka po izboru.
