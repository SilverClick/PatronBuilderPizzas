public class Pizzas {

    private String tipoMasa;

    private boolean relleno;

    private int tamaño;

    private final int familiar = 1;
    private final int mediana = 2;
    private final int pequeña = 3;

    private boolean salsa;

    private String tipoSalsa;

    private boolean cebolla;

    private boolean sinGluten;

    private boolean extraQueso;

    private boolean piña;

    private boolean champiñones;

    private boolean jamon;
    /**
     * Constructor con todoa los parametros
     * @param tipoMasa espesor de la masa
     * @param relleno si esta rellena la pizza
     * @param tamaño el tamaño de la pizza
     * @param salsa si lleva salsa
     * @param tipoSalsa que tipo de salsa lleva
     * @param cebolla lleva o no lleva
     * @param sinGluten para celíacos
     * @param extraQueso si tiene extra de queso la pizza
     * @param piña si lleva piña la pizza
     * @param champiñones si lleva champiñones la pizza.
     * @param jamon si lleva jamon la pizza
     */

    public Pizzas(String tipoMasa, boolean relleno, int tamaño, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon) {
        this.tipoMasa = tipoMasa;
        this.relleno = relleno;
        this.tamaño = tamaño;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return
                "tipoMasa='" + tipoMasa + '\'' +
                ", relleno=" + relleno +
                ", tamaño=" + tamaño +
                ", salsa=" + salsa +
                ", tipoSalsa='" + tipoSalsa + '\'' +

                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon
               ;
    }
}
