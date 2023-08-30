Git - распределенная система управления версиями.
GitHub - сервис хостинга репозиторией Git.
*сохраняет разные версии проекта;
*быстрый переход межуд версиями;
*откат;
*командная разработка;
*независимая одновременная разработка.
git --version
$ git config --global user.name
$ git config -- user.email bolotinn5@mail.ru
$ get config --list

javac -classpath lib.jar Main.java
java -classpath lib.jar:hw.jar Main /* ; - windows : linux
В JAR-архиве может быть специальный файл с метаданными — META-INF/MANIFEST.MF.
Формат JAR основан на формате ZIP.
JDK Набор инструментов для разработки Java-программ, включая компилятор
JRE Набор инструментов для запуска Java-программ, включая виртуальную машину
JVM Виртуальная машина Java
JIT Подход к реализации виртуальной машины, при котором байткод не интерпретируется, а компилируется в машинный код для исполнения аппаратным процессором
JAR Формат архива, в который обычно упаковывают Java-программы и библиотеки

Main.java
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("It's alive! It's alive!");
    }
}

Среды разработки:
IntelluJ IDEA
NetBeans
Eclipse

ant - build.xml;
gradle - build.gradle;
maven - pom.xml;

/*...*/
/**...*/ javadoc comments

import java.security.MessageDigest;
public class Main{
    public static void main (String[] args) throws Exception{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("gleb".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}

boolean - логический тип
char - символьный, хранящий 1 символ.
byte, short, int, long - целочисленные типы, отличающиеся объемом.
float, double - вещественные типы, отличающиеся емкостью.
int a = 100;
int b = a;
Остальное ссылочные типы(ячейка памяти, содержащая ссылку на место в памяти, содержащее объект String.
String s = "Hello World";
String t = s;
String u = null;
!!! Java нельзя получить численное значение адреса объекта и делать с ним арифметику !!!
boolean brushedTeethToday = true;
boolean haveDog = false;
boolean iKnowMath = 1 < 100; /* <, <=, >, >=, ==, !=.
boolean fromInt = 10; - error.
boolean haveSpareTime = !isBusy; // отрицание.
boolean canGoToPark = haveSpareTime(если false, дальше не идет) && weatherIsGood; // и, & полный проход.
boolean hadGoodTime = learnedJavaOnStepic(если false, дальше не идет) || wentToPark; // или, | полный проход.
boolean tastesGood = addedKetchup ^ addedHoney; // исключающее или.
Допускаются сокращенные виды записи:
value &= expression;
value |= expression;
value ^= expression;

