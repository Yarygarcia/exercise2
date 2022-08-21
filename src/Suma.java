public class Suma {
    private String marca;
    private String modelo;
    private float precio;

    public Suma(String marca, String modelo, float precio){
        this.marca=marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public void imprimir(){
        System.out.print("marca: " + marca + " modelo: " + modelo + " precio: " + precio);
    }
}
