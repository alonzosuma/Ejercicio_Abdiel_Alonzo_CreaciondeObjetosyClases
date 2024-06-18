public class Libro {

        // Atributos:
        private String titulo;
        private String  Autor;
        private String ISBN;
        private String Categoria;
        private String Editorial;
        private int AñoDePublicacion;
        private double precio;

        //Contructor sin parametros:
    public Libro(){
        this.titulo = "Sin titulo";
        this.Autor = "No se reconoce al autor";
        this.ISBN = "Sin ISBN";
        this.Categoria = "No pertenece a ninguna categoria";
        this.Editorial = "No hay editorial";
        this.AñoDePublicacion = 0000;
        this.precio =0.0;
    }

        //Constructor con parametros:
        public Libro(String titulo, String Autor, String Categoria,String ISBN, String Editorial, int AñoDePublicacion, double precio){
            this.titulo = titulo;
            this.Autor = Autor;
            this.ISBN = ISBN;
            this.Categoria = Categoria;
            this.Editorial = Editorial;
            this.AñoDePublicacion = AñoDePublicacion;
            this.precio = precio;
        }

        //Metodos:
    public void ObtenerInformacion(){
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + Autor);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Categoria: " + Categoria);
            System.out.println("Editorial: " + Editorial);
            System.out.println("Año de publicacion: " + AñoDePublicacion);
            System.out.println("Precio: Q." + precio);
    }

    //Actualizacion de precio:
    public void ActualizarPrecio (double NuevoPrecio){
        this.precio = NuevoPrecio;
        System.out.println("Precio actualizado a Q." + this.precio);
    }
}