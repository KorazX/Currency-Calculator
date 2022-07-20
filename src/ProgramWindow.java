import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;
import javax.swing.*;


public class ProgramWindow extends JFrame{

    float textFieldValue;
    List<JLabel> jLabelCurrenciesList = new ArrayList<JLabel>();

    public ProgramWindow (){
        super("Currency Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720,710);
        setResizable(false);
        setLayout(new FlowLayout());
        JLabel jLabelTitle = new JLabel("Currency Calculator");
        jLabelTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 65));
        jLabelTitle.setForeground(Color.BLUE);
        add(jLabelTitle);

        JLabel jLabelEUR = new JLabel("EUR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/european-union.png"))), JLabel.RIGHT);
        add(jLabelEUR);

        JTextField jTextField = new JTextField(5);
        jTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    textFieldValue=Float.parseFloat(jTextField.getText());
                    UpdateCurrencies();
                }

                catch (NumberFormatException numberFormatException){
                    // not a valid number
                }
            }
        });
        add(jTextField);

        JSeparator   jSeparator = new JSeparator();
        jSeparator.setPreferredSize(new Dimension(600,2));
        add(jSeparator);

        //region currencies
        JPanel currenciesPanel = new JPanel();
        currenciesPanel.setLayout(new GridLayout(0,4));

        CreateCurrencyList();

        for (JLabel label: jLabelCurrenciesList) {
            currenciesPanel.add(label);
        }
        add(currenciesPanel);
        //endregion

        setVisible(true);
    }

    private void CreateCurrencyList() {
        jLabelCurrenciesList.add(new JLabel("0.0 USD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/united-states.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 JPY", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/japan.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 BGN", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/bulgaria.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 CZK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/czech-republic.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 DKK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/denmark.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 GBP", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/united-kingdom.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 HUF", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/hungary.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 PLN", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/poland.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 RON", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/romania.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 SEK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/sweden.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 CHF", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/switzerland.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 ISK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/iceland.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 NOK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/norway.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 HRK", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/croatia.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 TRY", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/turkey.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 AUD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/australia.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 BRL", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/brazil.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 CAD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/canada.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 CNY", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/china.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 HKD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/china.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 IDR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/indonesia.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 ILS", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/israel.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 INR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/india.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 KRW", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/south-korea.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 MXN", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/mexico.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 MYR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/malaysia.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 NZD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/new-zealand.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 PHP", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/philippines.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 SGD", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/singapore.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 THB", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/thailand.png"))), JLabel.LEFT));
        jLabelCurrenciesList.add(new JLabel("0.0 ZAR", new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/south-africa.png"))), JLabel.LEFT));
    }

    void UpdateCurrencies(){
        for (int i=0; i<jLabelCurrenciesList.size();i++){
            jLabelCurrenciesList.get(i).setText(textFieldValue*saxParser.currenciesList.get(i).rate+" "+saxParser.currenciesList.get(i).currency);
        }
    }
}