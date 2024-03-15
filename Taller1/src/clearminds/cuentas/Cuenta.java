package clearminds.cuentas;

public class Cuenta {
	private String Id;
	private char Tipo = 'A';
	private double saldo;
	
	public Cuenta(String Id, char Tipo, double saldo) {
		this.Id = Id;
		this.saldo = saldo;
		this.Tipo = Tipo;
	}
	public Cuenta(String Id) {
		this.Id = Id;
	}
	public char getTipo() {
		return Tipo;
	}
	public void setTipo(char Tipo) {
		this.Tipo = Tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return Id;
	}
	
	
	public void Imprimir() {
		System.out.println("***********");
		System.out.println("CUENTA");
		System.out.println("***********");
		System.out.println("Numero de cuenta: "+Id);
		System.out.println("Tipo: "+Tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("***********");
		System.out.println(" ");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("/////////////");
		System.out.println("ESTADO DE CUENTA");
		System.out.println("/////////////");
		System.out.println("Numero de cuenta: "+Id);
		System.out.println("Tipo: "+Tipo);
		System.out.println("Saldo: "+saldo+" $");
		System.out.println("/////////////");
		System.out.println(" ");
	}

	
}
