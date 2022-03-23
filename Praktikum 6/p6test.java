//import java.sql.Date;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class p6test{

    public static void main(String[] args){

        System.out.println("test");
        Pegawai p1 = new Pegawai("Alwan", new GregorianCalendar(1992,8,31), "222011374", "BPS", "STIS");
        Pegawai p2 = new Pegawai("Rahmana", new GregorianCalendar(1992,9,2),"222011333", "BPS", "Parkiran");
    
        p2.setTanggalLahir(new GregorianCalendar(2002,8,31));
        
        
        
        System.out.println("Ada orang");
       
        System.out.println(p1.getNama()+" lahir pada "+ p1.getTanggalLahir());
        System.out.println(p2.getNama()+" lahir pada "+ p2.getTanggalLahir());
       
        
        
}
}
