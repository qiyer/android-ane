package com.njsdklib.ane;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.njsdklib.extensions.ErayCommonJavaContext;
import cn.cmgame.billing.api.game.main.Listener;
import cn.cmgame.billing.api.game.main.Tool;

public class ANEadIntervalShow implements FREFunction {
	private ErayCommonJavaContext _context = null;
	@Override
	public FREObject call(FREContext context,FREObject[] arg1) {
		// TODO Auto-generated method stub
		_context = (ErayCommonJavaContext) context;
		FREObject b = null;
		int num = 0;
		try
		{
			num = arg1[0].getAsInt();
		}
		catch(Exception e)
		{
			_context.dispatchStatusEventAsync("ANEadIntervalShow", e.toString());
			return null;
		}
		Tool.adIntervalShow(_context.getActivity(),num);
		_context.dispatchStatusEventAsync("ANEadIntervalShow","success");
		return b;
	}

}
