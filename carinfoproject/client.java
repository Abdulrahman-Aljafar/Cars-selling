/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinfoproject;

/**
 *
 * @author mac
 */
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class client extends javax.swing.JFrame {

    private Socket socket;
    private Car car;
    private ObjectOutputStream outputServer;
    private ObjectInputStream inputServer;

    /**
     * Creates new form client
     */
    public client() {
        initComponents();
        this.setTitle("Car Information -client");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        updateButton.setEnabled(false);
        resetAllComponents();
        try {
            socket = new Socket("localhost", 5000);
            outputServer = new ObjectOutputStream(socket.getOutputStream());
            inputServer = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carStyleButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        carIdTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        carTypeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        carMakeTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        carModelTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        carMinimumPriceSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        carMaximumPriceSpinner = new javax.swing.JSpinner();
        suvRadioButton = new javax.swing.JRadioButton();
        sedanRadioButton = new javax.swing.JRadioButton();
        hatchbackRadioButton = new javax.swing.JRadioButton();
        minivanRadioButton = new javax.swing.JRadioButton();
        frontWheelDriveCheckBox = new javax.swing.JCheckBox();
        allWheelDriveCheckBox = new javax.swing.JCheckBox();
        backWheelDriveCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        carManufacuringYearComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        carSizeEngineTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" Car Id ");

        jLabel2.setText("Car type ");

        carTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Used", "New" }));

        jLabel3.setText("CarMake");

        jLabel4.setText("Car model");

        jLabel5.setText("Car minimum price");

        carMinimumPriceSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000, 1000));

        jLabel6.setText("Car maximum price");

        carMaximumPriceSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000, 1000));

        carStyleButtonGroup.add(suvRadioButton);
        suvRadioButton.setText("SUV");

        carStyleButtonGroup.add(sedanRadioButton);
        sedanRadioButton.setText("Sedan");

        carStyleButtonGroup.add(hatchbackRadioButton);
        hatchbackRadioButton.setText("Hatchback");

        carStyleButtonGroup.add(minivanRadioButton);
        minivanRadioButton.setText("Minivan");

        frontWheelDriveCheckBox.setText("Front Wheel Drive");

        allWheelDriveCheckBox.setText("All Wheel Drive");

        backWheelDriveCheckBox.setText("Back Wheel Drive");

        jLabel7.setText("Car Style");

        jLabel8.setText("Car drive");

        jLabel9.setText("Car Manufacturing Year");

        carManufacuringYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        jLabel10.setText("Car Size Engine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(suvRadioButton))
                        .addGap(75, 75, 75)
                        .addComponent(sedanRadioButton)
                        .addGap(80, 80, 80)
                        .addComponent(hatchbackRadioButton)
                        .addGap(81, 81, 81)
                        .addComponent(minivanRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(carIdTextField)
                                    .addComponent(carMakeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(carMaximumPriceSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(carModelTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(52, 52, 52)
                                .addComponent(carMinimumPriceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(frontWheelDriveCheckBox)
                        .addGap(63, 63, 63)
                        .addComponent(allWheelDriveCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carManufacuringYearComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carSizeEngineTextField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(backWheelDriveCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(carIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(carTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carMakeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(carModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carMinimumPriceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(carMaximumPriceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suvRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sedanRadioButton)
                    .addComponent(hatchbackRadioButton)
                    .addComponent(minivanRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frontWheelDriveCheckBox)
                    .addComponent(allWheelDriveCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backWheelDriveCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(carManufacuringYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(carSizeEngineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertButton)
                            .addComponent(searchButton)
                            .addComponent(updateButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(insertButton)
                .addGap(27, 27, 27)
                .addComponent(searchButton)
                .addGap(33, 33, 33)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void createACarObject() {
        int  carMaxPrice, carMinPrice;
        String carId, carMake, carModel, carStyle, carDriveType, carType, carSizeEngine,manufacuringYear;

        carId = carIdTextField.getText().trim();
        carType = carTypeComboBox.getSelectedItem() + "";
        carMake = carMakeTextField.getText().trim();
        carModel = carModelTextField.getText().trim();
        carMaxPrice = Integer.parseInt(carMaximumPriceSpinner.getValue().toString());
        carMinPrice = Integer.parseInt(carMinimumPriceSpinner.getValue().toString());
        String style = "";
        if (suvRadioButton.isSelected()) {
            style = "SUV";
        } else if (sedanRadioButton.isSelected()) {
            style = "Sedan";
        } else if (hatchbackRadioButton.isSelected()) {
            style = "hatchback";
        } else if (minivanRadioButton.isSelected()) {
            style = "Minivan";
        }
        String drive = "";
        if (frontWheelDriveCheckBox.isSelected()) {
            drive = "Front Wheel Drive";
        }
        if (allWheelDriveCheckBox.isSelected()) {
            if (drive.length() == 0) {
                drive = "All Wheel Drive";
            } else {
                drive += ", All Wheel Drive";
            }
        }
        if (backWheelDriveCheckBox.isSelected()) {
            if (drive.length() == 0) {
                drive = "Back Wheel Drive";
            } else {
                drive += ", Back Wheel Drive";
            }
        }
        manufacuringYear = (carManufacuringYearComboBox.getSelectedItem() + "");
        carSizeEngine = carSizeEngineTextField.getText().trim();

        car = new Car(carId, carType, carMake, carModel, carMinPrice, carMaxPrice, style, drive, manufacuringYear, carSizeEngine);

    }
    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed

        if (validateAllFormElements()) {
            createACarObject();

            try {
                outputServer.writeObject(car);
                outputServer.writeUTF("Insert");
                outputServer.flush();
                resetAllComponents();
            } catch (IOException ex) {
                System.out.println("Error in Insert Button " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resetAllComponents();        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        if (!carIdTextField.getText().equals("")) {
            createACarObject();
            
            try {

                outputServer.writeObject(car);
                outputServer.writeUTF("Search");
                outputServer.flush();
                Car carFromServer = (Car) inputServer.readObject();
                if (carManufacuringYearComboBox != null) {
                    carIdTextField.setText(carFromServer.getCarId());
                    carModelTextField.setText(carFromServer.getCarModel());
                    carMakeTextField.setText(carFromServer.getCarMake());
                    carMinimumPriceSpinner.setValue(carFromServer.getCarMinPrice());
                    carMaximumPriceSpinner.setValue(carFromServer.getCarMaxPrice());
                   // if (carStyleButtonGroup.equals("SUV")) {
                    //    suvRadioButton.setSelected(true);
                   // } else if (carStyleButtonGroup.equals("Sedan")) {
                   //     sedanRadioButton.setSelected(true);
                  //  } else if (carStyleButtonGroup.equals("Minivan")) {
                   //     minivanRadioButton.setSelected(true);
                  //  }
                  

                    
                    if (carFromServer.getCarStyle().equals("SUV")) {
                        suvRadioButton.setSelected(true);
                    }
                    
                    else if (carFromServer.getCarStyle().equals("Sedan")) {
                        sedanRadioButton.setSelected(true);
                    }
                    else if (carFromServer.getCarStyle().equals("Minivan")) {
                        minivanRadioButton.setSelected(true);
                    } 
                    
                        
                    else if (carFromServer.getCarStyle().equals("hatchback")) {
                       hatchbackRadioButton.setSelected(true);
                    }

                    if (carFromServer.getCarDriveType().contains("Front Wheel Drive")) {
                        frontWheelDriveCheckBox.setSelected(true);
                    }
                    
                    if (carFromServer.getCarDriveType().contains("All Wheel Drive")||carFromServer.getCarDriveType().contains(", All Wheel Drive")) {
                            
                        allWheelDriveCheckBox.setSelected(true);
                    }
 
                    
                    if ((carFromServer.getCarDriveType().contains("Back Wheel Drive"))||(carFromServer.getCarDriveType().contains(", Back Wheel Drive"))) {
                        backWheelDriveCheckBox.setSelected(true);
                    }

                    carTypeComboBox.setSelectedItem(carFromServer.getCarType());

                    carManufacuringYearComboBox.setSelectedItem(carFromServer.getManufacuringYear());

                    carSizeEngineTextField.setText(carFromServer.getCarSizeEngine());
                    
//                    if (allWheelDriveCheckBox.isSelected()) {
//                        allWheelDriveCheckBox.setSelected(true);
//                    }
//                    if (backWheelDriveCheckBox.isSelected()) {
//                        backWheelDriveCheckBox.setSelected(true);
//                    }


                    //disbale the insert and search button and enable the update button
                    insertButton.setEnabled(false);
                    searchButton.setEnabled(false);
                    updateButton.setEnabled(true);
                    carIdTextField.setEditable(false);
                }
            } catch (IOException ex) {
                System.out.println("Error in Search Button " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                System.out.println("Error in reading data from server" + ex.getMessage());
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (validateAllFormElements()) {
            createACarObject();
            try {

                outputServer.writeObject(car);
                outputServer.writeUTF("Update");
                outputServer.flush();

                resetAllComponents();
            } catch (IOException ex) {
                System.out.println("Error in Update Button " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed
    private boolean validateAllFormElements() {
        if (carIdTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Car ID", "Car ID missing", JOptionPane.ERROR_MESSAGE);
            carIdTextField.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (!carIdTextField.getText().matches("[0-9]{10}$")) {
            JOptionPane.showMessageDialog(this, "Car ID must contain 10 digit", "Wrong Car ID", JOptionPane.ERROR_MESSAGE);
            carIdTextField.setText("");
            carIdTextField.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (carTypeComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please choose a car type", "car type missing", JOptionPane.ERROR_MESSAGE);
            carTypeComboBox.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (carMakeTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Car make", "Car make missing", JOptionPane.ERROR_MESSAGE);
            carMakeTextField.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (!carMakeTextField.getText().matches("[A-Z][A-Za-z ]+")) {
            JOptionPane.showMessageDialog(this, "Car Make Must contain only letters and spaces,it should start with uppercase letter", "Wrong Car Make", JOptionPane.ERROR_MESSAGE);
            carMakeTextField.setText("");
            carMakeTextField.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (carModelTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Car model", "Car model missing", JOptionPane.ERROR_MESSAGE);
            carModelTextField.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (!carModelTextField.getText().matches("[A-Za-z0-9 ]+")) {
            JOptionPane.showMessageDialog(this, "Car model Must contain only letters and spacesand digit", "Wrong Car model", JOptionPane.ERROR_MESSAGE);
            carMakeTextField.setText("");
            carModelTextField.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (Integer.parseInt(carMinimumPriceSpinner.getValue() + "") < 1000 || Integer.parseInt(carMinimumPriceSpinner.getValue() + "") > 1000000) {

            JOptionPane.showMessageDialog(this, "Car minimum Price must be bigger than 1000 and less than 1000000 ", "price min mistake", JOptionPane.ERROR_MESSAGE);
            carMinimumPriceSpinner.setValue(0);
            carMinimumPriceSpinner.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (Integer.parseInt(carMaximumPriceSpinner.getValue() + "") < 1000 || Integer.parseInt(carMaximumPriceSpinner.getValue() + "") > 1000000) {

            JOptionPane.showMessageDialog(this, "Car maximum Price must be bigger than 1000 and less than 1000000 ", "price max mistake", JOptionPane.ERROR_MESSAGE);
            carMaximumPriceSpinner.setValue(0);
            carMaximumPriceSpinner.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (!sedanRadioButton.isSelected() && !minivanRadioButton.isSelected() && !hatchbackRadioButton.isSelected() && !suvRadioButton.isSelected()) {

            JOptionPane.showMessageDialog(this, "Please choose one of the car style", "car style mistake", JOptionPane.ERROR_MESSAGE);
            frontWheelDriveCheckBox.requestFocus(); // putting back the focus in the required field
            return false;

        } else if (!frontWheelDriveCheckBox.isSelected() && !allWheelDriveCheckBox.isSelected() && !backWheelDriveCheckBox.isSelected()) {

            JOptionPane.showMessageDialog(this, "Please choose one of the car drive", "car drive mistake", JOptionPane.ERROR_MESSAGE);
            frontWheelDriveCheckBox.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (carManufacuringYearComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please choose a car manufacuring year", "car manufacuring year missing", JOptionPane.ERROR_MESSAGE);
            carManufacuringYearComboBox.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (carSizeEngineTextField.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter car size", "car size mistake", JOptionPane.ERROR_MESSAGE);
            carSizeEngineTextField.requestFocus(); // putting back the focus in the required field
            return false;
        } else if (!carSizeEngineTextField.getText().matches("[0-9].+")) {

            JOptionPane.showMessageDialog(this, " car engine size should contain only double ", "car size mistake", JOptionPane.ERROR_MESSAGE);
            carSizeEngineTextField.requestFocus(); // putting back the focus in the required field
            return false;
        }

        return true;

    }

    private void resetAllComponents() {

        carIdTextField.setText("");
        carMakeTextField.setText("");
        carModelTextField.setText("");
        carSizeEngineTextField.setText("");
        suvRadioButton.setSelected(true);
        carTypeComboBox.setSelectedIndex(-1);
        carManufacuringYearComboBox.setSelectedIndex(-1);

        carMaximumPriceSpinner.setValue(0);
        carMinimumPriceSpinner.setValue(0);
        allWheelDriveCheckBox.setSelected(false);
        backWheelDriveCheckBox.setSelected(false);
        frontWheelDriveCheckBox.setSelected(false);
        updateButton.setEnabled(false);
        insertButton.setEnabled(true);
        searchButton.setEnabled(true);
        carIdTextField.setEditable(true);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allWheelDriveCheckBox;
    private javax.swing.JCheckBox backWheelDriveCheckBox;
    private javax.swing.JTextField carIdTextField;
    private javax.swing.JTextField carMakeTextField;
    private javax.swing.JComboBox<String> carManufacuringYearComboBox;
    private javax.swing.JSpinner carMaximumPriceSpinner;
    private javax.swing.JSpinner carMinimumPriceSpinner;
    private javax.swing.JTextField carModelTextField;
    private javax.swing.JTextField carSizeEngineTextField;
    private javax.swing.ButtonGroup carStyleButtonGroup;
    private javax.swing.JComboBox<String> carTypeComboBox;
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBox frontWheelDriveCheckBox;
    private javax.swing.JRadioButton hatchbackRadioButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton minivanRadioButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton sedanRadioButton;
    private javax.swing.JRadioButton suvRadioButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
