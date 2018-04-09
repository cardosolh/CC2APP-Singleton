
public class SingletonPatternDemo {

	public static void main(String[] args) {
		//Illegal cosntruct
		//Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();
		
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		//Show the message
		object.showMessage();

	}

}
