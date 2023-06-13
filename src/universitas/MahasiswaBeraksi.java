
package universitas;


public class MahasiswaBeraksi {
     public static void main (String[] args) {
        
        Mahasiswa yuded = new Mahasiswa ("2110010566", " Muhammad Yuded Saputera", " Teknik Informatika");
        
        System.out.println ("nama mahasiswa: "+ yuded.getNama ());
        System.out.println ("nama npm: "+ yuded.getNpm ());
        System.out.println ("nama prodi: "+ yuded.getProdi ());
    }
}
