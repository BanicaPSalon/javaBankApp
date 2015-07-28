
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
public class updateDialog extends javax.swing.JDialog {

    /**
     * Creates new form updateDialog
     */
    public updateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        accountNumField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mnameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 2, 2, 3));

        jLabel1.setText("Account Number:");
        getContentPane().add(jLabel1);

        accountNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumFieldActionPerformed(evt);
            }
        });
        getContentPane().add(accountNumField);

        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2);
        getContentPane().add(fnameField);

        jLabel3.setText("Middle Name:");
        getContentPane().add(jLabel3);
        getContentPane().add(mnameField);

        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4);

        lnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(lnameField);

        jLabel5.setText("Balance");
        getContentPane().add(jLabel5);
        getContentPane().add(balanceField);

        jButton1.setText("Save Changes");
        getContentPane().add(jButton1);

        jButton2.setText("Cancel");
        getContentPane().add(jButton2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameFieldActionPerformed

    private void accountNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumFieldActionPerformed
        // TODO add your handling code here:
        String textSearch =  accountNumField.getText();
        
        RandomAccessAccountRecord record = getRecord();
        
        if(record.getAccount()!= 0){
            //String values[] = {String.valueOf(record.getAccount()), record.getFname(), record.getMname(), record.getLname(), String.valueOf(record.getBalance())};
         
        accountNumField.setText(String.valueOf(record.getAccount()));
        lnameField.setText(record.getFname());   
        mnameField.setText(record.getMname());
        lnameField.setText(record.getLname());
        balanceField.setText(String.valueOf(record.getBalance()));
        
        }
        
        

    }//GEN-LAST:event_accountNumFieldActionPerformed

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
            java.util.logging.Logger.getLogger(updateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateDialog dialog = new updateDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumField;
    private javax.swing.JTextField balanceField;
    private javax.swing.JTextField fnameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lnameField;
    private javax.swing.JTextField mnameField;
    // End of variables declaration//GEN-END:variables

    //getRecord from file
//    private RandomAccessAccountRecord getRecord() {
//        RandomAccessAccountRecord record = new RandomAccessAccountRecord();
//        
//        //getRecord from file
//        try{
//            // accountField = new 
//            
//            int accountNumber = Integer.parseInt(accountNumField.getText());
//            
//            if(accountNumber < 1 || accountNumber > 100){
//                JOptionPane.showMessageDialog(this, "Account does not exist", "Error", JOptionPane.ERROR_MESSAGE);
//                return record;
//            }
//        }
//        catch{
            
            //seek to appropriate record loaction in file
       // }
  //  }

    private RandomAccessAccountRecord getRecord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}