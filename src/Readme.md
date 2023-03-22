
# PASOS A SEGUIR:

-Primer paso: Una clase Pizzas con todos los parámetros de la pizza, los 
constructores, y los setters y getters que no he puesto en el ejemplo.
```
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

```
-Segundo Paso: Creamos una clase BuilderPizzas que construya 
nuestra hamburguesa deseada con el constructor, el método build y los 
setter que no he puesto de todos los parámetros:

```
public class BuilderPizzas {
    protected Pizzas _pizza;

    public Pizzas build() {
        return this._pizza;
    }

    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

```

-Último Paso: En la clase main creamos una objeto Pizzas y cambiamos
los parámetros que queramos de la pizza para luego buildearla y enseñarla.
```
public class Main {
    public static void main(String[] args){
        Pizzas pizzaSinCebolla = new BuilderPizzas()
                .setCebolla(false)
                .build();
        System.out.println(pizzaSinCebolla.toString());

        Pizzas pizzaSinGluten = new BuilderPizzas()
                .setSinGluten(true)
                .setTipoSalsa("SIN_GLUTEN")
                .build();
        System.out.println(pizzaSinGluten.toString());

        Pizzas pizzaConPiña = new BuilderPizzas()
                .setPiña(true)
                .build();
        System.out.println(pizzaSinGluten.toString());
    }
}
```

### 2 Ejercicio Examen
-El builder es un patrón de diseño que permite al 
constructor de una clase poder cambiar objetos complejos paso a paso por
ejemplo si tuviéramos una aplicación de una hamburguesería para hacer
diferentes tipos de hamburguesas de forma eficaz podemos usar el builder así:

Una clase Hamburguesas con todos los parámetros, los constructores y los setters
y getters que no he puesto en el ejemplo.
```
public class Hamburguesas {
    private int size;
    private boolean pepinillo;
    private boolean cebolla;
    private boolean sinGluten;
    private int recojida;


    // tamaño de la hamburguesa
    public static final int SMALL = 0;
    public static final int MEDIUM = 2;
    public static final int BIG = 3;

    // recojida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Hamburguesas(){
        this.cebolla = true;
        this.recojida = TIENDA;
        this.pepinillo = true;
        this.sinGluten = false;
        this.size = MEDIUM;
    }

    public Pizzas(int size,boolean pepinillo,boolean cebolla, boolean sinGluten, int recojida) {
        this.size = size;
       this.pepinillo=pepinillo;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.recojida = recojida;
    }
```
Luego una clase BuilderHamburguesas que contruya nuestra hamburguesa deseada
con el constructor, el método build y los setter que no he puesto de todos 
los parámetros:
```
public class BuilderHamburguesas {

    private Hamburguesas _hamburguesas;

    public BuilderHamburguesas(){
        _hamburguesas = new Hamburguesas();
    }
    }
```
Por último en la main crearíamos la hamburguesa que más nos guste, por ejemplo una sin
pepinillos:
```
public class Main {

    public static void main(String[] args) {
Hamburguesas hamburguesaSinPepinillos=new BuilderHamburguesas()
                  .setPepinillo(false)
                  .build();
        System.out.println(hamburguesaSinPepinillos.toString());
```
Y este sería el diagrama del builder de hamburguesas:

```mermaid
    classDiagram
      Main "1" *-- "1..*" BuilderHamburguesas : association
      class Main{
          +main()
      }
      class BuilderHamburguesas{
          +build()
      }
      
      BuilderHamburguesas *-- "1" Hamburguesas : associatioon
      class Hamburguesas{
        +Hamburguesas()
      }
      
      
```
-Sí ,podríamos fusionar el builder con el patrón factory, de tal forma que 
podríamos hacer una factory de pizzas en la cúal en las clases que nos convengan 
de la factoría por ejemplo barco bicileta y camión las podriamos usar
para transportar el pedido de tal forma que la Pizza tenga un parámetro que sea tipo
de envío del cúal dependa el Factory quedaría así reflejada en la main:
```
Pizzas pizzaPorBarco = new BuilderPizzas()
.setTipoEnvío("barco")
.build();
System.out.println(pizza3.toString() +"\n")
 // CAMIÓN
             if(BuilderPizzas.getTipoEnvío="camión"){
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.CAMION);
        System.out.println("Camion:"+"El coste del envio es de: "+transporte.costeTotal(54000));
                int tipoC= transporte.tipoEmbalaje(120f,120f,120f,120f);
                if(tipoC == 0)
                    System.out.println(tipoC+"-->"+ITransporte.Pale);
                else if(tipoC == 1)
                    System.out.println(tipoC+"-->"+ITransporte.CajaCarton);
                else
                    System.out.println(tipoC+"-->"+ITransporte.CajaMadera);
                    }
                    else if(BuilderPizzas.getTipoEnvío="bicicleta"){
                //BICICLETA
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BICICLETA);
        System.out.println("Bicileta:"+"El coste del envio es de: "+transporte.costeTotal(20000));
               int tipoB =transporte.tipoEmbalaje(24f,24f,24f,24f);
               if(tipoB == 0)
                   System.out.println(tipoB+"-->"+ITransporte.Pale);
               else if(tipoB == 1)
                   System.out.println(tipoB+"-->"+ITransporte.CajaCarton);
               else
                   System.out.println(tipoB+"-->"+ITransporte.CajaMadera);
                   }
                   else{
        //Barco
        transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BARCO);
        System.out.println("Barco:"+"El coste del envio es de: "+transporte.costeTotal(18000));
        int tipoBar= transporte.tipoEmbalaje(220f,220f,220f,220f);
        if(tipoBar == 0)
            System.out.println(tipoBar+"-->"+ITransporte.Pale);
        else if(tipoBar == 1)
            System.out.println(tipoBar+"-->"+ITransporte.CajaCarton);
        else
            System.out.println(tipoBar+"-->"+ITransporte.CajaMadera);
            }
            }
        }
        
 ```

