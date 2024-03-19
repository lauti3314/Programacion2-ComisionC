public class Camion extends Vehiculo{
    private float carga;

    public Camion(String duenio, int ruedas, int puertas, float carga) {
        super(duenio, ruedas, puertas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public void caracteristicas() {
        System.out.println("---------");
        System.out.println("Dueño: "+getDuenio());
        System.out.println("Puertas: "+getPuertas());
        System.out.println("Ruedas: "+getRuedas());
        System.out.println("Carga: "+getCarga()+"kg");
    }
}
