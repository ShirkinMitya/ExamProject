package Gui;

import Service.Manager;
import Service.Mediator;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui extends javax.swing.JFrame {

    Manager manager;

    public Gui() {
        initComponents();
        this.manager = new Manager();
        manager.setMediator(new Mediator(this));
        changeButtonEnable();
        colourForLegend();
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

    public void endMessage(int totalTacts, List<Integer> totalTactsForEachShip) {
        String info = "Все достигли точек назначения за " + totalTacts + " тактов.";
        for (int i = 0; i < totalTactsForEachShip.size(); i++) {
            info += " Корабль " + (i + 1) + " доплыл за " + totalTactsForEachShip.get(i) + " тактов.";
        }
        JOptionPane.showMessageDialog(this, info);
    }

    private void colourForLegend() {
        LabelFirstShipLegend.setOpaque(true);
        LabelFirstShipLegend.setBackground(Color.RED);
        LabelSecondShipLegend.setOpaque(true);
        LabelSecondShipLegend.setBackground(Color.GREEN);
        LabelTwoShipLegend.setOpaque(true);
        LabelTwoShipLegend.setBackground(Color.BLUE);
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
        LabelLegend = new javax.swing.JLabel();
        LabelFirstShipLegend = new javax.swing.JLabel();
        LabelSecondShipLegend = new javax.swing.JLabel();
        LabelTwoShipLegend = new javax.swing.JLabel();

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

        LabelLegend.setText("Обозначения:");

        LabelFirstShipLegend.setText("1-ый корабль");

        LabelSecondShipLegend.setText("2-ой корабль");

        LabelTwoShipLegend.setText("1-ый и 2-ой корабль");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(LabelFirstShipLegend)
                                .addGap(26, 26, 26)
                                .addComponent(LabelTwoShipLegend)
                                .addGap(28, 28, 28)
                                .addComponent(LabelSecondShipLegend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(LabelLegend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(LabelTactsNumberInfo)
                        .addGap(18, 18, 18)
                        .addComponent(LabelNubmerOfTacts, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ButtonNextTact, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(ButtonReset)
                                .addGap(86, 86, 86)))
                        .addComponent(ButtonStartStop, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxTypeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelTypeOfWork))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(ButtonExit)
                        .addGap(23, 23, 23)
                        .addComponent(LabelTypeOfWork)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxTypeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(ButtonStartStop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ButtonNextTact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelLegend)
                        .addComponent(LabelTactsNumberInfo))
                    .addComponent(LabelNubmerOfTacts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFirstShipLegend)
                    .addComponent(LabelTwoShipLegend)
                    .addComponent(LabelSecondShipLegend))
                .addGap(44, 44, 44))
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
    private javax.swing.JLabel LabelFirstShipLegend;
    private javax.swing.JLabel LabelLegend;
    private javax.swing.JLabel LabelNubmerOfTacts;
    private javax.swing.JLabel LabelSecondShipLegend;
    private javax.swing.JLabel LabelTactsNumberInfo;
    private javax.swing.JLabel LabelTwoShipLegend;
    private javax.swing.JLabel LabelTypeOfWork;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane ScrollPane;
    // End of variables declaration//GEN-END:variables
}
