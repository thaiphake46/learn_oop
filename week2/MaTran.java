package week2;
import java.io.BufferedReader;
import java.io.FileReader;

public class MaTran {
    private int line;
    private int column;
    private int[][] maTran;

    MaTran() {
        this.line = 0;
        this.column = 0;
        this.maTran = new int[10][10];
    }

    //  MaTran(int line,int column,int[][] maTrix){
    //      this.line = line ;  
    //      this.column =  column ;  
    //     //  maTran = maTrix ; 
    //  }
    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setMaTran(int[][] maTran) {
        this.maTran = maTran;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getMaTran() {
        return maTran;
    }

    public void cong(MaTran matran1, MaTran matran2){
        int[][] a = matran1.getMaTran();
        int[][] b = matran2.getMaTran();
        int[][] tong = new int[10][10];
        if((matran1.getLine() == matran2.getLine()) && (matran1.getColumn() == matran2.getColumn())) {
            for(int i = 0; i < matran1.getLine(); i++) {
                for(int j = 0; j < matran1.getColumn(); j++) {
                    tong[i][j] = a[i][j] + b[i][j];
                }
            }
            setLine(matran1.getLine());
            setColumn(matran1.getColumn());
            setMaTran(tong);
        }
        else {
            System.out.println("khong cong dc.");
        }
    }

    // public int[][] congMaTran(MaTran maTrix ) {
        
    //  int[][]  a = this.getMaTran() ; 
    //  int[][] b = maTrix.getMaTran() ;
    //  int[][] tmp = new  int[this.getLine()][this.getColumn()] ; 

    //     for(int i=0;i < this.getLine();i++){
    //         for(int j=0;j< this.getColumn();j++){
    //                 tmp[i][j]  =  a[i][j] + b[i][j] ; 
    //         }
    //     }
    //      return tmp ;  
    // }

    public void hienThiMT() {
        int[][] matran = getMaTran();
        for(int i = 0; i < getLine(); i++) {
            for(int j = 0; j < getColumn(); j++) {
                System.out.printf(" %d ", matran[i][j]);
            }
            System.out.println();
        }
    }

    public void readFromFile(String fileName, int[][] matran) {
        // int n = 0, m = 0;
        // int[][] matran = new int[n][m];
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String hangCot = "";
            String giaTri = "";
            hangCot = br.readLine();
            String[] hc = hangCot.split("\\s+");
            setLine(Integer.parseInt(hc[0]));
            setColumn(Integer.parseInt(hc[1]));
            // this.line = Integer.parseInt(hc[0]);
            // this.column = Integer.parseInt(hc[1]);
            int i = 0;
            while(true) {
                giaTri = br.readLine();
                if(giaTri == null) {
                    break;
                }
                String[] gt = giaTri.split("\\s+");
                for(int j = 0; j < getColumn(); j++) {
                    matran[i][j] = Integer.parseInt(gt[j]);
                }
                i++;
            }
            setMaTran(matran);
            br.close();
            fr.close();
        }
        catch (Exception e) {
            // TODO: handle exception
            
        }

        // for(int i = 0; i < getLine(); i++) {
        //     for(int j = 0; j < getColumn(); j++) {
        //         System.out.printf(" %d ", matran[i][j]);
        //     }
        //     System.out.println();
        // }
        // return matran;
    }
}
