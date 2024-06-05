package lr10.HTML;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class newsParser {
    public static void main(String[] args) {
        Node title;
        JSONObject news = new JSONObject();
        Node date;
        try{
            Document doc = Jsoup.connect("http://fat.urfu.ru/").get();
            Elements newParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
            for (int i = 3; i < 20; i++){
                if (!(i % 2 == 0)){
                    List<Node> nodes= newParent.get(0).childNodes();
                    title = ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0);
                    date = ((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0);
                    news.put(date.toString(),title.toString());
                    try(FileWriter file = new FileWriter("G:\\Labs\\labs\\src\\lr10\\HTML\\test.json")){
                        file.write(news.toJSONString());
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        }catch ( IOException e){
            e.printStackTrace();
        }
    }
}
