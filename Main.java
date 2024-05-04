/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundplay;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author Administrator
 */
public class Main extends javax.swing.JFrame{
    long total_length;
    long pouse;
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    Player player;
    File myFile=null;
    
}