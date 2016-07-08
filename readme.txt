重点是在配置多渠道名称这块。

在项目中market.txt中配置(名称可以随便取)

还需要在gradle.properties中添加market=market.txt(重要)

设置渠道不在AndroidManifest.xml而是在Application(最重要)

最后运行gradlew  clean apkRelease

打出来的包在项目的build下(可以配置，打包完成的时候也可以看到路径;例子 项目文件夹所在地址/\PackerNgDemo\build\archives)