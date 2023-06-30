package setCombination;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCombination implements Cloneable, Comparable<SetCombination> {
	private Set<Integer> set = new TreeSet<>();

	public SetCombination() {
	}
	
	public SetCombination(Set<Integer> set) {
		this.set = set;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	
	public void add(int number) {
			set.add(number);
	}
	
	public void add(SetCombination set) {
		this.getSet().addAll(set.clone().getSet());
	}
	
	@Override
	public String toString() {
		Iterator<Integer> iterator = set.iterator();
		int number = iterator.next();
		String string = "{";
		if (number != 0) {
			string += number;
		}
		iterator.hasNext();
		while(iterator.hasNext()) {
			String comma = ", ";
			number = iterator.next();
			string += comma + number;
		}
		return string + "}";
	}
	
	@Override
	public SetCombination clone(){
		SetCombination copy = new SetCombination();
		Iterator<Integer> it = set.iterator();	
		while(it.hasNext()) {
			copy.add(it.next());
		}
		
		return copy;
	}

	@Override
	public int compareTo(SetCombination set) {
		Iterator<Integer> it1 = this.getSet().iterator();
		Iterator<Integer> it2 = set.getSet().iterator();
		
		if(this.getSet().size() > set.getSet().size()) {
			return 1;
		} else if (this.getSet().size() < set.getSet().size()) {
			return -1;
		}
			
		
		while(it1.hasNext() && it2.hasNext()) {
			Integer com1 = it1.next();
			Integer com2 = it2.next();
			int comp = com1.compareTo(com2);
			if(comp != 0)
				return comp;
		}
	    if (it1.hasNext() && !it2.hasNext()) {
	        return 1;
	    }
	    else if (!it1.hasNext() && it2.hasNext()){
	        return -1;
	    }
		return 0;
	}
	
	@Override
	public boolean equals(Object obj)
	{
	  if (this == obj) {
	    return true;
	  }
	  if (obj == null) {
	    return false;
	  }
	  if (getClass() != obj.getClass()) {
	    return false;
	  }

	  SetCombination that = (SetCombination) obj;
	  return this.set.equals(that.set);
	}
	
	@Override
	public int hashCode() {
	  final int prime = 31;
	  int result = 18;
	  result = prime * result + this.set.hashCode();
	  return result;
	}

}
