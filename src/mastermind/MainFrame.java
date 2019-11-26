/* 
 * Copyright (C) 2019 Matthew Cumbo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package mastermind;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

/**
 * @version January 10, 2019
 * @author Matthew Cumbo
 */
public class MainFrame extends javax.swing.JFrame {
    
    private int answer1;
    private int answer2;
    private int answer3;
    private int answer4;
    private int[] answers = new int[4];
    
    private int response1 = 0;
    private int response2 = 0;
    private int response3 = 0;
    private int response4 = 0;
    private int[] responses = new int[4];
    
    private boolean isRow1 = true;
    private boolean isRow2 = false;
    private boolean isRow3 = false;
    private boolean isRow4 = false;
    private boolean isRow5 = false;
    private boolean isRow6 = false;
    private boolean isRow7 = false;
    private boolean isRow8 = false;
    private boolean isRow9 = false;
    private boolean isRow10 = false;
    
    private boolean beat = false;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initializeAnswers();
        getContentPane().setBackground(Color.DARK_GRAY);
    }

    private void initializeAnswers(){
        answer1 = (int) (Math.random()*6)+1;
        answer2 = (int) (Math.random()*6)+1;
        answer3 = (int) (Math.random()*6)+1;
        answer4 = (int) (Math.random()*6)+1;
        //System.out.println("Answers: " + answer1 + ", " + answer2 + ", " + answer3 + ", " + answer4);
        answers[0] = answer1;
        answers[1] = answer2;
        answers[2] = answer3;
        answers[3] = answer4;
    }
    
    private void initializeResponses(){
        response1 = 0;
        response2 = 0;
        response3 = 0;
        response4 = 0;
    }
    
    private void initializePegsAndBoxes(){
        row1peg1.setBackground(Color.black);
        row1peg2.setBackground(Color.black);
        row1peg3.setBackground(Color.black);
        row1peg4.setBackground(Color.black);
        row2peg1.setBackground(Color.black);
        row2peg2.setBackground(Color.black);
        row2peg3.setBackground(Color.black);
        row2peg4.setBackground(Color.black);
        row3peg1.setBackground(Color.black);
        row3peg2.setBackground(Color.black);
        row3peg3.setBackground(Color.black);
        row3peg4.setBackground(Color.black);
        row4peg1.setBackground(Color.black);
        row4peg2.setBackground(Color.black);
        row4peg3.setBackground(Color.black);
        row4peg4.setBackground(Color.black);
        row5peg1.setBackground(Color.black);
        row5peg2.setBackground(Color.black);
        row5peg3.setBackground(Color.black);
        row5peg4.setBackground(Color.black);
        row6peg1.setBackground(Color.black);
        row6peg2.setBackground(Color.black);
        row6peg3.setBackground(Color.black);
        row6peg4.setBackground(Color.black);
        row7peg1.setBackground(Color.black);
        row7peg2.setBackground(Color.black);
        row7peg3.setBackground(Color.black);
        row7peg4.setBackground(Color.black);
        row8peg1.setBackground(Color.black);
        row8peg2.setBackground(Color.black);
        row8peg3.setBackground(Color.black);
        row8peg4.setBackground(Color.black);
        row9peg1.setBackground(Color.black);
        row9peg2.setBackground(Color.black);
        row9peg3.setBackground(Color.black);
        row9peg4.setBackground(Color.black);
        row10peg1.setBackground(Color.black);
        row10peg2.setBackground(Color.black);
        row10peg3.setBackground(Color.black);
        row10peg4.setBackground(Color.black);
        
        row1box1.setBackground(Color.gray);
        row2box1.setBackground(Color.gray);
        row3box1.setBackground(Color.gray);
        row4box1.setBackground(Color.gray);
        row5box1.setBackground(Color.gray);
        row6box1.setBackground(Color.gray);
        row7box1.setBackground(Color.gray);
        row8box1.setBackground(Color.gray);
        row9box1.setBackground(Color.gray);
        row10box1.setBackground(Color.gray);
        row1box2.setBackground(Color.gray);
        row2box2.setBackground(Color.gray);
        row3box2.setBackground(Color.gray);
        row4box2.setBackground(Color.gray);
        row5box2.setBackground(Color.gray);
        row6box2.setBackground(Color.gray);
        row7box2.setBackground(Color.gray);
        row8box2.setBackground(Color.gray);
        row9box2.setBackground(Color.gray);
        row10box2.setBackground(Color.gray);
        row1box3.setBackground(Color.gray);
        row2box3.setBackground(Color.gray);
        row3box3.setBackground(Color.gray);
        row4box3.setBackground(Color.gray);
        row5box3.setBackground(Color.gray);
        row6box3.setBackground(Color.gray);
        row7box3.setBackground(Color.gray);
        row8box3.setBackground(Color.gray);
        row9box3.setBackground(Color.gray);
        row10box3.setBackground(Color.gray);
        row1box4.setBackground(Color.gray);
        row2box4.setBackground(Color.gray);
        row3box4.setBackground(Color.gray);
        row4box4.setBackground(Color.gray);
        row5box4.setBackground(Color.gray);
        row6box4.setBackground(Color.gray);
        row7box4.setBackground(Color.gray);
        row8box4.setBackground(Color.gray);
        row9box4.setBackground(Color.gray);
        row10box4.setBackground(Color.gray);
    }
   
    private int getHits(){
        int total = 0;
        if(responses[0]==answers[0]) total++;
        if(responses[1]==answers[1]) total++;
        if(responses[2]==answers[2]) total++;
        if(responses[3]==answers[3]) total++;
        return total;
    }
    
    private int getMisses(){
        int total = 0;
        int pos1 = answers[0];
        int pos2 = answers[1];
        int pos3 = answers[2];
        int pos4 = answers[3];
        int res1 = responses[0];
        int res2 = responses[1];
        int res3 = responses[2];
        int res4 = responses[3];
        if(responses[0]==answers[0]){ 
            answers[0]=0;
            responses[0]=-1;
        }
        if(responses[1]==answers[1]){
            answers[1]=0;
            responses[1]=-1;
        }
        if(responses[2]==answers[2]){
            answers[2]=0;
            responses[2]=-1;
        }
        if(responses[3]==answers[3]){
            answers[3]=0;
            responses[3]=-1;
        }
        for(int i=0; i<responses.length; i++){
            for(int j=0; j<answers.length; j++){
                if(responses[i]==answers[j] && j!=i){
                    total++;
                    answers[j] = 0;
                    break;
                }
            }
        }
        answers[0] = pos1;
        answers[1] = pos2;
        answers[2] = pos3;
        answers[3] = pos4;
        responses[0] = res1;
        responses[1] = res2;
        responses[2] = res3;
        responses[3] = res4;
        return total;
    }
    
    private void fillPegs(int pos){
        ArrayList<JButton> pegs = new ArrayList<>();
        int hits = getHits();
        int miss = getMisses();
        //System.out.println("Total misses: " + miss + "\nTotal hits: " + hits);
        int pro = 0;
        switch(pos){
            case 1:
                pegs.add(row1peg1);
                pegs.add(row1peg2);
                pegs.add(row1peg3);
                pegs.add(row1peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 2:
                pegs.add(row2peg1);
                pegs.add(row2peg2);
                pegs.add(row2peg3);
                pegs.add(row2peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 3:
                pegs.add(row3peg1);
                pegs.add(row3peg2);
                pegs.add(row3peg3);
                pegs.add(row3peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 4:
                pegs.add(row4peg1);
                pegs.add(row4peg2);
                pegs.add(row4peg3);
                pegs.add(row4peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 5:
                pegs.add(row5peg1);
                pegs.add(row5peg2);
                pegs.add(row5peg3);
                pegs.add(row5peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 6:
                pegs.add(row6peg1);
                pegs.add(row6peg2);
                pegs.add(row6peg3);
                pegs.add(row6peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 7:
                pegs.add(row7peg1);
                pegs.add(row7peg2);
                pegs.add(row7peg3);
                pegs.add(row7peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 8:
                pegs.add(row8peg1);
                pegs.add(row8peg2);
                pegs.add(row8peg3);
                pegs.add(row8peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 9:
                pegs.add(row9peg1);
                pegs.add(row9peg2);
                pegs.add(row9peg3);
                pegs.add(row9peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
            case 10:
                pegs.add(row10peg1);
                pegs.add(row10peg2);
                pegs.add(row10peg3);
                pegs.add(row10peg4);
                for(int i=0; i<hits; i++){
                    if(pro<4) pegs.get(i).setBackground(Color.red);
                    pro++;
                }
                for(int i=0; i<miss; i++){
                    if(pro<4) pegs.get(pro).setBackground(Color.white);
                    pro++;
                }
                break;
        }
        
    }
    
    private String getColor(int num){
        switch(num){
            case 1:
                return "Black";
            case 2:
                return "Blue";
            case 3:
                return "Green";
            case 4:
                return "Red";
            case 5:
                return "White";
            case 6:
                return "Yellow";
            default:
                return "Null";
        }
    }
    
    private void displayEnd(){
        beat = true;
        JOptionPane.showMessageDialog(null, "You have cracked the code successfully.", "You win!", JOptionPane.INFORMATION_MESSAGE);
        btnBlack.setEnabled(false);
        btnBlue.setEnabled(false);
        btnGreen.setEnabled(false);
        btnRed.setEnabled(false);
        btnWhite.setEnabled(false);
        btnYellow.setEnabled(false);
    }
    /**
     * Action for the color buttons
     * @param w the color to set the box to
     * @param n the value of the response corresponding to the color
     */
    private void performColor(Color w, int n){
        if(isRow1){
            if(row1box1.getBackground()==Color.gray){
                row1box1.setBackground(w);
                response1 = n;
            }
            else if(row1box2.getBackground()==Color.gray){
                row1box2.setBackground(w);
                response2 = n;
            }
            else if(row1box3.getBackground()==Color.gray){
                row1box3.setBackground(w);
                response3 = n;
            }
            else if(row1box4.getBackground()==Color.gray){
                row1box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow2){
            if(row2box1.getBackground()==Color.gray){
                row2box1.setBackground(w);
                response1 = n;
            }
            else if(row2box2.getBackground()==Color.gray){
                row2box2.setBackground(w);
                response2 = n;
            }
            else if(row2box3.getBackground()==Color.gray){
                row2box3.setBackground(w);
                response3 = n;
            }
            else if(row2box4.getBackground()==Color.gray){
                row2box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow3){
            if(row3box1.getBackground()==Color.gray){
                row3box1.setBackground(w);
                response1 = n;
            }
            else if(row3box2.getBackground()==Color.gray){
                row3box2.setBackground(w);
                response2 = n;
            }
            else if(row3box3.getBackground()==Color.gray){
                row3box3.setBackground(w);
                response3 = n;
            }
            else if(row3box4.getBackground()==Color.gray){
                row3box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow4){
            if(row4box1.getBackground()==Color.gray){
                row4box1.setBackground(w);
                response1 = n;
            }
            else if(row4box2.getBackground()==Color.gray){
                row4box2.setBackground(w);
                response2 = n;
            }
            else if(row4box3.getBackground()==Color.gray){
                row4box3.setBackground(w);
                response3 = n;
            }
            else if(row4box4.getBackground()==Color.gray){
                row4box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow5){
            if(row5box1.getBackground()==Color.gray){
                row5box1.setBackground(w);
                response1 = n;
            }
            else if(row5box2.getBackground()==Color.gray){
                row5box2.setBackground(w);
                response2 = n;
            }
            else if(row5box3.getBackground()==Color.gray){
                row5box3.setBackground(w);
                response3 = n;
            }
            else if(row5box4.getBackground()==Color.gray){
                row5box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow6){
            if(row6box1.getBackground()==Color.gray){
                row6box1.setBackground(w);
                response1 = n;
            }
            else if(row6box2.getBackground()==Color.gray){
                row6box2.setBackground(w);
                response2 = n;
            }
            else if(row6box3.getBackground()==Color.gray){
                row6box3.setBackground(w);
                response3 = n;
            }
            else if(row6box4.getBackground()==Color.gray){
                row6box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow7){
            if(row7box1.getBackground()==Color.gray){
                row7box1.setBackground(w);
                response1 = n;
            }
            else if(row7box2.getBackground()==Color.gray){
                row7box2.setBackground(w);
                response2 = n;
            }
            else if(row7box3.getBackground()==Color.gray){
                row7box3.setBackground(w);
                response3 = n;
            }
            else if(row7box4.getBackground()==Color.gray){
                row7box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow8){
            if(row8box1.getBackground()==Color.gray){
                row8box1.setBackground(w);
                response1 = n;
            }
            else if(row8box2.getBackground()==Color.gray){
                row8box2.setBackground(w);
                response2 = n;
            }
            else if(row8box3.getBackground()==Color.gray){
                row8box3.setBackground(w);
                response3 = n;
            }
            else if(row8box4.getBackground()==Color.gray){
                row8box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow9){
            if(row9box1.getBackground()==Color.gray){
                row9box1.setBackground(w);
                response1 = n;
            }
            else if(row9box2.getBackground()==Color.gray){
                row9box2.setBackground(w);
                response2 = n;
            }
            else if(row9box3.getBackground()==Color.gray){
                row9box3.setBackground(w);
                response3 = n;
            }
            else if(row9box4.getBackground()==Color.gray){
                row9box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
            }
        }
        if(isRow10){
            if(row10box1.getBackground()==Color.gray){
                row10box1.setBackground(w);
                response1 = n;
            }
            else if(row10box2.getBackground()==Color.gray){
                row10box2.setBackground(w);
                response2 = n;
            }
            else if(row10box3.getBackground()==Color.gray){
                row10box3.setBackground(w);
                response3 = n;
            }
            else if(row10box4.getBackground()==Color.gray){
                row10box4.setBackground(w);
                response4 = n;
                btnGo.setEnabled(true);
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

        btnWhite = new javax.swing.JButton();
        btnBlack = new javax.swing.JButton();
        btnRed = new javax.swing.JButton();
        btnYellow = new javax.swing.JButton();
        btnBlue = new javax.swing.JButton();
        btnGreen = new javax.swing.JButton();
        row1box4 = new javax.swing.JButton();
        row1box1 = new javax.swing.JButton();
        row1box2 = new javax.swing.JButton();
        row1box3 = new javax.swing.JButton();
        row2box4 = new javax.swing.JButton();
        row2box1 = new javax.swing.JButton();
        row2box2 = new javax.swing.JButton();
        row2box3 = new javax.swing.JButton();
        row3box4 = new javax.swing.JButton();
        row3box1 = new javax.swing.JButton();
        row3box2 = new javax.swing.JButton();
        row3box3 = new javax.swing.JButton();
        row4box4 = new javax.swing.JButton();
        row4box1 = new javax.swing.JButton();
        row4box2 = new javax.swing.JButton();
        row4box3 = new javax.swing.JButton();
        row5box4 = new javax.swing.JButton();
        row5box1 = new javax.swing.JButton();
        row5box2 = new javax.swing.JButton();
        row5box3 = new javax.swing.JButton();
        row6box4 = new javax.swing.JButton();
        row6box1 = new javax.swing.JButton();
        row6box2 = new javax.swing.JButton();
        row6box3 = new javax.swing.JButton();
        row7box4 = new javax.swing.JButton();
        row7box1 = new javax.swing.JButton();
        row7box2 = new javax.swing.JButton();
        row7box3 = new javax.swing.JButton();
        row8box4 = new javax.swing.JButton();
        row8box1 = new javax.swing.JButton();
        row8box2 = new javax.swing.JButton();
        row8box3 = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        row1peg4 = new javax.swing.JButton();
        row1peg1 = new javax.swing.JButton();
        row1peg2 = new javax.swing.JButton();
        row1peg3 = new javax.swing.JButton();
        row2peg4 = new javax.swing.JButton();
        row2peg1 = new javax.swing.JButton();
        row2peg2 = new javax.swing.JButton();
        row2peg3 = new javax.swing.JButton();
        row3peg4 = new javax.swing.JButton();
        row3peg1 = new javax.swing.JButton();
        row3peg2 = new javax.swing.JButton();
        row3peg3 = new javax.swing.JButton();
        row4peg4 = new javax.swing.JButton();
        row4peg1 = new javax.swing.JButton();
        row4peg2 = new javax.swing.JButton();
        row4peg3 = new javax.swing.JButton();
        row5peg4 = new javax.swing.JButton();
        row5peg1 = new javax.swing.JButton();
        row5peg2 = new javax.swing.JButton();
        row5peg3 = new javax.swing.JButton();
        row6peg4 = new javax.swing.JButton();
        row6peg1 = new javax.swing.JButton();
        row6peg2 = new javax.swing.JButton();
        row6peg3 = new javax.swing.JButton();
        row7peg4 = new javax.swing.JButton();
        row7peg1 = new javax.swing.JButton();
        row7peg2 = new javax.swing.JButton();
        row7peg3 = new javax.swing.JButton();
        row8peg4 = new javax.swing.JButton();
        row8peg1 = new javax.swing.JButton();
        row8peg2 = new javax.swing.JButton();
        row8peg3 = new javax.swing.JButton();
        row1arrow = new javax.swing.JLabel();
        row8arrow = new javax.swing.JLabel();
        row7arrow = new javax.swing.JLabel();
        row6arrow = new javax.swing.JLabel();
        row5arrow = new javax.swing.JLabel();
        row4arrow = new javax.swing.JLabel();
        row3arrow = new javax.swing.JLabel();
        row2arrow = new javax.swing.JLabel();
        row7box5 = new javax.swing.JButton();
        row7box6 = new javax.swing.JButton();
        row7box7 = new javax.swing.JButton();
        row7box8 = new javax.swing.JButton();
        row8box5 = new javax.swing.JButton();
        row8box6 = new javax.swing.JButton();
        row8box7 = new javax.swing.JButton();
        row8box8 = new javax.swing.JButton();
        row7peg5 = new javax.swing.JButton();
        row7peg6 = new javax.swing.JButton();
        row7peg7 = new javax.swing.JButton();
        row7peg8 = new javax.swing.JButton();
        row8peg5 = new javax.swing.JButton();
        row8peg6 = new javax.swing.JButton();
        row8peg7 = new javax.swing.JButton();
        row8peg8 = new javax.swing.JButton();
        row8arrow1 = new javax.swing.JLabel();
        row7arrow1 = new javax.swing.JLabel();
        row9box4 = new javax.swing.JButton();
        row9box1 = new javax.swing.JButton();
        row9box2 = new javax.swing.JButton();
        row9box3 = new javax.swing.JButton();
        row10box4 = new javax.swing.JButton();
        row10box1 = new javax.swing.JButton();
        row10box2 = new javax.swing.JButton();
        row10box3 = new javax.swing.JButton();
        row9peg4 = new javax.swing.JButton();
        row9peg1 = new javax.swing.JButton();
        row9peg2 = new javax.swing.JButton();
        row9peg3 = new javax.swing.JButton();
        row10peg4 = new javax.swing.JButton();
        row10peg1 = new javax.swing.JButton();
        row10peg2 = new javax.swing.JButton();
        row10peg3 = new javax.swing.JButton();
        row10arrow = new javax.swing.JLabel();
        row9arrow = new javax.swing.JLabel();
        row7box13 = new javax.swing.JButton();
        row7box14 = new javax.swing.JButton();
        row7box15 = new javax.swing.JButton();
        row7box16 = new javax.swing.JButton();
        row8box13 = new javax.swing.JButton();
        row8box14 = new javax.swing.JButton();
        row8box15 = new javax.swing.JButton();
        row8box16 = new javax.swing.JButton();
        row7peg13 = new javax.swing.JButton();
        row7peg14 = new javax.swing.JButton();
        row7peg15 = new javax.swing.JButton();
        row7peg16 = new javax.swing.JButton();
        row8peg13 = new javax.swing.JButton();
        row8peg14 = new javax.swing.JButton();
        row8peg15 = new javax.swing.JButton();
        row8peg16 = new javax.swing.JButton();
        row8arrow3 = new javax.swing.JLabel();
        row7arrow3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGame = new javax.swing.JMenu();
        itmNewGame = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mastermind");
        setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("Mastermindlogo.png")));
        setResizable(false);

        btnWhite.setBackground(java.awt.Color.white);
        btnWhite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWhite.setFocusable(false);
        btnWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        btnBlack.setBackground(java.awt.Color.black);
        btnBlack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlack.setFocusable(false);
        btnBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlackActionPerformed(evt);
            }
        });

        btnRed.setBackground(java.awt.Color.red);
        btnRed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRed.setFocusable(false);
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });

        btnYellow.setBackground(java.awt.Color.yellow);
        btnYellow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYellow.setFocusable(false);
        btnYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowActionPerformed(evt);
            }
        });

        btnBlue.setBackground(java.awt.Color.blue);
        btnBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlue.setFocusable(false);
        btnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlueActionPerformed(evt);
            }
        });

        btnGreen.setBackground(java.awt.Color.green);
        btnGreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGreen.setFocusable(false);
        btnGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreenActionPerformed(evt);
            }
        });

        row1box4.setBackground(java.awt.Color.gray);
        row1box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row1box4.setEnabled(false);

        row1box1.setBackground(java.awt.Color.gray);
        row1box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row1box1.setEnabled(false);

        row1box2.setBackground(java.awt.Color.gray);
        row1box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row1box2.setEnabled(false);

        row1box3.setBackground(java.awt.Color.gray);
        row1box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row1box3.setEnabled(false);

        row2box4.setBackground(java.awt.Color.gray);
        row2box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row2box4.setEnabled(false);

        row2box1.setBackground(java.awt.Color.gray);
        row2box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row2box1.setEnabled(false);

        row2box2.setBackground(java.awt.Color.gray);
        row2box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row2box2.setEnabled(false);

        row2box3.setBackground(java.awt.Color.gray);
        row2box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row2box3.setEnabled(false);

        row3box4.setBackground(java.awt.Color.gray);
        row3box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row3box4.setEnabled(false);

        row3box1.setBackground(java.awt.Color.gray);
        row3box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row3box1.setEnabled(false);

        row3box2.setBackground(java.awt.Color.gray);
        row3box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row3box2.setEnabled(false);

        row3box3.setBackground(java.awt.Color.gray);
        row3box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row3box3.setEnabled(false);

        row4box4.setBackground(java.awt.Color.gray);
        row4box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row4box4.setEnabled(false);

        row4box1.setBackground(java.awt.Color.gray);
        row4box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row4box1.setEnabled(false);

        row4box2.setBackground(java.awt.Color.gray);
        row4box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row4box2.setEnabled(false);

        row4box3.setBackground(java.awt.Color.gray);
        row4box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row4box3.setEnabled(false);

        row5box4.setBackground(java.awt.Color.gray);
        row5box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row5box4.setEnabled(false);

        row5box1.setBackground(java.awt.Color.gray);
        row5box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row5box1.setEnabled(false);

        row5box2.setBackground(java.awt.Color.gray);
        row5box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row5box2.setEnabled(false);

        row5box3.setBackground(java.awt.Color.gray);
        row5box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row5box3.setEnabled(false);

        row6box4.setBackground(java.awt.Color.gray);
        row6box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row6box4.setEnabled(false);

        row6box1.setBackground(java.awt.Color.gray);
        row6box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row6box1.setEnabled(false);

        row6box2.setBackground(java.awt.Color.gray);
        row6box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row6box2.setEnabled(false);

        row6box3.setBackground(java.awt.Color.gray);
        row6box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row6box3.setEnabled(false);

        row7box4.setBackground(java.awt.Color.gray);
        row7box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box4.setEnabled(false);

        row7box1.setBackground(java.awt.Color.gray);
        row7box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box1.setEnabled(false);

        row7box2.setBackground(java.awt.Color.gray);
        row7box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box2.setEnabled(false);

        row7box3.setBackground(java.awt.Color.gray);
        row7box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box3.setEnabled(false);

        row8box4.setBackground(java.awt.Color.gray);
        row8box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box4.setEnabled(false);

        row8box1.setBackground(java.awt.Color.gray);
        row8box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box1.setEnabled(false);

        row8box2.setBackground(java.awt.Color.gray);
        row8box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box2.setEnabled(false);

        row8box3.setBackground(java.awt.Color.gray);
        row8box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box3.setEnabled(false);

        btnGo.setText("Go");
        btnGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGo.setEnabled(false);
        btnGo.setFocusable(false);
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnUndo.setText("Undo");
        btnUndo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUndo.setEnabled(false);
        btnUndo.setFocusable(false);
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        row1peg4.setBackground(java.awt.Color.black);
        row1peg4.setBorder(null);
        row1peg4.setEnabled(false);

        row1peg1.setBackground(java.awt.Color.black);
        row1peg1.setBorder(null);
        row1peg1.setEnabled(false);

        row1peg2.setBackground(java.awt.Color.black);
        row1peg2.setBorder(null);
        row1peg2.setEnabled(false);

        row1peg3.setBackground(java.awt.Color.black);
        row1peg3.setBorder(null);
        row1peg3.setEnabled(false);

        row2peg4.setBackground(java.awt.Color.black);
        row2peg4.setBorder(null);
        row2peg4.setEnabled(false);

        row2peg1.setBackground(java.awt.Color.black);
        row2peg1.setBorder(null);
        row2peg1.setEnabled(false);

        row2peg2.setBackground(java.awt.Color.black);
        row2peg2.setBorder(null);
        row2peg2.setEnabled(false);

        row2peg3.setBackground(java.awt.Color.black);
        row2peg3.setBorder(null);
        row2peg3.setEnabled(false);

        row3peg4.setBackground(java.awt.Color.black);
        row3peg4.setBorder(null);
        row3peg4.setEnabled(false);

        row3peg1.setBackground(java.awt.Color.black);
        row3peg1.setBorder(null);
        row3peg1.setEnabled(false);

        row3peg2.setBackground(java.awt.Color.black);
        row3peg2.setBorder(null);
        row3peg2.setEnabled(false);

        row3peg3.setBackground(java.awt.Color.black);
        row3peg3.setBorder(null);
        row3peg3.setEnabled(false);

        row4peg4.setBackground(java.awt.Color.black);
        row4peg4.setBorder(null);
        row4peg4.setEnabled(false);

        row4peg1.setBackground(java.awt.Color.black);
        row4peg1.setBorder(null);
        row4peg1.setEnabled(false);

        row4peg2.setBackground(java.awt.Color.black);
        row4peg2.setBorder(null);
        row4peg2.setEnabled(false);

        row4peg3.setBackground(java.awt.Color.black);
        row4peg3.setBorder(null);
        row4peg3.setEnabled(false);

        row5peg4.setBackground(java.awt.Color.black);
        row5peg4.setBorder(null);
        row5peg4.setEnabled(false);

        row5peg1.setBackground(java.awt.Color.black);
        row5peg1.setBorder(null);
        row5peg1.setEnabled(false);

        row5peg2.setBackground(java.awt.Color.black);
        row5peg2.setBorder(null);
        row5peg2.setEnabled(false);

        row5peg3.setBackground(java.awt.Color.black);
        row5peg3.setBorder(null);
        row5peg3.setEnabled(false);

        row6peg4.setBackground(java.awt.Color.black);
        row6peg4.setBorder(null);
        row6peg4.setEnabled(false);

        row6peg1.setBackground(java.awt.Color.black);
        row6peg1.setBorder(null);
        row6peg1.setEnabled(false);

        row6peg2.setBackground(java.awt.Color.black);
        row6peg2.setBorder(null);
        row6peg2.setEnabled(false);

        row6peg3.setBackground(java.awt.Color.black);
        row6peg3.setBorder(null);
        row6peg3.setEnabled(false);

        row7peg4.setBackground(java.awt.Color.black);
        row7peg4.setBorder(null);
        row7peg4.setEnabled(false);

        row7peg1.setBackground(java.awt.Color.black);
        row7peg1.setBorder(null);
        row7peg1.setEnabled(false);

        row7peg2.setBackground(java.awt.Color.black);
        row7peg2.setBorder(null);
        row7peg2.setEnabled(false);

        row7peg3.setBackground(java.awt.Color.black);
        row7peg3.setBorder(null);
        row7peg3.setEnabled(false);

        row8peg4.setBackground(java.awt.Color.black);
        row8peg4.setBorder(null);
        row8peg4.setEnabled(false);

        row8peg1.setBackground(java.awt.Color.black);
        row8peg1.setBorder(null);
        row8peg1.setEnabled(false);

        row8peg2.setBackground(java.awt.Color.black);
        row8peg2.setBorder(null);
        row8peg2.setEnabled(false);

        row8peg3.setBackground(java.awt.Color.black);
        row8peg3.setBorder(null);
        row8peg3.setEnabled(false);

        row1arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row1arrow.setForeground(new java.awt.Color(255, 255, 255));
        row1arrow.setText("-->");

        row8arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row8arrow.setForeground(new java.awt.Color(255, 255, 255));

        row7arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row7arrow.setForeground(new java.awt.Color(255, 255, 255));

        row6arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row6arrow.setForeground(new java.awt.Color(255, 255, 255));

        row5arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row5arrow.setForeground(new java.awt.Color(255, 255, 255));

        row4arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row4arrow.setForeground(new java.awt.Color(255, 255, 255));

        row3arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row3arrow.setForeground(new java.awt.Color(255, 255, 255));

        row2arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row2arrow.setForeground(new java.awt.Color(255, 255, 255));

        row7box5.setBackground(java.awt.Color.gray);
        row7box5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box5.setEnabled(false);

        row7box6.setBackground(java.awt.Color.gray);
        row7box6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box6.setEnabled(false);

        row7box7.setBackground(java.awt.Color.gray);
        row7box7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box7.setEnabled(false);

        row7box8.setBackground(java.awt.Color.gray);
        row7box8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box8.setEnabled(false);

        row8box5.setBackground(java.awt.Color.gray);
        row8box5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box5.setEnabled(false);

        row8box6.setBackground(java.awt.Color.gray);
        row8box6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box6.setEnabled(false);

        row8box7.setBackground(java.awt.Color.gray);
        row8box7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box7.setEnabled(false);

        row8box8.setBackground(java.awt.Color.gray);
        row8box8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box8.setEnabled(false);

        row7peg5.setBackground(java.awt.Color.black);
        row7peg5.setBorder(null);
        row7peg5.setEnabled(false);

        row7peg6.setBackground(java.awt.Color.black);
        row7peg6.setBorder(null);
        row7peg6.setEnabled(false);

        row7peg7.setBackground(java.awt.Color.black);
        row7peg7.setBorder(null);
        row7peg7.setEnabled(false);

        row7peg8.setBackground(java.awt.Color.black);
        row7peg8.setBorder(null);
        row7peg8.setEnabled(false);

        row8peg5.setBackground(java.awt.Color.black);
        row8peg5.setBorder(null);
        row8peg5.setEnabled(false);

        row8peg6.setBackground(java.awt.Color.black);
        row8peg6.setBorder(null);
        row8peg6.setEnabled(false);

        row8peg7.setBackground(java.awt.Color.black);
        row8peg7.setBorder(null);
        row8peg7.setEnabled(false);

        row8peg8.setBackground(java.awt.Color.black);
        row8peg8.setBorder(null);
        row8peg8.setEnabled(false);

        row8arrow1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row8arrow1.setForeground(new java.awt.Color(255, 255, 255));

        row7arrow1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row7arrow1.setForeground(new java.awt.Color(255, 255, 255));

        row9box4.setBackground(java.awt.Color.gray);
        row9box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row9box4.setEnabled(false);

        row9box1.setBackground(java.awt.Color.gray);
        row9box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row9box1.setEnabled(false);

        row9box2.setBackground(java.awt.Color.gray);
        row9box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row9box2.setEnabled(false);

        row9box3.setBackground(java.awt.Color.gray);
        row9box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row9box3.setEnabled(false);

        row10box4.setBackground(java.awt.Color.gray);
        row10box4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row10box4.setEnabled(false);

        row10box1.setBackground(java.awt.Color.gray);
        row10box1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row10box1.setEnabled(false);

        row10box2.setBackground(java.awt.Color.gray);
        row10box2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row10box2.setEnabled(false);

        row10box3.setBackground(java.awt.Color.gray);
        row10box3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row10box3.setEnabled(false);

        row9peg4.setBackground(java.awt.Color.black);
        row9peg4.setBorder(null);
        row9peg4.setEnabled(false);

        row9peg1.setBackground(java.awt.Color.black);
        row9peg1.setBorder(null);
        row9peg1.setEnabled(false);

        row9peg2.setBackground(java.awt.Color.black);
        row9peg2.setBorder(null);
        row9peg2.setEnabled(false);

        row9peg3.setBackground(java.awt.Color.black);
        row9peg3.setBorder(null);
        row9peg3.setEnabled(false);

        row10peg4.setBackground(java.awt.Color.black);
        row10peg4.setBorder(null);
        row10peg4.setEnabled(false);

        row10peg1.setBackground(java.awt.Color.black);
        row10peg1.setBorder(null);
        row10peg1.setEnabled(false);

        row10peg2.setBackground(java.awt.Color.black);
        row10peg2.setBorder(null);
        row10peg2.setEnabled(false);

        row10peg3.setBackground(java.awt.Color.black);
        row10peg3.setBorder(null);
        row10peg3.setEnabled(false);

        row10arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row10arrow.setForeground(new java.awt.Color(255, 255, 255));

        row9arrow.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row9arrow.setForeground(new java.awt.Color(255, 255, 255));

        row7box13.setBackground(java.awt.Color.gray);
        row7box13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box13.setEnabled(false);

        row7box14.setBackground(java.awt.Color.gray);
        row7box14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box14.setEnabled(false);

        row7box15.setBackground(java.awt.Color.gray);
        row7box15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box15.setEnabled(false);

        row7box16.setBackground(java.awt.Color.gray);
        row7box16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row7box16.setEnabled(false);

        row8box13.setBackground(java.awt.Color.gray);
        row8box13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box13.setEnabled(false);

        row8box14.setBackground(java.awt.Color.gray);
        row8box14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box14.setEnabled(false);

        row8box15.setBackground(java.awt.Color.gray);
        row8box15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box15.setEnabled(false);

        row8box16.setBackground(java.awt.Color.gray);
        row8box16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        row8box16.setEnabled(false);

        row7peg13.setBackground(java.awt.Color.black);
        row7peg13.setBorder(null);
        row7peg13.setEnabled(false);

        row7peg14.setBackground(java.awt.Color.black);
        row7peg14.setBorder(null);
        row7peg14.setEnabled(false);

        row7peg15.setBackground(java.awt.Color.black);
        row7peg15.setBorder(null);
        row7peg15.setEnabled(false);

        row7peg16.setBackground(java.awt.Color.black);
        row7peg16.setBorder(null);
        row7peg16.setEnabled(false);

        row8peg13.setBackground(java.awt.Color.black);
        row8peg13.setBorder(null);
        row8peg13.setEnabled(false);

        row8peg14.setBackground(java.awt.Color.black);
        row8peg14.setBorder(null);
        row8peg14.setEnabled(false);

        row8peg15.setBackground(java.awt.Color.black);
        row8peg15.setBorder(null);
        row8peg15.setEnabled(false);

        row8peg16.setBackground(java.awt.Color.black);
        row8peg16.setBorder(null);
        row8peg16.setEnabled(false);

        row8arrow3.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row8arrow3.setForeground(new java.awt.Color(255, 255, 255));

        row7arrow3.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        row7arrow3.setForeground(new java.awt.Color(255, 255, 255));

        mnuGame.setText("Game");

        itmNewGame.setText("New Game");
        itmNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNewGameActionPerformed(evt);
            }
        });
        mnuGame.add(itmNewGame);

        jMenuBar1.add(mnuGame);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8arrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row10peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7arrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row9box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row9box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row9peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8arrow1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7arrow1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(row6arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row6box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row6box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row6box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row6box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row6peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row6peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row6peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row6peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(row5arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row5box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row5box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row5box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row5box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row5peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row5peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row5peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row5peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(row4arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row4box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row4box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row4box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row4box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row4peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row4peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row4peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row4peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(row3arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row3box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row3box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row3box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row3box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row3peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row3peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row3peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row3peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(row2arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row2box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row2box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row2box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row2box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row2peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row2peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row2peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row2peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(row1arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row1box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row1box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row1box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(row1box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row1peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row1peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row1peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(row1peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row10arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(row8arrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row10peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row10peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row7arrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(row9arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row9box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row9box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row9peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row9peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row8arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(row8arrow1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8box5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row8peg5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row8peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row7arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(row7arrow1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7box5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(row7peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(row7peg5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row6arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row6box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row6box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row6box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row6box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row6peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row6peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row6peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row6peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row5arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row5box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row5box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row5box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row5box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row5peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row5peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row5peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row5peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row4arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row4box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row4box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row4box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row4box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row4peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row4peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row4peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row4peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row3arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row3box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row3box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row3box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row3box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row3peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row3peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row3peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row3peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row2arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row2box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row2box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row2box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row2box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row2peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row2peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row2peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row2peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(row1arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row1box1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row1box2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row1box3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(row1box4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row1peg1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row1peg2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row1peg3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(row1peg4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYellowActionPerformed
        performColor(Color.yellow, 6);
        btnUndo.setEnabled(true);
    }//GEN-LAST:event_btnYellowActionPerformed

    private void btnBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlackActionPerformed
        performColor(Color.black, 1);
        btnUndo.setEnabled(true);
    }//GEN-LAST:event_btnBlackActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        if(isRow1){
            row1box1.setBackground(Color.gray);
            row1box2.setBackground(Color.gray);
            row1box3.setBackground(Color.gray);
            row1box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow2){
            row2box1.setBackground(Color.gray);
            row2box2.setBackground(Color.gray);
            row2box3.setBackground(Color.gray);
            row2box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow3){
            row3box1.setBackground(Color.gray);
            row3box2.setBackground(Color.gray);
            row3box3.setBackground(Color.gray);
            row3box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow4){
            row4box1.setBackground(Color.gray);
            row4box2.setBackground(Color.gray);
            row4box3.setBackground(Color.gray);
            row4box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow5){
            row5box1.setBackground(Color.gray);
            row5box2.setBackground(Color.gray);
            row5box3.setBackground(Color.gray);
            row5box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow6){
            row6box1.setBackground(Color.gray);
            row6box2.setBackground(Color.gray);
            row6box3.setBackground(Color.gray);
            row6box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow7){
            row7box1.setBackground(Color.gray);
            row7box2.setBackground(Color.gray);
            row7box3.setBackground(Color.gray);
            row7box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow8){
            row8box1.setBackground(Color.gray);
            row8box2.setBackground(Color.gray);
            row8box3.setBackground(Color.gray);
            row8box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow9){
            row9box1.setBackground(Color.gray);
            row9box2.setBackground(Color.gray);
            row9box3.setBackground(Color.gray);
            row9box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        if(isRow10){
            row10box1.setBackground(Color.gray);
            row10box2.setBackground(Color.gray);
            row10box3.setBackground(Color.gray);
            row10box4.setBackground(Color.gray);
            initializeResponses();
            btnGo.setEnabled(false);
        }
        btnUndo.setEnabled(false);
    }//GEN-LAST:event_btnUndoActionPerformed

    private void btnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlueActionPerformed
        performColor(Color.blue, 2);
        btnUndo.setEnabled(true);
    }//GEN-LAST:event_btnBlueActionPerformed

    private void btnGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGreenActionPerformed
        performColor(Color.green, 3);
        btnUndo.setEnabled(true);
    }//GEN-LAST:event_btnGreenActionPerformed

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        performColor(Color.red, 4);
        btnUndo.setEnabled(true);
    }//GEN-LAST:event_btnRedActionPerformed

    private void btnWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhiteActionPerformed
        performColor(Color.white, 5);
        btnUndo.setEnabled(true);
    }//GEN-LAST:event_btnWhiteActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        responses[0] = response1;
        responses[1] = response2;
        responses[2] = response3;
        responses[3] = response4;
        btnUndo.setEnabled(false);
        if(isRow1){
            fillPegs(1);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow1 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow1 = false;
            isRow2 = true;
            row1arrow.setText("");
            row2arrow.setText("-->");
        }
        else if(isRow2){
            fillPegs(2);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow2 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow2 = false;
            isRow3 = true;
            row2arrow.setText("");
            row3arrow.setText("-->");
        }
        else if(isRow3){
            fillPegs(3);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow3 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow3 = false;
            isRow4 = true;
            row3arrow.setText("");
            row4arrow.setText("-->");
        }
        else if(isRow4){
            fillPegs(4);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow4 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow4 = false;
            isRow5 = true;
            row4arrow.setText("");
            row5arrow.setText("-->");
        }
        else if(isRow5){
            fillPegs(5);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow5 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow5 = false;
            isRow6 = true;
            row5arrow.setText("");
            row6arrow.setText("-->");
        }
        else if(isRow6){
            fillPegs(6);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow6 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow6 = false;
            isRow7 = true;
            row6arrow.setText("");
            row7arrow.setText("-->");
        }
        else if(isRow7){
            fillPegs(7);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow7 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow7 = false;
            isRow8 = true;
            row7arrow.setText("");
            row8arrow.setText("-->");
        }
        else if(isRow8){
            fillPegs(8);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow8 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow8 = false;
            isRow9 = true;
            row8arrow.setText("");
            row9arrow.setText("-->");
        }
        else if(isRow9){
            fillPegs(9);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow9 = false;
                displayEnd();
                return;
            }
            initializeResponses();
            isRow9 = false;
            isRow10 = true;
            row9arrow.setText("");
            row10arrow.setText("-->");
        }
        else if(isRow10){
            fillPegs(10);
            btnGo.setEnabled(false);
            if(getHits()==4){
                isRow10 = false;
                displayEnd();
            }
            else{
                initializeResponses();
                isRow10 = false;
                btnBlack.setEnabled(false);
                btnBlue.setEnabled(false);
                btnGreen.setEnabled(false);
                btnRed.setEnabled(false);
                btnWhite.setEnabled(false);
                btnYellow.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No more moves available. The code was:\n       " + getColor(answer1) + " " + getColor(answer2) + " " + getColor(answer3) + " " + getColor(answer4), "Game Over", JOptionPane.INFORMATION_MESSAGE);
                beat = true;
            }
        }
    }//GEN-LAST:event_btnGoActionPerformed

    private void itmNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNewGameActionPerformed
        if(!beat) JOptionPane.showMessageDialog(null, "The code was:\n\t" + getColor(answer1) + " " + getColor(answer2) + " " + getColor(answer3) + " " + getColor(answer4), "Game Over", JOptionPane.INFORMATION_MESSAGE);
        beat = false;
        isRow1 = true;
        isRow2 = false;
        isRow3 = false;
        isRow4 = false;
        isRow5 = false;
        isRow6 = false;
        isRow7 = false;
        isRow8 = false;
        isRow9 = false;
        isRow10 = false;
        initializeResponses();
        initializePegsAndBoxes();
        initializeAnswers();
        btnGo.setEnabled(false);
        btnUndo.setEnabled(false);
        btnBlack.setEnabled(true);
        btnBlue.setEnabled(true);
        btnGreen.setEnabled(true);
        btnRed.setEnabled(true);
        btnWhite.setEnabled(true);
        btnYellow.setEnabled(true);
        row10arrow.setText("");
        row9arrow.setText("");
        row8arrow.setText("");
        row7arrow.setText("");
        row6arrow.setText("");
        row5arrow.setText("");
        row4arrow.setText("");
        row3arrow.setText("");
        row2arrow.setText("");
        row1arrow.setText("-->");
//          new MainFrame().setVisible(true);
//          this.dispose();
    }//GEN-LAST:event_itmNewGameActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlack;
    private javax.swing.JButton btnBlue;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnGreen;
    private javax.swing.JButton btnRed;
    private javax.swing.JButton btnUndo;
    private javax.swing.JButton btnWhite;
    private javax.swing.JButton btnYellow;
    private javax.swing.JMenuItem itmNewGame;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuGame;
    private javax.swing.JLabel row10arrow;
    private javax.swing.JButton row10box1;
    private javax.swing.JButton row10box2;
    private javax.swing.JButton row10box3;
    private javax.swing.JButton row10box4;
    private javax.swing.JButton row10peg1;
    private javax.swing.JButton row10peg2;
    private javax.swing.JButton row10peg3;
    private javax.swing.JButton row10peg4;
    private javax.swing.JLabel row1arrow;
    private javax.swing.JButton row1box1;
    private javax.swing.JButton row1box2;
    private javax.swing.JButton row1box3;
    private javax.swing.JButton row1box4;
    private javax.swing.JButton row1peg1;
    private javax.swing.JButton row1peg2;
    private javax.swing.JButton row1peg3;
    private javax.swing.JButton row1peg4;
    private javax.swing.JLabel row2arrow;
    private javax.swing.JButton row2box1;
    private javax.swing.JButton row2box2;
    private javax.swing.JButton row2box3;
    private javax.swing.JButton row2box4;
    private javax.swing.JButton row2peg1;
    private javax.swing.JButton row2peg2;
    private javax.swing.JButton row2peg3;
    private javax.swing.JButton row2peg4;
    private javax.swing.JLabel row3arrow;
    private javax.swing.JButton row3box1;
    private javax.swing.JButton row3box2;
    private javax.swing.JButton row3box3;
    private javax.swing.JButton row3box4;
    private javax.swing.JButton row3peg1;
    private javax.swing.JButton row3peg2;
    private javax.swing.JButton row3peg3;
    private javax.swing.JButton row3peg4;
    private javax.swing.JLabel row4arrow;
    private javax.swing.JButton row4box1;
    private javax.swing.JButton row4box2;
    private javax.swing.JButton row4box3;
    private javax.swing.JButton row4box4;
    private javax.swing.JButton row4peg1;
    private javax.swing.JButton row4peg2;
    private javax.swing.JButton row4peg3;
    private javax.swing.JButton row4peg4;
    private javax.swing.JLabel row5arrow;
    private javax.swing.JButton row5box1;
    private javax.swing.JButton row5box2;
    private javax.swing.JButton row5box3;
    private javax.swing.JButton row5box4;
    private javax.swing.JButton row5peg1;
    private javax.swing.JButton row5peg2;
    private javax.swing.JButton row5peg3;
    private javax.swing.JButton row5peg4;
    private javax.swing.JLabel row6arrow;
    private javax.swing.JButton row6box1;
    private javax.swing.JButton row6box2;
    private javax.swing.JButton row6box3;
    private javax.swing.JButton row6box4;
    private javax.swing.JButton row6peg1;
    private javax.swing.JButton row6peg2;
    private javax.swing.JButton row6peg3;
    private javax.swing.JButton row6peg4;
    private javax.swing.JLabel row7arrow;
    private javax.swing.JLabel row7arrow1;
    private javax.swing.JLabel row7arrow3;
    private javax.swing.JButton row7box1;
    private javax.swing.JButton row7box13;
    private javax.swing.JButton row7box14;
    private javax.swing.JButton row7box15;
    private javax.swing.JButton row7box16;
    private javax.swing.JButton row7box2;
    private javax.swing.JButton row7box3;
    private javax.swing.JButton row7box4;
    private javax.swing.JButton row7box5;
    private javax.swing.JButton row7box6;
    private javax.swing.JButton row7box7;
    private javax.swing.JButton row7box8;
    private javax.swing.JButton row7peg1;
    private javax.swing.JButton row7peg13;
    private javax.swing.JButton row7peg14;
    private javax.swing.JButton row7peg15;
    private javax.swing.JButton row7peg16;
    private javax.swing.JButton row7peg2;
    private javax.swing.JButton row7peg3;
    private javax.swing.JButton row7peg4;
    private javax.swing.JButton row7peg5;
    private javax.swing.JButton row7peg6;
    private javax.swing.JButton row7peg7;
    private javax.swing.JButton row7peg8;
    private javax.swing.JLabel row8arrow;
    private javax.swing.JLabel row8arrow1;
    private javax.swing.JLabel row8arrow3;
    private javax.swing.JButton row8box1;
    private javax.swing.JButton row8box13;
    private javax.swing.JButton row8box14;
    private javax.swing.JButton row8box15;
    private javax.swing.JButton row8box16;
    private javax.swing.JButton row8box2;
    private javax.swing.JButton row8box3;
    private javax.swing.JButton row8box4;
    private javax.swing.JButton row8box5;
    private javax.swing.JButton row8box6;
    private javax.swing.JButton row8box7;
    private javax.swing.JButton row8box8;
    private javax.swing.JButton row8peg1;
    private javax.swing.JButton row8peg13;
    private javax.swing.JButton row8peg14;
    private javax.swing.JButton row8peg15;
    private javax.swing.JButton row8peg16;
    private javax.swing.JButton row8peg2;
    private javax.swing.JButton row8peg3;
    private javax.swing.JButton row8peg4;
    private javax.swing.JButton row8peg5;
    private javax.swing.JButton row8peg6;
    private javax.swing.JButton row8peg7;
    private javax.swing.JButton row8peg8;
    private javax.swing.JLabel row9arrow;
    private javax.swing.JButton row9box1;
    private javax.swing.JButton row9box2;
    private javax.swing.JButton row9box3;
    private javax.swing.JButton row9box4;
    private javax.swing.JButton row9peg1;
    private javax.swing.JButton row9peg2;
    private javax.swing.JButton row9peg3;
    private javax.swing.JButton row9peg4;
    // End of variables declaration//GEN-END:variables
}
