

import java.util.*;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProthomAlo {
	
	
	
	
	//Method for finding Posts ID
	public LinkedHashSet<String> getingAllPostId(String urlOfCategory) throws IOException {
		
		LinkedHashSet<String> linksSet = new LinkedHashSet<>(); 
		Document document = Jsoup
				.connect(urlOfCategory)
				.get();
		
		Element body = document.body();
		Elements posts = document.getElementsByClass("widget_color_ widget_wrap");
		Elements post = posts.select("a[href]");
		
		for (Element link : post) {
			String url = link.attr("href");
			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher matcher = pattern.matcher(url);
			if(matcher.find()) {
				linksSet.add(matcher.group());
			}
		}
		
		return linksSet;
	}
	
}