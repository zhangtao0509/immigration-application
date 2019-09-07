Mybatis generator 代码生成示例

1.下载代码生成器配置模板mybatisGenerator.xml

（1）<jdbcConnection>用于配置数据库连接
（2）<javaModelGenerator>用于配置javaBean生成路径以及规则
（3）<sqlMapGenerator>用于配置mybatis sql配置文件生成路径以及规则
（4）<table>用于指定用于生成代码的数据库表名称，支持通配符的形式

2.下载代码生成器jar包mybatis-generator-core-1.3.7.jar,执行以下命令以生成mybatis相关代码

java -jar mybatis-generator-core-x.x.x.jar -configfile \temp\mybatisGenerator.xml -overwrite
执行以上命令将使用-configfile参数指定上一步编辑好的配置文件生成代码。-overwrite参数将覆盖原目录下所生成的代码。

更多详细内容请参考官方文档 http://www.mybatis.org/generator/index.html