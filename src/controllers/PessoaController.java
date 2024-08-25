package controllers;

import entities.Pessoa;
import utils.CalculadoraIMC;

import javax.swing.*;

public class PessoaController {
    public void cadastrarPessoa(){
        var pessoa = new Pessoa();

        try{
            pessoa.setName(JOptionPane.showInputDialog("Digite seu nome: "));
            String height = JOptionPane.showInputDialog("Digite sua altura: ");
            String weight = JOptionPane.showInputDialog("Digite seu peso: ");

            pessoa.setHeight(Float.parseFloat(height));
            pessoa.setWeight(Float.parseFloat(weight));

            var calculadoraIMC = new CalculadoraIMC();
            float imc = calculadoraIMC.calcularIMC(pessoa);

            JOptionPane.showMessageDialog(null,"O imc de " + pessoa.getName() + "é de : "+imc);
        }
        catch (Exception e){
            System.out.println("Não foi possivel cadastrar pessoa :"+ e.getMessage());
        }
    }
}
