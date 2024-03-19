
public class Auto extends Vehiculo{
    private boolean descapotable;
    private boolean puertasAbiertas;

    public Auto(String duenio, int ruedas, int puertas, boolean descapotable, boolean puertasAbiertas) {
        super(duenio, ruedas, puertas);
        this.descapotable = descapotable;
        this.puertasAbiertas= false;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void subir() {
        if (!puertasAbiertas){
            System.out.println("Subiendo al auto");
            puertasAbiertas = true;
        }
    }

    public void bajar(){
        if (puertasAbiertas){
            System.out.println("Bajando del auto");
            puertasAbiertas=false;
        }
    }

    @Override
    public void caracteristicas() {
        System.out.println("Dueño: " + getDuenio());
        System.out.println("Ruedas: " + getRuedas());
        System.out.println("Puertas: " + getPuertas());
        if (isDescapotable()){
            System.out.println("Descapotable: " +isDescapotable());
        }

        subir();
        bajar();
    }
}
