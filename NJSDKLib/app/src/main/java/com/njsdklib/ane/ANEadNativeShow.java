package com.njsdklib.ane;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.njsdklib.extensions.ErayCommonJavaContext;
import cn.cmgame.billing.api.game.main.Listener;
import cn.cmgame.billing.api.game.main.Tool;

public class ANEadNativeShow implements FREFunction {
	private ErayCommonJavaContext _context = null;
	@Override
	public FREObject call(FREContext context,FREObject[] arg1) {
		// TODO Auto-generated method stub
		_context = (ErayCommonJavaContext) context;
		FREObject b = null;
		double px = 0;
		double py = 0;
		double pw = 0;
		double ph = 0;
		try
		{
			px = arg1[0].getAsDouble();
			py = arg1[1].getAsDouble();
			pw = arg1[2].getAsDouble();
			ph = arg1[3].getAsDouble();
		}
		catch(Exception e)
		{
			_context.dispatchStatusEventAsync("ANEadNativeShow", e.toString());
			return null;
		}
		Log.i("ANE", "ANEadNativeShow");
		Tool.adNativeShow(_context.getActivity(),(float)px,(float)py,(float)pw,(float)ph);
		_context.dispatchStatusEventAsync("ANEadNativeShow","success");
		return b;
	}

}
