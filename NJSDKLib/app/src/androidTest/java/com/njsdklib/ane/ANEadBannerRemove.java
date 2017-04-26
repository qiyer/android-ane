package com.njsdklib.ane;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.njsdklib.extensions.ErayCommonJavaContext;
import cn.cmgame.billing.api.game.main.Listener;
import cn.cmgame.billing.api.game.main.Tool;

public class ANEadBannerRemove implements FREFunction {
	private ErayCommonJavaContext _context = null;
	@Override
	public FREObject call(FREContext context,FREObject[] arg1) {
		// TODO Auto-generated method stub
		_context = (ErayCommonJavaContext) context;
		FREObject b = null;

		Tool.adBannerRemove(_context.getActivity());
		_context.dispatchStatusEventAsync("ANEadBannerRemove","success");
		return b;
	}

}
