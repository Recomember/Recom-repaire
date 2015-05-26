<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript">

</script>
<title>Recom -Top-</title>
<link rel="stylesheet" href='${f:url("/css/style.css")}'>
</head>
<body>
 <header id="header" align="center">
  <h1>Recom</h1>
  <s:form action="/logout">
   <input type="submit" name="logout" value="ログアウト">
  </s:form>
  <a href="${f:url("goTop") }">Top</a>
  <a href="${f:url("showList") }">List</a>
  <a href="${f:url("newRegisterRecomember") }">Register</a>
 </header>
 <section id="main" align="center">
  <h2>今日もレコメンバーと話そう！</h2>
  <div id="board" align="center">
   あなたのRecomemberさん<br>${countAllRecomember}人<br/>
   <br>
   会話したことがあるRecomemberさん<br>${countTalkRecomember}人<br/>
   <br>
   会話率<br>${ratioOfTalkedRecomember}%<br/>
   <br/>
	あと残り ${countNotTalkRecomember} 人と話せば100%!!
  </div>
 </section>
 <footer id="footer" align="center">
 All rights reserved by Recom
 </footer>
</body>
</html>