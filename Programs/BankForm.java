
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankForm extends JFrame implements ActionListener {

    // Labels and text fields for form
    Label title = new Label("BANK OF JALGAON");
    Label name = new Label("Name:");
    TextField nameField = new TextField();
    Label aadhar = new Label("Aadhar No:");
    TextField aadharField = new TextField();
    Label address = new Label("Address:");
    TextField addressField = new TextField();
    Label city = new Label("City:");
    TextField cityField = new TextField();
    Label state = new Label("State:");
    TextField stateField = new TextField();
    Label country = new Label("Country:");
    TextField countryField = new TextField();
    Label mob = new Label("Mobile No:");
    TextField mobField = new TextField();
    Label email = new Label("Email:");
    TextField emailField = new TextField();
    Label password = new Label("Create Password:");
    TextField passwordField = new TextField();
    Label confirmPassword = new Label("Confirm Password:");
    TextField confirmPasswordField = new TextField();
    Label info = new Label("The bank name is imaginary; resemblance to any bank is purely coincidental.");

    // Buttons
    Button saveButton = new Button("SAVE");
    Button clearButton = new Button("CLEAR");
    Button cancelButton = new Button("CANCEL");

    // Constructor to set up GUI components
    public BankForm() {
        setTitle("Bank Form");
        setSize(1000, 700);
        setLayout(null);

        // Title
        title.setBounds(310, 50, 380, 40);
        title.setAlignment(Label.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 30));
        add(title);

        // Adding all form fields
        addComponent(name, nameField, 120);
        addComponent(aadhar, aadharField, 160);
        addComponent(address, addressField, 200);
        addComponent(city, cityField, 240);
        addComponent(state, stateField, 280);
        addComponent(country, countryField, 320);
        addComponent(mob, mobField, 360);
        addComponent(email, emailField, 400);

        // Password and confirm password
        password.setBounds(290, 440, 200, 30);
        passwordField.setBounds(510, 440, 200, 30);
        passwordField.setEchoChar('*');
        add(password);
        add(passwordField);

        confirmPassword.setBounds(290, 480, 200, 30);
        confirmPasswordField.setBounds(510, 480, 200, 30);
        confirmPasswordField.setEchoChar('*');
        add(confirmPassword);
        add(confirmPasswordField);

        // Info label
        info.setBounds(150, 650, 700, 30);
        info.setAlignment(Label.CENTER);
        info.setFont(new Font("Arial", Font.BOLD, 11));
        add(info);

        // Buttons
        addButton(saveButton, 310);
        addButton(clearButton, 450);
        addButton(cancelButton, 590);

        // Button actions
        saveButton.addActionListener(this);
        clearButton.addActionListener(this);
        cancelButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method to add form components
    private void addComponent(Label label, TextField textField, int yPos) {
        label.setBounds(290, yPos, 200, 30);
        textField.setBounds(510, yPos, 200, 30);
        add(label);
        add(textField);
    }

    // Method to add buttons
    private void addButton(Button button, int xPos) {
        button.setBounds(xPos, 550, 100, 30);
        add(button);
    }

    // Action event handler
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            if (validateInputs()) {
                JOptionPane.showMessageDialog(this, "Data Saved");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Data Not Saved\n Please Enter Correct Data");
            }
        } else if (e.getSource() == clearButton) {
            clearFields();
        } else if (e.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    // Clears all text fields
    private void clearFields() {
        nameField.setText("");
        aadharField.setText("");
        addressField.setText("");
        cityField.setText("");
        stateField.setText("");
        countryField.setText("");
        mobField.setText("");
        emailField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
    }

    // Validates inputs
    private boolean validateInputs() {
        if (!nameField.getText().matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Name");
            return false;
        }
        if (!cityField.getText().matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Please Enter a Valid City");
            return false;
        }
        if (!stateField.getText().matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Please Enter a Valid State");
            return false;
        }
        if (!countryField.getText().matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Country");
            return false;
        }
        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            JOptionPane.showMessageDialog(this, "Passwords Do Not Match");
            confirmPasswordField.setText("");
            return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        new BankForm().setVisible(true);
    }
}
