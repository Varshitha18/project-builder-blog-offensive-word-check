package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {
	
	String[] offensive = {"a55hole", "acrotomophilia", "aeolus", "ahole", "alabama hot pocket", "alaskan pipeline", 
                 "anal", "anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e","areola","areole","arian","arrse","arse","arsehole","aryan","ass","ass fuck","ass fuck", "ass hole"};
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String title = blog.getBlogTitle().toLowerCase();
		for (String word : offensive) {
			if (title.contains(word)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String desc = blog.getBlogDescription().toLowerCase();
		for (String word : offensive) {
			if (desc.contains(word)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean checkBlog(Blog blog) {
		return checkBlogTitle(blog) && checkBlogDescription(blog);
	}
	
}