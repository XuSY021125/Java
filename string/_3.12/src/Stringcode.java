
public class Stringcode {
    public static void main(String[] args) {
        String str = new String("hallo world");
        String str1 = new String("hello java");
        String str2 = new String("Abc");
        String str3 = new String("aBC");

        System.out.println(str2.offsetByCodePoints(1, 2));

        atCode(str,str1);
        System.out.println();

        //返回字符串长度
        int len = str.length();
        int len1 = str2.length();
        System.out.println("字符串长度:" + len);
        System.out.println("字符串长度:" + len1);
        System.out.println();

        //截取字符串
        String result = str.substring(3);//指定参数下标到结尾
        String result1 = str1.substring(0,2);//第一个参数下标到第二个参数下标-1
        System.out.println("截取字符串:" + result);
        System.out.println("截取字符串:" + result1);
        System.out.println();

        //返回指定下标索引的码点
        System.out.println(str.codePointAt(1));
        System.out.println();

        //返回从指定下标（第一个参数）的代码点开始位移（第二个参数）后的码点索引
        System.out.println(str.offsetByCodePoints(2,2));
        System.out.println();

        //按照字典顺序,如果字符串位于other 之前,返回一个负数；如果字符串位于other后，返回一个正数；如果两个字符串相等，返回 0
        System.out.println("比较字典顺序" + str.compareTo("world"));
        System.out.println();

        //判断字符是否一样
        if (str2.equals(str3)){
            System.out.println("两个字符串完全一样");
        } else if (str2.equalsIgnoreCase(str3)){
            System.out.println("不看大小写，两个字符串一样");
        } else {
            System.out.println("两个字符串不一样");
        }
        System.out.println();

        //判断字符串的开头或结尾是否与
        if (str.startsWith("hal")){
            System.out.println("开头字符串一样");
        } else {
            System.out.println("开头字符串不一样");
        }

        if (str.endsWith("dl")) {
            System.out.println("结尾字符串一样");
        } else {
            System.out.println("结尾字符串不一样");
        }
        System.out.println();

        //int indexOf(String str)
        //int indexOf(String str, int fromlndex )
        //int indexOf(int cp)
        //int indexOf(int cp, int fromlndex )
        //返回与字符串 str 或代码点 cp 匹配的第一个子串的开始位置。这个位置从索引 0 或fromlndex 开始计算。 如果在原始串中不存在 str，返回 -1

        //int 1astIndexOf(String str)
        //int 1astIndexOf(String str, int fromlndex )
        //int lastindexOf(int cp)
        //int 1astindexOf(int cp, int fromlndex )
        //返回与字符串 str 或代码点 cp 匹配的最后一个子串的开始位置。 这个位置从原始串尾端或 fromlndex 开始计算

        int index = str1.indexOf("lo");
        int index1 = str1.indexOf(97,0);
        System.out.println("与字符串匹配的第一个子串的下标：" + index);
        System.out.println("与代码点                  " + index1);

        int lastint = str.lastIndexOf("a");//str = "hallo world";
        int lastint1 = str.lastIndexOf(97,4);
        System.out.println("与字符串匹配的最后一个子串的下标：" + lastint);
        System.out.println("与代码点                    " + lastint1);
        System.out.println();

        //返回一个新字符串。 这个字符串将原始字符串中的大写字母改为小写，或者将原始字符串中的所有小写字母改成了大写字母
        System.out.println(str2.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println();

        //将初始字符串的目标子串（第一个参数）变成另一个字符串（第二个参数），并返回一个新的字符串
        String original = new String("abcde");
        String replaced = original.replace("cd","ab");
        System.out.println("替换后的字符串：" + replaced);
        System.out.println();

        //Stringbuilder
        StringBuilder builder = new StringBuilder("hello");

        builder.append(" java");
        System.out.println("StringBuilder转换成字符串：" + builder.toString());

        builder.setCharAt(1,'a');
        System.out.println(builder);
        builder.setCharAt(1,'e');
        System.out.println(builder);

        System.out.println(builder.insert(5," world"));

        System.out.println(builder.delete(1,4));

    }

    public static void atCode(String s,String s1){
        char a = s.charAt(2);
        char b = s1.charAt(5);
        char c = s.charAt(6);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
