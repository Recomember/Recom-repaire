<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<title>登録確認</title>
</head>
<body align="center">

<h1>Recom</h1>

<h2>下記の情報でよろしいですか？</h2>
<s:form>
<table align="center" border="1">
<tr>
<th>会話した経験</th>
<th>名前</th>
<th>電話番号</th>
<th>好きな食べ物のジャンル</th>
<th>誕生年</th>
<th>誕生月</th>
<th>誕生日</th>
<th>ノート</th>
</tr>
<tr>
	<td>${recomemberRegisterDto.talkStatus}</td>
	<td>${recomemberRegisterDto.memberName}</td>
	<td>${recomemberRegisterDto.phoneNumber}</td>
	<td>${recomemberRegisterDto.favoriteFood}</td>
	<td>${recomemberRegisterDto.birthYear}</td>
	<td>${recomemberRegisterDto.birthMonth}</td>
	<td>${recomemberRegisterDto.birthDay}</td>
	<td>${recomemberRegisterDto.Note}</td>
</tr>
</table>
<br/>
<input type="submit" name="newRegisterRecomember" value="登録画面に戻る">
<input type="submit" name="registerComplete" value="登録">
</s:form>
 <footer id="footer" align="center">
 All rights reserved by Recom
 </footer>
</body>
</html>