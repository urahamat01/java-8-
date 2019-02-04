import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	static TreeSet<String> postsIdSet1 = new TreeSet<>();
	static TreeSet<String> lastpostsId = new TreeSet<>();
	
	public static void main(String[] args) throws IOException {
		forProthomAlo();
		// forKalerKontho();
		// forJugantor();
		
//		System.out.println(postsId.size());
//		for (String s : postsId) {
//			System.out.println(s);
//		}
		
		extractContent("https://www.prothomalo.com/bangladesh/article/");
	}

	// For prothom alo
	static void forProthomAlo() throws IOException {
		String categoryUrl = "https://www.prothomalo.com/bangladesh/article/";
		TreeSet<String> postsIdSet2 = new TreeSet<>();
		Document document = Jsoup
				.connect(categoryUrl)
				.get();
		Element body = document.body();
		Elements posts = body.getElementsByClass("each");
		Elements post = posts.select("a[href]");

		for (Element link : post) {
			String url = link.attr("href");
			Pattern pattern = Pattern.compile("[0-9]{7}");
			Matcher matcher = pattern.matcher(url);
			if (matcher.find()) {
				if (matcher.group().length() != 7) {
					break;
				} else {
					postsIdSet2.add(matcher.group());
				}
			}
		}
		if( postsIdSet2.containsAll(postsIdSet1)) {
			
		}
		lastpostsId.add("1576956");
		lastpostsId.add("1576955");
		
		
	}
	
	
	public static void extractContent(String postUrl) throws IOException{
		for(String s:lastpostsId) {
			
			Document document = Jsoup
					.connect(postUrl+s)
					.get();
			
			Element body = document.body();
			Elements heading = body.getElementsByTag("h1");
			System.out.println(heading.text());
			Elements posts = body.getElementsByTag("article");
			
			for (Element link : posts) {
				System.out.println(link.text());
			}
		}
	}


	

	// For kalerkontho
	static void forKalerKontho() throws IOException {
		Document document = Jsoup
				.connect("http://www.kalerkantho.com/online/national/").get();
		Element body = document.body();
		Elements posts = document.getElementsByClass("print_edition_left");
		Elements post = posts.select("a[href]");
		int count = 0;
		for (Element link : post) {
			String url = link.attr("href");
			System.out.println(url);
			count++;
		}
	}

	//
	static void forJugantor() throws IOException {
		Document document = Jsoup.connect("https://www.jugantor.com/national")
				.get();
		Element body = document.body();
		Elements posts = document.getElementsByClass("home_page_left");
		Elements post = posts.select("a[href]");
		int count = 0;
		for (Element link : post) {
			String url = link.attr("href");
			System.out.println(url);
			count++;
		}
	}

}