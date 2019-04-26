/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworkpizza;

import java.awt.Color;

/**
 *
 * @author chloe
 */
public class EditDeletePizzaPage extends javax.swing.JFrame {
    private Order theOrder;
    private int pizzaNumber = 1;
    private Pizza pizzaToEdit;
    private HomePage homeP;
    /**
     * Creates new form EditDeletePizzaPage
     */
    public EditDeletePizzaPage() {
        initComponents();
    }
    public EditDeletePizzaPage(Order order, HomePage homeP) 
    {
        initComponents();
        this.homeP = homeP;
        theOrder = order;
        pizzaToEdit = getPizzaToEdit();
        orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
        //set all edit combo boxes to the pizza being edited's proprties
        crustCmb.setSelectedItem(pizzaToEdit.getCrust());
        sizeCmb.setSelectedItem(pizzaToEdit.getSize());
        sauceCmb.setSelectedItem(pizzaToEdit.getSauce());
        topping1Cmb.setSelectedItem(pizzaToEdit.getTopping1());
        topping2Cmb.setSelectedItem(pizzaToEdit.getTopping2());
        this.getContentPane().setBackground(Color.white);
    }
    
    public Pizza getPizzaToEdit()
    {
        pizzaToEdit = theOrder.getPizzaFromOrder(pizzaNumber);
        return pizzaToEdit;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okPizzaBtn = new javax.swing.JButton();
        sizeCmb = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        sauceCmb = new javax.swing.JComboBox<>();
        crustCmb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderPriceArea = new javax.swing.JTextArea();
        topping1Cmb = new javax.swing.JComboBox<>();
        topping2Cmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rightBtn = new javax.swing.JButton();
        leftBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(176, 224, 230));
        setPreferredSize(new java.awt.Dimension(702, 1000));

