/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.horarios;

/**
 *
 * @author helio
 */
public class GradeHorarios {

    /**
     * @param args the command line arguments
     */
    private int grade[][] = new int[4][4];  
    private int aptidao[][] = new int[4][4];
    int ap;
    
    
    public GradeHorarios(){
        this.grade = gerarIndividuo();
        this.ap = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                this.aptidao[i][j]=0;
            }
        }
    }
    
    public static int[][] gerarIndividuo(){
        int novoIndividuo[][] = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int num = (int)(Math.random() * 4 );
                System.out.printf("" + num + " ");
                novoIndividuo[i][j] = num;
            }
            System.out.println("");
        }
        System.out.println("");
        return novoIndividuo;
    }
    
    public void mostraAptidao(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.printf(this.aptidao[i][j]+" ");
          }
            System.out.println("");
        }
        
    }
    
    public void setGrade(int[][] horario){
        this.grade = horario;
    }
    
    public int[][] getGrade(){
        return this.grade;
    }
    public void setAptidao(int valor, int i, int j){
        this.aptidao[i][j] = valor;
    }
    public void atualizaAp(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                ap = ap + aptidao[i][j];
            }
        }
    }
    public int getAp(){
        return this.ap;
    }
    
}
