
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {

    private String gameMark = "X";
    private int xWin = 0;
    private int oWin = 0;

    public TicTacToe() {
        initComponents();
        score();
    }

    private void score() {
        playerOne.setText(String.valueOf(xWin));
        playerTwo.setText(String.valueOf(oWin));
    }

    private void gameStart() {
        if (gameMark.equalsIgnoreCase("X")) {
            gameMark = "O";
        } else {
            gameMark = "X";
        }
    }

    private void gameReset() {
        JButton[] btn = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
        for (int i = 0; i < 9; i++) {
            btn[i].setText(null);
            btn[i].setBackground(null);
            btn[i].setEnabled(true);
        }
        gameMark = "X";
    }

    private void gameResult() {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();

        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();

        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();

//        PLAYER 1 HORIZONTAL SET
        if (b1 == "X" && b2 == "X" && b3 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }
        if (b4 == "X" && b5 == "X" && b6 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }
        if (b7 == "X" && b8 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }

//        PLAYER 1 VERTICAL SET
        if (b1 == "X" && b4 == "X" && b7 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }
        if (b2 == "X" && b5 == "X" && b8 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }
        if (b3 == "X" && b6 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }

//        PLAYER 1 DIAGONAL SET
        if (b1 == "X" && b5 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }
        if (b3 == "X" && b5 == "X" && b7 == "X") {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            xWin++;
            score();
            gameReset();
        }

//        PLAYER 2 HORIZONTAL SET
        if (b1 == "O" && b2 == "O" && b3 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }
        if (b4 == "O" && b5 == "O" && b6 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }
        if (b7 == "O" && b8 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }

//        PLAYER 2 VERTICAL SET
        if (b1 == "O" && b4 == "O" && b7 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }
        if (b2 == "O" && b5 == "O" && b8 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }
        if (b3 == "O" && b6 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }

//        PLAYER 2 DIAGONAL SET
        if (b1 == "O" && b5 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }
        if (b3 == "O" && b5 == "O" && b7 == "O") {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            oWin++;
            score();
            gameReset();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidePanelLeft = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        sidePanelRight = new javax.swing.JPanel();
        newGame = new javax.swing.JButton();
        exitGame = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        playerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        playerOne = new javax.swing.JLabel();
        playerTwo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC-TAC-TOE");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLeftLayout = new javax.swing.GroupLayout(sidePanelLeft);
        sidePanelLeft.setLayout(sidePanelLeftLayout);
        sidePanelLeftLayout.setHorizontalGroup(
            sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLeftLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLeftLayout.createSequentialGroup()
                        .addGroup(sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidePanelLeftLayout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidePanelLeftLayout.createSequentialGroup()
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(sidePanelLeftLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        sidePanelLeftLayout.setVerticalGroup(
            sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidePanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(sidePanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 540));

        newGame.setText("DRAW");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        exitGame.setText("EXIT");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("WELCOME TO");

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");

        playerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Player 1:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Player 2:");

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SCORE BOARD");

        playerOne.setText("        ");

        playerTwo.setText("        ");

        javax.swing.GroupLayout playerPanelLayout = new javax.swing.GroupLayout(playerPanel);
        playerPanel.setLayout(playerPanelLayout);
        playerPanelLayout.setHorizontalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(playerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        playerPanelLayout.setVerticalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerOne))
                .addGap(32, 32, 32)
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerTwo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidePanelRightLayout = new javax.swing.GroupLayout(sidePanelRight);
        sidePanelRight.setLayout(sidePanelRightLayout);
        sidePanelRightLayout.setHorizontalGroup(
            sidePanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitGame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(newGame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanelRightLayout.setVerticalGroup(
            sidePanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sidePanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sidePanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn2.setBackground(Color.red);
        } else {
            btn2.setBackground(Color.green);
        }
        gameStart();
        btn2.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn2ActionPerformed

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameActionPerformed
        JFrame frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Tic-Tac-Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitGameActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn1.setBackground(Color.red);
        } else {
            btn1.setBackground(Color.green);
        }
        gameStart();
        btn1.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn3.setBackground(Color.red);
        } else {
            btn3.setBackground(Color.green);
        }
        gameStart();
        btn3.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn4.setBackground(Color.red);
        } else {
            btn4.setBackground(Color.green);
        }
        gameStart();
        btn4.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn5.setBackground(Color.red);
        } else {
            btn5.setBackground(Color.green);
        }
        gameStart();
        btn5.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn6.setBackground(Color.red);
        } else {
            btn6.setBackground(Color.green);
        }
        gameStart();
        btn6.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn7.setBackground(Color.red);
        } else {
            btn7.setBackground(Color.green);
        }
        gameStart();
        btn7.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn8.setBackground(Color.red);
        } else {
            btn8.setBackground(Color.green);
        }
        gameStart();
        btn8.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(gameMark);
        if (gameMark.equalsIgnoreCase("X")) {
            btn9.setBackground(Color.red);
        } else {
            btn9.setBackground(Color.green);
        }
        gameStart();
        btn9.setEnabled(false);
        gameResult();
    }//GEN-LAST:event_btn9ActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        gameReset();
    }//GEN-LAST:event_newGameActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exitGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newGame;
    private javax.swing.JLabel playerOne;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JLabel playerTwo;
    private javax.swing.JPanel sidePanelLeft;
    private javax.swing.JPanel sidePanelRight;
    // End of variables declaration//GEN-END:variables
}
