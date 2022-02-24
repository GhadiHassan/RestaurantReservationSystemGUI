package a_1911463;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Frame3 extends javax.swing.JFrame {
    
    private int total; //to calculate the total price
    private final int personPrice = 117; //the price for each person
    private final String disCode1 = "UJ10";//code1,make 10% discount from total
    private final String disCode2 = "LR20";//code2,make 20% discount from total
    
    //constructor
    public Frame3() {
        initComponents();
        
        //initialize total to zero
        total=0;
        
        //set frame title
        setTitle("Frame3");
        
        //set background color
        bgPanel.setBackground(Frame1.bgColor);
        
        //show frame3
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        bgPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneNumText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dayLabel = new javax.swing.JLabel();
        peopleLabel = new javax.swing.JLabel();
        peopleText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        indoorRB = new javax.swing.JRadioButton();
        outdoorRB = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        disCodeText = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(77, 115, 104));

        bgPanel.setBackground(new java.awt.Color(217, 156, 167));

        jPanel2.setBackground(new java.awt.Color(77, 115, 104));

        jLabel2.setBackground(new java.awt.Color(240, 118, 123));
        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("Name");

        nameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setText("Email");

        emailText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(217, 156, 167));
        jLabel8.setText("==================================");

        phoneNumText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phoneNumText.setToolTipText("05xxxxxxxx");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(217, 156, 167));
        jLabel11.setText("==================================");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(97, 97, 97)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText)
                                    .addComponent(phoneNumText)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(198, 198, 198)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        confirmButton.setBackground(new java.awt.Color(77, 115, 104));
        confirmButton.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setText("Enter Reservation Information:");

        jPanel3.setBackground(new java.awt.Color(77, 115, 104));

        dayLabel.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        dayLabel.setText("Day");

        peopleLabel.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        peopleLabel.setText("People Number");

        peopleText.setEditable(false);
        peopleText.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        peopleText.setText("0");

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel7.setText("Seat Area");

        dayComboBox.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        plusButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(indoorRB);
        indoorRB.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        indoorRB.setText("Indoor");

        buttonGroup1.add(outdoorRB);
        outdoorRB.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        outdoorRB.setText("Outdoor");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(217, 156, 167));
        jLabel9.setText("=====================================");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(217, 156, 167));
        jLabel13.setText("=====================================");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peopleLabel)
                    .addComponent(dayLabel)
                    .addComponent(jLabel7))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(indoorRB)
                        .addGap(18, 18, 18)
                        .addComponent(outdoorRB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(peopleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusButton))
                            .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(601, 601, 601))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayLabel))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peopleLabel)
                    .addComponent(peopleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton)
                    .addComponent(plusButton))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(indoorRB)
                    .addComponent(outdoorRB))
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        jPanel1.setBackground(new java.awt.Color(77, 115, 104));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel5.setText("Total Price");

        totalText.setEditable(false);
        totalText.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        totalText.setText("0 SR");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("include VAT %15");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(217, 156, 167));
        jLabel10.setText("==============================");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(217, 156, 167));
        jLabel14.setText("==============================");

        jLabel18.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel18.setText("Discount Code");

        disCodeText.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N

        checkButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(33, 33, 33)
                                        .addComponent(disCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(checkButton)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(disCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel12.setText("Enter Your Information:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(77, 115, 104));
        jLabel15.setText("==============================================");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(77, 115, 104));
        jLabel16.setText("=============================================");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)))
                .addContainerGap())
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(693, 693, 693)
                .addComponent(confirmButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(39, 39, 39)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmButton)
                .addGap(5, 5, 5)
                .addComponent(jLabel15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //methode to validate phone number
    public boolean validatePhoneNum(String phoneNum){
        return phoneNum.matches("05\\d{8}");
    }
     
    //methode to validate email
    public boolean validateEmail(String email){
         return email.matches("[a-zA-Z_0-9]+@[a-zA-z]+.com");
    }
    
    //action listener for "confirm" button
    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        //get all the information from the frame
        String name = nameText.getText();
        String phoneNum =  phoneNumText.getText();
        String email = emailText.getText();
        String day = (String) dayComboBox.getSelectedItem();
        String people = peopleText.getText();
        String seatArea;
        if(indoorRB.isSelected())
            seatArea = "Indoor";
        else
            seatArea = "Outdoor";
        String totalPrice = totalText.getText();
        
        //validate name
        if (!nameText.getText().equals("")) {

            //validate phone number
            if (validatePhoneNum(phoneNum)) {
                
                //validate email
                if (validateEmail(email)) {
                    
                    //validate people number
                    if(!(peopleText.getText().equals("0"))){
                        
                        //validate if seat area is selected or not
                        if(indoorRB.isSelected() || outdoorRB.isSelected() ){
                            try {
                                //write reservation information on the file
                                FileWriter write = new FileWriter("reservations.txt", true);
                                BufferedWriter out = new BufferedWriter(write);
                                out.write(name + "\n");
                                out.write(phoneNum + "\n");
                                out.write(email + "\n");
                                out.write(day + "\n");
                                out.write(people + "\n");
                                out.write(seatArea + "\n");
                                out.write(totalPrice + "\n");
                                out.close();
                                
                                //close this frame and open frame4
                                this.dispose();
                                new Frame4();

                            }
                            //handle the IOException
                            catch (IOException ex) {
                                JOptionPane.showMessageDialog(null,
                                "there is an IOException",
                                "Exception", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,
                            "Please select seat area",
                            "Invalid Seat Area", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                            "Please enter people number",
                            "Invalid People Number", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,
                            "Email must be in xxx@xxx.com format",
                            "Invalid Email", JOptionPane.ERROR_MESSAGE);
                    emailText.setText("");
                }

            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Phone Number must be 10 digit and start with "
                                + "05\nTry Again",
                        "Invalid Phone Number", JOptionPane.ERROR_MESSAGE);
                phoneNumText.setText("");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Please enter yor name",
                    "Invalid Name", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed
   
    //action listener for "+" button
    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        /*when the user press on + button the number of people will increase
        and accordingly the total will increase(117 SR per person)*/
        //note:the resturant accepts a maximum of 9 people
        int num = Integer.parseInt(peopleText.getText());
        if(num < 9){
            num ++;
            peopleText.setText(Integer.toString(num));
            total = total + personPrice;
            totalText.setText(Integer.toString(total)+" SR");
        }
        
    }//GEN-LAST:event_plusButtonActionPerformed

    //action listener for "-" button
    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        /*when the user press on "-" button the number of people will decrease
        and accordingly the total will decrease(117 SR per person)*/
        //note:the resturant accepts a minimum of 1 person        
        int num = Integer.parseInt(peopleText.getText());
        if(num > 1){
            num -- ;
            peopleText.setText(Integer.toString(num));
            total = total - personPrice;
            totalText.setText(Integer.toString(total)+"SR");
        }
    }//GEN-LAST:event_minusButtonActionPerformed

    //action listener for "Check" button
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        /*if the total is zero we can not make a discount ,the user must choose
        the number of people firt so, show error dialog and return*/
        if(total == 0 ){
            JOptionPane.showMessageDialog(null,
                        "The total is zero\nplease enter the number of people "
                                + "first ",
                        "Total is zero", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String disCode = disCodeText.getText();//get the discount code from user
        int disAmount; //for discount amount
        
        //check the validity of discount code
        switch (disCode) {
            //if the user does not enter any code and press "check" button 
            case "":
                JOptionPane.showMessageDialog(null,
                        "You did not enter any code",
                        "No Discount Code", JOptionPane.ERROR_MESSAGE);
                break;
            //if the user enter code1 then 10% discount
            case disCode1:
                disAmount =(int)(total * 0.10);
                totalText.setText(Integer.toString(total - disAmount)+"SR");
                break;
            //if the user enter code2 then 20% discount
            case disCode2:
                disAmount =(int)(total * 0.20);
                totalText.setText(Integer.toString(total - disAmount)+"SR");
                break;
            //if the user enter a wrong code
            default:
                JOptionPane.showMessageDialog(null,
                        "Discount Code is incorrect \n Please Try Again",
                        "Invalid Discount Code", JOptionPane.ERROR_MESSAGE);
                disCodeText.setText("");
                break;
        }
        
    }//GEN-LAST:event_checkButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField disCodeText;
    private javax.swing.JTextField emailText;
    private javax.swing.JRadioButton indoorRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton minusButton;
    private javax.swing.JTextField nameText;
    private javax.swing.JRadioButton outdoorRB;
    private javax.swing.JLabel peopleLabel;
    private javax.swing.JTextField peopleText;
    private javax.swing.JTextField phoneNumText;
    private javax.swing.JButton plusButton;
    private javax.swing.JTextField totalText;
    // End of variables declaration//GEN-END:variables
}
