package aims.models;
import aims.Aims;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DigitalVideoDisc {
	private String ID;
	private String Title;
	private double Price;
	private int Length;
	private String Category;
	private ZonedDateTime AddedTime;
	
	
    public DigitalVideoDisc(String Title) {
        this.Title = Title;
        this.ID = Integer.toString(Aims.ItemCounter.get());
        Aims.ItemCounter.increase();
        this.AddedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }
	
    public DigitalVideoDisc(String Category, double Price, String Title) {
        this.Title = Title;
        this.Price = Price;
        this.Category = Category;
        this.ID = Integer.toString(Aims.ItemCounter.get());
        Aims.ItemCounter.increase();
        this.AddedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
        
    }
	
    public DigitalVideoDisc(String Category, double Price, String Title, int Length) {
        this.Title = Title;
        this.Price = Price;
        this.Category = Category;
        this.Length = Length;
        this.ID = Integer.toString(Aims.ItemCounter.get());
        Aims.ItemCounter.increase();
        this.AddedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }
	
	public String getID() {
		return this.ID;
	}
	
	public String getTitle() {
		return this.Title;
	}
	
	public double getPrice() {
		return this.Price;
	}
	
	public int getLength() {
		return this.Length;
	}
	
	public String getCategory() {
		return this.Category;
	}
	
	public String getAddedTime() {
		ZonedDateTime zdt = this.AddedTime;
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		
		return zdt.format(f1);
	}
}
