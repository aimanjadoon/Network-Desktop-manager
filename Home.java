

package src;

import Lockandunlock.lockeandunlocker;
import lockerandunlocker.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import port_scanning.*;
import lockandunlock.*;
import MessagingClient_1.*;
import Messaging_Server.*;









public class Home extends javax.swing.JFrame {
int x;
int y;
   

       public Home() {
        initComponents();
        setLocationRelativeTo(this);
        Toolkit tool= Toolkit.getDefaultToolkit();
        Dimension dim=new Dimension(tool.getScreenSize());
        int height= (int) dim.getHeight();
        int width=(int) dim.getWidth();
        setSize(width, height);
        setLocation(width / 2 - getWidth() / 2 , height / 2 - getHeight() / 2);
    }
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 736, Short.MAX_VALUE)
                .addComponent(jButton6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("For Details Click here..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Screen Sharer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Messaging");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Port scanning");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Folders locking/ unlocking");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 204));
        jMenuBar1.setFocusCycleRoot(true);

        jMenu1.setText("For Connection click here");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Ask for Screen/ Stop Screen Stream");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Start/ Stop Server");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        

    boolean isStartStream = false;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(isStart){
            JOptionPane.showMessageDialog(this, "If you want to ask to share screen, you must stop your server.");
            return;
        }
        
        if (!isStartStream) {
            String ip = JOptionPane.showInputDialog("Enter ip address who's screen do you want to ask?");
            if (ip != null && !ip.equals("")) {
                isStartStream = true;
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            while (isStartStream) {
                                Socket soc = new Socket(ip, 1011);
                                BufferedImage img = ImageIO.read(soc.getInputStream());
                                jPanel2.getGraphics().drawImage(img, 0, 0, jPanel2.getWidth(), jPanel2.getHeight(), null);
                                soc.close();

                                try {
                                    Thread.sleep(10);
                                } catch (Exception e) {
                                }
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        isStartStream = false;
                    }
                }).start();
                
                
         
            }else{
                JOptionPane.showMessageDialog(null, "Please enter a valid ip address.");
            }
        } else {
            isStartStream = false;
        }
    }                                          

    boolean isStart = false;
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       JTextArea textarea =new JTextArea();
        if(isStartStream){
            JOptionPane.showMessageDialog(this, "If you want to start a server. You must stop watching other's screen.");
            return;
        }
        if (!isStart) {
            isStart = true;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Robot rob = new Robot();
                        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                        while (isStart) {
                            ServerSocket soc = new ServerSocket(1011);
                            Socket so = soc.accept();
                            BufferedImage img = rob.createScreenCapture(new Rectangle(0, 0, (int) d.getWidth(), (int) d.getHeight()));
                                        
                            ByteArrayOutputStream ous = new ByteArrayOutputStream();
                            ImageIO.write(img, "png", ous);
                            so.getOutputStream().write(ous.toByteArray());
                            new ReceiveEvents(so,rob);
                            soc.close();
                            try {
                                Thread.sleep(10);
                            } catch (Exception e) {
                            }
                        }
                    } catch (Exception e) {e.printStackTrace();
                        JOptionPane.showMessageDialog(null, e);
                    } 
                    
                    isStart = false;
                }
            }).start();
            
           
            InetAddress ip;
        String hostname = null;
        try {
            
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
          String add= ip.toString();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
            System.out.println("ip in string is=" +add);
            
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }
            JOptionPane.showMessageDialog(this, "Server Started.");
            this.getContentPane().add(textarea);
            textarea.append("" +hostname);
        } else {
            isStart = false;
        }
    }                                          

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     InetAddress ip;
        String hostname = null;
        try {
            
            
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
             String add= ip.toString();
            
            System.out.println("Your current IP address : " +add);
            System.out.println("Your current Hostname : " + hostname);
            jTextArea1.append(hostname);
            jTextArea1.append("\n" +add);
 
 

            long startTime = System.nanoTime();

		// ... the code being measured starts ...
		
		// sleep for 1 seconds
		TimeUnit.SECONDS.sleep(1);

		// ... the code being measured ends ...

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

                String myString = Integer.toString((int) timeElapsed/1000000);
                jTextArea1.append("\nExecution time in milli seconds=" +myString);

                 
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         
         MainServer main= new MainServer();
        
         
         String[] args = {};
                   MainServer.main(args);
         
        // ServerTest.MainServer ms= st.new MainServer();
         
    
    
   
    // TODO add your handling code here:msg module
        
        
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        
        jPanel1.add(jPanel2);
        jPanel1.repaint();
        jPanel1.revalidate();
        
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
        this.dispose();// TODO add your handling code here:
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        Port_scanning ps= new Port_scanning();
        String[] args = {};
        Port_scanning.main(args);
        
        
        // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        lockeandunlocker lc= new lockeandunlocker();
        String[] args = {};
        lockeandunlocker.main(args);
        
        new Home().setVisible(true);
        
        // TODO add your handling code here:
    }                                        

    
    
    
    /**
     * @param args the command line arguments
     */
    
        
    
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
         
    }
       
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   

    class ReceiveEvents extends Thread{
			Socket socket= null;
			Robot robot = null;
			boolean continueLoop = true;

			public ReceiveEvents(Socket socket, Robot robot){

			this.socket = socket;
			this.robot = robot;
			start(); //Start the thread and hence calling run method
			}



			public void run(){
			Scanner scanner = null;
			try {
			scanner = new Scanner(socket.getInputStream());
			while(continueLoop){
			//recieve commands and respond accordingly

			int command = scanner.nextInt();
			switch(command){
					case-1:
					robot.mousePress(scanner.nextInt());
					break;
					case-2:
					robot.mouseRelease(scanner.nextInt());
					break;
					case-3:
					robot.keyPress(scanner.nextInt());
					break;
					case-4:
					robot.keyRelease(scanner.nextInt());
					break;
					case-5:
					robot.mouseMove(scanner.nextInt(),scanner.nextInt());
					break;
					}

					}
			}catch(IOException ex){
					ex.printStackTrace();
					}
				}//end function
				
				}
}
