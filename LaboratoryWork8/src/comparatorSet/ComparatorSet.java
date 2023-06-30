package comparatorSet;

import java.util.Comparator;

import setCombination.SetCombination;

public class ComparatorSet implements Comparator<SetCombination> {

	@Override
	public int compare(SetCombination set1, SetCombination set2) {
		if (set1 == null && set2 == null){
	        return 0;
	    }
	    else if (set1 == null){
	        return 1;
	    }
	    else if (set2 == null){
	        return -1;
	    }
		return set1.compareTo(set2);
	}

}
