package Q5;

public class Validator {
	
	public String checkComment(String comment)throws Exception{
		String[] str= {"abcde","Imno","pqrst","wxyz"};
		int c=0;
		for(int i=0;i<str.length;i++) {
			if(comment.contains(str[i])) {
				c++;
			}
		}
		if(c==1) {
			throw new SpamCommentException("spam comment");
		}else if(c>1) {
			throw new SpamCommentException("account ban due to spam comment");
		}
		return "comment is not a spam";
		
	}
	
	public String commentTheString(String comment)throws Exception{
		try {
			checkComment(comment);
			return("comment posted");
		}catch(SpamCommentException e) {
			return e.getMessage();
		}catch(Exception e) {
			return "other exception";
		}
		
	}

	public static void main(String[] args) throws Exception{
		
		Validator obj = new Validator();
		String s=obj.checkComment("hello my name is steve");
		String s1=obj.commentTheString("my comment is safe to post");
		
		System.out.println(s);
		System.out.println(s1);

	}

}
