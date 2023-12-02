package TheBigAdventure;

import java.util.Objects;

public class MapFile {
	String filepath;
	
	public MapFile(String filepath) {
		Objects.requireNonNull(filepath,"filepath is null \n");
		
	}

}
