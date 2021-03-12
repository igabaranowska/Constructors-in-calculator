package lab6;
import java.util.Scanner;

public class Zad1 {
	
	public static class Kalkulator{

		private double[] tab;

		public double pierwiastek(double liczba){
		return Math.sqrt(liczba);
		}

		public double potega(double liczba, double wykladnik) {
		return Math.pow(liczba, wykladnik);
		}

		public double dodaj(double[] tab) {
		double suma = 0;
		for(int i = 0; i < tab.length; i++) {
		suma = suma + tab[i];
		}
		
		//druga opcja
		/*for(double tmp : tab) {
		suma = suma + tmp;
		}*/ 

		return suma;
		}

		public double mnozenie(double[] tab) {
		double iloczyn = 1;
		for(int i = 0; i < tab.length; i++) {
		iloczyn = iloczyn * tab[i];
		}

		return iloczyn;
		}

		public double odejmij(double[] tab) {
		double roznica = tab[0];
		for(int i = 1; i < tab.length; i++) {
		roznica = roznica - tab[i];
		}

		return roznica;
		}

		public double dzielenie(double[] tab) {
		double iloraz = tab[0];
		for(int i = 1; i < tab.length; i++) {
		iloraz = iloraz / tab[i];
		}

		return iloraz;
		}

		public double wykonaj_dzialanie() {
		double wynik = 0;

		if(tab.length == 1) {

		System.out.println("Wybierz operacje wpisujac 0 lub 1: pierwiastkowanie - 1, potegowanie - 0 : ");
		Scanner np = new Scanner(System.in);
		int schowek = np.nextInt();

		while(schowek != 0 || schowek != 1) {
		System.out.println("Podano bledna wartosc! Sprobuj ponownie. ");
		schowek = np.nextInt();
		}

		switch(schowek) {
		case 0: {
		System.out.println("Do jakiej potegi chcesz podniesc liczbe? : ");
		int wykladnik = np.nextInt();
		wynik = this.potega(tab[0], wykladnik);

		}
		break;

		case 1: {
		wynik = this.pierwiastek(tab[0]);

		}
		break;

		}

		}else {
		System.out.println("Wybierz operacje wpisujac liczbe: dodawanie(1), odejmowanie(2), mnozenie(3), dzielenie(4): ");
		Scanner np = new Scanner(System.in);
		int schowek = np.nextInt();

		while(schowek < 1 || schowek > 4) {
		System.out.println("Podano bledna wartosc! Sprobuj ponownie. ");
		schowek = np.nextInt();
		}

		switch(schowek) {
		case 1: {
		wynik = this.dodaj(this.tab);

		}
		break;

		case 2: {
		wynik = this.odejmij(this.tab);
		}
		break;

		case 3: {
		wynik = this.mnozenie(this.tab);

		}
		break;

		case 4: {
		wynik = this.dzielenie(this.tab);

		}
		break;


		}

		}

		return wynik;

		}

		public Kalkulator(double liczba) {

		this.tab = new double[1];
		this.tab[0] = liczba;

		}

		public Kalkulator(double liczba1, double liczba2, double liczba3, double liczba4) {

		this.tab = new double[4];
		this.tab[0] = liczba1;
		this.tab[1] = liczba2;
		this.tab[2] = liczba3;
		this.tab[3] = liczba4;
		}

		public Kalkulator(double liczba1, double liczba2, double liczba3, double liczba4, double liczba5, double liczba6, double liczba7){


		this.tab = new double[7];
		this.tab[0] = liczba1;
		this.tab[1] = liczba2;
		this.tab[2] = liczba3;
		this.tab[3] = liczba4;
		this.tab[4] = liczba5;
		this.tab[5] = liczba6;
		this.tab[6] = liczba7;


		}

		public Kalkulator(final Kalkulator K) {
		double[] nowa_tab = new double[K.tab.length];

		for(int i = 0; i < nowa_tab.length; i++) {
		nowa_tab[i] = K.tab[i];
		}
		}
		}


}
