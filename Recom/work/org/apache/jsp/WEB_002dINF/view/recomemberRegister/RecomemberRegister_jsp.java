/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-22 02:09:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.recomemberRegister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RecomemberRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("f:url", org.seasar.struts.taglib.S2Functions.class, "url", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/common/common.jsp", Long.valueOf(1431143320000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>登録</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>登録ページ</h1>\n");
      out.write("<h2>\n");
      out.write("<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/index\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("'>TOP</a>\n");
      out.write("<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/recomemberRegister\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("'>登録</a>\n");
      out.write("<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/recomemberList\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("'>一覧</a>\n");
      out.write("</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("Recomemberを登録します。<br>\n");
      out.write("\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<br>\n");
      out.write("<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/logout\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("'>ログアウト</a>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.seasar.struts.taglib.S2FormTag _jspx_th_s_005fform_005f0 = (org.seasar.struts.taglib.S2FormTag) _005fjspx_005ftagPool_005fs_005fform.get(org.seasar.struts.taglib.S2FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<table border=1>\n");
        out.write("\n");
        out.write("\t<tr><th>名前</th><th><input id=\"new-name\" type=\"text\" name=\"newName\" required>\n");
        out.write("\t</th></tr><tr><th>電話番号</th><th><input id=\"new-phone\" type=\"text\" name=\"newPhone\"><br>\n");
        out.write("\t</th></tr><tr><th>誕生日</th><th>\n");
        out.write("\t\n");
        out.write("\t<select name=\"year\" >\n");
        out.write("    <option label=\"1901\" value=\"1901\">1901</option>\n");
        out.write("    <option label=\"1902\" value=\"1902\">1902</option>\n");
        out.write("    <option label=\"1903\" value=\"1903\">1903</option>\n");
        out.write("    <option label=\"1904\" value=\"1904\">1904</option>\n");
        out.write("    <option label=\"1905\" value=\"1905\">1905</option>\n");
        out.write("    <option label=\"1906\" value=\"1906\">1906</option>\n");
        out.write("    <option label=\"1907\" value=\"1907\">1907</option>\n");
        out.write("    <option label=\"1908\" value=\"1908\">1908</option>\n");
        out.write("    <option label=\"1909\" value=\"1909\">1909</option>\n");
        out.write("    <option label=\"1910\" value=\"1910\">1910</option>\n");
        out.write("    <option label=\"1911\" value=\"1911\">1911</option>\n");
        out.write("    <option label=\"1912\" value=\"1912\">1912</option>\n");
        out.write("    <option label=\"1913\" value=\"1913\">1913</option>\n");
        out.write("    <option label=\"1914\" value=\"1914\">1914</option>\n");
        out.write("    <option label=\"1915\" value=\"1915\">1915</option>\n");
        out.write("    <option label=\"1916\" value=\"1916\">1916</option>\n");
        out.write("    <option label=\"1917\" value=\"1917\">1917</option>\n");
        out.write("    <option label=\"1918\" value=\"1918\">1918</option>\n");
        out.write("    <option label=\"1919\" value=\"1919\">1919</option>\n");
        out.write("    <option label=\"1920\" value=\"1920\">1920</option>\n");
        out.write("    <option label=\"1921\" value=\"1921\">1921</option>\n");
        out.write("    <option label=\"1922\" value=\"1922\">1922</option>\n");
        out.write("    <option label=\"1923\" value=\"1923\">1923</option>\n");
        out.write("    <option label=\"1924\" value=\"1924\">1924</option>\n");
        out.write("    <option label=\"1925\" value=\"1925\">1925</option>\n");
        out.write("    <option label=\"1926\" value=\"1926\">1926</option>\n");
        out.write("    <option label=\"1927\" value=\"1927\">1927</option>\n");
        out.write("    <option label=\"1928\" value=\"1928\">1928</option>\n");
        out.write("    <option label=\"1929\" value=\"1929\">1929</option>\n");
        out.write("    <option label=\"1930\" value=\"1930\">1930</option>\n");
        out.write("    <option label=\"1931\" value=\"1931\">1931</option>\n");
        out.write("    <option label=\"1932\" value=\"1932\">1932</option>\n");
        out.write("    <option label=\"1933\" value=\"1933\">1933</option>\n");
        out.write("    <option label=\"1934\" value=\"1934\">1934</option>\n");
        out.write("    <option label=\"1935\" value=\"1935\">1935</option>\n");
        out.write("    <option label=\"1936\" value=\"1936\">1936</option>\n");
        out.write("    <option label=\"1937\" value=\"1937\">1937</option>\n");
        out.write("    <option label=\"1938\" value=\"1938\">1938</option>\n");
        out.write("    <option label=\"1939\" value=\"1939\">1939</option>\n");
        out.write("    <option label=\"1940\" value=\"1940\">1940</option>\n");
        out.write("    <option label=\"1941\" value=\"1941\">1941</option>\n");
        out.write("    <option label=\"1942\" value=\"1942\">1942</option>\n");
        out.write("    <option label=\"1943\" value=\"1943\">1943</option>\n");
        out.write("    <option label=\"1944\" value=\"1944\">1944</option>\n");
        out.write("    <option label=\"1945\" value=\"1945\">1945</option>\n");
        out.write("    <option label=\"1946\" value=\"1946\">1946</option>\n");
        out.write("    <option label=\"1947\" value=\"1947\">1947</option>\n");
        out.write("    <option label=\"1948\" value=\"1948\">1948</option>\n");
        out.write("    <option label=\"1949\" value=\"1949\">1949</option>\n");
        out.write("    <option label=\"1950\" value=\"1950\">1950</option>\n");
        out.write("    <option label=\"\" value=\"\" selected=\"selected\">----</option>\n");
        out.write("    <option label=\"1951\" value=\"1951\">1951</option>\n");
        out.write("    <option label=\"1952\" value=\"1952\">1952</option>\n");
        out.write("    <option label=\"1953\" value=\"1953\">1953</option>\n");
        out.write("    <option label=\"1954\" value=\"1954\">1954</option>\n");
        out.write("    <option label=\"1955\" value=\"1955\">1955</option>\n");
        out.write("    <option label=\"1956\" value=\"1956\">1956</option>\n");
        out.write("    <option label=\"1957\" value=\"1957\">1957</option>\n");
        out.write("    <option label=\"1958\" value=\"1958\">1958</option>\n");
        out.write("    <option label=\"1959\" value=\"1959\">1959</option>\n");
        out.write("    <option label=\"1960\" value=\"1960\">1960</option>\n");
        out.write("    <option label=\"1961\" value=\"1961\">1961</option>\n");
        out.write("    <option label=\"1962\" value=\"1962\">1962</option>\n");
        out.write("    <option label=\"1963\" value=\"1963\">1963</option>\n");
        out.write("    <option label=\"1964\" value=\"1964\">1964</option>\n");
        out.write("    <option label=\"1965\" value=\"1965\">1965</option>\n");
        out.write("    <option label=\"1966\" value=\"1966\">1966</option>\n");
        out.write("    <option label=\"1967\" value=\"1967\">1967</option>\n");
        out.write("    <option label=\"1968\" value=\"1968\">1968</option>\n");
        out.write("    <option label=\"1969\" value=\"1969\">1969</option>\n");
        out.write("    <option label=\"1970\" value=\"1970\">1970</option>\n");
        out.write("    <option label=\"1971\" value=\"1971\">1971</option>\n");
        out.write("    <option label=\"1972\" value=\"1972\">1972</option>\n");
        out.write("    <option label=\"1973\" value=\"1973\">1973</option>\n");
        out.write("    <option label=\"1974\" value=\"1974\">1974</option>\n");
        out.write("    <option label=\"1975\" value=\"1975\">1975</option>\n");
        out.write("    <option label=\"1976\" value=\"1976\">1976</option>\n");
        out.write("    <option label=\"1977\" value=\"1977\">1977</option>\n");
        out.write("    <option label=\"1978\" value=\"1978\">1978</option>\n");
        out.write("    <option label=\"1979\" value=\"1979\">1979</option>\n");
        out.write("    <option label=\"1980\" value=\"1980\">1980</option>\n");
        out.write("    <option label=\"1981\" value=\"1981\">1981</option>\n");
        out.write("    <option label=\"1982\" value=\"1982\">1982</option>\n");
        out.write("    <option label=\"1983\" value=\"1983\">1983</option>\n");
        out.write("    <option label=\"1984\" value=\"1984\">1984</option>\n");
        out.write("    <option label=\"1985\" value=\"1985\">1985</option>\n");
        out.write("    <option label=\"1986\" value=\"1986\">1986</option>\n");
        out.write("    <option label=\"1987\" value=\"1987\">1987</option>\n");
        out.write("    <option label=\"1988\" value=\"1988\">1988</option>\n");
        out.write("    <option label=\"1989\" value=\"1989\">1989</option>\n");
        out.write("    <option label=\"1990\" value=\"1990\">1990</option>\n");
        out.write("    <option label=\"1991\" value=\"1991\">1991</option>\n");
        out.write("    <option label=\"1992\" value=\"1992\">1992</option>\n");
        out.write("    <option label=\"1993\" value=\"1993\">1993</option>\n");
        out.write("    <option label=\"1994\" value=\"1994\">1994</option>\n");
        out.write("    <option label=\"1995\" value=\"1995\">1995</option>\n");
        out.write("    <option label=\"1996\" value=\"1996\">1996</option>\n");
        out.write("    <option label=\"1997\" value=\"1997\">1997</option>\n");
        out.write("    <option label=\"1998\" value=\"1998\">1998</option>\n");
        out.write("    <option label=\"1999\" value=\"1999\">1999</option>\n");
        out.write("    <option label=\"2000\" value=\"2000\">2000</option>\n");
        out.write("    <option label=\"2001\" value=\"2001\">2001</option>\n");
        out.write("    <option label=\"2002\" value=\"2002\">2002</option>\n");
        out.write("    <option label=\"2003\" value=\"2003\">2003</option>\n");
        out.write("    <option label=\"2004\" value=\"2004\">2004</option>\n");
        out.write("    <option label=\"2005\" value=\"2005\">2005</option>\n");
        out.write("    <option label=\"2006\" value=\"2006\">2006</option>\n");
        out.write("    <option label=\"2007\" value=\"2007\">2007</option>\n");
        out.write("    <option label=\"2008\" value=\"2008\">2008</option>\n");
        out.write("    <option label=\"2009\" value=\"2009\">2009</option>\n");
        out.write("    <option label=\"2010\" value=\"2010\">2010</option>\n");
        out.write("</select>年\n");
        out.write("<select name=\"month\">\n");
        out.write("    <option value=\"\" selected=\"selected\">----</option>\n");
        out.write("    <option value=\"1\">1</option>\n");
        out.write("    <option value=\"2\">2</option>\n");
        out.write("    <option value=\"3\">3</option>\n");
        out.write("    <option value=\"4\">4</option>\n");
        out.write("    <option value=\"5\">5</option>\n");
        out.write("    <option value=\"6\">6</option>\n");
        out.write("    <option value=\"7\">7</option>\n");
        out.write("    <option value=\"8\">8</option>\n");
        out.write("    <option value=\"9\">9</option>\n");
        out.write("    <option value=\"10\">10</option>\n");
        out.write("    <option value=\"11\">11</option>\n");
        out.write("    <option value=\"12\">12</option>\n");
        out.write("</select>月\n");
        out.write("<select name=\"day\" >\n");
        out.write("    <option value=\"\" selected=\"selected\">----</option>\n");
        out.write("    <option value=\"1\">1</option>\n");
        out.write("    <option value=\"2\">2</option>\n");
        out.write("    <option value=\"3\">3</option>\n");
        out.write("    <option value=\"4\">4</option>\n");
        out.write("    <option value=\"5\">5</option>\n");
        out.write("    <option value=\"6\">6</option>\n");
        out.write("    <option value=\"7\">7</option>\n");
        out.write("    <option value=\"8\">8</option>\n");
        out.write("    <option value=\"9\">9</option>\n");
        out.write("    <option value=\"10\">10</option>\n");
        out.write("    <option value=\"11\">11</option>\n");
        out.write("    <option value=\"12\">12</option>\n");
        out.write("    <option value=\"13\">13</option>\n");
        out.write("    <option value=\"14\">14</option>\n");
        out.write("    <option value=\"15\">15</option>\n");
        out.write("    <option value=\"16\">16</option>\n");
        out.write("    <option value=\"17\">17</option>\n");
        out.write("    <option value=\"18\">18</option>\n");
        out.write("    <option value=\"19\">19</option>\n");
        out.write("    <option value=\"20\">20</option>\n");
        out.write("    <option value=\"21\">21</option>\n");
        out.write("    <option value=\"22\">22</option>\n");
        out.write("    <option value=\"23\">23</option>\n");
        out.write("    <option value=\"24\">24</option>\n");
        out.write("    <option value=\"25\">25</option>\n");
        out.write("    <option value=\"26\">26</option>\n");
        out.write("    <option value=\"27\">27</option>\n");
        out.write("    <option value=\"28\">28</option>\n");
        out.write("    <option value=\"29\">29</option>\n");
        out.write("    <option value=\"30\">30</option>\n");
        out.write("    <option value=\"31\">31</option>\n");
        out.write(" </select>日\n");
        out.write("\n");
        out.write("\t\n");
        out.write("\t<br>\n");
        out.write("\t</th></tr><tr><th>好きな食べ物のジャンル</th><th>\n");
        out.write("\t\t<select name=\"food\">\n");
        out.write("  \t\t<option value=\"\">選択してください</option>\n");
        out.write("  \t\t<option value=\"和食\">和食</option>\n");
        out.write("  \t\t<option value=\"洋食\">洋食</option>\n");
        out.write("  \t\t<option value=\"中華\">中華</option>\n");
        out.write("   \t\t</select><br>\n");
        out.write("   \t</th></tr><tr><th>話したことが</th><th>\n");
        out.write("\t\t<select name=\"talkFlag\">\n");
        out.write("  \t\t<option value=\"\">選択してください</option>\n");
        out.write("  \t\t<option value=\"1\">ある</option>\n");
        out.write("  \t\t<option value=\"0\" selected>ない</option>\n");
        out.write("   \t\t</select>\n");
        out.write("\t\t\n");
        out.write("\t</th></tr><tr><th>ノート</th><th>\n");
        out.write("\t\t<textarea name=\"note\" cols=40 rows=4></textarea></th></tr></table>\n");
        out.write("  \t\n");
        out.write("  \t<a href='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/recomemberList\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("'>一覧</a>\t\n");
        out.write("\t<input type=\"submit\" name=\"RecomemberRegisterConfirm\" value=\"確認\">\n");
        out.write("\t\t\n");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
