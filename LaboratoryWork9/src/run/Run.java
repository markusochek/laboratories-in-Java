package run;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import java.util.TreeSet;

import article.Article;
import book.Book;
import comparatorSet.ComparatorSet;
import link.Link;
import literarySource.LiterarySource;

public class Run {

	public static void main(String[] args) {
		Set<LiterarySource> literarySources = new TreeSet<LiterarySource>(new ComparatorSet());
		literarySources.add(new Book("Приключения капитана Врунгеля","Александр Некрасов", 1937, "Пионер"));
		literarySources.add(new Book("Айболит","Корней Чуковский", 1929, "Лимпопо"));
		literarySources.add(new Article("Как повысить работоспособность?", "М. Петрова", "Психология", 2021, 662462));
		literarySources.add(new Article("Удивительная гора Рейнир", "Г. Русамов", "Красивые места Америки", 2021, 660823));
		literarySources.add(new Link("Гринпис", "www.greenpeace.org", LocalDate.of(2012, Month.NOVEMBER, 12)));
		literarySources.add(new Link("Экзотика", "www.ekzotika.com", LocalDate.of(2019, Month.SEPTEMBER, 4)));
		
		for (LiterarySource literarySource : literarySources) {
			System.out.println(literarySource);
		}
			
	}

}
