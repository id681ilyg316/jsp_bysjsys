## 本项目实现的最终作用是基于JSP毕业设计管理系统
## 分为4个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 专业管理
 - 发布校级通知
 - 学院管理
 - 查看首页
 - 班级管理
 - 用户注册
 - 管理员登录
### 第2个角色为设计文稿，实现了如下功能：
 - PPT截图
 - 截图1
### 第3个角色为教师角色，实现了如下功能：
 - 教师登录
 - 查看已提交课题信息
 - 查看并修改个人信息
 - 查看待审批课题
 - 查看所带课题状态
 - 查看首页
 - 消息管理
### 第4个角色为学生角色，实现了如下功能：
 - 下载论文
 - 学生登录
 - 查看中期检查
 - 查看并修改个人信息
 - 查看开题报告
 - 查看选题信息
 - 查看首页
 - 消息管理
## 数据库设计如下：
# 数据库设计文档

**数据库名：** bysjsys

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [class](#class) | 班级信息表 |
| [college](#college) |  |
| [dept](#dept) |  |
| [inspection](#inspection) |  |
| [message](#message) | 留言信息表 |
| [notice](#notice) |  |
| [paper](#paper) |  |
| [report](#report) |  |
| [task](#task) |  |
| [user](#user) | 用户表 |

**表名：** <a id="class">class</a>

**说明：** 班级信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | classid |   varchar   | 255 |   0    |    N     |  Y   |       |   |
|  2   | cname |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 分类名称  |
|  3   | deptid |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 部门ID  |

**表名：** <a id="college">college</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | collegeid |   varchar   | 255 |   0    |    N     |  Y   |       |   |
|  2   | cname |   varchar   | 255 |   0    |    N     |  N   |       |   |

**表名：** <a id="dept">dept</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | deptid |   varchar   | 255 |   0    |    N     |  Y   |       | 部门ID  |
|  2   | dname |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | collegeid |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="inspection">inspection</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | inspectionid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | taskid |   int   | 10 |   0    |    N     |  N   |       |   |
|  3   | progress |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  4   | problem |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  5   | teaopinion |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | deptopinion |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  7   | subtime |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="message">message</a>

**说明：** 留言信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | messageid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | fromid |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | toid |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | title |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  5   | content |   varchar   | 5000 |   0    |    N     |  N   |       | 内容  |
|  6   | filename |   varchar   | 255 |   0    |    N     |  N   |       | 文件名  |
|  7   | newname |   varchar   | 255 |   0    |    N     |  N   |       | 新的名字  |
|  8   | subtime |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="notice">notice</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | noticeid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | ntitle |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | scope |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | ncontent |   varchar   | 5000 |   0    |    N     |  N   |       |   |
|  5   | time |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 时间  |

**表名：** <a id="paper">paper</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | paperid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | taskid |   int   | 10 |   0    |    N     |  N   |       |   |
|  3   | filename |   varchar   | 255 |   0    |    N     |  N   |       | 文件名  |
|  4   | newname |   varchar   | 255 |   0    |    N     |  N   |       | 新的名字  |
|  5   | subtime |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="report">report</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | reportid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | taskid |   int   | 10 |   0    |    N     |  N   |       |   |
|  3   | overview |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  4   | goal |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  5   | method |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  6   | innovation |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  7   | progress |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  8   | requirement |   varchar   | 1000 |   0    |    N     |  N   |       |   |
|  9   | teaopinion |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  10   | deptopinion |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  11   | subtime |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="task">task</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | taskid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | title |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | summary |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | stuid |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  5   | teaid |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  6   | status |   varchar   | 255 |   0    |    N     |  N   |       | 状态  |
|  7   | subtime |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  8   | level |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="user">user</a>

**说明：** 用户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | username |   varchar   | 255 |   0    |    N     |  Y   |       | 用户名  |
|  2   | password |   varchar   | 255 |   0    |    N     |  N   |       | 密码  |
|  3   | role |   varchar   | 255 |   0    |    N     |  N   |       | 角色  |
|  4   | lasttime |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  5   | realname |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  6   | collegeid |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  7   | deptid |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 部门ID  |
|  8   | classid |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  9   | email |   varchar   | 45 |   0    |    Y     |  N   |   NULL    | 邮箱  |
|  10   | telphone |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**运行不出来可以微信 javape 我的公众号：源码码头**
