/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Role.EnviromentalAdminRole;
import Business.Role.ForestProtectorAdminRole;
import Business.Role.ProviderAdminRole;
import Business.Role.SupplierAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel container;
    private EcoSystem system;

    public ManageEnterpriseAdminJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
        populateCountryComboBox();
       // populateTypeComboBox();
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
private void populateTypeComboBox(CityNetwork cityNetwork) {
        comboType.removeAllItems();
        ArrayList<String> combo = new ArrayList<>();
        for(Enterprise enterprise:cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
            if(!combo.contains(enterprise.getEnterpriseType().getValue())){
                combo.add(enterprise.getEnterpriseType().getValue());
            }
            System.out.println("KYAPASS HO RAHI HAI"+enterprise.getEnterpriseType().getValue());
        }
        comboType.setModel(new DefaultComboBoxModel(combo.toArray()));
}
    private void populateEnterpriseComboBox(CityNetwork cityNetwork){
        comboEnterprise.removeAllItems();
        String type =String.valueOf(comboType.getSelectedItem());
        for(Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
           if(type.equalsIgnoreCase(enterprise.getEnterpriseType().getValue()) ==  true){
            System.out.println("11111111"+enterprise);
            comboEnterprise.addItem(enterprise);
        }
        }
        
    }
    
    
    
    
    private  void populateTable(){
         DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
       dtm.setRowCount(0);

        for(CountryNetwork countryNetwork:system.getCountryNetworkDirectory().getCountryNetworkList()){

            for(StateNetwork stateNetwork : countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
               
                for(CityNetwork cityNetwork : stateNetwork.getCityNetworkDirectory().getCityNetworkList()) {
                    
                    for(Enterprise enterprise:cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                       for(UserAccount userAccount:enterprise.getUserAccountDirectory().getUserAccountList()){
                        Object[] row = new Object[7];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        row[5]=userAccount.getUsername();
                        row[6]=userAccount.getEmployee().getJoinDate();
                        dtm.addRow(row);
                    }
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
                       for(UserAccount userAccount:enterprise.getUserAccountDirectory().getUserAccountList()){
                        Object[] row = new Object[7];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        row[5]=userAccount.getUsername();
                        row[6]=userAccount.getEmployee().getJoinDate();
                        dtm.addRow(row);
                    }
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
                        for(UserAccount userAccount:enterprise.getUserAccountDirectory().getUserAccountList()){

                        Object[] row = new Object[7];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        row[5]=userAccount.getUsername();
                        row[6]=userAccount.getEmployee().getJoinDate();
                        dtm.addRow(row);
                    }
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
                        for(UserAccount userAccount:enterprise.getUserAccountDirectory().getUserAccountList()){

                        Object[] row = new Object[7];
                        row[0]=enterprise.getName();
                        row[1]=countryNetwork.getName();
                        row[2]=stateNetwork.getName();
                        row[3]=cityNetwork;
                        row[4]=enterprise.getEnterpriseType().getValue();
                        row[5]=userAccount.getUsername();
                        row[6]=userAccount.getEmployee().getJoinDate();
                        dtm.addRow(row);
                    }
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
        comboCountry = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        comboEnterprise = new javax.swing.JComboBox();
        pswdPassword = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        tblEnterprise.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Country", "State", "City", "Type", "User Name", "JoinDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            tblEnterprise.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 700, 95));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Country:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        comboCountry.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });
        add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 140, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("State:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        comboState.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStateActionPerformed(evt);
            }
        });
        add(comboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 140, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        txtUsername.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 140, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Join Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("City:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        comboCity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });
        add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 140, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Enterprise Type:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        comboType.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });
        add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 140, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Enterprise:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        comboEnterprise.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 140, -1));

        pswdPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(pswdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 140, -1));

        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 140, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Password:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel11.setText("Manage Enterprise Admin");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo2.setNothingAllowed(false);
    dateChooserCombo2.setFieldFont(new java.awt.Font("Lucida Sans Typewriter", java.awt.Font.PLAIN, 13));
    add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
    jLabel12.setText("jLabel12");
    add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
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
        // Enterprise.EnterpriseType enterpriseType = (Enterprise.EnterpriseType)comboType.getSelectedItem();
         //System.out.println("QQQ"+enterpriseType);
        if(cityNetwork != null){
       //     if((enterpriseType == (Enterprise.EnterpriseType.Provider))){
      //REDo   populateEnterpriseComboBox(cityNetwork);
      
            populateTypeComboBox(cityNetwork);
            populateCityTable();
       //     }
        }
    }//GEN-LAST:event_comboCityActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        CountryNetwork countryNetwork = (CountryNetwork) comboCountry.getSelectedItem();
        StateNetwork stateNetwork  = (StateNetwork) comboState.getSelectedItem();
        CityNetwork cityNetwork = (CityNetwork) comboCity.getSelectedItem();
        Enterprise enterprise = (Enterprise) comboEnterprise.getSelectedItem();
        String type = String.valueOf(comboType.getSelectedItem());
        String userName = txtUsername.getText();
        String password = String.valueOf(pswdPassword.getPassword());
        String name = txtName.getText();
        String join1 = dateChooserCombo2.getText();
        System.out.println("BEFOREDATE"+join1);
        if((type != null)&&!(type.isEmpty()) && (userName != null)&&!(userName.isEmpty()) && (password != null)&&!(password.isEmpty()) && 
                (name != null)&&!(name.isEmpty()) && (stateNetwork != null) && (cityNetwork != null) && (enterprise != null))
        {
            Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
            Matcher m = pattern.matcher(userName+password+name);
            boolean boo = m.find();
            if(boo == true || name == null || userName == null || password == null) {
                JOptionPane.showMessageDialog(null,"Enter Valid Details");
            }
            else{  
                
                Date joindate = new Date();
                try {
                    joindate =new SimpleDateFormat("MM/dd/yyyy").parse(join1);
                    System.out.println("After"+joindate);
                    Employee employee = enterprise.getEmployeeDirectory().createEmployee(name,joindate);
                    if(String.valueOf(enterprise.getEnterpriseType().getValue()).equals("Provider")){
                        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, new ProviderAdminRole());
                        populateTable();
                        System.out.println("DATE"+joindate);
                    }
                    if(String.valueOf(enterprise.getEnterpriseType().getValue()).equals("Supplier")){
                        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, new SupplierAdminRole());
                        populateTable();
                        System.out.println("DATE"+joindate);
                    }
                    if(String.valueOf(enterprise.getEnterpriseType().getValue()).equals("Environmental")){
                        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, new EnviromentalAdminRole());
                        populateTable();
                        System.out.println("DATE"+joindate);
                    }
                    if(String.valueOf(enterprise.getEnterpriseType().getValue()).equals("ForestProtector")){
                        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, new ForestProtectorAdminRole());
                        populateTable();
                        System.out.println("DATE"+joindate);
                    }
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid date");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter Valid Details");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
        // TODO add your handling code here:
        CityNetwork cityNetwork = (CityNetwork) comboCity.getSelectedItem();
        if(cityNetwork != null){
          populateEnterpriseComboBox(cityNetwork);
        }
    }//GEN-LAST:event_comboTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboCity;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JComboBox comboEnterprise;
    private javax.swing.JComboBox comboState;
    private javax.swing.JComboBox comboType;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pswdPassword;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
