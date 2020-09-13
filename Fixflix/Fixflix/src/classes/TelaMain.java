package classes;


import javax.swing.DefaultListModel;
public class TelaMain extends javax.swing.JFrame {
    DefaultListModel lista = new DefaultListModel(); //Cria um objeto do tipo lista
    int selecionado = 0;
    int x;
    Parametro nome       = new Parametro();
    Parametro defeito    = new Parametro();
    Parametro prioridade = new Parametro();
    Parametro eletrica   = new Parametro();
    Parametro mecanica   = new Parametro();
    Parametro pneu       = new Parametro();
    Parametro clp        = new Parametro();
    Parametro aux        = new Parametro();
    
    public void ordenaVet()
    {
        int i,j;
        for( i=0; i<100; i++ ){
                  for( j=i+1; j<100; j++ ){
                       if( prioridade.pos[i] < prioridade.pos[j] ){
                          aux.numero = prioridade.pos[i];
                           prioridade.pos[i] = prioridade.pos[j];
                           prioridade.pos[j] = aux.numero;
                           
                           aux.palavra = nome.texto[i];
                           nome.texto[i] = nome.texto[j];
                           nome.texto[j] = aux.palavra;
                           
                           aux.palavra = defeito.texto[i];
                           defeito.texto[i] = defeito.texto[j];
                           defeito.texto[j] = aux.palavra;
                           
                           aux.booleano = pneu.bool[i];
                           pneu.bool[i] = pneu.bool[j];
                           pneu.bool[j] = aux.booleano;
                           
                           aux.booleano = mecanica.bool[i];
                           mecanica.bool[i] = mecanica.bool[j];
                           mecanica.bool[j] = aux.booleano;
                           
                           aux.booleano = eletrica.bool[i];
                           eletrica.bool[i] = eletrica.bool[j];
                           eletrica.bool[j] = aux.booleano;
                           
                           aux.booleano = clp.bool[i];
                           clp.bool[i] = clp.bool[j];
                           clp.bool[j] = aux.booleano;
                           
                           
                           
                       }
                  }
           }
        exibeLista();
    }
    
    public void editaVet()
    {
        prioridade.pos[x]=Integer.parseInt(prio.getValue().toString());
         defeito.texto[x] = txtdefeito.getText();
         nome.texto[x] = txtnome.getText();
         if(cbclp.isSelected())
         clp.bool[x]=true;
        else
            clp.bool[x]=false; 
         if(cbeletrica.isSelected())
            eletrica.bool[x]=true; 
         else
            eletrica.bool[x]=false; 
         if(cbmecanica.isSelected())
             mecanica.bool[x]=true;
         else
            mecanica.bool[x]=false; 
         if(cbpneu.isSelected())
             pneu.bool[x]=true;
         else
            pneu.bool[x]=false;
               
    }
    
    public void carregaVet()
    {
        for(int x=0;x<100;x++)
        {
            if(prioridade.pos[x]==0)
            {
         prioridade.pos[x]=Integer.parseInt(prio.getValue().toString());
         defeito.texto[x] = txtdefeito.getText();
         nome.texto[x] = txtnome.getText();
         if(cbclp.isSelected())
         clp.bool[x]=true;
        else
            clp.bool[x]=false; 
         if(cbeletrica.isSelected())
            eletrica.bool[x]=true; 
         else
            eletrica.bool[x]=false; 
         if(cbmecanica.isSelected())
             mecanica.bool[x]=true;
         else
            mecanica.bool[x]=false; 
         if(cbpneu.isSelected())
             pneu.bool[x]=true;
         else
            pneu.bool[x]=false;
                break;
            }
        }
    }
    
    public void exibeLista()
    {
        lista.removeAllElements();
    
        
         for(int x = 0; x< prioridade.pos.length;x++)
         if(prioridade.pos[x]!=0)
        lista.addElement(x+1 +"°: "+defeito.texto[x]);
    }
    public void limpaForm()
    {
       
      cbpneu.setSelected(false);  
      cbmecanica.setSelected(false);
      cbclp.setSelected(false); 
      cbeletrica.setSelected(false); 
      txtnome.setText("");
      txtdefeito.setText(""); 
    }
    
  
    
