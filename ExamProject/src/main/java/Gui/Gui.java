package Gui;

import Service.Manager;
import Service.Mediator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui extends javax.swing.JFrame {

    Manager manager;

    public Gui() {
        initComponents();
        this.manager = new Manager();
        manager.setMediator(new Mediator(this));
        changeButtonEnable();
    }

    public void replacePanelInScrollPane(JPanel newPanel) {
        ScrollPane.setViewportView(newPanel);
        newPanel.revalidate();
        newPanel.repaint();
    }

    private void changeButtonEnable() {
        boolean isManual = manager.isIsManual();
        ButtonNextTact.setEnabled(isManual);
        ButtonStartStop.setEnabled(!isManual);
    }

    public void updateNumberOfTacts(int numberOfTacts) {
        LabelNubmerOfTacts.setText(String.valueOf(numberOfTacts));
    }

    public void EndMessage(int numberOfTacts) {
        JOptionPane.showMessageDialog(this, "Вы доплыли за " + numberOfTacts + " тактов");
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
        LabelTactsNumberInfo = new javax.swing.JLabel();
        LabelNubmerOfTacts = new javax.swing.JLabel();
        LabelTypeOfWork = new javax.swing.JLabel();
        ButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonExit.setText("Выход");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        ButtonStartStop.setText("Старт/Стоп");
        ButtonStartStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStartStopActionPerformed(evt);
            }
        });

        ButtonNextTact.setText("Следующий такт");
        ButtonNextTact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextTactActionPerformed(evt);
            }
        });

        ComboBoxTypeOfWork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ручной", "Автоматический" }));
        ComboBoxTypeOfWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTypeOfWorkActionPerformed(evt);
            }
        });

        LabelTactsNumberInfo.setText("Кол-во тактов:");

        LabelTypeOfWork.setText("Тип работы программы:");

        ButtonReset.setText("Сбросить прогресс");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(LabelTactsNumberInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNubmerOfTacts, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComboBoxTypeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTypeOfWork)
                    .addComponent(ButtonStartStop, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonNextTact, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonReset))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ButtonExit)
                .addGap(23, 23, 23)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(LabelTypeOfWork)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxTypeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(ButtonStartStop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ButtonNextTact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNubmerOfTacts, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTactsNumberInfo)))
                    .addComponent(ScrollPane))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonStartStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStartStopActionPerformed
        manager.toggleRunning();
    }//GEN-LAST:event_ButtonStartStopActionPerformed

    private void ButtonNextTactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextTactActionPerformed
        manager.nextTact();
    }//GEN-LAST:event_ButtonNextTactActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        manager.reset();
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void ComboBoxTypeOfWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTypeOfWorkActionPerformed
        String value = (String) ComboBoxTypeOfWork.getSelectedItem();
        manager.setTypeOfWork(value.equals("Ручной"));
        changeButtonEnable();
    }//GEN-LAST:event_ComboBoxTypeOfWorkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonNextTact;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonStartStop;
    private javax.swing.JComboBox<String> ComboBoxTypeOfWork;
    private javax.swing.JLabel LabelNubmerOfTacts;
    private javax.swing.JLabel LabelTactsNumberInfo;
    private javax.swing.JLabel LabelTypeOfWork;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane ScrollPane;
    // End of variables declaration//GEN-END:variables
}
