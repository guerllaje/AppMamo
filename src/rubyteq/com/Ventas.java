package rubyteq.com;

public class Ventas {
    public int icon;
    public String title;
    public String Subtitle;
    public int ID;
    public Ventas(){
        super();
    }
    
    public Ventas(int icon, String title, String subtitle , int miID) {
        super();
        this.icon = icon;
        this.title = title;
        this.Subtitle = subtitle;
        this.ID = miID;
    }
}