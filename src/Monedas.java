
public class Monedas {
	
	private double Dolar;
	private double Euro;
	private double LibrasEsterlinas;
	private double YenJaponés;
	private double WonSurCoreano;
	private double PesoChileno; 
	
		
    
	public double getDolar() {
		return Dolar;
	}
	public void setDolar(double dolar) {
		Dolar = dolar;
	}
	public double getEuro() {
		return Euro;
	}
	public void setEuro(double euro) {
		Euro = euro;
	}
	public double getLibrasEsterlinas() {
		return LibrasEsterlinas;
	}
	public void setLibrasEsterlinas(double librasEsterlinas) {
		LibrasEsterlinas = librasEsterlinas;
	}
	public double getPesoChileno() {
		return PesoChileno;
	}
	public void setPesoChileno(double pesoChileno) {
		PesoChileno = pesoChileno;
	}
	public double getYenJaponés() {
		return YenJaponés;
	}
	public void setYenJaponés(double yenJaponés) {
		YenJaponés = yenJaponés;
	}
	public double getWonSurCoreano() {
		return WonSurCoreano;
	}
	public void setWonSurCoreano(double wonSurCoreano) {
		WonSurCoreano = wonSurCoreano;
	}
//**************************************************
	public double getdepesoAdolar() {
		if(PesoChileno<1) {
			System.out.println("no se permite menor a 1");
			PesoChileno=1;
			}
			else {
			return (PesoChileno/ 802.04);}
		return getdepesoAdolar();
		}
	
	
	public double getdepesoAEuro() {
		if(PesoChileno<1) {
			System.out.println("no se permite menor a 1");
			PesoChileno=1;
			}
			else {
			return (PesoChileno/ 875.16);}
		return getdepesoAEuro();
		}
	

	public double getdepesoALibrasEsterlinas() {
		if(PesoChileno<1){
			System.out.println("Valor NO permitido");
			PesoChileno=1;
		}
		else {
			return (PesoChileno/ 991.16);}
		return (getdepesoALibrasEsterlinas());}
	
	
	public double getdepesoAYenJaponés() {
		if(PesoChileno<1){
			System.out.println("Valor NO permitido");
			PesoChileno=1;
		}
		else {
			return (PesoChileno/ 5.96);}
		return (getdepesoAYenJaponés());
		}	
	
	public double getdePesoAWonSurCoreano() {
		if(PesoChileno<1){
			System.out.println("Valor NO permitido");
			PesoChileno=1;
		}
		else {
			return (PesoChileno/ 0.61);}
			return (getdePesoAWonSurCoreano());
		}	
	
	
//******************************************************

//**********************************************************
	public double getDeDolarApeso() {
		if(Dolar<=0) {
			System.out.println("no se permite menor a 0");
			Dolar=1;
		}else{return Dolar* 802.04;}
		return getDeDolarApeso();}
	
	
	public double getDeEuroApeso() {
		if(Euro<=0) {
			System.out.println("no se permite menor a 0");
			Euro=1;
		}
		else{return Euro* 875.16;}
		return getDeEuroApeso();
	}
	
	public double getdeLibrasEsterlinasAPeso() {
		if(LibrasEsterlinas<=0) {
			System.out.println("no se permite menor a 0");
			LibrasEsterlinas=1;
		}
		else{return LibrasEsterlinas* 991.16;}
		return getdeLibrasEsterlinasAPeso();
	}
	public double getdeYenJaponésapeso() {
		if(YenJaponés<1){
			System.out.println("Valor NO permitido");
			YenJaponés=1;
		}
		else {
		return (YenJaponés*5.96);}
	return (getdeYenJaponésapeso());
	}	
		
	public double getdeWonSurCoreanoAPeso() {
		
		if(WonSurCoreano<1){
			System.out.println("Valor NO permitido");
			WonSurCoreano=1;
		}
		else {
		return (WonSurCoreano* 0.61);}
	return (getdeWonSurCoreanoAPeso());
	}
}
	
