package com.naman14.timber;

import android.util.Log;

/**
 * @author hujiawei 15/12/7
 */
public class Singleton {

    static final String TAG = Singleton.class.getSimpleName();

    private String msg;
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    private Singleton() {
    }

    private String testMethod(String name){
        msg = "test() called with: " + "name = [" + name + "]";
        Log.d(TAG, msg);
        Log.d(TAG, "test() returned: " + name);
        return name;
    }

}
