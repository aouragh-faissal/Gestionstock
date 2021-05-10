package com.gestion.stock.flicker;

import java.io.InputStream;

public interface IFlickrPhoto {

	public String savePhoto(InputStream photo, String title) throws Exception;
}
