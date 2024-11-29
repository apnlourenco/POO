public class ExemploSingleton {
    private static ExemploSingleton instance;

    private ExemploSingleton () {
        System.out.println("Instância criada!");

    }
    public static ExemploSingleton getInstance() {
        if (instance == null) {
            instance = new ExemploSingleton();
            }
            return instance;
           }

    

}