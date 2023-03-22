public class Main {
    public static void main(String[] args){
        Pizzas pizzaSinCebolla=new Pizzas("Normal",false,2,true,"Solo Tomate",false,false,false,false,true,true);
        System.out.println(pizzaSinCebolla.toString());
        Pizzas pizzaConPiña=new Pizzas("Normal",false,2,true,"Solo Tomate",true,false,false,true,true,true);
        System.out.println(pizzaConPiña.toString());
        Pizzas pizzaSinGluten=new Pizzas("Normal",false,2,true,"Sin Gluten",false,true,false,false,true,true);
        System.out.println(pizzaSinGluten.toString());
    }
}