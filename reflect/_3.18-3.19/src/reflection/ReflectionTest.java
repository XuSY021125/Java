package reflection;

import java.lang.reflect.*;
import java.util.Scanner;
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0){
            name = args[0];
        }else {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入类名：");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();

            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print("class" + name + " ");

            if (supercl != null && supercl != Object.class){
                System.out.print("extends" + supercl.getName());
            }
            System.out.println("{");

            printField(cl);
            System.out.println();
            printConstructors(cl);
            System.out.println();
            printMethod(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printField(Class cl){
        //返回包含Field对象的数组，这个对象包括这个类的全部域，不包括超类的。如果类中没有域，或者Class对象描述的是基本类型或数组类型，将返回一个长度为0的数组
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields){
            String fieldName = f.getName(); //返回用于描述构造器名、方法名、域名的字符串
            Class fieldType = f.getType();  //获取这一个域的类型

            String modifiers = Modifier.toString(f.getModifiers());//getModifier()返回修饰符的整型数值；Modifier.toString(int)用于将修饰符的整型数值转换成字符串
            if (modifiers.length() > 0){
                System.out.print("    " + modifiers + " ");
            }
            System.out.println(fieldType.getName() + " " + fieldName + ";");
        }
    }

    public static void printConstructors(Class cl){
        //返回包含Constructor对象的数组，这个对象包括这个类的全部域，不包括超类的。如果类中没有域，或者Class对象描述的是基本类型或数组类型，将返回一个长度为0的数组
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors){
            String conName = c.getName();//返回用于描述构造器名、方法名、域名的字符串

            String modifiers = Modifier.toString(c.getModifiers());//getModifier()返回修饰符的整型数值；Modifier.toString(int)用于将修饰符的整型数值转换成字符串
            if (modifiers.length() > 0){
                System.out.print("    " + modifiers + " ");
            }
            System.out.print(conName + "(");

            Class[] parameters = c.getParameterTypes();//getParameterTypes()方法在Constructor和Method类中，获取参数的类型
            for (int i = 0; i<parameters.length; i++){
                if (i > 0){
                    System.out.print(", ");
                }
                String parameterTypeName = parameters[i].getName();//获取参数类型的名字
                System.out.print(parameterTypeName);
            }
            System.out.println(")");
        }
    }

    public static void printMethod(Class cl){
        //返回包含Method对象的数组，这个对象包括这个类的全部域，不包括超类的。如果类中没有域，或者Class对象描述的是基本类型或数组类型，将返回一个长度为0的数组
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods){
            Class returnName = m.getReturnType();//getReturnType()方法在Method类中，获取返回值类型
            String methodName = m.getName();////返回用于描述构造器名、方法名、域名的字符串

            System.out.printf("    ");

            String modifiers = Modifier.toString(m.getModifiers());//getModifier()返回修饰符的整型数值；Modifier.toString(int)用于将修饰符的整型数值转换成字符串
            if (modifiers.length() > 0){
                System.out.printf(modifiers + " ");
            }
            System.out.printf(returnName.getName() + " " + methodName + "(");//获取返回值类型的名字

            Class[] parameterTypes = m.getParameterTypes();//getParameterTypes()方法在Constructor和Method类中，获取参数的类型
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0){
                    System.out.printf(", ");
                }
                String parameterTypeName = parameterTypes[i].getName();//获取参数类型的名字
                System.out.printf(parameterTypeName);
            }
            System.out.println(")");
        }
    }
}


//public class ReflectionTest {
//    public static void main(String[] args) {
//        String name;
//        if (args.length > 0) {
//            name = args[0];
//        } else {
//            Scanner in = new Scanner(System.in);
//            System.out.println("请输入一个类名，例如：(java.util.Data)：");
//            name = in.next();
//        }
//
//        try {
//            Class cl = Class.forName(name);
//            Class supercl = cl.getSuperclass();
//            String modifiers = Modifier.toString(cl.getModifiers());
//
//            if (modifiers.length() > 0) {
//                System.out.print(modifiers + " ");
//            }
//
//            System.out.print("class " + name + " ");
//
//            if (supercl != null && supercl != Object.class) {
//                System.out.print("extends" + supercl.getName());
//            }
//
//            System.out.print("{\n");
//
//            printField(cl);
//            System.out.println();
//
//            printConstructors(cl);
//            System.out.println();
//
//            printMethods(cl);
//
//            System.out.println("}");
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.exit(0);
//
//    }
//
//    public static void printConstructors(Class cl) {
//        Constructor[] constructors = cl.getDeclaredConstructors();
//
//        for (Constructor c : constructors) {
//            String name = c.getName();
//
//            System.out.print("    ");
//
//            String modifiers = Modifier.toString(c.getModifiers());
//            if (modifiers.length() > 0) {
//                System.out.print(modifiers + " ");
//            }
//
//            System.out.print(name + "(");
//
//            Class[] parameterTypes = c.getParameterTypes();
//            for (int i = 0; i < parameterTypes.length; i++) {
//                if (i > 0) {
//                    System.out.print(", ");
//                }
//                String n = parameterTypes[i].getName();
//                System.out.print(n);
//            }
//            System.out.println(")");
//        }
//    }
//
//    public static void printMethods(Class cl){
//        Method[] metheds = cl.getDeclaredMethods();
//
//        for (Method m : metheds){
//            Class returnType = m.getReturnType();
//            String name = m.getName();
//
//            System.out.print("    ");
//
//            String modifiers = Modifier.toString(m.getModifiers());
//            if (modifiers.length() > 0){
//                System.out.print(modifiers + " ");
//            }
//            System.out.print(returnType.getName() + name + "(");
//
//            Class[] parameterTypes = m.getParameterTypes();
//            for (int i = 0; i < parameterTypes.length; i++){
//                if (i > 0){
//                    System.out.print(", ");
//                }
//                System.out.print(parameterTypes[i].getName());
//            }
//            System.out.println(")");
//        }
//    }
//
//    public static void printField(Class cl){
//        Field[] fields = cl.getDeclaredFields();
//        for (Field f : fields){
//            Class type = f.getType();
//            String name = f.getName();
//            String modifiers = Modifier.toString(f.getModifiers());
//
//            if (modifiers.length() > 0){
//                System.out.print("    " + modifiers + " ");
//            }
//
//            System.out.println(type.getName() + name + ";");
//        }
//    }
//}