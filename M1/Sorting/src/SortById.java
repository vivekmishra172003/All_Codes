import java.util.Comparator;
public class SortById implements Comparator<Product>  {
	@Override
	public int compare(Product a,Product b) {
		return a.getProductid() - b.getProductid();
	}
}
