package setOfSetsCombination;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import comparatorSet.ComparatorSet;
import setCombination.SetCombination;

public class SetOfSetsCombination {
	private Set<SetCombination> setOfSets = new TreeSet<SetCombination>(new ComparatorSet());

	public SetOfSetsCombination() {
	}
	
	public SetOfSetsCombination(Set<SetCombination> setOfSet) {
		this.setOfSets = setOfSet;
	}

	public Set<SetCombination> getSetOfSet() {
		return setOfSets;
	}

	public void setSetOfSet(Set<SetCombination> setOfSet) {
		this.setOfSets = setOfSet;
	}
	
	public void add(SetCombination set) {
		setOfSets.add(set.clone());
	}
	
	public void cartesianProduct() {
		SetOfSetsCombination setOfSetsNew = new SetOfSetsCombination();
		for (SetCombination set1 : this.getSetOfSet()) {
			for (SetCombination set2 : this.getSetOfSet()) {
				SetCombination set = set1.clone();
				set.add(set2);
				setOfSetsNew.add(set);
			}
		}
//		return setOfSetsNew;
		this.setOfSets = setOfSetsNew.clone().getSetOfSet();
	}
	
	@Override
	public String toString() {
		Iterator<SetCombination> iterator = setOfSets.iterator();
		String string = "{" + iterator.next();
		iterator.hasNext();
		while(iterator.hasNext()) {
			string += ", " + iterator.next();
		}
		return string + "}";
	}
	
	@Override
	public SetOfSetsCombination clone(){
		SetOfSetsCombination copy = new SetOfSetsCombination();
		Iterator<SetCombination> it = setOfSets.iterator();	
		while(it.hasNext()) {
			copy.add(it.next());
		}
		
		return copy;
	}

	public void destroyZeros() {
		for (SetCombination set : this.getSetOfSet()) {
			if(set.getSet().contains(0)) {
				set.getSet().remove(0);
			}
			if (set.getSet().isEmpty()) {
				set.getSet().add(0);
			}
		}	
//		return this.clone();
		this.setOfSets = this.clone().getSetOfSet();
	}

}
