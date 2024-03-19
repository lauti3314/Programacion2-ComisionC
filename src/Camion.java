public class Camion extends Vehiculo{
    private float carga;
    private float cargar;
    public Camion(String duenio, int ruedas, int puertas, float carga, float cargar) {
        super(duenio, ruedas, puertas);
        this.carga = carga;
        this.cargar= cargar;
    }

    public float getCargar() {
        return cargar;
    }

    public void setCargar(float cargar) {
        this.cargar = cargar;
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
        System.out.println("Has cargado: "+ getCargar()+ "kg");

    }
}
