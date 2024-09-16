package ui;

import service.Carro;

public class Ui {

    public void questao1() {
        Carro carro1 = new Carro ("BMW","320i",2014);
        Carro carro2 = new Carro ("Ford","Mustang Gt",2024);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
