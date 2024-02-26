/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package consultorio;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.ListaPaciente;

/**
 *
 * @author Patrik
 */
public class Consultorio extends javax.swing.JFrame {

    private static Consultorio instance;

    public static Consultorio getInstance() {
        if (instance == null) {
            instance = new Consultorio(new ListaPaciente());
        }
        return instance;
    }

    public ListaPaciente lista;

    public JTable getTabelaPacientes() {
        return tabelaPacientes;
    }

    /**
     * Creates new form Consultorio
     *
     * @param lista
     */
    public Consultorio(ListaPaciente lista) {
        initComponents();
        this.lista = lista;
        this.tabelaPacientes = new JTable(); // Inicialize a variável conforme necessário
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jButtonNovaConsulta = new javax.swing.JButton();
        jButtonExcluirConsulta = new javax.swing.JButton();
        jButtonFinalizarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Palatino Linotype", 0, 36)); // NOI18N
        lblTitulo.setText("Seja bem-vindo ao sistema de Agendamento");

        jButtonNovaConsulta.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jButtonNovaConsulta.setText("Nova Consulta");
        jButtonNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaConsultaActionPerformed(evt);
            }
        });

        jButtonExcluirConsulta.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jButtonExcluirConsulta.setText("Excluir Consulta");
        jButtonExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirConsultaActionPerformed(evt);
            }
        });

        jButtonFinalizarConsulta.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jButtonFinalizarConsulta.setText("Finalizar Consulta");
        jButtonFinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarConsultaActionPerformed(evt);
            }
        });

        tabelaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Paciente?", "Consulta realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaPacientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovaConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFinalizarConsulta)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovaConsulta)
                    .addComponent(jButtonExcluirConsulta)
                    .addComponent(jButtonFinalizarConsulta))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaConsultaActionPerformed
        CadastroConsultaPaciente cadastro = new CadastroConsultaPaciente(lista, tabelaPacientes);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jButtonNovaConsultaActionPerformed

    private void jButtonExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirConsultaActionPerformed
        int selectedRow = tabelaPacientes.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tabelaPacientes.getModel();
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, "Consulta excluída com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma consulta para excluir.");
        }
    }//GEN-LAST:event_jButtonExcluirConsultaActionPerformed

    private void jButtonFinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarConsultaActionPerformed
        int selectedRow = tabelaPacientes.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tabelaPacientes.getModel();
            String consultaRealizada = (String) model.getValueAt(selectedRow, 5);
            if (consultaRealizada.equalsIgnoreCase("Sim")) {
                JOptionPane.showMessageDialog(this, "Esta consulta já foi finalizada.");
            } else {
                DetalhesConsulta cad = new DetalhesConsulta(lista, tabelaPacientes);
                cad.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma consulta para finalizar.");
        }
    }//GEN-LAST:event_jButtonFinalizarConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ListaPaciente lista = new ListaPaciente();
        java.awt.EventQueue.invokeLater(() -> {
            new Consultorio(lista).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluirConsulta;
    private javax.swing.JButton jButtonFinalizarConsulta;
    private javax.swing.JButton jButtonNovaConsulta;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTable tabelaPacientes;
    // End of variables declaration//GEN-END:variables
}
