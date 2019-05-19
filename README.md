## 数字输入系统
> 用户可根据提供的word/pdf文档中的试卷，进行数字输入测试，限时十分钟，共400个数字。
### 需求
* 限时：10min
* 实现倒计时功能，计时结束自动提交
* 每个页面5个框，可输入五个数字
* 按enter键自动跳转至下一个输入框，可自动翻页
* 输入数字无小数点
* 可按向上键返回上一个输入框,但不可返回到上一页
* 计算得分 0.25分/个
* 显示输入错入的记录 包括序号，用户输入及正确答案
#### TODO

* [ ] 用户注册
* [ ] 用户登录
* [ ] 日志输出记录
* [ ] 读取pdf中数据存入数据库
* [ ] 给用户随机分配试卷
* [ ] 记录用户最近十次测试成绩（只记录分数）
* [ ] 可分为等级练习和随机练习两部分：
> 等级练习：先从练习3位数开始，当用户分数超过60分之后，可解锁下一等级，练习4位数，
> 随机练习：类似于考试模式，数据随机生成，各个位数的数占比不一

* [ ] 对开页面，左边是pdf数据，右边是测试页面，pdf可下载，左边框可收起