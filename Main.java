public class Main{
    public static void main(String[] args){
        Koran japos = new JawaPos();
        Koran sumer = new SuaraMerdeka();
        JakartaPos jakpos = new JakartaPos();
        Koran[] k =new
                Koran[]{japos,sumer,jakpos};
        for (int i=0;i<k.length;i++){
            k[i].tampilDeskripsi();
        }
    }
}