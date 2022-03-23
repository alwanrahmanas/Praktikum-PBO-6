import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Pegawai extends Orang implements Dosen{  

    public String NIP;
    public String kantor;
    public String unitKerja;
    public String NIDN;
    
       
    public Pegawai(String nama, Calendar tanggalLahir, String NIP, String namaKantor, String unitKerja){

       
       super(nama,tanggalLahir);
       this.nama = nama;
       this.tanggalLahir = tanggalLahir;
       this.NIP = NIP;
       this.kantor = namaKantor;
       this.unitKerja = unitKerja;
       

   }

   public Pegawai(String nama, String NIP, String namaKantor, String unitKerja){

       
    super(nama);
    this.nama = nama;
    this.NIP = NIP;
    this.kantor = namaKantor;
    this.unitKerja = unitKerja;
    

}
    
   public String getNIP(){
       return this.NIP;
   }

   public void setNIDN(String NIDN){

       this.NIDN = NIDN;
   }

   public String getNama(){
       return this.nama;
   }

   public String getNIDN(){

    return this.NIDN;
   }
  
   public String getKeahlian(){
       return this.Keahlian;
   }
   public String getPekerjaan(){
       return this.Pekerjaan;
   }
   public void setKeahlian(String keahlian){
       this.Keahlian = keahlian;
   }

   public String getUnitKerja(){

    return this.unitKerja;
   }

   public String getKantor(){

    return this.kantor;
   }

   public void setTanggalLahir(Calendar tanggalLahir){

    this.tanggalLahir = tanggalLahir;
   }

   public String getTanggalLahir(){
    
    try{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
        validateTanggalLahir();
    
        return sdf.format(tanggalLahir.getTime()).toString();
    }catch (Exception e){
        return "Belum tersedia ";
    }finally{System.out.println("Error Tertangani");}
    }

    void validateTanggalLahir() throws Exception{
    
        if(tanggalLahir.get(Calendar.YEAR)<2000){
            throw new Exception("Di bawah umur");
        }
        else{
            System.out.println("Cukup umur");
        }
    }
 

   
}
