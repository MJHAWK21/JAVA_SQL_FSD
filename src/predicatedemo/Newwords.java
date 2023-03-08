package predicatedemo;

import java.util.Arrays;
import java.util.List;

public class Newwords {

	public static void main(String[] args) {
		String s1="Hey i am joker. Hello Hello HI hey hi! hi MeLcow, melcow";
		String s2=s1.replaceAll("[!@#$%^&*()/0-9,.?:;]","");
		System.out.println(s2);
		String[]r=s2.split(" ");
        List<String>f=Arrays.asList(r);
        int w = f.size();
        //System.out.println(f);
        List<String>e= f.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
        int q=e.size();
        System.out.println("number of words: "+w);
        System.out.println("number of unique words: "+q);
        System.out.println("unique words are: ");
        //System.out.println(e);
        e.forEach(t->System.out.println(t));
	}

}
