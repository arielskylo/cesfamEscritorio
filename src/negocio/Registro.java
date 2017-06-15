package negocio;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import datos.RutListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cargo;
import modelo.Comuna;
import modelo.ModeloComboBox;
import modelo.Usuario;

/**
 *
 * @author Skylo
 */
public class Registro extends javax.swing.JFrame{

    Connection conn = null;
    ArrayList<Comuna> comunas = new ArrayList<>();
    ArrayList<Cargo> cargos = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        cargarComboBoxComuna();
        cargarComboBoxCargo();
        txtRut.addKeyListener(new RutListener());
        setLocationRelativeTo(null);
        fechanac.setDateFormatString("dd/MM/YYYY");
        fechanac.setMaxSelectableDate(new Date());
        fechanac.setDate(new Date());
    }

    private void cargarComboBoxComuna() {
        try {
            ArrayList<String> nombres = new ArrayList<>();
            Connection conn = datos.Coneccion.Enlace();
            ResultSet rs = conn.createStatement().executeQuery("Select * from COMUNA");
            while (rs.next()) {
                Comuna c = new Comuna(rs.getInt("ID_COMUNA"), rs.getString("NOMBRE"));
                comunas.add(c);
            }
            for (Comuna c : comunas) {
                nombres.add(c.getNombre());
            }
            ModeloComboBox model = new ModeloComboBox();
            model.setModelo(nombres);
            model.setSelectedItem(model.getElementAt(0));
            //model.setSelectedItem(model.getSelectedItem());

            jcomuna.setModel(model);

        } catch (Exception e) {
            System.out.println( e.getMessage());
           
        }
    }

    private void cargarComboBoxCargo() {
        try {
            ArrayList<String> ca = new ArrayList<>();
            Connection conn = datos.Coneccion.Enlace();
            ResultSet rs = conn.createStatement().executeQuery("Select * from CARGO");
            while (rs.next()) {
                Cargo car = new Cargo(rs.getInt("ID_CU"), rs.getString("NOMBRE"), rs.getString("DESCRIPCION"), rs.getInt("NIVEL_ID"));
                cargos.add(car);
            }
            for (Cargo cg : cargos) {
                ca.add(cg.getNombre());
            }
            ModeloComboBox mode = new ModeloComboBox();
            mode.setModelo(ca);
            mode.setSelectedItem(mode.getElementAt(0));
            jCargo.setModel(mode);
        } catch (Exception e) {
            e.getMessage();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtapaterno = new javax.swing.JTextField();
        txtamaterno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jcomuna = new javax.swing.JComboBox<>();
        jCargo = new javax.swing.JComboBox<>();
        rM = new javax.swing.JRadioButton();
        rF = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fechanac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIOS");

        jLabel2.setText("NOMBRE :");

        jLabel3.setText("APELLIDO PATERNO :");

        jLabel4.setText("APELLIDO MATERNO :");

        jLabel5.setText("SEXO :");

        jLabel6.setText("FECHA NACIEMIENTO :");

        jLabel7.setText("E-MAIL :");

        jLabel8.setText("CELULAR :");

        jLabel9.setText("DIRECCION :");

        jLabel10.setText("COMUNA :");

        jLabel12.setText("CONTRASEÑA :");

        jLabel13.setText("CARGO :");

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ATRÁS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btngroup.add(rM);
        rM.setText("Masculino");

        btngroup.add(rF);
        rF.setText("Femenino");

        jLabel11.setText("RUT :");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre)
                            .addComponent(txtapaterno)
                            .addComponent(txtamaterno)
                            .addComponent(txtRut)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtemail)
                                    .addComponent(txtcelular)
                                    .addComponent(txtdireccion)
                                    .addComponent(txtpass)
                                    .addComponent(jcomuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addComponent(rF))
                                    .addComponent(fechanac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton2)
                        .addGap(81, 81, 81)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtapaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtamaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date d = fechanac.getDate();
        char genero = 'O';
        if(rM.isSelected()){
            genero = 'M';
        }
        if(rF.isSelected()){
            genero = 'F';
        }
        try {
            System.out.println(cargos.get(jCargo.getSelectedIndex()).getIdCu());
            Connection conn = datos.Coneccion.Enlace();
            String user = "Insert into USUARIO values('"+txtRut.getText()+"','" + txtnombre.getText() + "', '" + txtapaterno.getText() +"','"+ txtamaterno.getText()+
                    "','"+ genero +"', TO_DATE('" + d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getYear() + "', 'DD/MM/YYYY'),'" + txtemail.getText() + "','" + txtcelular.getText() + "','"
                    + txtdireccion.getText() + "'," + comunas.get(jcomuna.getSelectedIndex()).getIdComuna() + ",'PRUEBA' ,'" + Base64.encode(txtpass.getText().getBytes()) + "','" 
                    + cargos.get(jCargo.getSelectedIndex()).getIdCu() +"')";
            System.out.println(user);
            conn.createStatement().executeUpdate(user);
            JOptionPane.showMessageDialog(null, "USUARIO INGRESADO CON EXITO");
            
            txtRut.setText(null);
            txtnombre.setText(null);
            txtapaterno.setText(null);
            txtamaterno.setText(null);
            fechanac.setDate(new Date());
            txtemail.setText(null);
            txtcelular.setText(null);
            txtdireccion.setText(null);
            txtpass.setText(null);
            
            
            
           // throw new Exception("Usuario o clave incorrectos.");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, "NO PUEDE INSERTAR CAMPOS VACÍOS, POR FAVOR VERFIQUE E INTENTE NUEVAMENTE");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngroup;
    private com.toedter.calendar.JDateChooser fechanac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcomuna;
    private javax.swing.JRadioButton rF;
    private javax.swing.JRadioButton rM;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtamaterno;
    private javax.swing.JTextField txtapaterno;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

}
