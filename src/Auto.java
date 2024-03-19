public class Auto extends Vehiculo{
    private boolean descapotable;

    public Auto(String duenio, int ruedas, int puertas, boolean descapotable) {
        super(duenio, ruedas, puertas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public void caracteristicas() {
        System.out.println("Dueño: " + getDuenio());
        System.out.println("Ruedas: " + getRuedas());
        System.out.println("Puertas: " + getPuertas());
        if (isDescapotable()){
            System.out.println("Descapotable: " +isDescapotable());
        }
    }
}
