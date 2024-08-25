package repositories;

import controllers.PessoaController;
import entities.Pessoa;

import javax.swing.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ImcRepository {
    public void exportarDados(Pessoa pessoa){
        try{
            var fileWrite = new FileWriter("c:\\temp\\dados.txt",true);
            var printWrite = new PrintWriter(fileWrite);

            printWrite.write("\n IMC de "+ pessoa.getName() + " : " + pessoa.getImc());
            printWrite.write("\n");

            printWrite.close();
            JOptionPane.showMessageDialog(null,"Dados gravados com sucesso!");
        }
        catch (Exception e){
            System.out.println("Falha ao guardar dados: "+e.getMessage());
        }

    }
}
