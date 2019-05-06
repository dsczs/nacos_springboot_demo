1.config.properties

    spring.datasource.driver-class-name=com.mysql.jdbc.Driver
    spring.datasource.url=jdbc:mysql://172.16.27.131:3306/test
    spring.datasource.username=root
    spring.datasource.password=123456

    testname=dev

2.测试地址
    http://localhost:8080/user/findUserById?id=12
    http://localhost:8080/user/testname