package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Gmenu extends JFrame{


    protected JPanel panelMain;
    Dealership dealership = new Dealership();
    Parking parking = new Parking();

    private JButton printCallendarButton;
    private JButton previewAvailableVehiclesButton;
    private JButton hireManagerButton;
    private JButton hireEmployeeButton;
    private JButton printSaleAgreementButton;
    private JButton showCurrentEmployeesButton;
    private JButton subtractVehicleFormParkingnButton;
    private JButton setBonusButton;
    private JButton addCarToParkingButton;
    private JButton riseSalaryButton;
    private JButton addTruckToParkingButton;
    private JButton swapEmployeesButton;
    private JButton timerButton;
    private JButton equalsTestButton;
    private JButton getSalaryButton;
    private JButton cloneButton;
    private JButton getHashCodeButton;
    private JButton compareButton;


    public Gmenu() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        printCallendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dealership.printCallendar();


            }
        });
        previewAvailableVehiclesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parking.printAvailableVeh();
                JFrame vehFrame = new JFrame("Available Vehicles");
                JList<String> list = new JList<String>(parking.stringArray());

                vehFrame.add(list);
                vehFrame.setVisible(true);
                vehFrame.pack();

            }
        });
        printSaleAgreementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame saleFrame = new JFrame("Sale Agreement");
                JTextArea area = new JTextArea();
                area.append("Seller Details\n"+
                        "Full Name:\n"+
                        "Address:\n"+
                        "Postcode:\n"+
                        "Phone Number:\n"+
                        "Buyer Details\n"+
                        "Full Name:\n"+
                        "Address:\n"+
                        "Postcode:\n"+
                        "Phone Number:\n"+
                        "Vehicle Details\n"+
                        "Make:\n"+
                        "Model:\n"+
                        "Year:\n"+
                        "Current Mileage (Confirmed True by Seller):\n"+
                        "VIN/Chassis Number:\n"+
                        "(The Vehicle Identification Number must be verified on the vehicle body and DVLA V5\n"+
                        "Registration Certificate)\n"+
                        "Engine Number (optional):\n"+
                        "Vehicle Sale Price: £\n"+
                        "Amount Paid to Seller: £ ;\n");
                saleFrame.add(area);
                saleFrame.setVisible(true);
                saleFrame.pack();

                dealership.printSaleAgreement();

            }
        });
        subtractVehicleFormParkingnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame subtractVehframe = new JFrame("Subtract");

                JLabel label = new JLabel("Pick vehicles to subtract");
                JButton subtractBtn = new JButton("Subtract");
                JComboBox carList = new JComboBox(parking.stringArray());

                subtractVehframe.setLayout(new FlowLayout());
                subtractVehframe.add(label);
                subtractVehframe.add(carList);
                subtractVehframe.add(subtractBtn);
                subtractVehframe.pack();
                subtractVehframe.setVisible(true);

                subtractBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        parking.guiSubtractVehicle(carList.getSelectedIndex());
                        carList.setModel(new DefaultComboBoxModel<String>(parking.stringArray()));
                    }
                });
            }
        });
        timerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame timerFrame = new JFrame("Timer");
                //JTextArea text = new JTextArea();

                //timerFrame.setLayout(new FlowLayout());
                //timerFrame.add(text);
                //timerFrame.pack();
                //timerFrame.setVisible(true);

                ActionListener listener = new Timeprinter();
                // construct a timer that calls the listener
                // once every 10 seconds
                javax.swing.Timer t = new javax.swing.Timer(1000, listener);
                t.start();

                JOptionPane.showMessageDialog(null, "Quit program?");
                t.stop();
            }
        });
    }
}
