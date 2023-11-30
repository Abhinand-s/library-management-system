import java.io.IOException;
public class frontface extends javax.swing.JFrame {

    public frontface() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LIBRARY MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ROLE OF MINE IS :");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "LIBRARIAN", "TEACHER", "STUDENT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
    // Get the selected role from the combo box
    String selectedRole = jComboBox1.getSelectedItem().toString();

    // Check the selected role and perform login based on the role
    if (selectedRole.equals("ADMIN")) {
        // Perform admin login logic here
        if (selectedRole.equals("ADMIN")) {
        try {
            
            String adminFilePath = "Adminlog.java";

         
            Process compileProcess = new ProcessBuilder("javac", adminFilePath).start();
            int compileExitCode = compileProcess.waitFor();

            if (compileExitCode == 0) {
                
                String adminClassName = "Adminlog"; 
                Process runProcess = new ProcessBuilder("java", adminClassName).start();
             } else {
                System.out.println("Compilation error in Adminlog.java");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
        
    } else if (selectedRole.equals("LIBRARIAN")) {
        // Perform librarian login logic here
         if (selectedRole.equals("LIBRARIAN")) {
        try {
            
            String libFilePath = "LIBRARIANLOG.java";

         
            Process compileProcess = new ProcessBuilder("javac", libFilePath).start();
            int compileExitCode = compileProcess.waitFor();

            if (compileExitCode == 0) {
                
                String libClassName = "LIBRARIANLOG"; 
                Process runProcess = new ProcessBuilder("java", libClassName).start();
             } else {
                System.out.println("Compilation error in LIBRARIANLOG.java");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    } else if (selectedRole.equals("TEACHER")) {
        // Perform teacher login logic here
        if (selectedRole.equals("TEACHER")) {
        try {
            
            String teaFilePath = "TEACHERLOG.java";

         
            Process compileProcess = new ProcessBuilder("javac", teaFilePath).start();
            int compileExitCode = compileProcess.waitFor();

            if (compileExitCode == 0) {
                
                String teaClassName = "TEACHERLOG"; 
                Process runProcess = new ProcessBuilder("java", teaClassName).start();
             } else {
                System.out.println("Compilation error in TEACHERLOG.java");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    } else if (selectedRole.equals("STUDENT")) {
        // Perform student login logic here
         if (selectedRole.equals("STUDENT")) {
        try {
            
            String stuFilePath = "STUDENTLOG.java";

         
            Process compileProcess = new ProcessBuilder("javac", stuFilePath).start();
            int compileExitCode = compileProcess.waitFor();

            if (compileExitCode == 0) {
                
                String stuClassName = "STUDENTLOG"; 
                Process runProcess = new ProcessBuilder("java", stuClassName).start();
             } else {
                System.out.println("Compilation error in STUDENTLOG.java");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    }


    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
