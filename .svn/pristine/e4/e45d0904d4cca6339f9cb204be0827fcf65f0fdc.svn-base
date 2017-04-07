package define;

import org.mybatis.generator.api.dom.DefaultJavaFormatter;
import org.mybatis.generator.api.dom.java.CompilationUnit;

public class MyJavaFormater  extends DefaultJavaFormatter {
	
	public String getFormattedContent(CompilationUnit compilationUnit){
		String shortName=compilationUnit.getType().getShortName();
		String formatterContent=compilationUnit.getFormattedContent();
		//System.out.println("shortName:"+shortName+",formatterContent:"+formatterContent);
		if(shortName.endsWith("Mapper")){
			formatterContent=formatterContent.replaceFirst("Mapper extends", "Dao extends");
		}
		compilationUnit.getType().getShortName();
		
		//compilationUnit.getType().
		
	    return formatterContent;
	}
}
