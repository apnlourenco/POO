package atividade01_exemplo;

public class QueijoDecorator extends PizzaDecorator {
    public QueijoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 2.0; // Custo do queijo
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Queijo";
    }
}

