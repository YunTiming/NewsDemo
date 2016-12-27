package com.example.administrator.newsdemo.app;

import android.app.Activity;
import android.app.Application;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/27.
 */

public class App  extends Application{
    private static App instance;
    private Set<Activity> allActivities;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;


    }

    public static synchronized App getInstance() {
        return instance;
    }

    public void addActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new HashSet<Activity>();
        }
        allActivities.add(act);
    }
    public void removeActivity(Activity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }
    public void exitApp() {
        if (allActivities != null) {
            synchronized (allActivities) {
                for (Activity act : allActivities) {
                    act.finish();
                }
            }
        }
        //从操作系统中结束掉当前程序的进程。
        android.os.Process.killProcess(android.os.Process.myPid());
        //
        System.exit(0);
    }
}
