package com.njsdklib.ane;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.njsdklib.extensions.ErayCommonJavaContext;
import cn.cmgame.billing.api.game.main.Listener;
import cn.cmgame.billing.api.game.main.Tool;

public class ANEadInit implements FREFunction {
	private ErayCommonJavaContext _context = null;
	@Override
	public FREObject call(FREContext context,FREObject[] arg1) {
		// TODO Auto-generated method stub
		_context = (ErayCommonJavaContext) context;
		FREObject b = null;
		Log.i("ANE","ANEadInit");
		try{
			Tool.adInit(_context.getActivity());
		}catch(Exception e){
			Log.i("ANE-ANEadInit",e.toString());
			_context.dispatchStatusEventAsync("adInit",e.toString());
			return null;
		}finally {
			_context.dispatchStatusEventAsync("adInit","success");
		}

		return b;
	}

}
