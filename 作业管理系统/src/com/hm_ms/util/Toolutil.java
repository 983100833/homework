package com.hm_ms.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.UnsupportedCharsetException;

public	class Toolutil {
	public static String encodeStr(String str) throws UnsupportedEncodingException {
		try {
			return new String(str.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
