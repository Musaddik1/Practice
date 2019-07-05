package behavioralvisitor;

public interface shoppingCardvisitor {
	
	int visit(Book book);
	int visit(Fruit fruit);
	

}
class shoppCardvisitorimp implements shoppingCardvisitor
{

	
	@Override
	public int visit(Book book)
	{
		System.out.println("Book Name   :"+book.getBname());
		System.out.println("Book Number  :"+book.getNumber());
		return book.getNumber();
	}

	@Override
	public int visit(Fruit fruit) {
		
		System.out.println("Fruit name :  "+fruit.getFname());
		System.out.println("Weight  :"+fruit.getWeight());
		System.out.println("Fruit price  :"+fruit.getPrice());
		return (int) fruit.getPrice();
	}
	
}
