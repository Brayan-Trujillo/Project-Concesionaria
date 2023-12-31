package concesionaria;

public abstract class Vehiculo {
    
    private int idVehiculo;
    private String marca;
    private String modelo;
    private String color;
    private String anioFabricacion;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String marca, String modelo, String color, String anioFabricacion, double precio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }
    
    public void hacerService () {
        System.out.println("Service de vehículo realizado correctamente");
    }
    
    public void otorgarGarantia () {
        System.out.println("Garantía otorgada a vehículo correctamente");
    }
    
    public void calibrarCubiertas () {
        System.out.println("Cubiertas de vehículo calibradas correctamente");
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anioFabricacion=" + anioFabricacion + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
