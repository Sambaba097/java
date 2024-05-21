public class SingletonFactory {

    // Interface pour les produits de type A
interface ProductA {
    void operationA();
}

// Interface pour les produits de type B
interface ProductB {
    void operationB();
}

// Implémentation concrète du produit A
class ConcreteProductA implements ProductA {
    @Override
    public void operationA() {
        System.out.println("Concrete Product A operation");
    }
}

// Implémentation concrète du produit B
class ConcreteProductB implements ProductB {
    @Override
    public void operationB() {
        System.out.println("Concrete Product B operation");
    }
}

// Interface de l'Abstract Factory
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// Implémentation concrète de l'Abstract Factory
class ConcreteFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB();
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();

        ProductA productA = factory.createProductA();
        productA.operationA();

        ProductB productB = factory.createProductB();
        productB.operationB();
    }
}



    
}