    public TelaMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdefeito = new javax.swing.JTextField();
        btnlimpa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTeste = new javax.swing.JList<>();
        btnremo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbmecanica = new javax.swing.JCheckBox();
        cbeletrica = new javax.swing.JCheckBox();
        cbclp = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        prio = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnedit = new javax.swing.JButton();
        cbpneu = new javax.swing.JCheckBox();
        btndelete = new javax.swing.JButton();
        btncada = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtdefeito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdefeitoMouseClicked(evt);
            }
        });

        btnlimpa.setText("Limpar");
        btnlimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpaActionPerformed(evt);
            }
        });

        lstTeste.setModel(lista);
        lstTeste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstTesteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstTeste);

        btnremo.setText("Remover/Concluir");
        btnremo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoActionPerformed(evt);
            }
        });

        jLabel3.setText("Solicitante:");

        cbmecanica.setText("Mecânica");

        cbeletrica.setText("Elétrica/Eletrônica");

        cbclp.setText("Controlador Programavel");

        jLabel2.setText("Tipo de manutenção:");

        txtnome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnomeMouseClicked(evt);
            }
        });

        prio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jLabel1.setText("Descrição breve do problema:");

        btnedit.setText("Editar");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        cbpneu.setText("Pneumatica/Hidraulica");

        btndelete.setText("Apagar tudo");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btncada.setText("Cadastrar");
        btncada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadaActionPerformed(evt);
            }
        });

        jLabel4.setText("Grau de prioridade:");

        jLabel5.setText("Tarefas para realizar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbeletrica)
                            .addComponent(cbmecanica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbclp)
                            .addComponent(cbpneu)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnremo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpa))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtdefeito))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtdefeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbeletrica)
                            .addComponent(cbpneu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbmecanica)
                            .addComponent(cbclp))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(prio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnedit)
                            .addComponent(btnremo)
                            .addComponent(btncada)
                            .addComponent(btndelete)
                            .addComponent(btnlimpa))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdefeitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdefeitoMouseClicked
        txtdefeito.setText("");
    }//GEN-LAST:event_txtdefeitoMouseClicked

    private void btnlimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpaActionPerformed
limpaForm();
    }//GEN-LAST:event_btnlimpaActionPerformed

    private void lstTesteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstTesteMouseClicked
        selecionado = lstTeste.getSelectedIndex();
         
     txtnome.setText(nome.texto[selecionado]);
     txtdefeito.setText(defeito.texto[selecionado]);
     if(eletrica.bool[selecionado]==true)
        cbeletrica.setSelected(true);
        else
        cbeletrica.setSelected(false); 
        if(clp.bool[selecionado]==true)
        cbclp.setSelected(true);
        else
        cbclp.setSelected(false); 
        if(mecanica.bool[selecionado]==true)
        cbmecanica.setSelected(true);
        else
        cbmecanica.setSelected(false); 
        if(pneu.bool[selecionado]==true)
        cbpneu.setSelected(true);
        else
        cbpneu.setSelected(false);
        
        prio.setValue(prioridade.pos[selecionado]);
     
    
    }//GEN-LAST:event_lstTesteMouseClicked

    private void btnremoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoActionPerformed
        selecionado = lstTeste.getSelectedIndex();
        prioridade.pos[selecionado]=0;
        ordenaVet();
    }//GEN-LAST:event_btnremoActionPerformed

    private void txtnomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnomeMouseClicked
        txtnome.setText("");
    }//GEN-LAST:event_txtnomeMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        x = lstTeste.getSelectedIndex();
        editaVet();
        ordenaVet();
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
    prioridade.ZeraVet();
    ordenaVet();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadaActionPerformed
        carregaVet();
        ordenaVet();
    }//GEN-LAST:event_btncadaActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
                new TelaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncada;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnlimpa;
    private javax.swing.JButton btnremo;
    private javax.swing.JCheckBox cbclp;
    private javax.swing.JCheckBox cbeletrica;
    private javax.swing.JCheckBox cbmecanica;
    private javax.swing.JCheckBox cbpneu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstTeste;
    private javax.swing.JSpinner prio;
    private javax.swing.JTextField txtdefeito;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables


}
