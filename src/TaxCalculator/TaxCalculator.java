package TaxCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TaxCalculator extends JFrame {

    private JTextField taxableIncomeField;
    private JTextField fiscalPartsField;
    private JTextArea resultArea;
    private JComboBox<String> dropdown;


    public TaxCalculator() {
        setTitle("Tax Calculator");
        setSize(400, 300);
        setMinimumSize(new Dimension(400, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        // Labels
        JLabel incomeLabel = new JLabel("Taxable Income (€):");
        JLabel partsLabel = new JLabel("Number of Fiscal Parts:");

        // Text fields
        taxableIncomeField = new JTextField(10);
        fiscalPartsField = new JTextField(10);

        taxableIncomeField.setToolTipText("Въведете облагаемия доход");
        fiscalPartsField.setToolTipText("Брой фискални единици");
        taxableIncomeField.addActionListener(new CalculateButtonListener());
        fiscalPartsField.addActionListener(new CalculateButtonListener());




        // Calculate button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());

        // Text area for result
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        String[] options = {"2023", "2024", "---"};
        dropdown = new JComboBox<>(options);
        dropdown.setSelectedItem("2023");
        dropdown.addActionListener(new DropdownListener());

        // Panel for input fields and button
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(incomeLabel);
        panel.add(taxableIncomeField);
        panel.add(partsLabel);
        panel.add(fiscalPartsField);
        panel.add(calculateButton);
        panel.add(dropdown);


        // Add components to the frame
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }



    private class DropdownListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            // обработка на избрания елемент
            String year = Objects.requireNonNull(dropdown.getSelectedItem()).toString();
           double[] tranches = switch (year) {
                case "2024" -> new double[]{11294, 28797, 82341, 177106};
                case "2023" -> new double[]{10777, 27478, 78570, 168994};
                default -> new double[]{10777, 27478, 78570, 168994};
            };

            resultArea.setText("");
            resultArea.append("Barem choisit: " + year + "\n");
            resultArea.append(String.format("0%%:   0  -   %.0f\n", tranches[0]));
            resultArea.append(String.format("11%%:  %.0f   -  %.0f\n", tranches[0], tranches[1]));
            resultArea.append(String.format("30%%:  %.0f   -  %.0f\n", tranches[1], tranches[2]));
            resultArea.append(String.format("41%%:  %.0f   -  %.0f\n", tranches[2], tranches[3]));
            resultArea.append(String.format("45%%:  %.0f   -\n", tranches[3]));


        }
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double taxableIncome;
            int fiscalParts;
            try {
                taxableIncome = Double.parseDouble(taxableIncomeField.getText());
                fiscalParts = Integer.parseInt(fiscalPartsField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(TaxCalculator.this, "Please enter valid values!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (taxableIncome <= 0) {
                JOptionPane.showMessageDialog(TaxCalculator.this, "Please enter valid values!\n Taxable income.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (fiscalParts < 1) {
                JOptionPane.showMessageDialog(TaxCalculator.this, "Please enter valid values!\n Fiscal parts.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double[] tax = CalculateTax.calculateTax(taxableIncome, fiscalParts, Objects.requireNonNull(dropdown.getSelectedItem()).toString());
            resultArea.setText("");

            resultArea.append("<b>Този текст ще бъде отобразен в удебелен шрифт</b>");
            resultArea.setText(String.format("€%.2f ......... Tax tax up to 11 294€ \n", tax[1] * fiscalParts));
            resultArea.append(String.format("€%.2f........... Total between 11 295 € and 28 797 €\n", tax[2] * fiscalParts));
            resultArea.append(String.format("€%.2f........... Total tax between 28 798 € and 82 341 €\n", tax[3] * fiscalParts));
            resultArea.append(String.format("€%.2f........... Total tax between 82 342 € à 177 106 €\n", tax[4] * fiscalParts));
            resultArea.append(String.format("€%.2f........... Total above 177 106 €\n", tax[5] * fiscalParts));
            resultArea.append(String.format("€%.2f........... Total Tax.\n", tax[0]));


        }
    }

    private  class CalculateTax {
        private static double[] calculateTax(double taxableIncome, int fiscalParts, String year) {
            double incomePerPart = taxableIncome / fiscalParts;
            double tax = 0.0;
            double[] limits = switch (year) {
                case "2024" -> new double[]{11294, 28797, 82341, 177106};
                case "2023" -> new double[]{10777, 27478, 78570, 168994};
                default -> new double[]{10777, 27478, 78570, 168994};
            };


            double[] rates = {0.0, 0.11, 0.30, 0.41, 0.45};

            // Calculate tax for each bracket
            double[] bracketTaxes = new double[5];
            if (incomePerPart > limits[0]) {
                bracketTaxes[0] = limits[0] * rates[0];
            } else {
                bracketTaxes[0] = incomePerPart * rates[0];
            }

            if (incomePerPart > limits[1]) {
                bracketTaxes[1] = (Math.min(incomePerPart, limits[1]) - limits[0]) * rates[1];
            } else if (incomePerPart > limits[0]) {
                bracketTaxes[1] = (incomePerPart - limits[0]) * rates[1];
            }

            if (incomePerPart > limits[2]) {
                bracketTaxes[2] = (Math.min(incomePerPart, limits[2]) - limits[1]) * rates[2];
            } else if (incomePerPart > limits[1]) {
                bracketTaxes[2] = (incomePerPart - limits[1]) * rates[2];
            }

            if (incomePerPart > limits[3]) {
                bracketTaxes[3] = (Math.min(incomePerPart, limits[3]) - limits[2]) * rates[3];
            } else if (incomePerPart > limits[2]) {
                bracketTaxes[3] = (incomePerPart - limits[2]) * rates[3];
            }

            if (incomePerPart > limits[3]) {
                bracketTaxes[4] = (incomePerPart - limits[3]) * rates[4];
            }

            // Sum taxes for all brackets
            for (double bracketTax : bracketTaxes) {
                tax += bracketTax;
            }
            tax *= fiscalParts;

            // Multiply by the number of fiscal parts to get total tax
            return new double[]{tax, bracketTaxes[0], bracketTaxes[1], bracketTaxes[2], bracketTaxes[3], bracketTaxes[4]};
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TaxCalculator calculator = new TaxCalculator();
            calculator.setVisible(true);
        });
    }
}

