public class Paciente {
    protected String nombre;
    protected int documento;
    protected double costoConsulta;

    public Paciente() {
    }

    public Paciente(String nombre, int documento, double costoConsulta) {
        this.nombre = nombre;
        this.documento = documento;
        this.costoConsulta = costoConsulta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }

    public void costoFinal(){
        System.out.println("El costo base de la consulta es de: "+ this.costoConsulta);
    }

    public double aplicarDescuento(double porcentaje){
        double calcularDescuento = this.costoConsulta * (porcentaje / 100);
        return this.costoConsulta - calcularDescuento;
    }

    public double aplicarRecargo(double porcentaje){
        double porcRecargo = this.costoConsulta * (porcentaje / 100);
        return this.costoConsulta + porcRecargo;
    }

    public boolean consultaCostosa (){
        boolean asn;
        if (this.costoConsulta > 300000){
            asn = true;
        } else {
            asn = false;
        }
        return asn;
    }

    public void mostrarDatos (double costoFinal){
        System.out.println("Nombre. "+ nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Costo de Consulta: " + costoConsulta);
        System.out.println("Costo Final: " + costoFinal);

    }
}
