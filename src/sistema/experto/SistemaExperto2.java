package sistema.experto;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jpl7.Query;
import org.jpl7.Term;

public class SistemaExperto2 extends javax.swing.JFrame {

    private String sintoma1Seleccionado;
    private String sintoma2Seleccionado;
    private String sintoma3Seleccionado;

    private String caracteristica1Seleccionada;
    private String caracteristica2Seleccionada;
    private String caracteristica3Seleccionada;

    
    
    public SistemaExperto2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmb1 = new javax.swing.JComboBox<>();
        cmb2 = new javax.swing.JComboBox<>();
        cmb3 = new javax.swing.JComboBox<>();
        cmb4 = new javax.swing.JComboBox<>();
        cmb5 = new javax.swing.JComboBox<>();
        cmb6 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        cmbDiagnostico1 = new javax.swing.JButton();
        cmbLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fiebre", "tos", "dolor_garganta", "cansancio", "dolor_cabeza", "nauseas", "diarrea", "estornudos", "picazon_ojos", "mareos", "vomitos", "dolor_abdominal", "sensibilidad_luz", "dolor_muscular", "palpitaciones", "dificultad_respiratoria", "inflamacion_articular", "sangrado_encias", "ulceras_orales", "petequias", "convulsiones", "paralisis_muscular", "palidez", "taquipnea", "dolor_pecho", "perdida_peso", "poliuria", "polidipsia", "oliguria", "confusion_mental", "hemorragia_nasal", "dificultad_tragar" }));
        cmb1.setName("cmb1"); // NOI18N
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 133, 34));

        cmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fiebre", "tos", "dolor_garganta", "cansancio", "dolor_cabeza", "nauseas", "diarrea", "estornudos", "picazon_ojos", "mareos", "vomitos", "dolor_abdominal", "sensibilidad_luz", "dolor_muscular", "palpitaciones", "dificultad_respiratoria", "inflamacion_articular", "sangrado_encias", "ulceras_orales", "petequias", "convulsiones", "paralisis_muscular", "palidez", "taquipnea", "dolor_pecho", "perdida_peso", "poliuria", "polidipsia", "oliguria", "confusion_mental", "hemorragia_nasal", "dificultad_tragar" }));
        cmb2.setName("cmb1"); // NOI18N
        cmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 133, 34));

        cmb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fiebre", "tos", "dolor_garganta", "cansancio", "dolor_cabeza", "nauseas", "diarrea", "estornudos", "picazon_ojos", "mareos", "vomitos", "dolor_abdominal", "sensibilidad_luz", "dolor_muscular", "palpitaciones", "dificultad_respiratoria", "inflamacion_articular", "sangrado_encias", "ulceras_orales", "petequias", "convulsiones", "paralisis_muscular", "palidez", "taquipnea", "dolor_pecho", "perdida_peso", "poliuria", "polidipsia", "oliguria", "confusion_mental", "hemorragia_nasal", "dificultad_tragar" }));
        cmb3.setToolTipText("");
        cmb3.setName("cmb3"); // NOI18N
        cmb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 133, 34));

        cmb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mal_humor", "irritabilidad", "enojo", "agitacion", "tristeza", "confusion_mental", "fatiga", "falta_concentracion", "inquietud", "mareos", "palpitaciones", "perdida_apetito", "sudoracion_excesiva", "temblores" }));
        cmb4.setName("cmb4"); // NOI18N
        cmb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb4ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 132, 35));

        cmb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mal_humor", "irritabilidad", "enojo", "agitacion", "tristeza", "confusion_mental", "fatiga", "falta_concentracion", "inquietud", "mareos", "palpitaciones", "perdida_apetito", "sudoracion_excesiva", "temblores" }));
        cmb5.setName("cmb5"); // NOI18N
        cmb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb5ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 132, 38));

        cmb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mal_humor", "irritabilidad", "enojo", "agitacion", "tristeza", "confusion_mental", "fatiga", "falta_concentracion", "inquietud", "mareos", "palpitaciones", "perdida_apetito", "sudoracion_excesiva", "temblores" }));
        cmb6.setName("cmb6"); // NOI18N
        cmb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb6ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 132, 36));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtArea.setRows(5);
        txtArea.setName("txtArea"); // NOI18N
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 335, 268));

        cmbDiagnostico1.setText("Diagnosticar");
        cmbDiagnostico1.setName("cmbDiagnostico"); // NOI18N
        cmbDiagnostico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiagnostico1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbDiagnostico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 40));

        cmbLimpiar.setText("Limpiar Area");
        cmbLimpiar.setName("cmbLimpiar"); // NOI18N
        cmbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 33));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Caracteristicas de sintomas del paciente:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 24));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel4.setText("Selecciona 3 Sintomas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 143, 24));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel3.setText("Diagnóstico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 143, 24));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+12));
        jLabel2.setText("Sistema Experto En Enfermedades");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/imagen.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -30, 730, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed

        sintoma1Seleccionado = (String) cmb1.getSelectedItem();
        System.out.println("Síntoma 1 seleccionado: " + sintoma1Seleccionado);
    }//GEN-LAST:event_cmb1ActionPerformed

    private void cmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb2ActionPerformed

        sintoma2Seleccionado = (String) cmb2.getSelectedItem();
        System.out.println("Síntoma 2 seleccionado: " + sintoma2Seleccionado);
    }//GEN-LAST:event_cmb2ActionPerformed

    private void cmb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb3ActionPerformed
        sintoma3Seleccionado = (String) cmb3.getSelectedItem();
        System.out.println("Síntoma 3 seleccionado: " + sintoma3Seleccionado);
    }//GEN-LAST:event_cmb3ActionPerformed

    private void cmbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimpiarActionPerformed

        txtArea.setText("");


    }//GEN-LAST:event_cmbLimpiarActionPerformed

    private void cmbDiagnostico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiagnostico1ActionPerformed
        String rutaArchivoProlog = "C:\\ghcup\\Ejemplos Haskell\\Prolog\\Experto.pl";

        // Consulta para cargar el archivo Prolog
        String consultaCargarArchivo = "consult('" + rutaArchivoProlog.replace("\\", "\\\\") + "')";
        Query queryCargarArchivo = new Query(consultaCargarArchivo);

        // Verificar si la consulta de carga fue exitosa
        if (queryCargarArchivo.hasSolution()) {
            System.out.println("Conectado correctamente al archivo Prolog.");

            // Ahora, construir y ejecutar la consulta de diagnóstico
            String consultaDiagnostico = "diagnosticar_enfermedad([" + sintoma1Seleccionado + ", " + sintoma2Seleccionado + ", " + sintoma3Seleccionado + "], [" + caracteristica1Seleccionada + ", " + caracteristica2Seleccionada + ", " + caracteristica3Seleccionada + "], Enfermedad, Tratamiento).";
            Query queryDiagnostico = new Query(consultaDiagnostico);

            // Verificar si la consulta de diagnóstico fue exitosa
            if (queryDiagnostico.hasSolution()) {
                StringBuilder mensaje = new StringBuilder();

                while (queryDiagnostico.hasMoreSolutions()) {
                    java.util.Map<String, Term> solution = queryDiagnostico.nextSolution();
                    Term enfermedad = solution.get("Enfermedad");
                    Term tratamiento = solution.get("Tratamiento");

                    mensaje.append("Enfermedad: ").append(enfermedad).append("\nTratamiento: ").append(tratamiento).append("\n");
                }

                // Muestra el mensaje en el TextArea (reemplaza 'txtArea' con el nombre real de tu TextArea)
                txtArea.setText(mensaje.toString());
            } else {
                // Mensaje en caso de que no haya solución en la consulta de diagnóstico
                txtArea.setText("No se encontró un diagnóstico. Verifica tus síntomas y características.");
            }
        } else {
            // Mensaje en caso de error al cargar el archivo Prolog
            txtArea.setText("Error al cargar el archivo Prolog. Verifica la ruta del archivo.");
        }
    }//GEN-LAST:event_cmbDiagnostico1ActionPerformed

    private void cmb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb6ActionPerformed
        caracteristica3Seleccionada = (String) cmb6.getSelectedItem();
        System.out.println("Característica 3 seleccionada: " + caracteristica3Seleccionada);
    }//GEN-LAST:event_cmb6ActionPerformed

    private void cmb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb4ActionPerformed

        caracteristica1Seleccionada = (String) cmb4.getSelectedItem();
        System.out.println("Característica 1 seleccionada: " + caracteristica1Seleccionada);
    }//GEN-LAST:event_cmb4ActionPerformed

    private void cmb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb5ActionPerformed
        caracteristica2Seleccionada = (String) cmb5.getSelectedItem();
        System.out.println("Característica 2 seleccionada: " + caracteristica2Seleccionada);
    }//GEN-LAST:event_cmb5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaExperto2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JComboBox<String> cmb2;
    private javax.swing.JComboBox<String> cmb3;
    private javax.swing.JComboBox<String> cmb4;
    private javax.swing.JComboBox<String> cmb5;
    private javax.swing.JComboBox<String> cmb6;
    private javax.swing.JButton cmbDiagnostico1;
    private javax.swing.JButton cmbLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
