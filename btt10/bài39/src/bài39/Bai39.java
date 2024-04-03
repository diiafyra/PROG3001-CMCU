/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài39;

/**
 *
 * @author DELL
 */
interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}

class WebPage implements Searchable {
    private String url;
    private String htmlContent;

    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    @Override
    public boolean search(String keyword) {
        return htmlContent.contains(keyword);
    }
}
public class Bai39 {
    public static void main(String[] args) {
        Document document = new Document("Random thing about Java (testing).");
        boolean foundInDocument = document.search("Random");
        System.out.println("Tìm kiếm trong Document:");
        if (foundInDocument) {
            System.out.println("Từ khóa được tìm thấy trong Document.");
        } else {
            System.out.println("Từ khóa không được tìm thấy trong Document.");
        }

        System.out.println();

        WebPage webPage = new WebPage("https://st.cmc-u.edu.vn(testing)", " bài tập cho Java");
        boolean foundInWebPage = webPage.search("Java");
        System.out.println("Tìm kiếm trong WebPage:");
        if (foundInWebPage) {
            System.out.println("Từ khóa được tìm thấy trong WebPage.");
        } else {
            System.out.println("Từ khóa không được tìm thấy trong WebPage.");
        }
    }
}