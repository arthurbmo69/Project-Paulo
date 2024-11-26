package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FornecedorView {

    public void exibirTela() {
        JFrame frame = new JFrame("Gerenciar Fornecedores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton btnAdicionar = new JButton("Adicionar Fornecedor");
        JButton btnListar = new JButton("Listar Fornecedores");
        JButton btnSair = new JButton("Sair");

        panel.add(btnAdicionar);
        panel.add(btnListar);
        panel.add(btnSair);

        frame.add(panel);

        // Eventos
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarFornecedor();
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarFornecedores();
            }
        });

        btnSair.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }

    public void adicionarFornecedor() {
        String nome = JOptionPane.showInputDialog("Digite o nome do fornecedor:");
        String contato = JOptionPane.showInputDialog("Digite o contato do fornecedor:");
        JOptionPane.showMessageDialog(null, "Fornecedor " + nome + " adicionado com sucesso!");
    }

    public void listarFornecedores() {
        // Exemplo fictício de fornecedores
        String fornecedores = "1 - Fornecedor X\n2 - Fornecedor Y\n3 - Fornecedor Z";
        JOptionPane.showMessageDialog(null, "Fornecedores:\n" + fornecedores);
    }
}
