
public class PrimaEmpleado2 {

    private String nom;
    private String directiu;
    private int antiguitat;

    public static void main(String[] args) {
        PrimaEmpleado2 programa = new PrimaEmpleado2();
        programa.inicio();
    }

    public void inicio() {
        calcularPrima();
    }

    public void calcularPrima("Elvira","S",11){
        
		int p = 0;
        if (programa.antiguitat >= 0 && programa.antiguitat < 1000) {
            if (programa.directiu == "S") {
                if (programa.antiguitat > 12) {
                    p = 600;
                } else {
                    p = 400;
                }
            } else if (programa.directiu == "N") {
                if (programa.antiguitat > 12) {
                    p = 150;
                } else {
                    p = 100;
                }
            } else {
                System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
            }
            if (p != 0) {
                System.out.println("La prima que li correspon a " + programa.nom
                        + " és de " + p + " Euros");
            }
        } else {
            System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
        }
    }
}
