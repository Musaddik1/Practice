package DateOfTransaction;

public class Transaction {

		private String name;
		private int number;
		private double price;
		private String date;
		
		public Transaction()
		{
			
		}

		public Transaction(String name, int number, double price, String date) {
			super();
			this.name = name;
			this.number = number;
			this.price = price;
			this.date = date;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "Transaction [name=" + name + ", number=" + number + ", price=" + price + ", date=" + date + "]";
		}
		
}
