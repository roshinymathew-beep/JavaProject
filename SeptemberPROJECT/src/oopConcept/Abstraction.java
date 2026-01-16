package oopConcept;

abstract class Google
{
	abstract void search();
	public void message()
	{
		System.out.println("Google Search");
	}
}
class SearchAll extends Google
{

	@Override
	void search() {
		System.out.println("Search All");
		
	}
	
}
class Searchimage extends Google
{

	@Override
	void search() {
		System.out.println("Search image");
		
	}
	
}
class Searchvideo extends Google
{

	@Override
	void search() {

		System.out.println("Search video");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {

		SearchAll a=new SearchAll();
		a.message();
		a.search();
		Searchimage i=new Searchimage();
		i.message();
		i.search();
		Searchvideo v=new Searchvideo();
		v.message();
		v.search();

	}

}
