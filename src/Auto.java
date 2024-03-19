
public class Auto extends Vehiculo{
    private boolean descapotable;
    private boolean subirBajar;

    public Auto(String duenio, int ruedas, int puertas, boolean descapotable, boolean subirBajar) {
        super(duenio, ruedas, puertas);
        this.descapotable = descapotable;
        this.subirBajar= subirBajar;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void subir() {
        if (subirBajar == true){
            System.out.println("Subiendo techo");
        }
    }

    public void bajar(){
        if (subirBajar == false){
            System.out.println("Bajando techo");
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
