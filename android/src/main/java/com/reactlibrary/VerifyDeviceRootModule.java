package com.reactlibrary;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import com.scottyab.rootbeer.RootBeer;

@ReactModule(name = VerifyDeviceRootModule.NAME)
public class VerifyDeviceRootModule extends ReactContextBaseJavaModule {
    public static final String NAME = "VerifyDeviceRoot";
    private final ReactApplicationContext reactContext;

    public VerifyDeviceRootModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    @ReactMethod
    public void isRooted(Promise promise) {
        RootBeer rootBeer = new RootBeer(reactContext);
        promise.resolve(rootBeer.isRooted());
    }

    @ReactMethod
    public void isRootedWithBusyBoxCheck(Promise promise) {
        RootBeer rootBeer = new RootBeer(reactContext);
        promise.resolve(rootBeer.isRootedWithBusyBoxCheck());
    }
}
