
/* aceasta este clasa care va crea "fabrici" , va crea obiecte de tip
 * AbstractCreator care de fapt vor fi Maternity sau Forest 
 */


package creator;

public class Creator {
	public static AbstractCreator create(String type){
		if(type==null)
			return null;
		if(type.equals("maternity"))
			return new Maternity();
		if(type.equals("forest"))
			return new Forest();
		
		return null;
	}
}
