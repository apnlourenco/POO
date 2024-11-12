package atividade01_exemplo;

public class PizzaSimples implements Pizza {
    @Override
    
    public double getCusto() {
        return 15.0;
    }

    @Override
    public String getDescricao() {
        return "Pizza simples";
    }
}
