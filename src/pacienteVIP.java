public class pacienteVIP extends Paciente{


    private int aniosFidelidad;


    public pacienteVIP() {
    }


    public pacienteVIP(String nombre, int documento, double costoConsulta, int aniosFidelidad) {
        super(nombre, documento, costoConsulta);
        this.aniosFidelidad = aniosFidelidad;
    }


    public int aniosFidelidad() {
        return aniosFidelidad;
    }

    public pacienteVIP setAniosFidelidad(int aniosFidelidad) {
        this.aniosFidelidad = aniosFidelidad;
        return this;
    }

    @Override
    public String toString() {
        return "PacienteVIP{" +
                "aniosFidelidad=" + aniosFidelidad +
                ", nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }

    public void descFidel(){

        if(aniosFidelidad <5){
            double discount = costoConsulta * (0.2);
            double pago = costoConsulta - discount;
            if(pago > 300000){
                System.out.println("El costo de la consulta es: " + 300000);
            }else {
                System.out.println("El costo de la consulta es: " + pago);
            }
        } else if (5 >= aniosFidelidad) {
            double discount = costoConsulta * (0.3);
            double pago = costoConsulta - discount;
            if(pago > 300000){
                System.out.println("El costo de la consulta es: " + 300000);
            }else {
                System.out.println("El costo de la consulta es: " + pago);
            }
        } else if (aniosFidelidad >= 10) { // aca
            double discount = costoConsulta * (0.4);
            double pago = costoConsulta - discount;
            if(pago > 300000){
                System.out.println("El costo de la consulta es: " + 300000);
            }else {
                System.out.println("El costo de la consulta es: " + pago);
            }

        }else {
            System.out.println("El paciente no puede pertenecer al regimen VIP, no cumple con las condiciones de fidelidad  ");
        }

    }
}
