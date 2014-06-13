
package com.christianGrabowski.mySpending.app;

import android.os.Bundle;
import com.phonegap.api.*;

import org.apache.cordova.DroidGap;


public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///assets/www/mySpendingEmber/index.html");
    }


}