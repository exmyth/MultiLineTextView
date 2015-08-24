package com.exmyth.utils;

import android.content.Context;
import android.util.TypedValue;

public class DimensionUtil {
	
	public static int width = 0;
	public static int height = 0;
	public static int densityDpi = 0;
	public static float density = 0F;

	private DimensionUtil(){
		
	}
	
	/**
	 * Converts dip or dp value px value, to ensure the same size
	 * 
	 * @param context
	 * @param dipValue
	 * @return
	 */
	public static float dip2px(Context context, float dipValue) {
		float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
				dipValue, context.getResources().getDisplayMetrics());
		return px;
	}
	
	public static float sp2px(Context context, float dipValue) {
		float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
				dipValue, context.getResources().getDisplayMetrics());
		return px;
	}
}
