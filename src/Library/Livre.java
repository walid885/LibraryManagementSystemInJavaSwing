package Library;

public class Livre {

	private String codeLivre; 
	private String Titre; 
	
	public Livre (String codeLivre, String Titre) {
		this.codeLivre = codeLivre; 
		this.Titre = Titre;
		
	}
	public String getCodeLivre() {
		return codeLivre;
	}
	public void setCodeLivre(String codeLivre) {
		this.codeLivre = codeLivre;
	}
	public String  getTitre () {
		return Titre;
	}
	
	public void setTitre( String Titre) {
		this.Titre = Titre; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
