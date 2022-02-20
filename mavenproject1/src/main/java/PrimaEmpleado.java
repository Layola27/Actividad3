


public class PrimaEmpleado {
	private String nom;
	private String directiu;
	private int antiguitat;

	public static void main(String[] args) {
                
		PrimaEmpleado e = new PrimaEmpleado();

		int p = 0;
		if (e.antiguitat >= 0 && e.antiguitat < 1000) {
			if (e.directiu == "S") {
				if (e.antiguitat > 12)
					p = 600;
				else {
					p = 400;
				}
			} else if (e.directiu == "N") {
				if (e.antiguitat > 12)
					p = 150;
				else
					p = 100;
			} else
				System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
			if (p!=0)
			   System.out.println("La prima que li correspon a " + e.nom
			 		          + " és de " + p + " Euros");
		} else
			System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
	}

	public PrimaEmpleado(String nom, String directiu, int antiguitat) {
		this.nom = nom;
		this.directiu = directiu;
		this.antiguitat = antiguitat;
	}
}
