package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delcampaign_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" /> \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {\n");
      out.write("\tcolor: #FF0000;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write(" <style>\n");
      out.write("       body{\n");
      out.write("    background-image: url(images/img01.jpg); \n");
      out.write("                 \n");
      out.write("    }\n");
      out.write("    html {\n");
      out.write("  font: 16px 'Open sans', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("      @import url(https://fonts.googleapis.com/css?family=Dancing+Script:700);\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".header{\n");
      out.write(" height: 3em;\n");
      out.write(" background-color: #A6DCED;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar {width: 100%;  background-color: #A6DCED;\n");
      out.write("}\n");
      out.write("/* make navbar to be as wide as needed to hold all links - 10pts */\n");
      out.write("div.header ul.navbar li{\n");
      out.write("  display: inline-block;\n");
      out.write("  width: 22.6vw; \n");
      out.write("  height: 45px;\n");
      out.write("  margin-left: -5px;\n");
      out.write("  text-align: center;\n");
      out.write("  background-color: #A6DCED;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* make navbar links share the row and with proper padding - 10pts */\n");
      out.write("div.header ul.navbar li{\n");
      out.write("  display: inline-block;\n");
      out.write("  padding-top: 10px;\n");
      out.write("  vertical-align: top;\n");
      out.write("}\n");
      out.write(".navbar > li a:hover {\n");
      out.write("  color: rgb(150, 150, 150);\n");
      out.write("}\n");
      out.write("/* set grey color, sans-serif font and remove underline for links - 5pts */\n");
      out.write("a[href='index.html']{\n");
      out.write("  color: white;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write("a[href='http://medlifeweb.org/']{\n");
      out.write("  color:white;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write("a[href='contact.html']{\n");
      out.write("  color:white;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write("a[href='services.html']{\n");
      out.write("  color:white;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write("a[href='https://www.android.com/intl/en_us/auto/']{\n");
      out.write("  color:grey;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write("a[href='https://www.android.com/intl/en_us/one/']{\n");
      out.write("  color:grey;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write("a[href='https://www.android.com/intl/en_us/play/']{\n");
      out.write("  color:grey;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write(".header {\n");
      out.write("  background-image: url(\"http://www.medlifeweb.org/images/stories/Banner_Ecuador.jpg\");\n");
      out.write("background-color:white;\n");
      out.write("  background-size: cover;\n");
      out.write("background-position: center;\n");
      out.write("background-height:1em;\n");
      out.write("width:100%;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("padding-bottom: 286px\n");
      out.write("}\n");
      out.write(".body{\n");
      out.write("  width: 100%;\n");
      out.write("  background-color: white;\n");
      out.write("  border:solid white;\n");
      out.write("  border-width: 0 40px;\n");
      out.write("}\n");
      out.write(".head{\n");
      out.write("  margin-top:1em;\n");
      out.write("  font-size:xx-large;\n");
      out.write("  color:#6C87A3;\n");
      out.write("  text-align:center;\n");
      out.write("}\n");
      out.write(".body{\n");
      out.write("  color:black;\n");
      out.write("  text-align:justify;\n");
      out.write("  font-size:x-large;\n");
      out.write("  font-family: 'Dancing Script', cursive;\n");
      out.write("}\n");
      out.write(".head1{\n");
      out.write("   font-size:xx-large;\n");
      out.write("  color:#6C87A3;\n");
      out.write("  text-align:center;\n");
      out.write("  margin-top: 1em;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".foot{\n");
      out.write("  margin-top:4em;\n");
      out.write("  text-align:center;\n");
      out.write("  color: grey;\n");
      out.write("  background-color:black;\n");
      out.write("  position: relative;\n");
      out.write("  top: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("iframe { display: block; margin: 2em auto; }\n");
      out.write("            </style>\n");
      out.write("             <style>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("        \n");
      out.write("html {\n");
      out.write("  font: 16px 'Open sans', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form label {\n");
      out.write("  font-size: .9em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Base */\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html,\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Form */\n");
      out.write("\n");
      out.write("form {\n");
      out.write("  margin: 2% auto;\n");
      out.write("  padding: 1em;\n");
      out.write("  width: 320px;\n");
      out.write("  color: #aaa;\n");
      out.write("  border: .1em solid #ddd;\n");
      out.write("  border-color: black;\n");
      out.write("  position: relative;\n");
      out.write("  top:40px; \n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".name {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name input,\n");
      out.write(".submit input,\n");
      out.write("select,\n");
      out.write("textarea {\n");
      out.write("  width: 47%;\n");
      out.write("  height: 3em;\n");
      out.write("  text-indent: .5em;\n");
      out.write("  border: .1em solid #ddd;\n");
      out.write("\n");
      out.write("  outline-color: #1abc9c;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name input[name=\"surname\"] {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name input[type=\"mail\"] {\n");
      out.write("  margin-top: 1em;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".radio,\n");
      out.write(".dropdown,\n");
      out.write(".message,\n");
      out.write(".check,\n");
      out.write(".submit {\n");
      out.write("  margin-top: 1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown select,\n");
      out.write(".message textarea,\n");
      out.write(".submit input {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown select {\n");
      out.write("  color: #aaa;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".message textarea {\n");
      out.write("  height: 8em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".radio input,\n");
      out.write(".check input {\n");
      out.write("  position: relative;\n");
      out.write("  top: 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".radio input:before,\n");
      out.write(".check input:before {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  width: 1em;\n");
      out.write("  height: 1em;\n");
      out.write("  background: #e9e9e9;\n");
      out.write("\n");
      out.write("  transition: all .35s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".radio input:before {\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".radio input:checked:before {\n");
      out.write("  top: -.1em;\n");
      out.write("  left: -.1em;\n");
      out.write("  width: .5em;\n");
      out.write("  height: .5em;\n");
      out.write("  border: .35em solid #e9e9e9;\n");
      out.write("  background: #1abc9c;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".check input:checked:before {\n");
      out.write("  content: \"\\f00c\";\n");
      out.write("  font-family: 'fontAwesome';\n");
      out.write("  color: #1abc9c;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".check input:before {\n");
      out.write("  left: -.1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit input {\n");
      out.write("  //display: block;\n");
      out.write("  //margin: auto;\n");
      out.write("  //width: 99.5%;\n");
      out.write("  background: black;\n");
      out.write("  color: #fff;\n");
      out.write("  border: 0;\n");
      out.write("  border-bottom: solid darken(#1abc9c, 7%);\n");
      out.write("  font-size: 1em;\n");
      out.write("  font-weight: bold;\n");
      out.write("  &:focus,\n");
      out.write("  &:hover {\n");
      out.write("    background: #16a085;\n");
      out.write("    border-bottom-color: darken(#16a085, 7%);\n");
      out.write("  }\n");
      out.write("  &:active {\n");
      out.write("    background: #1bc2a2;\n");
      out.write("    border-bottom-color: darken(#1bc2a2, 7%);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t<h1>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write(" <div class=\"header\">\n");
      out.write("  \n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("               \n");
      out.write("<form action=\"UpdateDelProduct.jsp\" id=\"js-form\">\n");
      out.write("    <h1 style=\"color:black\">Delete Campaign</h1>\n");
      out.write("  <div class=\"name\">\n");
      out.write("      <br/>\n");
      out.write("      \n");
      out.write("    <input type=\"text\" name=\"cpname\" placeholder=\"Campaign Name\" style=\"border-color:black; position:relative; right:2px; width:300; top:20px  \"/>\n");
      out.write("    <br />\n");
      out.write("  <br />\n");
      out.write("  \n");
      out.write("   \n");
      out.write("    <br/> <br/>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    \n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("      <br />\n");
      out.write("      <br />\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("     \n");
      out.write("  <div class=\"submit\">\n");
      out.write("  <input type=\"submit\" value=\"Delete\"/>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("                \n");
      out.write("                                <div id=\"menu\">\n");
      out.write("                                 <ul  style=\"position:relative; bottom: 420px; right: 510px\">\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp\">Homepage</a></li>\n");
      out.write("        \n");
      out.write("                \n");
      out.write("\t\t<li class=\"active\"><a href=\"services.jsp\">Services</a></li>\n");
      out.write("\t\t<li class=\"active\"><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"#\">Help</a></li></ul>\n");
      out.write("                                </div>\n");
      out.write("<div class= \"foot\">\n");
      out.write("  <footer>\n");
      out.write("<br />  \n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
