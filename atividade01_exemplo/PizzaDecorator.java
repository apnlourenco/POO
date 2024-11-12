package atividade01_exemplo;

public class PizzaDecorator {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getCusto() {
        return pizza.getCusto();
    }

    public String getDescricao() {
        return pizza.getDescricao();
    }
}


