package lab11;

public class Movie {

	private String title;
	
	private String category;
	
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
		
	//getter
	public String getTitle() {
		return title;
	}
	
	//setter
	public void setCategory(String category) {
		this.category = category;
	}
				
	//getter
	public String getCategory() {
		return category;
	}
	
	// constructor with two arguments
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	@Override
	public String toString () {
		return (title);
	}
	
	
}
