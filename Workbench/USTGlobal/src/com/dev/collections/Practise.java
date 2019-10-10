package com.dev.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*TreeSet tree=new TreeSet();
tree.add(1);
tree.add(10);
tree.add(2);
tree.add(4);
tree.add("two");
Iterator it=tree.iterator() ;
while(it.hasNext()) {
	System.out.println(it.next()+"");
}
	}*/
		
		List<String> vals = Arrays.asList("a","b","c");
		String join = vals.parallelStream().reduce( (a,b)->a.concat(b).toUpperCase()).get();
		System.out.println(join);

}
}
