package com.gestion.stock.flicker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.flickr4java.flickr.util.IOUtilities;

public class FlickrPhoto implements IFlickrPhoto{
	
	private Flickr flickr;

    private UploadMetaData uploadMetaData = new UploadMetaData();


	
	
private void connect(){
    	
    	final Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("key.properties");
			prop.load(input);
		}
		catch (final IOException ex) {
			ex.printStackTrace();
		} 
		finally {
            IOUtilities.close(input);
        }
		
		String apikey = prop.getProperty("apikey");
		String secret = prop.getProperty("secret");
		String token = prop.getProperty("token");
		String tokensecret = prop.getProperty("tokensecret");
		
		flickr = new Flickr(apikey, secret, new REST());
        Auth auth = new Auth();
        auth.setPermission(Permission.READ);
        auth.setToken(token);
        auth.setTokenSecret(tokensecret);
        RequestContext requestContext = RequestContext.getRequestContext();
        requestContext.setAuth(auth);
        flickr.setAuth(auth);
    }

@Override
public String savePhoto(InputStream photo, String title) throws Exception{
    connect();
    uploadMetaData.setTitle(title);
    String photoId = flickr.getUploader().upload(photo, uploadMetaData);
    return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
}

}
