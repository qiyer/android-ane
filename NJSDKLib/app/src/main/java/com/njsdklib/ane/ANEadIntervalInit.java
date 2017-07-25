package com.njsdklib.ane;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.njsdklib.extensions.ErayCommonJavaContext;
import cn.cmgame.billing.api.game.main.Listener;
import cn.cmgame.billing.api.game.main.Tool;

public class ANEadIntervalInit implements FREFunction {
	private ErayCommonJavaContext _context = null;
	@Override
	public FREObject call(FREContext context,FREObject[] arg1) {
		// TODO Auto-generated method stub
		_context = (ErayCommonJavaContext) context;
		FREObject b = null;
		Log.i("ANE", "ANEadIntervalInit");
		Tool.adIntervalInit(_context.getActivity(), new Listener() {
			@Override
			public void onAdClick(String s) {
				Log.i("ANE", s);
				_context.dispatchStatusEventAsync("onAdClick",s);
			}

			@Override
			public void onAdClosed(String s) {
				Log.i("ANE", s);
				_context.dispatchStatusEventAsync("onAdClosed",s);
			}

			@Override
			public void onAdFailed(String s) {
				Log.i("ANE", s);
				_context.dispatchStatusEventAsync("onAdFailed",s);
			}

			@Override
			public void onAdInitFailed(String s) {
				Log.i("ANE", s);
				_context.dispatchStatusEventAsync("onAdInitFailed",s);
			}

			@Override
			public void onAdInitSucessed(String s) {
				Log.i("ANE", s);
				_context.dispatchStatusEventAsync("onAdInitSucessed",s);
			}

			@Override
			public void onAdNoAd(String s) {
				Log.i("ANE", s);
				_context.dispatchStatusEventAsync("onAdNoAd",s);
			}

			@Override
			public void onAdPresent(String s) {
				Log.i("ANE", s);
				_context.dispatchStatusEventAsync("onAdPresent",s);
			}
		});
		_context.dispatchStatusEventAsync("adIntervalInit", "success");
		return b;
	}

}
