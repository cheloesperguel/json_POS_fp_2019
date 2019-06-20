package modelo;

public class Producto {

	private String codigo;
	private String nombre;
	private Categoria categoria;
	private String color;
	private String talla;
	private int precio;

    public Producto(String codigo, String nombre, Categoria categoria, String color, String talla, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }

    public Producto() {
    }

        
        
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
        
        

}