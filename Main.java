package P5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan nama dosen : ");
        String nama = sc.nextLine();
        System.out.print("masukan alamat dosen : ");

        String alamat = sc.nextLine();

        Dosen dosen1 = new Dosen(nama, alamat);

        for(int i = 0; i < 3; i++){
            System.out.print("masukan mata kuliah yang diampu: ");
            String matkul = sc.nextLine();
            dosen1.addCourse(matkul);
        }

        System.out.println(dosen1);

    }
        
}
    

