# GradleStudy

## 一、项目宗旨

本项目主要用于记录 Android Gradle 学习中的点滴。

### 1、博文讲解可移步至以下两个地方：

CSDN: [Android Gradle](https://blog.csdn.net/weixin_37625173/category_9350766.html)

掘金：[猛猛的小盆友](https://juejin.im/user/5c3033ef51882524ec3a88ba/posts)

### 2、代码：

github: [GradleStudy](https://github.com/zincPower/GradleStudy)

## 二、已有章节

### 1、buildTypes

博文：[buildTypes——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/100824010)

### 2、defaultConfig

博文：[defaultConfig——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/100641538)

### 3、productFlavors

博文：[flavorDimensions和productFlavors——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/100867037)

### 4、风味包配置

博文：[android多渠道包（风味包）——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/102510549)

### 5、sourceSets

博文：[sourceSets——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/102616036)

### 6、lintOptions

博文：[lintOptions——安卓gradle](https://blog.csdn.net/weixin_37625173/article/details/103236227)

## 三、后续章节

- dexOptions
- externalNativeBuild
- aaptOptions
- adbOptions
- packagingOptions
- compileOptions
- dataBinding
- signingConfigs
- splits
- testOptions

## 四、如何使用该项目

1. 打开根目录下的 settings.gradle 文件

2. 修改下面这段代码
```
// xxx 即我们想运行的 gradle 配置
// 例如：我们想运行 lintOptions 的配置，此处的 xxx 替换为 zinc_lintOptions
project(':app').buildFileName = 'xxx.gradle'
```

## 四、其他项目推荐

### 1、Android 高级UI

简介：分享Android中UI的一些知识和应用

项目地址：[UI2018](https://github.com/zincPower/UI2018)

### 2、JRecycleView

简介：简单的让RecycleView更有趣

项目地址：[JRecycleView](https://github.com/zincPower/JRecycleView)

### 3、JPermission

简介：Android（安卓）基于注解的6.0权限动态申请

项目地址：[JPermission](https://github.com/zincPower/JPermission)

## 四、作者简介
### 1、个人博客

掘金：https://juejin.im/user/5c3033ef51882524ec3a88ba/posts

csdn：https://blog.csdn.net/weixin_37625173

### 2、赞赏

如果觉得博客对您有所帮助或启发，赞赏下吧。小盆友会写更多的优质文章与大家分享

![](https://github.com/zincPower/GradleStudy/blob/master/img/zincPay.jpg)