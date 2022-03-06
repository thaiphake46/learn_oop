package week2;
public class B2 {
    public static void main(String[] args) {
        MaTran maTran1 = new MaTran();
        MaTran maTran2 = new MaTran();

        System.out.println("- In ra ma tran 1");
        maTran1.readFromFile("matran1.txt", maTran1.getMaTran());
        maTran1.hienThiMT();

        System.out.println("- In ra ma tran 2");
        maTran2.readFromFile("matran2.txt", maTran1.getMaTran());
        maTran2.hienThiMT();

        System.out.println("MA tran sau khi cong la: ");
        // MaTran  plusMatrix  = maTran1.congMaTran(maTran2) ;  
        // int [][] tmp  = maTran1.congMaTran(maTran2) ;  
        //  for(int i=0;i< maTran1.getLine();i++){
        //      for(int j=0;j<maTran2.getColumn();j++){
        //           System.out.printf(" %d ", tmp[i][j]);
        //      }
        //     System.out.println("");
        //  }

        // MaTran tong = new MaTran();
        // tong.cong(maTran1,maTran2);
        // tong.hienThiMT();
    }
}
