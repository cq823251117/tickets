/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package oracle.apps.ak.tickets.webui;

import com.sun.java.util.collections.HashMap;

import java.io.Serializable;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.OAWebBeanConstants;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

/**
 * Controller for ...
 */
public class loginCO extends OAControllerImpl
{
  public static final String RCS_ID="$Header$";
  public static final boolean RCS_ID_RECORDED =
        VersionInfo.recordClassVersion(RCS_ID, "%packagename%");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);
    OAApplicationModule am=pageContext.getApplicationModule(webBean);
    am.invokeMethod("init");
    System.out.println("zi dong shuang xin");
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    System.out.println("Button was pressed");
    super.processFormRequest(pageContext, webBean);
    OAApplicationModule am=pageContext.getApplicationModule(webBean);
    if(pageContext.getParameter("login")!=null) {
      String userName = (String)pageContext.getParameter("userName");
      String userPassword=(String)pageContext.getParameter("userPassword");
      
      HashMap parameters=new HashMap();
      parameters.put("userName",userName);
      parameters.put("userPassword",userPassword);
      Serializable[] methodParams={parameters};
      Class[] parameterType={parameters.getClass()};
      
      System.out.println("loginButton was pressed");
      //这种调用方式与java传统传统的调用方式的区别是什么
      HashMap num=(HashMap)am.invokeMethod("login",methodParams,parameterType);
      
      if(num!=null) {
          String idCustomer=(String)num.get("idCustomer");
          String nameCustomer=(String)num.get("nameCustomer");
          HashMap parameter=new HashMap();
          parameter.put("idCustomer",idCustomer);
          parameter.put("nameCustomer",nameCustomer);
          
          pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/userPG",
                                        null,
                                        OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                        null,
                                        parameter,
                                        true, // retain AM
                                        OAWebBeanConstants.ADD_BREAD_CRUMB_NO);
          
      }
      
    }
  }
}
