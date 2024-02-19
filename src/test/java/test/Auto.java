package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        int contadorAsientos = 0;
        for (int i = 0; i < asientos.length; i++) {
            contadorAsientos++;
        }
        return contadorAsientos;
    }
    String verificarIntegridad(){
        String verificador="si";
        if (motor.registro==this.registro){
            for (int i = 0; i <= asientos.length; i++) {
                if (asientos[i].registro != this.registro){
                    verificador="no";
                    break;
                }
            }
        }else {
            verificador="no";
        }
        if (verificador=="si"){
            return "Auto original";
        }else {
            return "Las piezas no son originales";
        }
    }

}
