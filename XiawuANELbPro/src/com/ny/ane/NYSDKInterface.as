package com.ny.ane
{
	import flash.external.ExtensionContext;
	
	public class NYSDKInterface extends BaseInterface
	{
		
		public function NYSDKInterface(_extContext:ExtensionContext)
		{
			super(_extContext);
		}
		
		public function adInit():void{
			extContext.call("adInit");
		}
		
		public function adIntervalInit():void{
			extContext.call("adIntervalInit");
		}
		
		public function adIntervalShow(pos: int = 0):void{
			extContext.call("adIntervalShow",pos);
		}
		
		public function adBannerAdd(pos: int = 0):void{
			extContext.call("adBannerAdd",pos);
		}
		
		public function adBannerRemove():void{
			extContext.call("adBannerRemove");
		}
		
		public function adBannerSetVisible(visible:Boolean = false):void{
			extContext.call("adBannerSetVisible",visible);
		}
		
		public function adFloatWinInit():void{
			extContext.call("adFloatWinInit");
		}
		
		public function adFloatWinAdd():void{
			extContext.call("adFloatWinAdd");
		}
		
		public function adNativeInit():void{
			extContext.call("adNativeInit");
		}
		
		public function adNativeShow(px:Number = 1.0, py:Number = 1.0,pw:Number = 1.0,ph:Number = 1.0):void{
			extContext.call("adNativeShow",px,py,pw,ph);
		}
		
		public function adNativeRemove():void{
			extContext.call("adNativeRemove");
		}
	}
}