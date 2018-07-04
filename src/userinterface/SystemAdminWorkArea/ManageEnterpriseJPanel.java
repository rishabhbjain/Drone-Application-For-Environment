/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel container;
    private EcoSystem system;

    public ManageEnterpriseJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
        populateTable();
        populateCountryComboBox();
        populateTypeComboBox();
    }

    private void populateCountryComboBox() {
        comboCountry.removeAllItems();
        for(CountryNetwork countryNetwork:system.getCountryNetworkDirectory().getCountryNetworkList()){
            comboCountry.addItem(countryNetwork);
        }
    }
    private void populateStateComboBox(CountryNetwork countryNetwork) {
        comboState.removeAllItems();
     
       for(StateNetwork stateNetwork:countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
           comboState.addItem(stateNetwork);
       }
    }
    private void populateCityComboBox(StateNetwork stateNetwork) {
      comboCity.removeAllItems();
      
      for(CityNetwork cityNetwork:stateNetwork.getCityNetworkDirectory().getCityNetworkList()){
          comboCity.addItem(cityNetwork);
      }
    }
    
    private void populateTypeComboBox() {
        comboType.removeAllItems();
        for(Enterprise.EnterpriseType enterprisetype:Enterprise.EnterpriseType.values()){
                        comboType.addItem(enterprisetype);
                    }
    }
    
    private void populateTable(){
       DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
       dtm.setRowCount(0);
        for(CountryNetwork countryNetwork:system.getCountryNetworkDirectory().getCountryNetworkList()){

            for(StateNetwork stateNetwork : countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
               
                for(CityNetwork cityNetwork : stateNetwork.getCityNetworkDirectory().getCityNetworkList()) {
                    
                    for(Enterprise enterprise:cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                       
                        Object[] row = new Object[5];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        
                        dtm.addRow(row);
                    }
                }
            }
        }
    }
    
    private  void populateCountryTable(){
         DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
       dtm.setRowCount(0);

        for(CountryNetwork countryNetwork:system.getCountryNetworkDirectory().getCountryNetworkList()){

            if(countryNetwork == comboCountry.getSelectedItem()){
            
            for(StateNetwork stateNetwork : countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
               
                for(CityNetwork cityNetwork : stateNetwork.getCityNetworkDirectory().getCityNetworkList()) {
                    
                    for(Enterprise enterprise:cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                       
                        Object[] row = new Object[5];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        
                        dtm.addRow(row);
                    }
                }
            }
            }
        }
        
    }
    
    private  void populateStateTable(){
         DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
       dtm.setRowCount(0);

        for(CountryNetwork countryNetwork:system.getCountryNetworkDirectory().getCountryNetworkList()){

            if(countryNetwork == comboCountry.getSelectedItem()){
            
            for(StateNetwork stateNetwork : countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
               
                if(stateNetwork == comboState.getSelectedItem()){
                for(CityNetwork cityNetwork : stateNetwork.getCityNetworkDirectory().getCityNetworkList()) {
                    
                    for(Enterprise enterprise:cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                       
                        Object[] row = new Object[5];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        
                        dtm.addRow(row);
                    }
                }
                }
            }
            }
        }
        
    }

    private  void populateCityTable(){
         DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
       dtm.setRowCount(0);

        for(CountryNetwork countryNetwork:system.getCountryNetworkDirectory().getCountryNetworkList()){

            if(countryNetwork == comboCountry.getSelectedItem()){
            
            for(StateNetwork stateNetwork : countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
               
                if(stateNetwork == comboState.getSelectedItem()){
                for(CityNetwork cityNetwork : stateNetwork.getCityNetworkDirectory().getCityNetworkList()) {
                    if(cityNetwork == comboCity.getSelectedItem()){
                    for(Enterprise enterprise:cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                       
                        Object[] row = new Object[5];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        
                        dtm.addRow(row);
                    }
                    }
                }
            }
            }
            }
        }
        
    }
    
    
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox();
        comboCountry = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterprise.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise", "Country", "State", "City", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);
        if (tblEnterprise.getColumnModel().getColumnCount() > 0) {
            tblEnterprise.getColumnModel().getColumn(0).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(1).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(2).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(3).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 680, 140));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Country:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("State:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        comboCity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });
        add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 150, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));

        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 150, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        comboState.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStateActionPerformed(evt);
            }
        });
        add(comboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 150, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        comboType.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 150, -1));

        comboCountry.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboCountry.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });
        add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 150, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Search By Type :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        txtSearch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtSearch.setPreferredSize(new java.awt.Dimension(10, 22));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 180, 30));

        btnSearch.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setText("Manage Enterprise");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree(); 
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        CountryNetwork countryNetwork = (CountryNetwork) comboCountry.getSelectedItem();
        StateNetwork stateNetwork  = (StateNetwork) comboState.getSelectedItem();
        CityNetwork cityNetwork = (CityNetwork) comboCity.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboType.getSelectedItem();
        String name = txtName.getText();
        if((name != null)&&!(name.isEmpty()) && (stateNetwork != null) && (cityNetwork != null) && (type != null))
        {
            Pattern pattern = Pattern.compile("[^A-Za-z]");
            Matcher m = pattern.matcher(name);
            boolean boo = m.find();
            if(boo == true || name == null) {
                JOptionPane.showMessageDialog(null,"Enter Valid Details");
            }
            else{  
                
                Enterprise enterprise = cityNetwork.getEnterpriseDirectory().createAndAddEnterprise(name, type);
                populateTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter Valid Details");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
        CountryNetwork countryNetwork = (CountryNetwork) comboCountry.getSelectedItem();
        if(countryNetwork != null){
            populateStateComboBox(countryNetwork);
            populateCountryTable();
        }
    }//GEN-LAST:event_comboCountryActionPerformed

    private void comboStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStateActionPerformed
        // TODO add your handling code here:
         StateNetwork stateNetwork = (StateNetwork) comboState.getSelectedItem();
        if(stateNetwork != null){
            populateCityComboBox(stateNetwork);
            populateStateTable();
        }
    }//GEN-LAST:event_comboStateActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
        CityNetwork cityNetwork = (CityNetwork) comboCity.getSelectedItem();
        if(cityNetwork != null){
            populateCityTable();
        }
       
    }//GEN-LAST:event_comboCityActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String type = txtSearch.getText();
           DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
       dtm.setRowCount(0);
        for(CountryNetwork countryNetwork:system.getCountryNetworkDirectory().getCountryNetworkList()){

            for(StateNetwork stateNetwork : countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
               
                for(CityNetwork cityNetwork : stateNetwork.getCityNetworkDirectory().getCityNetworkList()) {
                    
                    for(Enterprise enterprise:cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                        String en = enterprise.getEnterpriseType().getValue();
                        if(en.equalsIgnoreCase(type) == true){
  
                            Object[] row = new Object[5];
                            row[0]=enterprise;
                            row[1]=countryNetwork.getName();
                            row[2]=stateNetwork.getName();
                            row[3]=cityNetwork;
                            row[4]=enterprise.getEnterpriseType().getValue();
                        
                            dtm.addRow(row);
                        }
                    }
                      
                }
            }
        }
        txtSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboCity;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JComboBox comboState;
    private javax.swing.JComboBox comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
