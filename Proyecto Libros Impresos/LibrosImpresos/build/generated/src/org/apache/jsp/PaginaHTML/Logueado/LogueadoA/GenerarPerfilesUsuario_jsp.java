package org.apache.jsp.PaginaHTML.Logueado.LogueadoA;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GenerarPerfilesUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ca_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_ca_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_ca_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      Modelo.Persona per = null;
      synchronized (session) {
        per = (Modelo.Persona) _jspx_page_context.getAttribute("per", PageContext.SESSION_SCOPE);
        if (per == null){
          per = new Modelo.Persona();
          _jspx_page_context.setAttribute("per", per, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      Controlador.NegocioPersona persona = null;
      synchronized (_jspx_page_context) {
        persona = (Controlador.NegocioPersona) _jspx_page_context.getAttribute("persona", PageContext.PAGE_SCOPE);
        if (persona == null){
          persona = new Controlador.NegocioPersona();
          _jspx_page_context.setAttribute("persona", persona, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("per"), request);
      out.write('\n');
      Modelo.Cargo car = null;
      synchronized (_jspx_page_context) {
        car = (Modelo.Cargo) _jspx_page_context.getAttribute("car", PageContext.PAGE_SCOPE);
        if (car == null){
          car = new Modelo.Cargo();
          _jspx_page_context.setAttribute("car", car, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      Controlador.CargoNegocio cargo = null;
      synchronized (_jspx_page_context) {
        cargo = (Controlador.CargoNegocio) _jspx_page_context.getAttribute("cargo", PageContext.PAGE_SCOPE);
        if (cargo == null){
          cargo = new Controlador.CargoNegocio();
          _jspx_page_context.setAttribute("cargo", cargo, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("car"), request);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,700\">\n");
      out.write("    <link href=\"/../../LibrosImpresos/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("    <title>Generar Perfiles de Usuario</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <center>\n");
      out.write("            <ul>\n");
      out.write("                <li onclick=\"location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/InicioAdministrador.jsp';\"  style=\"cursor:pointer;\">Inicio</li>\n");
      out.write("                <li>Servicios\n");
      out.write("                    <ul>\n");
      out.write("                        <li onclick=\"location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/DefinirServicios.jsp';\"  style=\"cursor:pointer;\">Definir Servicios</li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Usuarios\n");
      out.write("                    <ul>\n");
      out.write("                        <li onclick=\"location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/GenerarPerfilesUsuario.jsp';\"  style=\"cursor:pointer;\">Generar Perfiles de Usuario</li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Vales\n");
      out.write("                  <ul>\n");
      out.write("                    <li onclick=\"location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/DefinirValesTipoUsuario.jsp';\"  style=\"cursor:pointer;\">Definir Vales/Tipo Usuario</li>\n");
      out.write("                    <li onclick=\"location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/GenerarValesAdicionales.jsp';\"  style=\"cursor:pointer;\">Generar Vales Adicionales</li>\n");
      out.write("                    <li onclick=\"location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/GenerarInformesAuditoria.jsp';\"  style=\"cursor:pointer;\">Generar Informe Auditoría Vales</li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li onclick=\"location.href='/../../LibrosImpresos/LogOutServlet';\"  style=\"cursor:pointer;\">Cerrar Sesión</li>\n");
      out.write("            </ul>   \n");
      out.write("        </center>    \n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <p id=\"b\">Bienvenido(a)&nbsp;&nbsp;<a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${per.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${per.getApellido()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a><span>&nbsp;&nbsp;&nbsp; Cargo: &nbsp;<a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${per.getCargo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></span></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <img src=\"/../../LibrosImpresos/img/Logo3.png\"/>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"registro\">\n");
      out.write("        <form  name=\"frmRegistro\" action=\"/../../LibrosImpresos/InsertarPerfilServlet\" method=\"post\">\n");
      out.write("            <input type=\"text\" class=\"textPage\" id=\"user\" name=\"txtRut\" placeholder=\"Ingrese Rut\" required=\"required\">\n");
      out.write("            <input type=\"password\" name=\"txtClave\" placeholder=\"Clave\" required=\"required\">\n");
      out.write("            <input type=\"text\" id=\"user\" name=\"txtNombre\" placeholder=\"Ingrese Nombre\" required=\"required\">\n");
      out.write("            <input type=\"text\" id=\"user\" name=\"txtApellido\" placeholder=\"Ingrese Apellido\" required=\"required\">\n");
      out.write("            <select name=\"cmbCargo\" class=\"cmbVale\" style=\"cursor: pointer\">\n");
      out.write("                ");
      if (_jspx_meth_ca_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Crear Perfil\" style=\"cursor:pointer\"/>\n");
      out.write("        </form>\n");
      out.write("            <div>\n");
      out.write("            <center>\n");
      out.write("                <p><a class=\"textPage\" href=\"/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/InicioAdministrador.jsp\" onMouseover=\"this.style.color='White'\" onMouseout=\"this.style.color='aqua'\">Volver</a></p>\n");
      out.write("            </center>                               \n");
      out.write("            </div>\n");
      out.write("    </div>   \n");
      out.write("    <footer id=\"footer\">\n");
      out.write("        <p>© 2017 Todos los derechos reservados, creado por estudiantes de <a href=\"http://www.duoc.cl\" rel=\"nofollow\" onMouseover=\"this.style.color='red'\" onMouseout=\"this.style.color='aqua'\">DUOC</a>.</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_ca_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ca:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_ca_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_ca_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_ca_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_ca_forEach_0.setParent(null);
    _jspx_th_ca_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cargo.consultarCargo()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_ca_forEach_0.setVar("itemb");
    int[] _jspx_push_body_count_ca_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_ca_forEach_0 = _jspx_th_ca_forEach_0.doStartTag();
      if (_jspx_eval_ca_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option class=\"cmbVale\"  style=\"cursor: pointer\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemb.getTipoCargo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_ca_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_ca_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_ca_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_ca_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_ca_forEach_0.doFinally();
      _jspx_tagPool_ca_forEach_var_items.reuse(_jspx_th_ca_forEach_0);
    }
    return false;
  }
}
