/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lockandunlock;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yasir Sharif
 */
public class lockeandunlocker extends javax.swing.JFrame {

    /**
     * Creates new form lockeandunlocker
     */
    public lockeandunlocker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        list1 = new java.awt.List();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pathcollector = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        listview = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255)));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Attachfile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("locker");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("unlocker");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pathcollector)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathcollector, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(listview, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("locker and unlocker");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String path=f.getAbsolutePath();
        listview.addItem(path);
        pathcollector.setText(path);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //try{
         try {
        Path path = Paths.get(pathcollector.getText());
       File f=new File(pathcollector.getText());
       String username = System.getProperty("user.name");
        UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(username);
         AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
                    AclEntry entry = AclEntry.newBuilder().setType(AclEntryType.DENY).
                            setPrincipal(user).setPermissions(AclEntryPermission.ADD_FILE,
                                    AclEntryPermission.ADD_SUBDIRECTORY, AclEntryPermission.APPEND_DATA, AclEntryPermission.DELETE, AclEntryPermission.DELETE_CHILD, AclEntryPermission.EXECUTE, AclEntryPermission.LIST_DIRECTORY,
                                    AclEntryPermission.READ_ACL, AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA,
                                    AclEntryPermission.READ_NAMED_ATTRS, AclEntryPermission.SYNCHRONIZE, AclEntryPermission.WRITE_ACL,
                                    AclEntryPermission.WRITE_ATTRIBUTES, AclEntryPermission.WRITE_DATA, AclEntryPermission.WRITE_NAMED_ATTRS,
                                    AclEntryPermission.WRITE_OWNER).build();
                    List<AclEntry> acl = view.getAcl();
                    acl.add(0, entry);
                    view.setAcl(acl);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       // try {
            //Process process = Runtime.getRuntime().exec("cmd.exe /c attrib +h pathcollector.getText()");
          //  Files.setAttribute(path, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
            // f.setReadable(false);
       // } catch (IOException ex) {
         //   Logger.getLogger(lockeandunlocker.class.getName()).log(Level.SEVERE, null, ex);
      //  }
        
                // f.setExecutable(false);

                // System.out.println("allow to execute "+ f.canExecute() );
                // System.out.println("allow to to read "+ f.canRead() );
                //System.out.println("allow to to write"+ f.canWrite() ); 
                 // process.waitFor();
        
             JOptionPane.showMessageDialog(null, "the file is locked");
            /// }catch (IOException e) {
                 // e.printStackTrace();
          // } catch (InterruptedException ex) {
          //  Logger.getLogger(lockeandunlocker.class.getName()).log(Level.SEVERE, null, ex);
       // }
        //pathcollector.setText("");
        
             //pathcollector.setText("");
          
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         try {
        Path path = Paths.get(pathcollector.getText());
       File f=new File(pathcollector.getText());
       String username = System.getProperty("user.name");
        UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(username);
         AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
                    AclEntry entry = AclEntry.newBuilder().setType(AclEntryType.ALLOW).
                            setPrincipal(user).setPermissions(AclEntryPermission.ADD_FILE,
                                    AclEntryPermission.ADD_SUBDIRECTORY, AclEntryPermission.APPEND_DATA, AclEntryPermission.DELETE, AclEntryPermission.DELETE_CHILD, AclEntryPermission.EXECUTE, AclEntryPermission.LIST_DIRECTORY,
                                    AclEntryPermission.READ_ACL, AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA,
                                    AclEntryPermission.READ_NAMED_ATTRS, AclEntryPermission.SYNCHRONIZE, AclEntryPermission.WRITE_ACL,
                                    AclEntryPermission.WRITE_ATTRIBUTES, AclEntryPermission.WRITE_DATA, AclEntryPermission.WRITE_NAMED_ATTRS,
                                    AclEntryPermission.WRITE_OWNER).build();
                    List<AclEntry> acl = view.getAcl();
                    acl.add(0, entry);
                    view.setAcl(acl);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
               // f.setWritable(true);
               // f.setReadable(true);
               
        
                 //f.setExecutable(true);

                 //System.out.println("allow to execute "+ f.canExecute() );
                // System.out.println("allow to  read "+ f.canRead() );
                //System.out.println("allow to  write"+ f.canWrite() );
                JOptionPane.showMessageDialog(null, "the file is unlocked");
               // pathcollector.setText("");
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lockeandunlocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lockeandunlocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lockeandunlocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lockeandunlocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lockeandunlocker().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.List list1;
    private java.awt.List listview;
    private javax.swing.JTextField pathcollector;
    // End of variables declaration                   
}

