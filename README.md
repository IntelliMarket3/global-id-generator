# 全局ID生成器

> 稍加改动的雪花算法

## 各个bit位含义

* 第一位为固定位1，指定id为非负数。
* 第2位 ～第42位， 一共41位长度。为当前时间戳。
* 第43位～第45位，一共3位长度。表示不同的业务领域。
* 第46位～第52位，一共7位长度。表示当前机器id
* 第53位～第64位，一共12位长度。表示同一时间戳下的递增id。

## 使用

继承`com.dpitech.common.utils.uid.AbstractUnionIdProcessor`模版类并实现其抽象方法即可。

## Others

源码以及jar包已经上传团队maven仓库：[maven-repo](https://packages.aliyun.com/repos/2030781-release-71jW1l/packages)

[设计思路](https://www.yuque.com/dpitech/dy2rme/pvhyo5)