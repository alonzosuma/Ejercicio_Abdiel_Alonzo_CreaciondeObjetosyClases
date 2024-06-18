public class Main {
    //Metodo Main para inicializar todos los atributos:
    public static void main (String[] args){
        Libro Libro1 = new Libro("Quetzaltenango, historia de su historia.", "Roberto Gutierrez","Historia", "372381943", "Editorial Zopilote",2022, 345.08);

        System.out.println("Detalles del libro: ");
        Libro1.ObtenerInformacion();

        Libro1.ActualizarPrecio(203.56);
    }
}