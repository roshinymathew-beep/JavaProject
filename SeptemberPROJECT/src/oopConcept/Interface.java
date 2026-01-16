package oopConcept;

interface Whatsapp
{
	int a=10;
	void mute();
	void call();
	void disconnect();
}
class Audiocalls implements Whatsapp
{

	@Override
	public void mute() {
		System.out.println("Voice muted");
		
	}

	@Override
	public void call() {
		System.out.println("Audio call");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Audio disconnected");
	}
	
}
class Videocalls implements Whatsapp
{

	@Override
	public void mute() {
		System.out.println("Videocall muted");
	}

	@Override
	public void call() {
		System.out.println("Video calls");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Video call disconnected");
		
	}
	
}
	public class Interface {
	public static void main(String[] args) {
		
		 Audiocalls ac=new Audiocalls();
		 ac.call();
		 ac.disconnect();
		 ac.mute();
		 Videocalls v=new Videocalls();
		 v.call();
		 v.disconnect();
		 v.mute();
		 Whatsapp ob=new Audiocalls();
		 ob.call();
		 ob.disconnect();
		 ob.mute();
		 ob=new Videocalls();
		 ob.call();
		 ob.disconnect();
		 ob.mute();
		 
		System.out.println(Whatsapp.a);
		//System.out.println(Whatsap.a=20); a is static & final
		

	}
	

}
