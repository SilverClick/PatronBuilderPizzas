public class Pizzas {

    private String tipoMasa;

    private boolean relleno;

    private int tamaño;
    public static final String FINA = "FINA";
    public static final String PAN = "PAN";

    private final int familiar = 2;
    private final int mediana = 3;
    private final int pequeña = 4;

    private boolean salsa;

    private String tipoSalsa;

    public static final String BARBACOA = "BARBACOA";
    public static final String SOLO_TOMATE = "SOLO_TOMATE";
    public static final String SIN_GLUTEN = "SIN_GLUTEN";

    private boolean cebolla;

    private boolean sinGluten;

    private boolean extraQueso;

    private boolean piña;

    private boolean champiñones;

    private boolean jamon;
    public Pizzas(){
        this.cebolla = true;
        this.relleno=false;
        this.salsa = true;
        this.tipoSalsa=BARBACOA;
        this.sinGluten = false;
        this.tamaño = mediana;
        this.tipoMasa = FINA;
        this.extraQueso=false;
        this.piña=false;
        this.jamon=true;
        this.champiñones=true;

    }
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

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public boolean isPiña() {
        return piña;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
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
