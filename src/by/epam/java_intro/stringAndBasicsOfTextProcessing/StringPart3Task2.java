package by.epam.java_intro.stringAndBasicsOfTextProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*2. 2. Дана строка, содержащая следующий текст (xml-документ):
<notes>
 <note id = "1">
 <to>Вася</to>
 <from>Света</from>
 <heading>Напоминание</heading>
 <body>Позвони мне завтра!</body>
 </note>
 <note id = "2">
 <to>Петя</to>
 <from>Маша</from>
 <heading>Важное напоминание</heading>
 <body/>
 </note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя */

public class StringPart3Task2 {

    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\Bogdan\\IdeaProjects\\StringAndBasicsOfTextProcessing\\src\\by\\epam\\java_intro\\stringAndBasicsOfTextProcessing\\xml.xml";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();

        while (line != null) {
            System.out.println(xmlAnalyzer(line.trim()));
            String s = xmlAnalyzer(line);
            System.out.println(s);
            line = reader.readLine();

        }


    }

    public static String xmlAnalyzer(String file) {

        StringBuilder sb = new StringBuilder();
        Pattern pOpenTag = Pattern.compile("<\\w.+?>");
        Pattern pCloseTag = Pattern.compile("</\\w+>");
        Pattern pTagContent = Pattern.compile(">.+?<");
        Pattern pTagWithoutBody = Pattern.compile("<\\w.+?/>");

        String[] lines = file.split("\n\\s*");

        for (String line : lines) {

            Matcher mOpenTag = pOpenTag.matcher(line);
            Matcher mCloseTag = pCloseTag.matcher(line);
            Matcher mTagContent = pTagContent.matcher(line);
            Matcher mTagWithoutBody = pTagWithoutBody.matcher(line);

            if (mOpenTag.find()) {
                sb.append(mOpenTag.group()).append("\t Open Tag\n");
            }
            if (mCloseTag.find()) {
                sb.append(mCloseTag.group()).append("\t Close Tag\n");
            }
            if (mTagContent.find()) {
                sb.append(mTagContent.group().substring(1)).append("\t Tag Content\n");
            }
            if (mTagWithoutBody.find()) {
                sb.append(mTagWithoutBody.group()).append("\t Empty tag\n");
            }
        }
        return sb.toString();

    }


}


