
import java.util.Calendar;


public abstract class Orang{

    public String nama;
    public Calendar tanggalLahir;

    public Orang(String nama, Calendar tanggalLahir){

        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama(){

        return this.nama;
    }

    public void setNama(String nama){

        this.nama = nama;
    }

    /* public String getTiga(int depan, int belakang){

       for(int i =30;i>nama.length;i--){

        if(i-nama.length==3)
           int al = i;
       }         
    return 30-al;
    
    } */

    /* public String getNamaPanggilan(){

        return this.substring(0,2);
    } */

}