public class Personaje {
    private String nom;
    private int dinero;

    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }

    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");
    }

    public void gastarDinero(int cantidad){
        System.out.println(this.nom + " gasta " + cantidad + "$");

        this.dinero -= cantidad;
    
    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();
        jugador.gastarDinero(100);
        jugador.mostrarInfo();
    }
}