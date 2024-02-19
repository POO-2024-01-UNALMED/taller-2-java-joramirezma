package test;
public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String color){
       switch (color){
           case "rojo", "amarillo", "verde", "negro", "blanco":
               this.color=color;
               break;
           default:
               break;

       }

    }
}
