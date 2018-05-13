/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auction;

/**
 *
 * @author Nischal
 */
public class Auction {

    public void AddAuctions(){
    AddAuction add=new AddAuction();
    add.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AddAuctions();
    }
    
}
