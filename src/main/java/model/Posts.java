package model;

public class Posts {
	private int id;
	private String title;
	private String body;

	public Posts() {

	}

	public Posts(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
