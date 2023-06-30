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
		literarySources.add(new Book("����������� �������� ��������","��������� ��������", 1937, "������"));
		literarySources.add(new Book("�������","������ ���������", 1929, "�������"));
		literarySources.add(new Article("��� �������� �����������������?", "�. �������", "����������", 2021, 662462));
		literarySources.add(new Article("������������ ���� ������", "�. �������", "�������� ����� �������", 2021, 660823));
		literarySources.add(new Link("�������", "www.greenpeace.org", LocalDate.of(2012, Month.NOVEMBER, 12)));
		literarySources.add(new Link("��������", "www.ekzotika.com", LocalDate.of(2019, Month.SEPTEMBER, 4)));
		
		for (LiterarySource literarySource : literarySources) {
			System.out.println(literarySource);
		}
			
	}

}
