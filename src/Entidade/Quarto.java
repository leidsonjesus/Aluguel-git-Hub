package Entidade;

public class Quarto {
	
	private String nome;
	private String email;
	
	public Quarto( String nome, String email) {
		super();
		
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEamail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return nome + ", " + email;
		}	
}
