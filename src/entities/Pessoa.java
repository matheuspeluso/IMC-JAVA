package entities;

public class Pessoa {
    private String name;
    private float height;
    private float weight;
    private float imc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
