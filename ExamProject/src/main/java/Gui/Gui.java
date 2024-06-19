package Gui;

import Service.Manager;
import javax.swing.JPanel;

public class Gui extends javax.swing.JFrame {

    Manager manager = new Manager();

    public Gui() {
        initComponents();
        updateRoute();
    }

    private void replacePanelInScrollPane(JPanel newPanel) {
        ScrollPane.setViewportView(newPanel);
        newPanel.revalidate();
        newPanel.repaint();
    }

    private void updateRoute() {
        replacePanelInScrollPane(manager.createPathSegmentPanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ButtonExit = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        ButtonStartStop = new javax.swing.JButton();
        ButtonNextTact = new javax.swing.JButton();
        ComboBoxTypeOfWork = new javax.swing.JComboBox<>();
        ComboBoxDirection = new javax.swing.JComboBox<>();
        LabelTactsNumberInfo = new javax.swing.JLabel();
        LabelNubmerOfTacts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonExit.setText("Выход");

        ButtonStartStop.setText("Старт/Стоп");
        ButtonStartStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStartStopActionPerformed(evt);
            }
        });

        ButtonNextTact.setText("След.такт");
        ButtonNextTact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextTactActionPerformed(evt);
            }
        });

        ComboBoxTypeOfWork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ручная ", "Автоматическая", " ", " " }));
        ComboBoxTypeOfWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTypeOfWorkActionPerformed(evt);
            }
        });

        ComboBoxDirection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "от МСК", "от СПБ", " " }));

        LabelTactsNumberInfo.setText("Колво такстов:");

        LabelNubmerOfTacts.setText("jLabel1");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonNextTact)
                            .addComponent(ButtonStartStop)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(ComboBoxDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxTypeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(LabelTactsNumberInfo)
                                .addGap(18, 18, 18)
                                .addComponent(LabelNubmerOfTacts)))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ButtonExit)
                        .addGap(15, 15, 15)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(ComboBoxTypeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(ComboBoxDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(ButtonStartStop)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonNextTact)
                        .addGap(94, 94, 94)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTactsNumberInfo)
                            .addComponent(LabelNubmerOfTacts))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTypeOfWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTypeOfWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTypeOfWorkActionPerformed

    private void ButtonStartStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStartStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonStartStopActionPerformed

    private void ButtonNextTactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextTactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonNextTactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonNextTact;
    private javax.swing.JButton ButtonStartStop;
    private javax.swing.JComboBox<String> ComboBoxDirection;
    private javax.swing.JComboBox<String> ComboBoxTypeOfWork;
    private javax.swing.JLabel LabelNubmerOfTacts;
    private javax.swing.JLabel LabelTactsNumberInfo;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane ScrollPane;
    // End of variables declaration//GEN-END:variables
}
