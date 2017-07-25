package com.njsdklib.extensions;


import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class ErayExtension implements FREExtension {

	public FREContext createContext(String arg0) {
		// TODO Auto-generated method stub
		return new ErayCommonJavaContext();
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void initialize() {
		// TODO Auto-generated method stub

	}



}
