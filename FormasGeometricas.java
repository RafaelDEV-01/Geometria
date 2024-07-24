package Polimorfismo;

// Classe abstrata FormasGeometricas
public abstract class FormasGeometricas {
    double base, altura, lado;

    // Métodos abstratos para serem implementados nas subclasses
    public abstract void area();
    
    public abstract void perimetro();
}
