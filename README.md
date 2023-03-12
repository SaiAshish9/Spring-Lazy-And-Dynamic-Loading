<img width="868" alt="Screenshot 2023-03-12 at 11 14 55 PM" src="https://user-images.githubusercontent.com/43849911/224562621-8d2fbc0a-61e9-4134-a74e-d2b86d30f0bb.png">

https://www.imperva.com/learn/performance/lazy-loading/#:~:text=rendered%20or%20executed.-,Lazy%20Loading%20vs.,entities%20referenced%20by%20a%20resource

https://github.com/jeeftor/SpringBoot-Dynamic-JarLoad

https://medium.com/@Jeef/dynamically-loading-libraries-into-a-springboot-application-at-run-time-80639ee5aab

```
Spring boot lazy initialization was introduced at 2.2 version. 

Sometimes , we might need some of the beans to lazy initialize due to project requirements at the time of application start.


ApplicationContext and
BeanFactory by default lazy loads. It creates the beans only one time and loads when they are called via get method

ApplicationContext loads all the singleton beans upon the startup.
```

<img width="1050" alt="Screenshot 2023-03-12 at 11 46 21 PM" src="https://user-images.githubusercontent.com/43849911/224564205-6ffb24a1-ac8e-45d2-b42c-5599282ecd9e.png">

<img width="944" alt="Screenshot 2023-03-12 at 11 48 05 PM" src="https://user-images.githubusercontent.com/43849911/224564298-83eb7781-30de-4f50-be81-1da9e714d5a5.png">

<img width="948" alt="Screenshot 2023-03-12 at 11 49 44 PM" src="https://user-images.githubusercontent.com/43849911/224564363-cbb2b6f0-7ce4-4591-b23c-69254a275db9.png">

<img width="943" alt="Screenshot 2023-03-12 at 11 52 14 PM" src="https://user-images.githubusercontent.com/43849911/224564481-9b120dad-935c-49b3-be03-9d445b3e0f86.png">

<img width="940" alt="Screenshot 2023-03-12 at 11 53 41 PM" src="https://user-images.githubusercontent.com/43849911/224564546-da44a1e9-37c5-4a9a-a16f-c0a5ddbff1e4.png">

```
Product2 is eager initialization and Product1 is lazy initialization

2023-03-12T23:53:14.515+05:30  INFO 3726 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 637 ms
Product2 initialized
2023-03-12T23:53:14.612+05:30  INFO 3726 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-03-12T23:53:14.628+05:30  INFO 3726 --- [           main] com.sai.Lazy.LazyApplication             : Started LazyApplication in 1.069 seconds (process running for 1.51)
Product1 initialized
Product1 : mac
Product2 : ubuntu
```


