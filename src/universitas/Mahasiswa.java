
package universitas;

public class Mahasiswa {
    //membuat variabel
    String npm, nama, prodi;
    
    public String getNama(){
        return nama;
    }
    
    public String getNpm(){
        return npm;
    }
    
    public String getProdi(){
        return prodi;
    }
    
    public void setnama (String nama){
        nama = nama;
    }
    
    public void setnpm (String npm){
        npm = npm;
    }
}
