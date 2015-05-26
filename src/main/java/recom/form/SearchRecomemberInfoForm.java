package recom.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class SearchRecomemberInfoForm {

	@Required
	public String searchText;

	@IntegerType
	public String page;

}
