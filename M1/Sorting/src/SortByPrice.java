import java.util.Comparator;
public class SortByPrice implements Comparator<Product>{
	@Override
	public int compare(Product a,Product b) {
		return (int) (a.getPrice() - b.getPrice());
	}
	
}
