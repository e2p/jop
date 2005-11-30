package kfl.ctrl;

import BBSys;

/*
 * PnlStation.java
 *
 * Created on 06. Februar 2002, 16:27
 */

/**
 *
 * @author  Standard
 */
public class PnlStation extends javax.swing.JPanel {

    private int nr;
    
    /** Creates new form PnlStation */
    public PnlStation(int nr, int ver) {
        initComponents();
        this.nr = nr;
        lblStation.setText("Station "+nr+"    V "+(ver>>6)+"."+(ver&0x3f));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        lblStation = new javax.swing.JLabel();
        chkU1 = new javax.swing.JCheckBox();
        chkU2 = new javax.swing.JCheckBox();
        chkU3 = new javax.swing.JCheckBox();
        chkI1 = new javax.swing.JCheckBox();
        chkI2 = new javax.swing.JCheckBox();
        chkI3 = new javax.swing.JCheckBox();
        chkIN = new javax.swing.JCheckBox();
        chkSU = new javax.swing.JCheckBox();
        chkSO = new javax.swing.JCheckBox();
        chkSI = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtImp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtStrom = new javax.swing.JTextField();
        
        setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gridBagConstraints1;
        
        setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStation.setText("Station");
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(7, 5, 7, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(lblStation, gridBagConstraints1);
        
        chkU1.setText("L1 Spannung");
        chkU1.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 1;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkU1, gridBagConstraints1);
        
        chkU2.setText("L2 Spannung");
        chkU2.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 2;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkU2, gridBagConstraints1);
        
        chkU3.setText("L3 Spannung");
        chkU3.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 3;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkU3, gridBagConstraints1);
        
        chkI1.setText("L1 Strom");
        chkI1.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 1;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkI1, gridBagConstraints1);
        
        chkI2.setText("L2 Strom");
        chkI2.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 2;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkI2, gridBagConstraints1);
        
        chkI3.setText("L3 Strom");
        chkI3.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 3;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkI3, gridBagConstraints1);
        
        chkIN.setText("N Strom");
        chkIN.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 4;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkIN, gridBagConstraints1);
        
        chkSU.setText("Sensor unten");
        chkSU.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 6;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkSU, gridBagConstraints1);
        
        chkSO.setText("Sensor oben");
        chkSO.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 5;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkSO, gridBagConstraints1);
        
        chkSI.setText("Sensor Impuls");
        chkSI.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 6;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(0, 5, 0, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(chkSI, gridBagConstraints1);
        
        jLabel1.setText("Impulse:");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 7;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel1, gridBagConstraints1);
        
        txtImp.setColumns(5);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 7;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(txtImp, gridBagConstraints1);
        
        jLabel2.setText("Status");
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 8;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel2, gridBagConstraints1);
        
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reset", "Ready", "Hinauf", "Herunter", "Error", "Debug", "Service" }));
        cmbStatus.setEnabled(false);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 8;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(cmbStatus, gridBagConstraints1);
        
        jLabel3.setText("Strom:");
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 9;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel3, gridBagConstraints1);
        
        txtStrom.setColumns(5);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 9;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        add(txtStrom, gridBagConstraints1);
        
    }//GEN-END:initComponents

    public void setOpto(int val) {
        chkU1.setSelected((val&BBSys.BIT_UL1)!=0);
        chkU2.setSelected((val&BBSys.BIT_UL2)!=0);
        chkU3.setSelected((val&BBSys.BIT_UL3)!=0);
        chkI1.setSelected((val&BBSys.BIT_IL1)!=0);
        chkI2.setSelected((val&BBSys.BIT_IL2)!=0);
        chkI3.setSelected((val&BBSys.BIT_IL3)!=0);
        chkIN.setSelected((val&BBSys.BIT_IN)!=0);
    }    

    public void setInp(int val) {

		val >>>= 4;			// Sensor and Tast
        chkSU.setSelected((val&BBSys.BIT_SENSU)!=0);
        chkSO.setSelected((val&BBSys.BIT_SENSO)!=0);
        chkSI.setSelected((val&BBSys.BIT_SENSI)!=0);
    }

    public void setStatus(int val) {
		
		cmbStatus.setSelectedIndex(val);
    }
    
    public void setImpuls(int val) {

		txtImp.setText(""+val);
    }

    public void setStrom(int i1, int i2, int i3) {

		txtStrom.setText(""+i1+" "+i2+" "+i3);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblStation;
    private javax.swing.JCheckBox chkU1;
    private javax.swing.JCheckBox chkU2;
    private javax.swing.JCheckBox chkU3;
    private javax.swing.JCheckBox chkI1;
    private javax.swing.JCheckBox chkI2;
    private javax.swing.JCheckBox chkI3;
    private javax.swing.JCheckBox chkIN;
    private javax.swing.JCheckBox chkSU;
    private javax.swing.JCheckBox chkSO;
    private javax.swing.JCheckBox chkSI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtImp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtStrom;
    // End of variables declaration//GEN-END:variables

}
