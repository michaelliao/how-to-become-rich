# how-to-become-rich

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
