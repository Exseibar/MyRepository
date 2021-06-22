package generics;

public class Box<G> { // type parameter <>

	private G content;

//	public Box(G content) {
//		this.content = content;
//	}

	public G getContent() {
		return content;
	}

	public void setContent(G content) {
		this.content = content;
	}

}