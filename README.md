# RabbitMQ-SpringBoot-12306-client
## 功能说明
需要结合RabbitMQ-SpringBoot-12306-server
1. 模拟用户抢票操作，使用jmeter访问controller或者手写线程访问controller，然后把抢票的用户发送到队列中，这时候等待server处理请求的返回