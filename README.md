# rabbitmq-consumer-example
- 스프링부트 rabbitMq 컨슈머 예제

## 개발 환경
- macOS
- java 17
- spring boot 3.4.1
- gradle 8.11.1

## Local 개발환경을 위한 Docker
- 프로듀서에서 실행
- 실행방법
  ```
  $ cd docker-rabbitmq && docker-compose up -d
  ```
- 도커 종료방법
  ```
  $ cd docker-rabbitmq && docker-compose down -v
  ```

## rabbitmq manager ui
- http://localhost:15672

## 구동
local: http://localhost:8082
