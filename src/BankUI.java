
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Genelou
 */
public class BankUI extends javax.swing.JFrame {
private ObjectOutputStream output;
    /**
     * Creates new form BankUI
     */
    public BankUI() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountNumLabel = new javax.swing.JLabel();
        accountNumField = new javax.swing.JTextField();
        exitMenu = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        mnameLabel = new javax.swing.JLabel();
        mnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveAsItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        updateRecordMenu = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        viewAccountMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 2, 2, 2));

        accountNumLabel.setText("Account Number:");
        getContentPane().add(accountNumLabel);
        getContentPane().add(accountNumField);

        exitMenu.setText("First Name:");
        getContentPane().add(exitMenu);
        getContentPane().add(fnameField);

        mnameLabel.setText("Middle Name:");
        getContentPane().add(mnameLabel);
        getContentPane().add(mnameField);

        lnameLabel.setText("Last Name:");
        getContentPane().add(lnameLabel);
        getContentPane().add(lnameField);

        balanceLabel.setText("Balance:");
        getContentPane().add(balanceLabel);
        getContentPane().add(balanceField);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);

        fileMenu.setText("File");

        saveAsItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        saveAsItem.setText("Save As");
        saveAsItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);
        fileMenu.add(jMenuItem1);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        updateRecordMenu.setText("Update Record");
        updateRecordMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordMenuActionPerformed(evt);
            }
        });
        editMenu.add(updateRecordMenu);

        jMenuBar1.add(editMenu);

        viewMenu.setText("View");

        viewAccountMenu.setText("View Records");
        viewAccountMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccountMenuActionPerformed(evt);
            }
        });
        viewMenu.add(viewAccountMenu);

        jMenuItem2.setText("View Record");
        viewMenu.add(jMenuItem2);

        jMenuBar1.add(viewMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        addRecord();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void viewAccountMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccountMenuActionPerformed
        // TODO add your handling code here:
       ReadFiles menu = new ReadFiles(this, true);
        menu.setVisible(true);
    }//GEN-LAST:event_viewAccountMenuActionPerformed

    private void updateRecordMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordMenuActionPerformed
        // TODO add your handling code here:
        updateRecord record = new updateRecord(this, true);
        record.setVisible(true);
        
       
    }//GEN-LAST:event_updateRecordMenuActionPerformed

    private void saveAsItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsItemActionPerformed
        openFile();
    }//GEN-LAST:event_saveAsItemActionPerformed

 // add record to file
 public void addRecord()
 {
    int accountNumber = 0;
    AccountRecord record;
    // if account field value is not empty
    if ( ! accountNumField.getText().equals( "" ) ) {

    // output values to file
    try {
    accountNumber = Integer.parseInt(accountNumField.getText() );

    if ( accountNumber > 0 ) {

    // create new record
    record = new AccountRecord( accountNumber, fnameField.getText(), mnameField.getText(), lnameField.getText(), Double.parseDouble( balanceField.getText()) );

    // output record and flush buffer
    output.writeObject( record );
    output.flush();
 }

 // clear textfields
 clearFields();
 }

 
 // process invalid account number or balance format
 catch ( NumberFormatException formatException ) {
 JOptionPane.showMessageDialog( this, "Bad account number or balance", "Invalid Number Format", JOptionPane.ERROR_MESSAGE );
 }

 // process exceptions from file output
 catch ( IOException ioException ) {
 closeFile();
 }

} // end if
 } // end method addRecord

 
 private void closeFile()
 {
 // close file
 try {
 output.close();
 System.exit( 0 );
 }

 // process exceptions from closing file
catch( IOException ioException ) { JOptionPane.showMessageDialog( this, "Error closing file", "Error", JOptionPane.ERROR_MESSAGE );
 System.exit( 1 );
 }
 }
 
 // allow user to specify file name
 private void openFile()
 {
// display file dialog, so user can choose file to open
 JFileChooser fileChooser = new JFileChooser();
 fileChooser.setFileSelectionMode( JFileChooser.FILES_ONLY );

 int result = fileChooser.showSaveDialog( this );

 // if user clicked Cancel button on dialog, return
 if ( result == JFileChooser.CANCEL_OPTION )
 return;

 // get selected file
 File fileName = fileChooser.getSelectedFile();

 // display error if invalid
 if( fileName == null || fileName.getName().equals( "" ) ) 
     JOptionPane.showMessageDialog( this, "Invalid File Name", "Invalid File Name", JOptionPane.ERROR_MESSAGE );
 
 else {

 // open file
 try {
 output = new ObjectOutputStream(new FileOutputStream( fileName ) );

 //addButton.setEnabled( false );
 //balanceField.setEnabled( true );
 }

 // process exceptions from opening file
 catch ( IOException ioException ) { JOptionPane.showMessageDialog( this, "Error Opening File", "Error", JOptionPane.ERROR_MESSAGE );
 }
 }

} // end method openFile
    
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
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumField;
    private javax.swing.JLabel accountNumLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel exitMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField fnameField;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField mnameField;
    private javax.swing.JLabel mnameLabel;
    private javax.swing.JMenuItem saveAsItem;
    private javax.swing.JMenuItem updateRecordMenu;
    private javax.swing.JMenuItem viewAccountMenu;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        
        accountNumField.setText("");
        fnameField.setText("");
        mnameField.setText("");
        lnameField.setText("");
        balanceField.setText("");         
        
    }

//    JButton getDoTask1Button() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}