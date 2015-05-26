package recom.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;

import recom.dto.RecomemberInfoDto;
import recom.dto.RecomemberRegisterDto;

@RunWith(Seasar2.class)
public class RecomemberServiceTest {

	@Test
	public void testInsertRecomemberInfoDto() {
		RecomemberRegisterDto dto = new RecomemberRegisterDto();
		dto.memberName = "登録テスト";
		dto.talkStatus = "なし";

		RecomemberService s = new RecomemberService();
		s.insert(dto);

		RecomemberInfoDto recomemberInfoDto = s.searchRecomember("登録テスト");
		assertEquals(recomemberInfoDto,dto.memberName);
	}

	@Test
	public void testGetAllRecomemberDto() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetDeleteDto() {
		fail("まだ実装されていません");
	}

	@Test
	public void testChangeDeleteStatus() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetEditDto() {
		fail("まだ実装されていません");
	}

	@Test
	public void testUpdateRecomember() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSearchRecomember() {
		fail("まだ実装されていません");
	}

	@Test
	public void testCountSearchResults() {
		fail("まだ実装されていません");
	}

	@Test
	public void testCountAllRecomemeber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testCountTalkRecomember() {
		fail("まだ実装されていません");
	}

}
