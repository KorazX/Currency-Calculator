

import java.awt.*;
import java.util.Objects;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class ProgramWindow extends JFrame{


    public ProgramWindow (){
        super("Currency Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430,710);
        //setResizable(false);
        setLayout(new FlowLayout());

        JLabel jLabelTitle = new JLabel("Currency Calculator");
        jLabelTitle.setVerticalAlignment(1);
        jLabelTitle.setHorizontalAlignment(0);
        jLabelTitle.setFont(new Font("Times New Roman", Font.BOLD, 36));
        jLabelTitle.setForeground(Color.BLUE);
        add(jLabelTitle);


        JLabel jLabelEUR = new JLabel("EUR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/european-union.png"))), JLabel.RIGHT);
        add(jLabelEUR);
        JTextField jTextFieldEUR = new JTextField(5);
        add(jTextFieldEUR);

        JSeparator   jSeparator = new JSeparator();
        jSeparator.setPreferredSize(new Dimension(320,2));
        add(jSeparator);

        JLabel jLabelUSD = new JLabel("USD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/united-states.png"))), JLabel.RIGHT);
        add(jLabelUSD);

        JLabel jLabelJPY = new JLabel("JPY", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/japan.png"))), JLabel.RIGHT);
        add(jLabelJPY);

        JLabel jLabelBGN = new JLabel("BGN", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/bulgaria.png"))), JLabel.RIGHT);
        add(jLabelBGN);

        JLabel jLabelCZK = new JLabel("CZK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/czech-republic.png"))), JLabel.RIGHT);
        add(jLabelCZK);

        JLabel jLabelDKK = new JLabel("DKK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/denmark.png"))), JLabel.RIGHT);
        add(jLabelDKK);

        JLabel jLabelGBP = new JLabel("GBP", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/united-kingdom.png"))), JLabel.RIGHT);
        add(jLabelGBP);

        JLabel jLabelHUF = new JLabel("HUF", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/hungary.png"))), JLabel.RIGHT);
        add(jLabelHUF);

        JLabel jLabelPLN = new JLabel("PLN", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/poland.png"))), JLabel.RIGHT);
        add(jLabelPLN);

        JLabel jLabelRON = new JLabel("RON", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/romania.png"))), JLabel.RIGHT);
        add(jLabelRON);

        JLabel jLabelSEK = new JLabel("SEK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/sweden.png"))), JLabel.RIGHT);
        add(jLabelSEK);

        JLabel jLabelCHF = new JLabel("CHF", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/switzerland.png"))), JLabel.RIGHT);
        add(jLabelCHF);

        JLabel jLabelISK = new JLabel("ISK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/iceland.png"))), JLabel.RIGHT);
        add(jLabelISK);

        JLabel jLabelNOK = new JLabel("NOK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/norway.png"))), JLabel.RIGHT);
        add(jLabelNOK);

        JLabel jLabelHRK = new JLabel("HRK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/croatia.png"))), JLabel.RIGHT);
        add(jLabelHRK);

        JLabel jLabelTRY = new JLabel("TRY", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/turkey.png"))), JLabel.RIGHT);
        add(jLabelTRY);

        JLabel jLabelAUD = new JLabel("AUD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/australia.png"))), JLabel.RIGHT);
        add(jLabelAUD);

        JLabel jLabelBRL = new JLabel("BRL", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/brazil.png"))), JLabel.RIGHT);
        add(jLabelBRL);

        JLabel jLabelCAD = new JLabel("CAD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/canada.png"))), JLabel.RIGHT);
        add(jLabelCAD);

        JLabel jLabelCNY = new JLabel("CNY", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/china.png"))), JLabel.RIGHT);
        add(jLabelCNY);

        JLabel jLabelHKD = new JLabel("HKD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/china.png"))), JLabel.RIGHT);
        add(jLabelHKD);

        JLabel jLabelIDR = new JLabel("IDR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/indonesia.png"))), JLabel.RIGHT);
        add(jLabelIDR);

        JLabel jLabelILS = new JLabel("ILS", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/israel.png"))), JLabel.RIGHT);
        add(jLabelILS);

        JLabel jLabelINR = new JLabel("INR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/india.png"))), JLabel.RIGHT);
        add(jLabelINR);

        JLabel jLabelKRW = new JLabel("KRW", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/south-korea.png"))), JLabel.RIGHT);
        add(jLabelKRW);

        JLabel jLabelMXN = new JLabel("MXN", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/mexico.png"))), JLabel.RIGHT);
        add(jLabelMXN);

        JLabel jLabelMYR = new JLabel("MYR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/malaysia.png"))), JLabel.RIGHT);
        add(jLabelMYR);

        JLabel jLabelNZD = new JLabel("NZD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/new-zealand.png"))), JLabel.RIGHT);
        add(jLabelNZD);

        JLabel jLabelPHP = new JLabel("PHP", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/philippines.png"))), JLabel.RIGHT);
        add(jLabelPHP);

        JLabel jLabelSGD = new JLabel("SGD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/singapore.png"))), JLabel.RIGHT);
        add(jLabelSGD);

        JLabel jLabelTHB = new JLabel("THB", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/thailand.png"))), JLabel.RIGHT);
        add(jLabelTHB);

        JLabel jLabelZAR = new JLabel("ZAR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/south-africa.png"))), JLabel.RIGHT);
        add(jLabelZAR);

        setVisible(true);
    }
}
