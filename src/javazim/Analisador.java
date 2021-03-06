package javazim;

import java.io.StringReader;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo.reis
 */
public class Analisador extends javax.swing.JFrame
{
    public void executarAnaliseLexica() throws Exception
    {
        int i = 1;
        Lexer lexer = new Lexer(new StringReader(txtEntrada.getText()));
        String resultado = "";
        
        
        while(true)
        {
            Token token = lexer.yylex();
            
            if (token == null)
            {
                txtSaida.setText(resultado);
                return;
            }
            
            switch (token)
            {
                case Programa:
                    break;
                    
                case Classe:
                    break;
                    
                case DeclaracaoVar:
                    resultado = resultado + "Linha: " + i + " <DeclaracaoVar: " + lexer.lexema + ">\n";
                    break;
                    
                case ListaMetodo:
                    break;
                    
                case Metodo:
                    break;
                    
                case ListaParam:
                    resultado = resultado + "Linha: " + i + " <ListaParam: " + lexer.lexema + ">\n";
                    break;
                    
                case Param:
                    resultado = resultado + "Linha: " + i + " <Param: " + lexer.lexema + ">\n";
                    break;
                    
                case Retorno:
                    resultado = resultado + "Linha: " + i + " <Retorno: " + lexer.lexema + ">\n";
                    break;
                    
                case Main:
                    break;
                    
                case Tipo:
                    resultado = resultado + "Linha: " + i + " <Tipo: " + lexer.lexema + ">\n";
                    break;
                    
                case TipoPrimitivo:
                    resultado = resultado + "Linha: " + i + " <TipoPrimitivo: " + lexer.lexema + ">\n";
                    break;
                    
                case ListaCmd:
                    break;
                    
                case Cmd:
                    break;
                    
                case CmdIf:
                    break;
                    
                case CmdWhile:
                    break;
                    
                case CmdPrint:
                    break;
                    
                case CmdPrintLn:
                    break;
                    
                case CmdAtrib:
                    break;
                    
                case CmdFunc:
                    break;
                    
                case Expressao:
                    break;
                    
                case Op:
                    resultado = resultado + "Linha: " + i + " <Op: " + lexer.lexema + ">\n";
                    break;
                    
                case OpUnario:
                    resultado = resultado + "Linha: " + i + " <OpUnario: " + lexer.lexema + ">\n";
                    break;
                    
                case ID:
                    resultado = resultado + "Linha: " + i + " <ID: " + lexer.lexema + ">\n";
                    break;
                    
                case ConstInteira:
                    resultado = resultado + "Linha: " + i + " <ConstInteira: " + lexer.lexema + ">\n";
                    break;
                    
                case ConstReal:
                    resultado = resultado + "Linha: " + i + " <ConstReal: " + lexer.lexema + ">\n";
                    break;
                    
                case ConstString:
                    resultado = resultado + "Linha: " + i + " <ConstString: " + lexer.lexema + ">\n";
                    break;

                case Delimitador:
                    resultado = resultado + "Linha: " + i + " <Delimitador: " + lexer.lexema + ">\n";
                    break;

                case Atribuicao:
                    resultado = resultado + "Linha: " + i + " <Atribuicao: " + lexer.lexema + ">\n";
                    break;
                    
                case SimboloAgrupador:
                    resultado = resultado + "Linha: " + i + " <SimboloAgrupador: " + lexer.lexema + ">\n";
                    break;                
                    
                case PalavraReservada:
                    resultado = resultado + "Linha: " + i + " <PalavraReservada: " + lexer.lexema + ">\n";
                    break;
                    
                case NaoReconhecido:
                    resultado = resultado + "Linha: " + i + " <NaoReconhecido: " + lexer.lexema + ">\n";
                    break;
                    
                case NovaLinha:
                    ++i;
                    break;
                    
                default:
                    resultado = resultado + "Linha: " + i + " <" + lexer.lexema + ">" + ++i;
                    break;
            }
        }
    }
    
    public Analisador()
    {
        initComponents();
        configureLook();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextArea();
        btnAnalisar = new javax.swing.JButton();
        btnCopiarSaida = new javax.swing.JButton();
        btnNovaAnalise = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALEX - Analisador LEXico, v.0.1");
        setMaximumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setText("Entrada:");

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);
        txtEntrada.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Saída:");

        txtSaida.setBackground(new java.awt.Color(240, 240, 240));
        txtSaida.setColumns(20);
        txtSaida.setRows(5);
        txtSaida.setEditable(false);
        jScrollPane2.setViewportView(txtSaida);
        txtSaida.getAccessibleContext().setAccessibleName("");

        btnAnalisar.setText("Analisar");
        btnAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarActionPerformed(evt);
            }
        });

        btnCopiarSaida.setText("Copiar Saída");
        btnCopiarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarSaidaActionPerformed(evt);
            }
        });

        btnNovaAnalise.setText("Nova Análise");
        btnNovaAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaAnaliseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                        .addComponent(btnNovaAnalise)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopiarSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnalisar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCopiarSaida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnalisar)
                        .addComponent(btnNovaAnalise))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAnalisarActionPerformed
    {//GEN-HEADEREND:event_btnAnalisarActionPerformed
        try
        {
            executarAnaliseLexica();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAnalisarActionPerformed

    private void btnCopiarSaidaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCopiarSaidaActionPerformed
    {//GEN-HEADEREND:event_btnCopiarSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarSaidaActionPerformed

    private void btnNovaAnaliseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovaAnaliseActionPerformed
    {//GEN-HEADEREND:event_btnNovaAnaliseActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(
                null, "Limpar os dados e realizar uma nova análise?", "Nova Análise", 0
            );
        
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            txtEntrada.setText("");
            txtSaida.setText("");
            txtEntrada.requestFocus();
        }
    }//GEN-LAST:event_btnNovaAnaliseActionPerformed

    private void configureLook()
    {
        setLocationRelativeTo(this);
        txtEntrada.requestFocus();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Analisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analisador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisar;
    private javax.swing.JButton btnCopiarSaida;
    private javax.swing.JButton btnNovaAnalise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtSaida;
    // End of variables declaration//GEN-END:variables
}
