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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class server extends javax.swing.JFrame {

    private String dbName;
    private String userID;
    private String password;
    private Connection conn;

    private Socket socket;
    private ServerSocket serverSocket;
    private ObjectInputStream inputClient;
    private ObjectOutputStream outputToClient;

    /**
     * Creates new form server
     */
    public server() {
        initComponents();
        setTitle("Car Registration System: Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dbName = "carsaleinfo";
        userID = "root";
        password = "";

        createAConnectionObject();
        setVisible(true);
        serverTextArea.append("Server Started");
        try {
            // Create a server socket
            serverSocket = new ServerSocket(5000);

            /*
            
             */
            //Listen for a new connection reques
            // Create an object ouput stream to write data to client
            //outputToClient = new ObjectOutputStream(socket.getOutputStream());
            // Create an input stream to read object from client
            //inputClient = new ObjectInputStream(socket.getInputStream());
            while (true) {

                socket = serverSocket.accept();
                HandleClient task = new HandleClient(socket);
                new Thread(task).start();

            }
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        } finally {
            try {
                inputClient.close();
                outputToClient.close();
                socket.close();
                serverSocket.close();
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        }
    }

    class HandleClient implements Runnable {

        Socket socket;

        public HandleClient(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                outputToClient = new ObjectOutputStream(socket.getOutputStream());
                inputClient = new ObjectInputStream(socket.getInputStream());
                while (true) {

                    Car car = (Car) inputClient.readObject();
                    String typeOfOperation = inputClient.readUTF();
 
                    if (typeOfOperation.equals("Insert")) {
                        insert(car);
                    } else if (typeOfOperation.equals("Search")) {
                        search(car);
                    } else if (typeOfOperation.equals("Update")) {
                        update(car);
                    }
                    outputToClient.writeObject(car);
                    outputToClient.flush();
                    serverTextArea.append("\n" + car.toString());                }
            } catch (IOException ex) {
                Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void createAConnectionObject() {
        try {
            String URL = "jdbc:mysql://localhost/" + dbName;
            Class.forName("com.mysql.jdbc.Driver"); // Load ODBC driver
            conn = DriverManager.getConnection(URL, userID, password);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("ClassNotFound: " + ex.getMessage());
        }
    }

    private void insert(Car car) {
        if (conn != null) {
            String SQL = "Insert Into carsaleinfo Values ('"
                    + car.getCarId() + "','"
                    + car.getCarType() + "','"
                    + car.getCarMake() + "','"
                    + car.getCarModel() + "',"
                    + car.getCarMinPrice() + ","
                    + car.getCarMaxPrice() + ",'"
                    + car.getCarStyle() + "','"
                    + car.getCarDriveType() + "','"
                    + car.getManufacuringYear() + "','"
                    + car.getCarSizeEngine() + "')";
            System.out.println(SQL);
            Statement statement;
            try {
                statement = conn.createStatement();
                statement.executeUpdate(SQL);
                serverTextArea.append("\nData Insertion Succuessfully");
            } catch (SQLException ex) {
                Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            serverTextArea.append("\nDatabase connection Failed");
        }
    }

    private void search(Car car) {
        if (conn != null) {
            String SQL = "SELECT * FROM carsaleinfo WHERE CarId = '" + car.getCarId() + "'";
            Statement statement;
            try {
                statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(SQL);
                boolean found = false;
                while (rs.next()) {
                    found = true;
                    car.setCarId(rs.getString(1));
                    car.setCarType(rs.getString(2));
                    car.setCarMake(rs.getString(3));
                    car.setCarModel(rs.getString(4));
                    car.setCarMinPrice(rs.getInt(5));
                    car.setCarMaxPrice(rs.getInt(6));
                    car.setCarStyle(rs.getString(7));
                    car.setCarDriveType(rs.getString(8));
                    car.setManufacuringYear(rs.getString(9));
                    car.setCarSizeEngine(rs.getString(10));

                    //Send back the couse object to the client
                    
                    serverTextArea.append("\nCar id found: Search Successful");
                }
                if (!found) {
                    serverTextArea.append("\nNo Car id found");
                   
                }
            } catch (SQLException ex) {
                serverTextArea.append("\nNo Record found");
            } 
        } else {
            serverTextArea.append("\nDatabase Connection Failed");
        }
    }

    private void update(Car car) {

        if (conn != null) {
            String SQL = "UPDATE carsaleinfo SET CarType  = '" + car.getCarType() + "', "
                    + "CarMake = '" + car.getCarMake() + "',"
                    + "CarModel = '" + car.getCarModel() + "',"
                    + "	CarMinimumPrice = " + car.getCarMinPrice() + ","
                    + "CarMaximumPrice = " + car.getCarMaxPrice() + ","
                    + "CarStyle = '" + car.getCarStyle() + "',"
                    + "	CarDriveType = '" + car.getCarDriveType() + "',"
                    + "CarManufacturingYear = '" + car.getManufacuringYear() + "',"
                    + "CarEngineSize = '" + car.getCarSizeEngine()+"'"
                    + "where CarId = '" + car.getCarId()+"'" ;

            serverTextArea.append("\n" + SQL);
            Statement statement;
            try {
                statement = conn.createStatement();
                statement.executeUpdate(SQL);
                serverTextArea.append("\nSuccessfully Updated to database");

            } catch (SQLException ex) {
                serverTextArea.append("\nError Occured in updating to database");
            } catch (Exception ex) {
                serverTextArea.append("\nError Occured in updating to database");
            }
        } else {
            serverTextArea.append("\nDatabase Connection Failed");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        serverTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        serverTextArea.setColumns(20);
        serverTextArea.setRows(5);
        jScrollPane2.setViewportView(serverTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new server();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea serverTextArea;
    // End of variables declaration//GEN-END:variables
}
