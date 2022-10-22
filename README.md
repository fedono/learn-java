- Java源码本质上是一个文本文件，我们需要先用 javac 把 Hello.java编译成字节码文件Hello.class，然后，用java命令执行这个字节码文件：
    - javac 来执行 .java 文件，生成 .class 文件
    - 使用 java 来执行 .class 文件
    - 可执行文件javac是编译器，而可执行文件java就是虚拟机
    - 有一些童鞋可能知道，直接运行java Hello.java也是可以的：
    ```java
        $ java Hello.java 
        Hello, world!
    ```
        这是Java 11新增的一个功能，它可以直接运行一个单文件源码！

        需要注意的是，在实际项目中，单个不依赖第三方库的Java源码是非常罕见的，所以，绝大多数情况下，我们无法直接运行一个Java源码文件，原因是它需要依赖其他的库。
- 可以在 这里搜索你的 package https://developer.aliyun.com/mvn/search
    - 
- 这是第一个可以运行起来的程序，可以通过 localhost:8080 可以看到的结果的程序
    - https://spring.io/guides/gs/spring-boot/    
    - 在 demos/gc-spring-boot/initial 下使用  ./gradlew bootRun 来启动
        - 使用 ./gradlew bootRun 应该是第一次启动，再次就可以直接 gradle bootRun 吧
        - 在 HelloController.java 中写代码吧，这样可以用来调试
        - 然后在 localhost:8080 下查看代码是否能运行成功
    - 配置代码改动后自动重启应用
        - Devtools global settings properties in the $HOME/.config/spring-boot directory when devtools is active.
            - 使用 which java 找到 java 的地址 /usr/bin/java
            - 然后设置全局的环境变量 $JAVA_HOME 为`/Library/Java/JavaVirtualMachines/jdk-16.0.2.jdk/Contents/Home` 
            - 首先是找到 java 在哪里，这里是在 Library/Java 下
        - 先需要找到全局的设置文件 
            - https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#using.devtools.globalsettings
        - https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#using.running-your-application
        -     https://www.jb51.net/article/136925.htm