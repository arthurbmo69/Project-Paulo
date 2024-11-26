package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaView {

    public void exibirTela() {
        JFrame frame = new JFrame("Gerenciar Vendas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton btnAdicionar = new JButton("Adicionar Venda");
        JButton btnListar = new JButton("Listar Vendas");
        JButton btnSair = new JButton("Sair");

        panel.add(btnAdicionar);
        panel.add(btnListar);
        panel.add(btnSair);

        frame.add(panel);

        // Eventos
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarVenda();
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarVendas();
            }
        });

        btnSair.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }

    public void adicionarVenda() {
        JOptionPane.showMessageDialog(null, "Adicionar funcionalidade de vendas.");
    }

    public void listarVendas() {
        // Exemplo fictício de vendas
        String vendas = "1 - Venda A\n2 - Venda B\n3 - Venda C";
        JOptionPane.showMessageDialog(null, "Vendas:\n" + vendas);
    }
}
