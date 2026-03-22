public class pacienteEPS extends Paciente{

    private String EPS;

    public pacienteEPS() {
    }


    public pacienteEPS(String nombre, int documento, double costoConsulta, String EPS) {
        super(nombre, documento, costoConsulta);
        this.EPS = EPS;
    }

    @Override
    public String toString() {
        return "pacienteEPS{" +
                "EPS='" + EPS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }

    public void costoFinal(){

        if (costoConsulta <= 80000){
            double copago = costoConsulta * 0.2;
            System.out.println("Costo de la consulta: " + copago );

        } else if (costoConsulta <= 300000) {
            double copago = costoConsulta * 0.25;
            System.out.println("Costo de la consulta: " + copago );
        } else if (costoConsulta > 300000) {
            double pago = costoConsulta * 0.3;
            double descuento = costoConsulta * 0.05;
            double copago = pago - descuento;
            System.out.println("Costo de la consulta: " + copago);;
        }else {
            double copago = costoConsulta * 0.3;
            System.out.println("Costo de la consulta: " + copago);
        }


    }
}
