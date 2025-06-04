import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TabletUtil {
	
	public List<Tablet> retrieveTabletsByBrand(Stream<Tablet> tabletStream, String brand) {
        
        //Fill the code here
		List<Tablet> tl = tabletStream
				.filter(t->brand.equalsIgnoreCase(t.getBrand()))
				.collect(Collectors.toList());
        return tl;
    }
	
	public List<String> getTabletsAboveMg(Stream<Tablet> tabletStream, int mg) {
	    
	    //Fill the code here
		List<String> ls = tabletStream
				.filter(w -> w.getMg() >= mg)
				.map(Tablet::getName)
				.collect(Collectors.toList());
	    return ls;
	}
}

