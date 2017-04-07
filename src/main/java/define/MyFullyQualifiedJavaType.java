package define;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;

public class MyFullyQualifiedJavaType extends FullyQualifiedJavaType {

	public MyFullyQualifiedJavaType(String fullTypeSpecification) {
		super(fullTypeSpecification);
	}

	public String getShortName(){
		String shortName=super.getShortName();
		//System.out.println("---shortName:"+shortName);
		return shortName;
	   
	}
}
