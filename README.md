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
byte(8 bit, -128..+127), short(16 bit, -2^15.._2^15-1), int(32 bit, -2^31..+2^31-1), long(64 bit, -2^63..+2^63-1) - целочисленные типы, отличающиеся объемом.
int decimal = 99; //десятичная.
int octal = 0755; //восьмиричная.
int hex = 0xFF; //шестнадцатиричная.
int binary = 0b101; //двоичная.
int tenMillion = 10_000_000; //_ для больших чисел.
long tenBillion = 10_000_000_000L;
float, double - вещественные типы, отличающиеся емкостью.
int a = 100;
int b = a;
Арифметика:
a = a + b; | a += b;
a+b;a-b;a*b;a/b;a%b;a++;--a-b--.

byte a = 127;
a++;
b = -128.
Чем выше позиция в списке, тем выше приоритет оператора, т.е. тем раньше он применяется. Чтобы не запутаться, рекомендуется использовать скобки.
постфиксные: expr++ expr--
﻿унарные: ++expr --expr +expr -expr ~ !
мультипликативные: * / %
аддитивные: + -
сдвиги: << >> >>>
сравнения: < > <= >= instanceof
равенство: == !=
побитовое И: &
побитовое исключительное ИЛИ: ^
побитовое ИЛИ: |
логическое И: &&
логическое ИЛИ: ||
тернарный: ? :
присваивания: = += -= *= /= %= &= ^= |= <<= >>= >>>=

Остальное ссылочные типы(ячейка памяти, содержащая ссылку на место в памяти, содержащее объект String.
String s = "Hello World";
String t = s;
String u = null;
!!! Java нельзя получить численное значение адреса объекта и делать с ним арифметику !!!
boolean brushedTeethToday = true;
boolean haveDog = false;
boolean iKnowMath = 1 < 100; // <, <=, >, >=, ==, !=.
boolean fromInt = 10; - error.
boolean haveSpareTime = !isBusy; // отрицание.
boolean canGoToPark = haveSpareTime(если false, дальше не идет) && weatherIsGood; // и, & полный проход.
boolean hadGoodTime = learnedJavaOnStepic(если false, дальше не идет) || wentToPark; // или, | полный проход.
boolean tastesGood = addedKetchup ^ addedHoney; // исключающее или.
Допускаются сокращенные виды записи:
value &= expression;
value |= expression;
value ^= expression;

public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
return ((a != b) && (c != d)) || ((a != c) && (b != d));
}
or 
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
return ((a != b) && (c != d)) || ((a != c) && (b != d));
}