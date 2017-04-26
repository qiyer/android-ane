package com.njsdklib.extensions;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.njsdklib.ane.ANEadBannerAdd;
import com.njsdklib.ane.ANEadBannerRemove;
import com.njsdklib.ane.ANEadBannerSetVisible;
import com.njsdklib.ane.ANEadFloatWinAdd;
import com.njsdklib.ane.ANEadFloatWinInit;
import com.njsdklib.ane.ANEadInit;
import com.njsdklib.ane.ANEadIntervalInit;
import com.njsdklib.ane.ANEadIntervalShow;
import com.njsdklib.ane.ANEadNativeInit;
import com.njsdklib.ane.ANEadNativeRemove;
import com.njsdklib.ane.ANEadNativeShow;

public class ErayCommonJavaContext extends FREContext {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		// TODO Auto-generated method stub
		Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>();

		//init
		functionMap.put("adInit",new ANEadInit());
		functionMap.put("adIntervalInit",new ANEadIntervalInit());
		functionMap.put("adIntervalShow",new ANEadIntervalShow());
		functionMap.put("adBannerAdd",new ANEadBannerAdd());
		functionMap.put("adBannerRemove",new ANEadBannerRemove());
		functionMap.put("adBannerSetVisible",new ANEadBannerSetVisible());
		functionMap.put("adFloatWinInit",new ANEadFloatWinInit());
		functionMap.put("adFloatWinAdd",new ANEadFloatWinAdd());
		functionMap.put("adNativeInit", new ANEadNativeInit());
		functionMap.put("adNativeShow", new ANEadNativeShow());
		functionMap.put("adNativeRemove",new ANEadNativeRemove());

		
		return functionMap;
	}

}