        okPizzaBtn.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        okPizzaBtn.setLabel("Ok");
        okPizzaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okPizzaBtnActionPerformed(evt);
            }
        });

        sizeCmb.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        sizeCmb.setModel(new javax.swing.DefaultComboBoxModel<size>(size.values()));
        sizeCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeCmbActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        deleteBtn.setLabel("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        sauceCmb.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        sauceCmb.setModel(new javax.swing.DefaultComboBoxModel<sauce>(sauce.values()));
        sauceCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauceCmbActionPerformed(evt);
            }
        });

        crustCmb.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        crustCmb.setModel(new javax.swing.DefaultComboBoxModel<crust>(crust.values()));
        crustCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crustCmbActionPerformed(evt);
            }
        });

        orderPriceArea.setBackground(new java.awt.Color(176, 224, 230));
        orderPriceArea.setColumns(20);
        orderPriceArea.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        orderPriceArea.setRows(5);
        jScrollPane1.setViewportView(orderPriceArea);

        topping1Cmb.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        topping1Cmb.setModel(new javax.swing.DefaultComboBoxModel<topping1>(topping1.values()));
        topping1Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topping1CmbActionPerformed(evt);
            }
        });

        topping2Cmb.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        topping2Cmb.setModel(new javax.swing.DefaultComboBoxModel<topping2>(topping2.values()));
        topping2Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topping2CmbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        jLabel1.setText("Size");

        jLabel2.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        jLabel2.setText("Sauce");

        jLabel3.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        jLabel3.setText("Crust");

        jLabel4.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        jLabel4.setText("Topping1");

        jLabel5.setFont(new java.awt.Font("AR BONNIE", 0, 18)); // NOI18N
        jLabel5.setText("Topping2");

        rightBtn.setText(">");
        rightBtn.setActionCommand("rightBtn");
        rightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtnActionPerformed(evt);
            }
        });

        leftBtn.setText("<");
        leftBtn.setActionCommand("<");
        leftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(67, 67, 67)
                .addComponent(okPizzaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(237, 237, 237)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topping1Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crustCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sauceCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sizeCmb, 0, 85, Short.MAX_VALUE)
                    .addComponent(topping2Cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sauceCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crustCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topping1Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topping2Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(154, 154, 154)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(okPizzaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okPizzaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okPizzaBtnActionPerformed
        homeP.orderNeedsUpdate();
        this.setVisible(false);

    }//GEN-LAST:event_okPizzaBtnActionPerformed

    private void sizeCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeCmbActionPerformed
        theOrder.updatePizzaSize(pizzaNumber,(size)(sizeCmb.getSelectedItem()));
        pizzaToEdit = getPizzaToEdit();
        orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));

    }//GEN-LAST:event_sizeCmbActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //dont delete if there are no pizzas
        //once deleted go to the last pizza, if you get to no pizzas reset 
        //the text to nothing
                //dont delete if there are no pizzas
        if(theOrder.getNumberOfPizzas()>0){
        theOrder.deletePizza(pizzaNumber);
        }
        //once deleted go to the last pizza, if you get to no pizzas reset 
        //the text to nothing 
        if(pizzaNumber > theOrder.getNumberOfPizzas()){
        pizzaNumber = theOrder.getNumberOfPizzas();
        }
        if(pizzaNumber == 0){
           pizzaNumber = 1;
           orderPriceArea.setText("");       
        }else {
        pizzaToEdit = getPizzaToEdit();
        orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void sauceCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauceCmbActionPerformed
        theOrder.updatePizzaSauce(pizzaNumber, 
                                (sauce)(sauceCmb.getSelectedItem()));
        pizzaToEdit = getPizzaToEdit();
        orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
    }//GEN-LAST:event_sauceCmbActionPerformed

    private void crustCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crustCmbActionPerformed
        theOrder.updatePizzaCrust(pizzaNumber,
                                (crust)(crustCmb.getSelectedItem()));
        pizzaToEdit = getPizzaToEdit();
        orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
    }//GEN-LAST:event_crustCmbActionPerformed

    private void topping1CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topping1CmbActionPerformed
        theOrder.updatePizzaTopping1(pizzaNumber, 
                                    (topping1)(topping1Cmb.getSelectedItem()));
        pizzaToEdit = getPizzaToEdit();
        orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
    }//GEN-LAST:event_topping1CmbActionPerformed

    private void topping2CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topping2CmbActionPerformed
        theOrder.updatePizzaTopping2(pizzaNumber,
                                    (topping2)(topping2Cmb.getSelectedItem()));
        pizzaToEdit = getPizzaToEdit();
        orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
    }//GEN-LAST:event_topping2CmbActionPerformed

    private void rightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtnActionPerformed
        //can only scroll through pizzas if there are pizzas
        if(theOrder.getNumberOfPizzas() > 0){
            if(pizzaNumber < theOrder.getNumberOfPizzas()){
            pizzaNumber = pizzaNumber + 1;
            }
            ///addddd else
            pizzaToEdit = getPizzaToEdit();
            orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
        }
    }//GEN-LAST:event_rightBtnActionPerformed

    private void leftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBtnActionPerformed
        // can only scroll through pizzas if there are pizzas
        if(theOrder.getNumberOfPizzas() > 0){
            if(pizzaNumber > 1){
            pizzaNumber = pizzaNumber - 1;
            }
            //add else
            pizzaToEdit = getPizzaToEdit();
            orderPriceArea.setText(pizzaToEdit.getPizzaInfo(pizzaToEdit));
        }
    }//GEN-LAST:event_leftBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditDeletePizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDeletePizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDeletePizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDeletePizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDeletePizzaPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<crust> crustCmb;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leftBtn;
    private javax.swing.JButton okPizzaBtn;
    private javax.swing.JTextArea orderPriceArea;
    private javax.swing.JButton rightBtn;
    private javax.swing.JComboBox<sauce> sauceCmb;
    private javax.swing.JComboBox<size> sizeCmb;
    private javax.swing.JComboBox<topping1> topping1Cmb;
    private javax.swing.JComboBox<topping2> topping2Cmb;
    // End of variables declaration//GEN-END:variables
}
