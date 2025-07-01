package gui;

import coffee.Coffee;
import coffee.CoffeeFactory;
import decorators.*;
import payment.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

public class CoffeeShopGUI extends JFrame {
    private JComboBox<String> coffeeTypeBox;
    private JCheckBox milkBox, chocolateBox, whippedCreamBox;
    private JComboBox<String> paymentBox;
    private JTextArea summaryArea;
    private JButton orderButton;

    public CoffeeShopGUI() {
        super("Coffee Shop");
        setLayout(new BorderLayout());

        // Painel de seleção de café
        JPanel coffeePanel = new JPanel(new GridLayout(0, 1));
        coffeePanel.setBorder(BorderFactory.createTitledBorder("Escolha seu café"));
        coffeeTypeBox = new JComboBox<>(new String[]{"Espresso", "Latte"});
        coffeePanel.add(coffeeTypeBox);

        // Painel de complementos
        JPanel addonPanel = new JPanel(new GridLayout(0, 1));
        addonPanel.setBorder(BorderFactory.createTitledBorder("Adicionais"));
        milkBox = new JCheckBox("Leite (R$1,00)");
        chocolateBox = new JCheckBox("Chocolate (R$1,50)");
        whippedCreamBox = new JCheckBox("Chantilly (R$2,00)");
        addonPanel.add(milkBox);
        addonPanel.add(chocolateBox);
        addonPanel.add(whippedCreamBox);

        // Painel de pagamento
        JPanel paymentPanel = new JPanel(new GridLayout(0, 1));
        paymentPanel.setBorder(BorderFactory.createTitledBorder("Método de Pagamento"));
        paymentBox = new JComboBox<>(new String[]{"Cartão de Crédito", "PIX", "Dinheiro"});
        paymentPanel.add(paymentBox);

        // Área de resumo
        summaryArea = new JTextArea(5, 30);
        summaryArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(summaryArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Resumo do Pedido"));

        // Botão de pedido
        orderButton = new JButton("Fazer Pedido");
        orderButton.addActionListener(this::handleOrder);

        // Layout principal
        JPanel centerPanel = new JPanel(new GridLayout(1, 3));
        centerPanel.add(coffeePanel);
        centerPanel.add(addonPanel);
        centerPanel.add(paymentPanel);

        add(centerPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
        add(orderButton, BorderLayout.NORTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void handleOrder(ActionEvent event) {
        String type = (String) coffeeTypeBox.getSelectedItem();
        Coffee coffee = CoffeeFactory.createCoffee(type.toLowerCase());

        if (milkBox.isSelected()) coffee = new Milk(coffee);
        if (chocolateBox.isSelected()) coffee = new Chocolate(coffee);
        if (whippedCreamBox.isSelected()) coffee = new WhippedCream(coffee);

        String paymentMethod