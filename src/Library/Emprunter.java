package Library;
import java.util.Vector;

public class Emprunter {
// due to the assignment , we are going to use , 2 static vectors , already filled with info , it may be optimized 
	//later by connecting it to a databse , such as SQLite , but for the academic purposes now, and 
	//in order to satisfy the assignement requieremnts, we are going to use a prefilled vectors. 
	
	// l'emprenteur qui se trouve a l'indice i peut empreunte le livre dans vectLivre de meme indice 
	
	
	boolean CanIBook(String codeEmprenteur , String codeLivre) {
		boolean res ; 
		
		return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final Vector<String> vectLivre = new Vector<>(4);
		final Vector<String> vectEmprentuer = new Vector<>(4);
		
		vectLivre.addElement("livre1");
		vectLivre.addElement("livre2");
		vectLivre.addElement("livre3");
		vectLivre.addElement("livre4");
		

System.out.println(vectLivre.elementAt(0));

	}

}
