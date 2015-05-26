package recom.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import recom.dto.LoginInfoDto;
import recom.dto.UserInfoDto;
import recom.entity.Recomuser;

public class LoginService extends S2AbstractService<Recomuser> {

	@Resource
	public LoginInfoDto loginInfoDto;
	/**
	 * フォームの入力値とDBの値を比較するメソッド
	 * @return 比較した結果（true or false）
	 */
	public boolean matchLoginInfo(String userId, String password){
		UserInfoDto userInfoDto = getuserInfoDto(userId);
		return (userId.equals(userInfoDto.userId) && password.equals(userInfoDto.password));
	}

	/**
	 * DBからエンティティをIdをもとに取得する
	 * @return UserInfoDto ユーザーIDとパスワード
	 */
	private UserInfoDto  getuserInfoDto(String userId){

		Recomuser userEntity = select().where(new SimpleWhere().eq("userId", userId)).getSingleResult(); 	//値を全件取得する

		UserInfoDto userInfoDto = createUserInfoDto(userEntity);

		return userInfoDto;
	}

	/**
	 * DBのレコードをDtoに格納する
	 * @param userEntity DBからの値
	 * @return
	 */
	private UserInfoDto createUserInfoDto(Recomuser userEntity){
		UserInfoDto userInfoDto = new UserInfoDto();
		userInfoDto.userId = userEntity.userId;
		userInfoDto.password = userEntity.password;
		return userInfoDto;

	}

}
