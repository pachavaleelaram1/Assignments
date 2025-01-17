Here are different ways to create a string in Java:

1. *Using String Literal*

```
String str = "Hello World";
```

2. *Using new Keyword*

```
String str = new String("Hello World");
```

3. *Using String Constructor with Character Array*

```
char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
String str = new String(charArray);
```

4. *Using String Constructor with Byte Array*

```
byte[] byteArray = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
String str = new String(byteArray);
```

5. *Using StringBuilder Class*

```
StringBuilder sb = new StringBuilder("Hello World");
String str = sb.toString();
```

6. *Using StringBuffer Class*

```
StringBuffer sb = new StringBuffer("Hello World");
String str = sb.toString();
```
