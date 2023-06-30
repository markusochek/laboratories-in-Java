package comparatorSet;

import java.util.Comparator;

import literarySource.LiterarySource;

public class ComparatorSet implements Comparator<LiterarySource> {

	@Override
	public int compare(LiterarySource set1, LiterarySource set2) {
		if (set1 == null && set2 == null){
	        return 0;
	    }
	    else if (set1 == null){
	        return 1;
	    }
	    else if (set2 == null){
	        return -1;
	    }
		return set1.getTitle().compareTo((set2).getTitle());
	}

}
