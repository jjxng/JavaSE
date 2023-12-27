package section19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IO09 {

	public static void main(String[] args) {

		String path = "./upload/pokemon.obj";
		
		try(
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {
			
			PokeMonVO pokemonVO = (PokeMonVO) ois.readObject();
			System.out.println("pokemon.obj -> pokemonVO 객체화!");
			System.out.println("No. " + pokemonVO.getNo());
			System.out.println("Name. " + pokemonVO.getName());
			System.out.println("Type. " + pokemonVO.getType());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
