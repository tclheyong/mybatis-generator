package define;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.internal.util.StringUtility;

import tk.mybatis.mapper.generator.MapperCommentGenerator;

public class MyMapperPlugin extends tk.mybatis.mapper.generator.MapperPlugin{
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<String> mappers = new HashSet();
	  @SuppressWarnings("unused")
	private boolean caseSensitive = false;

	  public void setContext(Context context)
	  {
	    super.setContext(context);

	    CommentGeneratorConfiguration commentCfg = new CommentGeneratorConfiguration();
	    commentCfg.setConfigurationType(MapperCommentGenerator.class.getCanonicalName());
	    context.setCommentGeneratorConfiguration(commentCfg);
	  }

	  public void setProperties(Properties properties)
	  {
	    super.setProperties(properties);
	    String mappers = this.properties.getProperty("mappers");
	    if (StringUtility.stringHasValue(mappers)) {
	      for (String mapper : mappers.split(","))
	        this.mappers.add(mapper);
	    }
	    else {
	      throw new RuntimeException("Mapper插件缺少必要的mappers属性!");
	    }
	    String caseSensitive = this.properties.getProperty("caseSensitive");
	    if (StringUtility.stringHasValue(caseSensitive))
	      this.caseSensitive = caseSensitive.equalsIgnoreCase("TRUE");
	  }

	 public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
	  {
	    MyFullyQualifiedJavaType entityType = new MyFullyQualifiedJavaType(introspectedTable.getBaseRecordType());
	    for (String mapper : mappers) {
	      interfaze.addImportedType(new MyFullyQualifiedJavaType(mapper));
	      interfaze.addSuperInterface(new MyFullyQualifiedJavaType(mapper + "<" + entityType.getShortName() + ">"));
	    }

	    interfaze.addImportedType(entityType);
	    return true;
	  }

}
