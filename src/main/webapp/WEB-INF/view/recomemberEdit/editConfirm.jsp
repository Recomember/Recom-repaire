<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<title>編集確認</title>
</head>
<body align="center">
 <header id="header">
  <h1>Recom</h1>
  <s:form action="/logout">
   <input type="submit" name="logout" value="ログアウト">
  </s:form>
 </header>
 <section id="main">
  <h2>下記の情報で登録します。よろしいですか？</h2>
  <html:errors/>
  <s:form>
   <table align="center" border="1">
	<tr>
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
	 <td>${recomemberEditDto.talkStatus}</td>
     <td>${recomemberEditDto.memberName}</td>
     <td>${recomemberEditDto.phoneNumber}</td>
     <td>${recomemberEditDto.favoriteFood}</td>
     <td>${recomemberEditDto.birthYear}</td>
     <td>${recomemberEditDto.birthMonth}</td>
     <td>${recomemberEditDto.birthDay}</td>
     <td>${recomemberEditDto.note}</td>
    </tr>
   </table>
   <br/>
   <input type="hidden" value="${f:h(recomemberId)}" name="recomemberId">
   <input type="submit" name="backEdit" value="編集画面に戻る">
   <input type="submit" name="editComplete" value="編集完了">
  </s:form>
 </section>
<footer id="footer" align="center">
All rights reserved by Recom.
</footer>
</body>
</html>