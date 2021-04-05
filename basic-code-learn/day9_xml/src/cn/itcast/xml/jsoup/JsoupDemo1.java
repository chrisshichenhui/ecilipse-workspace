package cn.itcast.xml.jsoup;
/*
jsoup 快速入门
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.namespace.QName;
import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Document对象，根据xml文档获取
        //2.1 获取Student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();//搞清楚这几个方法是干啥的
//        2.2 解析xml文档，加载文档进内存，获取dom树---》Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素对象 Element
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        Element element = elements.get(0);

        //获取数据
        String name = element.text();
        System.out.println(name);


    }
}
