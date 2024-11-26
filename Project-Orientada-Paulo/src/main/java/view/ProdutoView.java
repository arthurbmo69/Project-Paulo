package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProdutoView {

    public void exibirTela() {
        JFrame frame = new JFrame("Gerenciar Produtos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton btnAdicionar = new JButton("Adicionar Produto");
        JButton btnListar = new JButton("Listar Produtos");
        JButton btnSair = new JButton("Sair");

        panel.add(btnAdicionar);
        panel.add(btnListar);
        panel.add(btnSair);

        frame.add(panel);

        // Eventos
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProduto();
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarProdutos();
            }
        });

        btnSair.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }

    public void adicionarProduto() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        String preco = JOptionPane.showInputDialog("Digite o preço do produto:");
        JOptionPane.showMessageDialog(null, "Produto " + nome + " adicionado com sucesso!");
    }

    public void listarProdutos() {
        // Exemplo fictício de produtos
        String produtos = "1 - Produto A\n2 - Produto B\n3 - Produto C";
        JOptionPane.showMessageDialog(null, "Produtos:\n" + produtos);
    }
}
