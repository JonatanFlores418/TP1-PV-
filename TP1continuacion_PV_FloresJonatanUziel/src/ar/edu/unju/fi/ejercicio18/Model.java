package ar.edu.unju.fi.ejercicio18;

class Pais {
    private String codigo;
    private String nombre;

    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

class DestinoTuristico {
    private String codigo;
    private String nombre;
    private double precio;
    private Pais pais;
    private int cantidadDias;

    public DestinoTuristico(String codigo, String nombre, double precio, Pais pais, int cantidadDias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.pais = pais;
        this.cantidadDias = cantidadDias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Pais getPais() {
        return pais;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String toString() {
        return "DestinoTuristico{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", pais=" + pais +
                ", cantidadDias=" + cantidadDias +
                '}';
    }
}
