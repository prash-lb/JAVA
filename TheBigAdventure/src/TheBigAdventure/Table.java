package TheBigAdventure;

public class Table {
	int length;
	int width;
	int [][] data ;
	
	public Table( int length , int width , int [][] data){
		this.length = length;
		this.width = width;
		this.data = data;
	}
	
	@Override
	public String toString() {
		var builder = new StringBuilder();
		builder.append(this.length).append(" ").append(this.width);
		return builder.toString();
	}
}
