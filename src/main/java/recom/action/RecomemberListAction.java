package recom.action;

import javax.annotation.Resource;

import org.seasar.framework.util.IntegerConversionUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.constant.RecomemberStatusConstant;
import recom.dto.RecomemberInfoDto;
import recom.form.RecomemberListForm;
import recom.service.RecomemberService;

/**
 * 一覧画面用アクションクラス
 * @author masayuki
 *
 */
public class RecomemberListAction {

	@ActionForm
	@Resource
	protected RecomemberListForm recomemberListForm;

	public RecomemberInfoDto recomemberInfoDto;

	@Resource
	public RecomemberService recomemberService;

	//前のページがあるか
	public boolean hasNext = false;

	//次のページがあるか
	public boolean hasPrev = false;

	//総件数
	public long total;


	/**
	 *  トップ画面表示
	 * @return トップ画面
	 */
	@Execute(validator = false)
	public String goTop() {
		return "/recomTop/goTop?redirect=true";
	}

	/**
	 * 一覧表示
	 * @return 一覧画面
	 */
	@Execute(validator = false)
	public String showList(){
		//総件数を取得
		this.total = recomemberService.countAllRecomemeber();

		int page = IntegerConversionUtil.toPrimitiveInt(this.recomemberListForm.page);

		recomemberInfoDto = recomemberService.getAllRecomemberDto(page);

		if(page != 0){
			
			hasPrev = true;
		}

		if((page + 1) * RecomemberStatusConstant.LIMIT < total){
			hasNext = true;
		}
		return "recomemberlist.jsp";
	}

	/**
	 * 新規登録画面表示
	 * @return 登録フォーム画面
	 */
	@Execute(validator = false)
	public String newRegisterRecomember(){
		return "../recomemberRegister/register.jsp";
	}

}
