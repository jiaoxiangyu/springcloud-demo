# spring-cloud-demo
spring cloud demo (Finchley版本)

旧版  
├── discovery-eureka 注册中心服务端eureka（包含组件：注册中心eureka-server）  
├── provider 提供者服务（包含组件：注册中心eureka-client）  
├── provider-copy 提供者服务-copy（包含组件：注册中心eureka-client）  
├── consumer 消费者服务（包含组件：注册中心eureka-client、远程调用openFeign（其中还包含负载均衡ribbon、断路器hystrix）断路器监控hystrix-dashboard、配置中心客户端config-client、消息总线bus、请求链路跟踪日志sleuth-zipkin）  
├── consumer-copy 消费者服务-copy（包含组件：注册中心eureka-client、远程调用openFeign（其中还包含负载均衡ribbon、断路器hystrix）  
├── hystrix-dashboard 断路器执行监控（包含组件：注册中心eureka-client、断路器监控hystrix-dashboard）  
├── hystrix-turbine 断路器聚合监控（包含组件：注册中心eureka-client、断路器聚合监控hystrix-turbine）  
├── zuul-proxy 路由zuul（包含组件：注册中心eureka-client、路由zuul）  
├── config-server 配置中心服务端config（包含组件：注册中心eureka-client、配置中心config-server、消息总线bus）  
  
新版  
├── provider-consul 提供者服务（包含组件：注册中心客户端consul-client）  
├── provider-consul-copy 提供者服务（包含组件：注册中心客户端consul-client）  
├── consumer-consul 消费者服务（包含组件：注册中心客户端consul-client、远程调用openFeign（其中还包含负载均衡ribbon、断路器hystrix）、配置中心客户端consul-client）  
├── admin-server 应用监控服务端admin（包含组件：注册中心客户端consul-client、应用监控服务端admin-server）  
├── admin-client 应用监控客户端admin-client（包含组件：注册中心客户端consul-client、应用监控客户端admin-client）  






