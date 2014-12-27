package com.zyzzyxtech.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Ken on 12/26/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        super.onCreate();
        Parse.initialize(this, "yAuyzglSo7nLzgkS2OVFdVGj6lWwWm5FE01M6Jtr", "bN67hNWszlq7K5JKr85Z2ML0QkmvzfJL62KpJsKD");


    }
}