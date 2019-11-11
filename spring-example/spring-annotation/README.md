# README

[toc]

## 1.组件注入的方式

### 1.1 `@Configuration` + `@Bean`

> 常用于导入第三方包

### 1.2 `@ComponentScan` + `@Controller|@Service|@Repository`

> 自定义的类

### 1.3 `@Import`

> 快速向 IoC 容器中导入一个 Bean。

- 导入一个实体类

注入该实体到 IoC 容器中， id 默认为类的全路径。

- 导入一个实现`ImportSelector`的类

返回需要导入的组件的全类名数组。

- 导入一个实现`AnnotationMetadata`的类

手动注册 Bean 的 IoC 容器中。

### 1.4 实现`FactoryBean`

- 默认获取的工厂 bean 为 `getObject()`方法返回的 Bean
- 如果要获取工厂自身的 Bean，则需要通过 `&beanName`获取 Bean
