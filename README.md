# boot-dubbo
SpringBoot版简单Dubbo的使用，思想很重要

1、下载并启动zookeeper；
2、配置application.properties中zookeeper地址；
3、模块结构：
    provider-api     生产者公共接口模块
    provider-service 生产者模块
    consumer         消费者模块
    
启动项目后直接访问：http://localhost:9001/buy 
