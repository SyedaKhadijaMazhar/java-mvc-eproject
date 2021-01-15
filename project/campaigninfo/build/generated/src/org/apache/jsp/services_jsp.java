package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("                 <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
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
      out.write(".img\n");
      out.write("{\n");
      out.write("    height: 10px;\n");
      out.write("    width: 10px;\n");
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
      out.write("<div class=\"head\">\n");
      out.write("  <header>Campaign Details</header>\n");
      out.write("</div>\n");
      out.write("<div class=\"body\">\n");
      out.write("   We're Really happy to serve our users for there respective purposes. \n");
      out.write("                                    It's an honour for us to serve you. As you're interested in working with \n");
      out.write("                                    our team members we would like you to see the packages available in our bureau:\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<div class=\"img\">\n");
      out.write("    <td><img src=\"images/tv6.jpg\" style=\" height: 300px; width: 300px\" alt=\"\"/></td>\n");
      out.write("  <td><img  src=\"images/image-365222599.jpg\"style=\" height: 300px; width: 300px\" alt=\"\"/></td>\n");
      out.write("  <td><img src=\"images/radio.png\" style=\" height: 300px; width: 300px\"alt=\"\"/></td></div>\n");
      out.write("   </tr>\n");
      out.write("<tr>\n");
      out.write("  <td><p style=\"text-align:center; font-size: 18pt;\">PACKAGE ONE</p></td>\n");
      out.write("  <td><p style=\"text-align:center; font-size:18pt;\">PACKAGE TWO </p></td>\n");
      out.write("  <td><p style=\"text-align:center; font-size:18pt;\">PACKAGE THREE</p></td>\n");
      out.write("  </tr>\n");
      out.write("<tr>\n");
      out.write("  <td><p style=\"text-align:justify; margin-left:2em;margin-right:2em;margin-top:1em;font-family: 'Dancing Script', cursive;\">\n");
      out.write("          This package is for just one month the facility available in this package is Telemarketing,  calling availability.  THIS WILL COST YOU AROUND $100.</p></td>\n");
      out.write("  <td><p style=\"text-align:justify; margin-left:2em;margin-right:2em;margin-top:1em;font-family: 'Dancing Script', cursive;\">This package is for just two month the facility available in this package is Telemarketing,\n");
      out.write("                                    calling availability , magazine advertisement.\n");
      out.write("                                    THIS WILL COST YOU AROUND $200.\n");
      out.write("\n");
      out.write("</p></td>\n");
      out.write("  <td><p style=\"text-align:justify; margin-left:2em;margin-right:2em;margin-top:1em;font-family: 'Dancing Script', cursive;\">\n");
      out.write(" This package is for just five month the facility available in this package is Telemarketing,\n");
      out.write("                                    calling availability , magazine advertisement , flyers and bulletin board services.\n");
      out.write("                                    THIS WILL COST YOU AROUND $400.</p></td>\n");
      out.write("  \n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("                \n");
      out.write("                  <div id=\"menu\">\n");
      out.write("                                 <ul  style=\"position:relative; bottom: 885px; right: 510px\">\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp\">Homepage</a></li>\n");
      out.write("        \n");
      out.write("                \n");
      out.write("\t\t<li class=\"active\"><a href=\"services.jsp\">Services</a></li>\n");
      out.write("\t\t<li class=\"active\"><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"#\">Help</a></li></ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("<div class= \"foot\">\n");
      out.write("  <footer>\n");
      out.write("<br />   \n");
      out.write("\n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
