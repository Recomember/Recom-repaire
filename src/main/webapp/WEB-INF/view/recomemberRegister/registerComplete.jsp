<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<title>登録完了画面</title>
</head>
<body align="center">
<h1>Recom</h1>
 <s:form action="/logout">
   <input type="submit" name="logout" value="ログアウト">
  </s:form>
<h2>登録完了!</h2>

 <a href="${f:url("showList") }">一覧に戻る</a>
 <footer id="footer" align="center">
 All rights reserved by Recom
 </footer>
</body>
</html>