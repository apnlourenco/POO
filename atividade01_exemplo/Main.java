package atividade01_exemplo;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaSimples();
        System.out.println(pizza.getDescricao() + " - " + pizza.getCusto()); // Pizza simples - 10.0

        Pizza pizzaComQueijo = (Pizza) new QueijoDecorator(pizza);
        System.out.println(pizzaComQueijo.getDescricao() + " - " + pizzaComQueijo.getCusto()); // Pizza simples, Queijo - 12.0

        Pizza pizzaComQueijoPepperoni = new PepperoniDecorator(pizzaComQueijo);
        System.out.println(pizzaComQueijoPepperoni.getDescricao() + " - " + pizzaComQueijoPepperoni.getCusto()); // Pizza simples, Queijo, Pepperoni - 15.0
    }
}

