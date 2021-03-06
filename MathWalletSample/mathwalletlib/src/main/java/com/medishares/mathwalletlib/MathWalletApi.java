package com.medishares.mathwalletlib;

import android.content.Context;

import com.medishares.mathwalletlib.bean.MathWalletLogin;
import com.medishares.mathwalletlib.bean.MathWalletPay;

public interface MathWalletApi {

    void requestLogin(Context context, MathWalletLogin mathWalletLogin, MathWalletCallBack callBack);

    void requestPay(Context context, MathWalletPay mathWalletPay, MathWalletCallBack callBack);
}
