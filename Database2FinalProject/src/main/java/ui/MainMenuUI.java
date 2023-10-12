/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import database.MongoDBConnection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.TaskList;
import model.TaskListManager;
import model.TaskListTableModel;
import org.apache.struts2.ServletActionContext;
import org.bson.Document;
import security.SessionManager;
import security.TaskListDAO;
import javax.swing.JLabel;
import org.bson.types.ObjectId;

/**
 *
 * @author GHOST
 */
public class MainMenuUI extends javax.swing.JFrame {
    private TaskListTableModel tableModel;
    private List<TaskList> taskLists = new ArrayList<>();
    private TaskListManager taskListManager;
    String loggedInUsername = SessionManager.getLoggedInUsername();
    String welcomeMessage = "Welcome " + loggedInUsername;

    public MainMenuUI() {
        initComponents();

        tableModel = new TaskListTableModel(new Object[]{"List Name", "Description"}, 0);
        jLabelWelcome.setText(welcomeMessage);
        jTableTaskList.setModel(tableModel);
        taskListManager = new TaskListManager(JListTask, "LISTAS DE TAREAS");
        taskListManager.refreshTaskLists();
        cargarListasDeTareasDelUsuario();
    }
    
    private void cargarListasDeTareasDelUsuario() {
        ObjectId loggedInUserId = SessionManager.getLoggedInUserId(); // Obtén el ID de usuario desde la sesión

        if (loggedInUserId != null) {
            TaskListDAO taskListDAO = new TaskListDAO();

            List<TaskList> listasDeTareas = taskListDAO.getListasDeTareasPorUsuario(loggedInUserId);

            tableModel.setRowCount(0);

            for (TaskList listaDeTareas : listasDeTareas) {
                tableModel.addRow(new Object[]{listaDeTareas.getName(), listaDeTareas.getDescription()});
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PanelListas = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTaskList = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListTask = new javax.swing.JList<>();
        jLabelWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ToDo List");

        jButton1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PanelListas.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton2.setText("NEW LIST");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableTaskList.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jTableTaskList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Description"
            }
        ));
        jTableTaskList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTaskListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTaskList);

        javax.swing.GroupLayout PanelListasLayout = new javax.swing.GroupLayout(PanelListas);
        PanelListas.setLayout(PanelListasLayout);
        PanelListasLayout.setHorizontalGroup(
            PanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListasLayout.createSequentialGroup()
                .addGroup(PanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListasLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelListasLayout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelListasLayout.setVerticalGroup(
            PanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        JListTask.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(JListTask);

        jLabelWelcome.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(85, 85, 85))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(PanelListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SessionManager.setLoggedInUsername(null);
        this.dispose();
        LoginUI loginUI = new LoginUI();
                loginUI.setSize(800, 500); // Reemplaza 'ancho' y 'alto' con los valores deseados
        
        // Centrar la ventana en la pantalla
        loginUI.setLocationRelativeTo(null);
        
        // Deshabilitar la opción de maximizar
        loginUI.setResizable(false);
        
        // Hacer visible el JFrame LoginUI
        loginUI.setVisible(true); 
        loginUI.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String listName = JOptionPane.showInputDialog(this, "Ingrese el nombre de la lista:");

    if (listName != null && !listName.isEmpty()) {
        // Obtén el ID de usuario desde SessionManager
        ObjectId loggedInUserId = SessionManager.getLoggedInUserId();

        if (loggedInUserId != null) {
            TaskListDAO taskListDAO = new TaskListDAO();

            // Verificar si ya existe una lista con el mismo nombre y perteneciente al mismo usuario
            boolean listaExistente = taskListDAO.checkIfListExists(listName, loggedInUserId);

            if (listaExistente) {
                JOptionPane.showMessageDialog(this, "Ya existe una lista con este nombre para el usuario actual. Por favor, elija otro nombre.");
            } else {
                String description = JOptionPane.showInputDialog(this, "Ingrese la descripción de la lista:");

                if (description != null) {
                    // Continuar con la creación de la lista
                    taskListDAO.insertTaskList(listName, description, loggedInUserId);
                    taskListManager.refreshTaskLists();
                    cargarListasDeTareasDelUsuario();
                } else {
                    JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha iniciado sesión.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "El nombre de la lista no puede estar vacío.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableTaskListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTaskListMouseClicked
    if (evt.getClickCount() == 1) {
        int selectedRow = jTableTaskList.getSelectedRow();
        if (selectedRow != -1) {
            String listName = (String) jTableTaskList.getValueAt(selectedRow, 0);
            String description = (String) jTableTaskList.getValueAt(selectedRow, 1);
            TaskUI taskUI = new TaskUI(listName, description);
            taskUI.setVisible(true);
            taskUI.setSize(1037, 663);
            taskUI.setLocationRelativeTo(null);
            taskUI.setLocationRelativeTo(this);
        }
    }
    }//GEN-LAST:event_jTableTaskListMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListTask;
    private javax.swing.JPanel PanelListas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTaskList;
    // End of variables declaration//GEN-END:variables
}
