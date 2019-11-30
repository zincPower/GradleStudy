# GradleStudy

>目录<br/>
>一、项目宗旨<br/>
>二、已有章节<br/>
>三、后续章节<br/>
>四、如何使用该项目<br/>
>五、其他项目推荐<br/>
>六、作者简介

## 一、项目宗旨

本项目主要用于记录 Android Gradle 学习中的点滴。

![](https://github.com/zincPower/GradleStudy/blob/master/img/logo.png)

### 1、博文讲解可移步至以下两个地方：

CSDN: [Android Gradle](https://blog.csdn.net/weixin_37625173/category_9350766.html)

掘金：[猛猛的小盆友](https://juejin.im/user/5c3033ef51882524ec3a88ba/posts)

### 2、代码：

github: [GradleStudy](https://github.com/zincPower/GradleStudy)

## 二、已有章节

### 1、buildTypes

- CSDN: [buildTypes——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/100824010)

- 掘金: [buildTypes——安卓gradle](https://juejin.im/post/5d7e01125188253a8305480a)

- github代码: [传送门](https://github.com/zincPower/GradleStudy/blob/master/app/zinc_buildTypes.gradle)

### 2、defaultConfig

- CSDN: [defaultConfig——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/100641538)

- 掘金: [defaultConfig——安卓gradle](https://juejin.im/post/5d7baa7d51882554841c50d5)

- github代码: [传送门](https://github.com/zincPower/GradleStudy/blob/master/app/zinc_defaultConfig.gradle)

### 3、productFlavors

- CSDN: [flavorDimensions和productFlavors——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/100867037)

- 掘金: [flavorDimensions和productFlavors——安卓gradle](https://juejin.im/post/5da7215ef265da5b576bebbd)

- github代码: [传送门](https://github.com/zincPower/GradleStudy/blob/master/app/zinc_flavor.gradle)

### 4、风味包配置

- CSDN: [android多渠道包（风味包）——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/102510549)

- 掘金: [android多渠道包（风味包）——安卓gradle](https://juejin.im/post/5da722dbf265da5b8e0f1773)

- github代码: [传送门](https://github.com/zincPower/FlavorDemo)

### 5、sourceSets

- CSDN: [sourceSets——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/102616036)

- 掘金: [sourceSets——安卓gradle](https://juejin.im/post/5dd9eda7f265da7de667d2bc)

- github代码: [传送门](https://github.com/zincPower/GradleStudy/blob/master/app/zinc_sourceSets.gradle)

### 6、lintOptions

- CSDN: [lintOptions——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/103236227)

- 掘金: [lintOptions——安卓gradle](https://juejin.im/post/5ddca7a0518825730753a31e)

- github代码: [传送门](https://github.com/zincPower/GradleStudy/blob/master/app/zinc_lintOptions.gradle)

### 7、splits

- CSDN: [splits——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/103284575)

- 掘金: [splits——安卓gradle](https://juejin.im/post/5ddfe513e51d45027e2a7e96)

- github代码: [传送门](https://github.com/zincPower/GradleStudy/blob/master/app/zinc_splits.gradle)

### 8、signingConfigs

- CSDN: [signingConfigs——安卓 gradle](https://blog.csdn.net/weixin_37625173/article/details/103322670)

- 掘金: [signingConfigs——安卓 gradle](https://juejin.im/post/5de298266fb9a0719f649a6d)

- github代码: [传送门](https://github.com/zincPower/GradleStudy/blob/master/app/zinc_sigingConfigs.gradle)

## 三、后续章节

- dexOptions
- externalNativeBuild
- aaptOptions
- adbOptions
- packagingOptions
- compileOptions
- dataBinding
- testOptions

## 四、如何使用该项目

1. 打开根目录下的 settings.gradle 文件

2. 修改下面这段代码
```
// xxx 即我们想运行的 gradle 配置
// 例如：我们想运行 lintOptions 的配置，此处的 xxx 替换为 zinc_lintOptions
project(':app').buildFileName = 'xxx.gradle'
```

## 五、其他项目推荐

### 1、Android 高级UI

简介：分享Android中UI的一些知识和应用

项目地址：[UI2018](https://github.com/zincPower/UI2018)

### 2、JRecycleView

简介：简单的让RecycleView更有趣

项目地址：[JRecycleView](https://github.com/zincPower/JRecycleView)

### 3、JPermission

简介：Android（安卓）基于注解的6.0权限动态申请

项目地址：[JPermission](https://github.com/zincPower/JPermission)

## 六、作者简介
### 1、个人博客

掘金：https://juejin.im/user/5c3033ef51882524ec3a88ba/posts

csdn：https://blog.csdn.net/weixin_37625173

### 2、赞赏

如果觉得博客对您有所帮助或启发，赞赏下吧。小盆友会写更多的优质文章与大家分享

![](https://github.com/zincPower/GradleStudy/blob/master/img/zincPay.jpg)
