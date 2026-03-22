public class pacienteParticular extends Paciente{
    public pacienteParticular() {
    }

    public pacienteParticular(String nombre, int documento, double costoConsulta) {
        super(nombre, documento, costoConsulta);
    }

    @Override
    public String toString() {
        return super.toString() + "pacienteParticular{"+
                '}';
    }

    public void costoFinal(){
        double porcentaje;
        double recarg;
        if (costoConsulta >= 400000){
            porcentaje = 15;
            System.out.println("El total es: " + aplicarDescuento(porcentaje));
        } else if (costoConsulta >= 200000) {
            porcentaje = 10;
            System.out.println("El total es: " + aplicarDescuento(porcentaje));
        } else if (costoConsulta >= 50000) {
            recarg = 5;
            System.out.println("El total es: " + aplicarRecargo(recarg));
        } else {
            System.out.println("El total es: " + costoConsulta);
        }

    }
}
