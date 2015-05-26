<%@ page  pageEncoding="UTF-8"%>
<html>
<head>
 <title>Welcome to Recom</title>
 <link rel="stylesheet" href='${f:url("/css/style.css")}'>
</head>
<body align="center">

 <h1>Recom(レコム)へようこそ！</h1>

 <html:errors/>
 <s:form>
  <table class="login" align="center">
   <tr>
    <td>ユーザーID</td><td><input type="text" name="userId"></td>
   </tr>
   <tr>
    <td>パスワード</td><td><input type="password" name="password" ></td>
   </tr>
  </table>
  <br/>
  <input type="submit" name="goTop" value="ログイン">
 </s:form>
</body>
</html>