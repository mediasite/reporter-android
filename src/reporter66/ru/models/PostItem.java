package reporter66.ru.models;

import android.net.Uri;

public class PostItem {
	private long id;
	private Uri uri;
	private int type;
	private long post_id;
	private String path;
	private long external_id = -1;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Uri getUri() {
		return uri;
	}
	public void setUri(Uri uri) {
		this.uri = uri;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getPost_id() {
		return post_id;
	}
	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public long getExternal_id() {
		return external_id;
	}
	
	public void setExternal_id(long external_id) {
		this.external_id = external_id;
	}
	
	public boolean isSended(){
		if(this.external_id > -1)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return uri.toString();
	}
}
