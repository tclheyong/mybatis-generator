package define;

import org.mybatis.generator.api.dom.DefaultXmlFormatter;
import org.mybatis.generator.api.dom.xml.Document;

public class MyXmlFormater  extends DefaultXmlFormatter {
	
	public String getFormattedContent(Document compilationUnit){
		
		String formatterContent=compilationUnit.getFormattedContent();
		formatterContent=formatterContent.replace("Mapper", "Dao");
		//System.out.println("-formatterContent:"+formatterContent);
		
	    return formatterContent;
	}
}
