package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.autodesk.agiledemo.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Weather</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String zipCode = request.getParameter("zip");
		Weather weather = null;
		if (zipCode != null && !zipCode.isEmpty()){
			weather = new WeatherParser().parse(new WeatherRetriever().get(zipCode));
		}
 	
      out.write("\r\n");
      out.write("\t<form>\r\n");
      out.write("\t\tzip-code: <input type=\"text\" name=\"zip\" /> <input type=\"submit\"\r\n");
      out.write("\t\t\tvalue=\"submit\" id=\"submit\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\r\n");
      out.write("\t");
if (weather != null) {
      out.write("\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><span id=\"city\">City: </span><span id=\"city-value\">");
      out.print( weather.getCity());
      out.write("</span></li>\r\n");
      out.write("        <li><span id=\"region\">Region: </span><span id=\"region-value\">");
      out.print( weather.getRegion());
      out.write("</span></li>\r\n");
      out.write("        <li><span id=\"country\">Country: </span><span id=\"country-value\">");
      out.print( weather.getCountry());
      out.write("</span></li>\r\n");
      out.write("        <li><span id=\"temperature\">Temperature: </span><span id=\"temperature-value\">");
      out.print( weather.getTemperature());
      out.write("</span></li>\r\n");
      out.write("        <li><span id=\"condition\">Condition: </span><span id=\"condition-value\">");
      out.print( weather.getCondition());
      out.write("</span></li>\r\n");
      out.write("        <li><span id=\"humidity\">Humidity: </span><span id=\"humidity-value\">");
      out.print( weather.getHumidity());
      out.write("</span></li>\r\n");
      out.write("        <li><span id=\"wind-speed\">Wind Speed: </span><span id=\"wind-speed-value\">");
      out.print( weather.getWindSpeed());
      out.write("</span></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
