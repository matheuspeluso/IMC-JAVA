package utils;

import entities.Pessoa;

public class CalculadoraIMC {
    public float calcularIMC(Pessoa pessoa){
        float height = pessoa.getHeight();
        float weight = pessoa.getWeight();
        return weight / (height * height);
    }
}
