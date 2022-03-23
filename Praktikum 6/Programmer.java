import java.util.GregorianCalendar;
import java.util.Calendar;

public class Programmer extends Pegawai{

    private String bahasaPemrograman;
    private String platform;

    public Programmer(String nama, Calendar tanggalLahir, String NIP, String kantor, String unitKerja, String bahasaPemrograman, String platform){

        super(nama,tanggalLahir,NIP,kantor,unitKerja);
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.NIP = NIP;
        this.kantor = kantor;
        this.unitKerja = unitKerja;
        this.bahasaPemrograman = bahasaPemrograman;
        this.platform = platform;
    }

    public String getBahasa(){

        return this.bahasaPemrograman;
    }

    public void setBahasa(String bahasa){
        
         this.bahasaPemrograman = bahasa;
    }

    public String getPlatform(){

        return this.platform;
    }

    public String getPekerjaan(){
        return "Coding all along day";
    }

    public void setPlatform(String platform){

        this.platform = platform;
    }

    public String getTanggalLahir(){
    
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
            validateTanggalLahir();
        
            return sdf.format(tanggalLahir.getTime()).toString();
        }catch (Exception e){
            return "Belum tersedia ";
        }finally{System.out.println("Error Tertangani");} 
        //return sdf.format(tanggalLahir.getTime()).toString(); 
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
