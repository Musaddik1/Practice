package behavioralvisitor;

public class TestVisitor {

	public static void main(String[] args) {
		
		itemElement item=new Book("C language", 1234);
		shoppingCardvisitor visitor=new shoppCardvisitorimp();
		visitor.visit((Book) item);
		System.out.println("***********************");
		item=new Fruit("Apple", 50, 7);
		visitor.visit((Fruit) item);
	}
}
