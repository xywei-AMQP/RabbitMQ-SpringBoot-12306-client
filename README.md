# RabbitMQ-SpringBoot-12306-client
## 功能说明
需要结合RabbitMQ-SpringBoot-12306-server
1. 模拟用户抢票操作，使用jmeter访问controller或者手写线程访问controller，然后把抢票的用户发送到队列中，这时候等待server处理请求的返回

## 问题
1. 使用rabbitMQ的时候，使用哪种工作模型？
2. 需要不需要在web服务启动的时候就创建队列？还是用到的时候就创建队列？  
3. 用户抢票了，如何返回用户抢票的结果？如何提醒用户是成功了还是失败了？

## 实践
1. 先实现队列server接收用户抢票信息和返回用户抢票是否成功的信息给client，验证队列是否能流量削峰。
2. 再探讨如何实现用户看到自己抢票的结果！
3. 接着研究exchange在何时创建！
4. 最后优化代码，重构
