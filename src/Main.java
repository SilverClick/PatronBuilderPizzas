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