<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<title>編集画面</title>
</head>
<body align="center">
 <header id="header">
  <h1>Recom</h1>
  <s:form action="/logout">
   <input type="submit" name="logout" value="ログアウト">
  </s:form>
  <a href="${f:url("goTop") }">Top</a>
  <a href="${f:url("showList") }">List</a>
  <a href="${f:url("newRegisterRecomember") }">Register</a>
 </header>
 <section id="main">
  <h2>Recomemberを編集します。</h2>
   <html:errors/>
   <s:form>
   <input type="hidden" value="${f:h(recomemberId)}" name="recomemberId">
    <div>
 会話した経験：<html:select property="talkStatus" value="${recomemberEditDto.talkStatus }">
  <html:option value="なし" />
  <html:option value="あり"/>
  </html:select>
 </div><br/>
 <div>
  名前：
  <input type="text" name="memberName" value="${recomemberEditDto.memberName}"/>
 </div><br/>
 <div>
  電話番号：
  <input type="text" name="phoneNumber" value="${recomemberEditDto.phoneNumber}"/>
 </div><br/>
  <div>
  好きな食べ物のジャンル
  <html:select property="favoriteFood" value="${recomemberEditDto.favoriteFood}">
   <html:option value=""/>
   <html:option value="和食"/>
   <html:option value="ラーメン"/>
   <html:option value="カレー"/>
   <html:option value="洋食"/>
   <html:option value="イタリアン・フレンチ"/>
   <html:option value="アジア・エスニック料理"/>
   <html:option value="中華"/>
  </html:select>
 </div><br/>
 <div>
  誕生日<br>
 <html:select property="birthYear" value="${recomemberEditDto.birthYear}">
 <html:option value="">----</html:option>
 <html:option value="1950">1950</html:option>
 <html:option value="1951">1951</html:option>
 <html:option value="1952">1952</html:option>
 <html:option value="1953">1953</html:option>
 <html:option value="1954">1954</html:option>
 <html:option value="1955">1955</html:option>
 <html:option value="1956">1956</html:option>
 <html:option value="1957">1957</html:option>
 <html:option value="1958">1958</html:option>
 <html:option value="1959">1959</html:option>
 <html:option value="1960">1960</html:option>
 <html:option value="1961">1961</html:option>
 <html:option value="1962">1962</html:option>
 <html:option value="1963">1963</html:option>
 <html:option value="1964">1964</html:option>
 <html:option value="1965">1965</html:option>
 <html:option value="1966">1966</html:option>
 <html:option value="1967">1967</html:option>
 <html:option value="1968">1968</html:option>
 <html:option value="1969">1969</html:option>
 <html:option value="1970">1970</html:option>
 <html:option value="1971">1971</html:option>
 <html:option value="1972">1972</html:option>
 <html:option value="1973">1973</html:option>
 <html:option value="1974">1974</html:option>
 <html:option value="1975">1975</html:option>
 <html:option value="1976">1976</html:option>
 <html:option value="1977">1977</html:option>
 <html:option value="1978">1978</html:option>
 <html:option value="1979">1979</html:option>
 <html:option value="1980">1980</html:option>
 <html:option value="1981">1981</html:option>
 <html:option value="1982">1982</html:option>
 <html:option value="1983">1983</html:option>
 <html:option value="1984">1984</html:option>
 <html:option value="1985">1985</html:option>
 <html:option value="1986">1986</html:option>
 <html:option value="1987">1987</html:option>
 <html:option value="1988">1988</html:option>
 <html:option value="1989">1989</html:option>
 <html:option value="1990">1990</html:option>
 <html:option value="1991">1991</html:option>
 <html:option value="1992">1992</html:option>
 <html:option value="1993">1993</html:option>
 <html:option value="1994">1994</html:option>
 <html:option value="1995">1995</html:option>
 <html:option value="1996">1996</html:option>
 <html:option value="1997">1997</html:option>
 <html:option value="1998">1998</html:option>
 <html:option value="1999">1999</html:option>
 <html:option value="2000">2000</html:option>
 <html:option value="2001">2001</html:option>
 <html:option value="2002">2002</html:option>
 <html:option value="2003">2003</html:option>
 <html:option value="2004">2004</html:option>
 <html:option value="2005">2005</html:option>
 <html:option value="2006">2006</html:option>
 <html:option value="2007">2007</html:option>
 <html:option value="2008">2008</html:option>
 <html:option value="2009">2009</html:option>
 <html:option value="2010">2010</html:option>
 <html:option value="2011">2011</html:option>
 <html:option value="2012">2012</html:option>
 <html:option value="2013">2013</html:option>
 <html:option value="2014">2014</html:option>
 <html:option value="2015">2015</html:option>
 <html:option value="2016">2016</html:option>
 <html:option value="2017">2017</html:option>
 <html:option value="2018">2018</html:option>
 <html:option value="2019">2019</html:option>
 <html:option value="2020">2020</html:option>
</html:select>年
 <html:select property="birthMonth" value="${recomemberEditDto.birthMonth}">
 <html:option value="">--</html:option>
<html:option value="1">1</html:option>
<html:option value="2">2</html:option>
<html:option value="3">3</html:option>
<html:option value="4">4</html:option>
<html:option value="5">5</html:option>
<html:option value="6">6</html:option>
<html:option value="7">7</html:option>
<html:option value="8">8</html:option>
<html:option value="9">9</html:option>
<html:option value="10">10</html:option>
<html:option value="11">11</html:option>
<html:option value="12">12</html:option>
 </html:select>月
 <html:select property="birthDay" value="${recomemberEditDto.birthDay}">
<html:option value="">--</html:option>
<html:option value="1">1</html:option>
<html:option value="2">2</html:option>
<html:option value="3">3</html:option>
<html:option value="4">4</html:option>
<html:option value="5">5</html:option>
<html:option value="6">6</html:option>
<html:option value="7">7</html:option>
<html:option value="8">8</html:option>
<html:option value="9">9</html:option>
<html:option value="10">10</html:option>
<html:option value="11">11</html:option>
<html:option value="12">12</html:option>
<html:option value="13">13</html:option>
<html:option value="14">14</html:option>
<html:option value="15">15</html:option>
<html:option value="16">16</html:option>
<html:option value="17">17</html:option>
<html:option value="18">18</html:option>
<html:option value="19">19</html:option>
<html:option value="20">20</html:option>
<html:option value="21">21</html:option>
<html:option value="22">22</html:option>
<html:option value="23">23</html:option>
<html:option value="24">24</html:option>
<html:option value="25">25</html:option>
<html:option value="26">26</html:option>
<html:option value="27">27</html:option>
<html:option value="28">28</html:option>
<html:option value="29">29</html:option>
<html:option value="30">30</html:option>
<html:option value="31">31</html:option>
 </html:select>日
 </div>
 <div>
  ノート<br>
  <html:textarea property="Note" value="${recomemberEditDto.note}" />
 </div>
<br/>
   <input type="submit" name="showList" value="一覧に戻る">
   <input type="submit" name="editConfirm" value="編集確認">
   </s:form>
 </section>
 <footer id="footer" align="center">
 All rights reserved by Recom
 </footer>
</body>
</html>