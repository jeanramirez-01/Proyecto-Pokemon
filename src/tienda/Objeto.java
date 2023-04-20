package tienda;

public class Objeto {

    public enum TipoObjeto {

        //Objetos equipables
        PESA("Aumenta el ataque y la defensa un 20%, pero disminuye su velocidad un 20%", 5000, 6),
        PLUMA("Aumenta la velocidad un 30%, pero disminuye la defensa y la defensa especial en un 20%.", 5000, 6),
        CHALECO("Aumenta la defensa y la defensa especial un 20%, pero disminuye la velocidad y el ataque un 15%.", 5000, 6),
        BASTON("Aumenta la estamina un 20%, pero disminuye en un 15% la velocidad.", 5000, 6),
        PILAS("Recupera la estamina actual en un 50% de la estamina maxima, pero disminuye la defensa especial un 30%.", 5000, 6),

        //Objetos consumibles de vida
        POCION("Medicina en spray, que cura heridas y restaura 20 PS de un POKÉMON.", 300, 99),
        SUPERPOCION("Medicina en spray, que cura heridas y restaura 50 PS de un POKÉMON.", 700, 99),
        HIPERPOCION("Medicina en spray, que cura heridas y restaura 200 PS de un POKÉMON.", 1500, 99),

        //Objetos consumibles de estado
        ANTIDOTO("Medicina en spray, que cura a un POKÉMON envenenado.", 100, 99),
        ANTIPARALIZADOR("Medicina en spray, que cura a un POKÉMON paralizado.", 200, 99),
        DESPERTAR("Medicina en spray, que despierta a un POKÉMON dormido.", 250, 99),
        ANTIQUEMAR("Medicina en spray, que cura a un POKÉMON quemado.", 250, 99),
        ANTIHIELO("Medicina en spray, que descongela a un POKÉMON.", 250, 99),

        //Tipos de pokeball
        POKE_BALL("Sirve para atrapar POKÉMON salvajes. Parece una cápsula.", 200, 99),
        SUPERBALL("Es buena. Tiene más índice de éxito que la POKÉ BALL.", 600, 99),
        ULTRABALL("Es muy buena. Tiene más índice que la SUPERBALL.", 1200, 99),
        MASTERBALL("Es la mejor. Atrapa siempre al pokémon. No falla.", 50000, 99);

        private String descripcion;
        private int precio;
        private int cantidadVenta;

        private TipoObjeto(String descripcion, int precio, int cantidadVenta) {
            this.descripcion = descripcion;
            this.precio = precio;
            this.cantidadVenta = cantidadVenta;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public int getCantidadVenta() {
            return cantidadVenta;
        }
    }

    private TipoObjeto tipoObjeto;

    public Objeto(TipoObjeto tipoObjeto) {
        super();
        this.tipoObjeto = tipoObjeto;
    }

    public TipoObjeto getTipoObjeto() {
        return tipoObjeto;
    }


}
