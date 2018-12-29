package com.huotu.android.couponsleague.utils

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.liulishuo.filedownloader.FileDownloader
import com.squareup.leakcanary.LeakCanary


object AppInit {

    fun init(context :Application){

        CrashHandler.instance.init(context)

        Fresco.initialize( context)

        if(!LeakCanary.isInAnalyzerProcess(context)){
            LeakCanary.install(context)
        }

        //初始化下载组件库
        FileDownloader.setupOnApplicationOnCreate(context)


    }


}