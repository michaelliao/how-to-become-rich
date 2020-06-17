# How to Become Rich

This is a tutorial about how to publish a Maven artifact to GitHub:

https://www.liaoxuefeng.com/wiki/1252599548343744/1347981037010977

### Usage

Add the following to `pom.xml`:

```
<project ...>

    ...

    <repositories>
        <repository>
            <id>github-rich-repo</id>
            <name>The Rich Repository on Github</name>
            <url>https://michaelliao.github.io/how-to-become-rich/maven-repo/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.itranswarp.rich</groupId>
            <artifactId>how-to-become-rich</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>

    ...

</project>
```

### Sample code

```
Millionaire millionaire = new Millionaire();
System.out.println(millionaire.howToBecomeRich());
```
