/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provagit2021;

/**
 *
 * @author aniel
 */
public class ProvaGit2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //First commit
        salute("world!");
        System.out.println("Hello Liz");
        System.out.println("Hello Aniello");
        System.out.println("Hello Universe !");
        salute("branch deleted");
    }
    
    
    public static void salute(String s){
        System.out.println("Hello " + s);
    }
    
}
