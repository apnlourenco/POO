package atividade01_exemplo;

public class PepperoniDecorator extends PizzaDecorator implements Pizza {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 3.0; // Custo do pepperoni
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Pepperoni";
    }
}
