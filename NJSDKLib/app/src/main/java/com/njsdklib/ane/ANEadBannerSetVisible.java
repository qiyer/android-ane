package com.njsdklib.ane;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.njsdklib.extensions.ErayCommonJavaContext;
import cn.cmgame.billing.api.game.main.Listener;
import cn.cmgame.billing.api.game.main.Tool;

public class ANEadBannerSetVisible implements FREFunction {
	private ErayCommonJavaContext _context = null;
	@Override
	public FREObject call(FREContext context,FREObject[] arg1) {
		// TODO Auto-generated method stub
		_context = (ErayCommonJavaContext) context;
		FREObject b = null;

		boolean visible = false;
		try
		{
			visible = arg1[0].getAsBool();
		}
		catch(Exception e)
		{
			_context.dispatchStatusEventAsync("ANEadBannerSetVisible", e.toString());
			return null;
		}
		Log.i("ANE", "ANEadBannerSetVisible");
		Tool.adBannerSetVisible(visible);
		_context.dispatchStatusEventAsync("ANEadBannerSetVisible","success");
		return b;
	}

}
