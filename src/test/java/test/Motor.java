package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro){
        this.registro=registro;
    }
    void asignarTipo(String tipo){
        switch (tipo){
            case "electrico":
            case "gasolina":
                this.tipo=tipo;
                break;
            default:
                break;
        }
    }
}
