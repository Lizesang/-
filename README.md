# Huat_SHP
项目名称：校园二手交易平台
***
## 涉及技术
前端：JSP  
后端：java + JSTL + AJAX  
框架：Spring + SpringMVC + Mybatis  
***
## 开发软件
开发平台：IntelliJ IDEA 2020.1  
数据库：MySQL 5.7
***
## 平台角色
一、游客  
二、会员用户  
三、管理员  
***
## 系统基本功能
一、游客和会员用户都可以直接进入平台主页面进行商品的查看和搜索；  
  
二、游客可以注册账户，成为会员用户，登录之后可以查看商品信息并购买，并在订单中心生成购买商品订单，在卖家订单中心生成兜售商品订单，完成基本的卖家发货，买家收货、验货和确认收货，最终完成交易；  
  
三、会员用户可以在平台上发布自己想兜售的商品，并可以随时修改商品信息或者直接删除商品；  
  
四、管理员可以通过后台对用户、商品、订单等信息进行管理。  
***
## 配置信息
该系统没有用到maven等项目管理工具，下载后只需要在`jdbc.properties`中修改数据库配置，以及将`huat_shp.sql`导入数据库中即可；  
再通过idea打开项目，并运行，如果出现一些小问题请自行解决；  
另外还需要注意数据库版本得是`MySQL 5.7`，如果是MySQL 8.0的话可能会出现一些问题，导致数据库连接不上。
***
## 系统展示
### 首页
![](https://github.com/Lizesang/picture/raw/master/首页.png)
### 搜索商品
![](https://github.com/Lizesang/picture/raw/master/搜索商品.png)
### 注册
![](https://github.com/Lizesang/picture/raw/master/注册.png)
### 登录
![](https://github.com/Lizesang/picture/raw/master/登录.png)
### 查看商品信息
![](https://github.com/Lizesang/picture/raw/master/查看商品信息.png)
### 个人中心
![](https://github.com/Lizesang/picture/raw/master/个人中心.png)
### 订单中心
![](https://github.com/Lizesang/picture/raw/master/订单中心.png)
### 发布商品
![](https://github.com/Lizesang/picture/raw/master/发布商品.png)
### 查看兜售商品信息
![](https://github.com/Lizesang/picture/raw/master/查看兜售商品信息.png)
### 个人信息
![](https://github.com/Lizesang/picture/raw/master/个人信息.png)
### 钱包管理
![](https://github.com/Lizesang/picture/raw/master/钱包管理.png)
### 管理员登录
![](https://github.com/Lizesang/picture/raw/master/管理员登录.png)
### 后台管理主页
![](https://github.com/Lizesang/picture/raw/master/后台管理主页.png)
### 用户信息管理
![](https://github.com/Lizesang/picture/raw/master/用户信息管理.png)
### 商品信息管理
![](https://github.com/Lizesang/picture/raw/master/商品信息管理.png)
### 订单信息管理
![](https://github.com/Lizesang/picture/raw/master/订单信息管理.png)
### 钱包审核
![](https://github.com/Lizesang/picture/raw/master/钱包审核.png)
