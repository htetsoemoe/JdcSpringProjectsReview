/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/10.0.7
 * Generated at: 2022-08-08 11:14:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dateTime_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/Users/DELL/.m2/repository/org/springframework/spring-webmvc/5.3.21/spring-webmvc-5.3.21.jar", Long.valueOf(1658388090453L));
    _jspx_dependants.put("jar:file:/C:/Users/DELL/.m2/repository/org/springframework/spring-webmvc/5.3.21/spring-webmvc-5.3.21.jar!/META-INF/spring.tld", Long.valueOf(1655257556000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.time.LocalDateTime value;

  public java.time.LocalDateTime getValue() {
    return this.value;
  }

  public void setValue(java.time.LocalDateTime value) {
    this.value = value;
    jspContext.setAttribute("value", value);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getValue() != null ) 
      _jspx_page_context.setAttribute("value", getValue());

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- To format date time in access-info.tag -->\r\n");
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_spring_005feval_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f0 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    boolean _jspx_th_spring_005feval_005f0_reused = false;
    try {
      _jspx_th_spring_005feval_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));
      // /WEB-INF/tags/dateTime.tag(6,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f0.setExpression("T(java.time.format.DateTimeFormatter).ofPattern('yyyy-MM-dd HH:mm:ss').format(value)");
      int[] _jspx_push_body_count_spring_005feval_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f0 = _jspx_th_spring_005feval_005f0.doStartTag();
        if (_jspx_th_spring_005feval_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f0);
      _jspx_th_spring_005feval_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005feval_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005feval_005f0_reused);
    }
    return false;
  }
}
