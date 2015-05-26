<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<title>削除確認画面</title>
</head>
<body align="center">
<header id="header">
 <h1>Recom</h1>
  <s:form action="/logout">
   <input type="submit" name="logout" value="ログアウト">
  </s:form>
 <p>
  <a href="${f:url("goTop") }">Top</a>
  <a href="${f:url("showList") }">List</a>
  <a href="${f:url("newRegisterRecomember") }">Register</a>
 </p>
</header>
<section id="main">
 <h2>以下の情報を削除してもよろしいですか？</h2>
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
<c:forEach var="deleteDto" items="${recomemberdeleteDto.recomemberDeleteDtos}">
<input type="hidden" value="${deleteDto.recomemberId}" name="recomemberId">
<tr>
<td>${deleteDto.talkStatus}</td>
<td>${deleteDto.memberName}</td>
<td>${deleteDto.phoneNumber}</td>
<td>${deleteDto.favoriteFood}</td>
<td>${deleteDto.birthYear}</td>
<td>${deleteDto.birthMonth}</td>
<td>${deleteDto.birthDay}</td>
<td>${deleteDto.note}</td>
</tr>
</c:forEach>
</table>
<br/>
<input type="submit" name="showList" value="一覧に戻る">
<input type="submit" name="deleteComplete" data-id="${deleteDto.recomemberId}" value="削除">
</s:form>
</section>
 <footer id="footer" align="center">
 All rights reserved by Recom
 </footer>
</body>
</html>