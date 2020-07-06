package br.edu.unijui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MainWindow extends javax.swing.JFrame {

    private HashMap<String, State> states;
    private String selectedState = "Select";
    private String tableState;
    private String tableCity;

    public MainWindow() {
        initComponents();
        restrictFileChooser();
        states = new HashMap<>();
        addItemChangeListener();
    }

    private void restrictFileChooser() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV files (*.csv)", "csv");
        jfcChooser.setFileFilter(filter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbSelect = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfSelectedFile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfNumberCities = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfNumberStates = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbState = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbCity = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jbFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtIndexes = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jtfHighestIsolationCountry = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfLowestIsolationCountry = new javax.swing.JTextField();
        jbExport = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();
        jtfLowestIsolationCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfHighestIsolationCity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COVID-19 Isolation Index System");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("COVID-19 Isolation Index System");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Input file:");

        jbSelect.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/page_add.png"))); // NOI18N
        jbSelect.setText("Select...");
        jbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Selected file:");

        jtfSelectedFile.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Number of cities:");

        jtfNumberCities.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Number of states:");

        jtfNumberStates.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("State:");

        jcbState.setMaximumRowCount(26);
        jcbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jcbState.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("City:");

        jcbCity.setMaximumRowCount(26);
        jcbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jcbCity.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Isolation Index (%)");

        jbFind.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N
        jbFind.setText("Find");
        jbFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFindActionPerformed(evt);
            }
        });

        jtIndexes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Isolated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtIndexes);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Highest Isolation (Country):");

        jtfHighestIsolationCountry.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("Lowest Isolation (Country):");

        jtfLowestIsolationCountry.setEnabled(false);

        jbExport.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/disk.png"))); // NOI18N
        jbExport.setText("Export Data");
        jbExport.setEnabled(false);
        jbExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportActionPerformed(evt);
            }
        });

        jbClose.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross.png"))); // NOI18N
        jbClose.setText("Close Application");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        jtfLowestIsolationCity.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("Highest Isolation (City):");

        jtfHighestIsolationCity.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("Lowest Isolation (City):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(326, 326, 326))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfHighestIsolationCountry)
                            .addComponent(jtfLowestIsolationCountry)
                            .addComponent(jtfLowestIsolationCity)
                            .addComponent(jtfHighestIsolationCity)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtfNumberStates, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbFind)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtfNumberCities, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtfSelectedFile, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcbState, 0, 277, Short.MAX_VALUE)
                                            .addComponent(jcbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jbClose)
                .addGap(55, 55, 55)
                .addComponent(jbExport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfSelectedFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jcbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumberCities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jcbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumberStates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jbFind))
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfHighestIsolationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfLowestIsolationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfHighestIsolationCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfLowestIsolationCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbClose)
                    .addComponent(jbExport))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectActionPerformed
        int result = jfcChooser.showOpenDialog(this);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        int cityCount = 0;

        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }

        try {
            File file = jfcChooser.getSelectedFile();
            jtfSelectedFile.setText(file.getName());

            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "File not found/invalid", "Error", JOptionPane.ERROR);
            return;
        }
        long start = System.currentTimeMillis();
        try {

            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split(",");
                // 0- Estado, 1- Cidade, 2- Porcentagem, 3- Data
                if (!states.keySet().contains(words[0])) {
                    states.put(words[0], new State(words[0]));
                }

                State state = states.get(words[0]);
                if (!state.hasCity(words[1])) {
                    state.addCity(new City(words[1]));
                    cityCount++;
                }
                    state.getCity(words[1]).addIndex(words[3], Float.parseFloat(words[2]));
                

            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error while trying to read the file. Try again.", "Error", JOptionPane.ERROR);
            return;
        }

        try {
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("bbbbbbbbbb");
        }

        Object[] stateNames = states.keySet().toArray();
        Arrays.sort(stateNames);
        for (Object stateName : stateNames) {
            jcbState.addItem((String) stateName);
        }
        
        long end = System.currentTimeMillis();
        System.out.println("Load Time: "+ (end - start));

        jtfSelectedFile.setEnabled(true);
        jtfNumberStates.setEnabled(true);
        jtfNumberStates.setText(Integer.toString(states.size()));
        jtfNumberCities.setEnabled(true);
        jtfNumberCities.setText(Integer.toString(cityCount));
        jcbState.setEnabled(true);
        jcbCity.setEnabled(true);
    }//GEN-LAST:event_jbSelectActionPerformed

    private void jbFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFindActionPerformed
        
        long start = System.currentTimeMillis();
        if (jcbState.getSelectedIndex() == 0 || jcbCity.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Select a state and city", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        City selectedCity = states.get((String) jcbState.getSelectedItem())
                .getCity((String) jcbCity.getSelectedItem());

        String[] dates = states.get((String) jcbState.getSelectedItem())
                .getCity((String) jcbCity.getSelectedItem()).getDates();

        Arrays.sort(dates, Collections.reverseOrder());
        TableModel model = jtIndexes.getModel();
        ((DefaultTableModel)model).setRowCount(0);
        int line = 0;
        float highestIndex = 0f;
        float lowestIndex = 100f;
        for (String date : dates) {
            float index = selectedCity.getIndex(date);

                ((DefaultTableModel) model).addRow(new Object[]{date, (index * 100f)});
 
            
            line++;
            if(index > highestIndex){
                jtfHighestIsolationCity.setText("(" + date + ")" + " - " + index*100 + "%");
                highestIndex = index;
            }
            if (index < lowestIndex){
                jtfLowestIsolationCity.setText("(" + date + ")" + " - " + index*100 + "%");
                lowestIndex = index;
            }
            
        }

        highestIndex = 0f;
        lowestIndex = 100f;
        if (jtfHighestIsolationCountry.getText().equals("") && jtfLowestIsolationCountry.getText().equals("")) {
            highestIndex = 0;
            lowestIndex = 100;
            for (State state : states.values()) {
                for (City city : state.getCities()) {
                    for (String date : city.getDates()) {
                        float index = city.getIndex(date);
                        
                        if (index > highestIndex) {
                            jtfHighestIsolationCountry.setText(city.getName() + " / " + state.getName() + " ("
                                    + date + ")  " + index * 100 + "%.");
                            highestIndex = index;
                        } else if (index < lowestIndex) {
                            jtfLowestIsolationCountry.setText(city.getName() + " / " + state.getName() + " ("
                                    + date + ")  " + index * 100 + "%.");
                            lowestIndex = index;
                        }
                    }
                }
            }
        }
        System.out.println(selectedCity.getDates().length);
        tableCity = selectedCity.getName();
        tableState = selectedState;
        jtfHighestIsolationCountry.setEnabled(true);
        jtfLowestIsolationCountry.setEnabled(true);
        jtfHighestIsolationCity.setEnabled(true);
        jtfLowestIsolationCity.setEnabled(true);
        jbExport.setEnabled(true);

    }//GEN-LAST:event_jbFindActionPerformed

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed

        int result = JOptionPane.showConfirmDialog(this, "Are you sure?", "Warning", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            return;
        }

    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportActionPerformed
        jfcChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file", "txt");
        jfcChooser.setFileFilter(filter);
        int result = jfcChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {

            File file = jfcChooser.getSelectedFile();
            try {
                saveData(file);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error has ocurred, please try again.", "Eroor", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExportActionPerformed

    private void addItemChangeListener() {
        jcbState.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if (jcbState.getSelectedIndex() == 0) {
                    jcbCity.removeAllItems();
                    jcbCity.addItem("Select");
                    return;
                } else if (!((String) jcbState.getSelectedItem()).equals(selectedState)) {
                    selectedState = (String) jcbState.getSelectedItem();
                    displayCities();
                    System.out.println(selectedState);
                }
            }
        });
    }

    private void displayCities() {
        Collator collator = Collator.getInstance(new Locale("pt", "BR"));
        collator.setStrength(Collator.PRIMARY);
        jcbCity.removeAllItems();
        jcbCity.addItem("Select");
        Object[] cityName = states.get(selectedState).getCityNames().toArray();
        Arrays.sort(cityName, collator);
        for (Object name : cityName) {
            jcbCity.addItem((String) name);
        }

    }

    private void saveData(File file) {
        String filename = file.getAbsolutePath();
        StringBuilder content = new StringBuilder();
        int count = 1;
        if (!filename.endsWith(".txt")) {
            file = new File(filename + ".txt");
        }

        content.append(tableCity).append(" / ").append(tableState).append("\n").append("\n");

        City city = states.get(tableState).getCity(tableCity);
        for (String date : city.getDates()) {
            content.append("[").append(Integer.toString(count)).append("]; ").
                    append(date).append("; ").append(city.getIndex(date) * 100).append("% \n");
            count++;
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("gosdogndfsokgsdf");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbExport;
    private javax.swing.JButton jbFind;
    private javax.swing.JButton jbSelect;
    private javax.swing.JComboBox<String> jcbCity;
    private javax.swing.JComboBox<String> jcbState;
    private javax.swing.JFileChooser jfcChooser;
    private javax.swing.JTable jtIndexes;
    private javax.swing.JTextField jtfHighestIsolationCity;
    private javax.swing.JTextField jtfHighestIsolationCountry;
    private javax.swing.JTextField jtfLowestIsolationCity;
    private javax.swing.JTextField jtfLowestIsolationCountry;
    private javax.swing.JTextField jtfNumberCities;
    private javax.swing.JTextField jtfNumberStates;
    private javax.swing.JTextField jtfSelectedFile;
    // End of variables declaration//GEN-END:variables
}
