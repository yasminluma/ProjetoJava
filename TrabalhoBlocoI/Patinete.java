package TrabalhoBlocoI;

public class Patinete extends Locacao {

	private String Modelo;//Eletrico ou normal
	private String tamanho;//Infantil ou adulto
	
	public Patinete()
	{
		
	}
	
	public Patinete (String Modelo, String tamanho, double valor, int x)
	{
		super(valor,x);
		this.Modelo = Modelo;
		this.tamanho = tamanho;

	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
