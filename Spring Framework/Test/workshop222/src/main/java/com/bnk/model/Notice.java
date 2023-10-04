package com.bnk.model;

public class Notice {
	private int seq;
	private String writer;
	private String title;
	private String cont;
	private String createdat;
	
	public Notice() {
		
	}
	

	public Notice(String writer, String title, String cont) {
		super();
		this.writer = writer;
		this.title = title;
		this.cont = cont;
	}




	public Notice(int seq, String writer, String title, String cont, String createdat) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.title = title;
		this.cont = cont;
		this.createdat = createdat;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Notice [seq=");
		builder.append(seq);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", title=");
		builder.append(title);
		builder.append(", cont=");
		builder.append(cont);
		builder.append(", createdat=");
		builder.append(createdat);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
