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
import oracle.apps.fnd.framework.webui.beans.form.OAFormValueBean;

/**
 * Controller for ...
 */
public class personInfoCO extends OAControllerImpl
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
      String idCustomer=(String)pageContext.getParameter("idCustomer");
      String nameCustomer=(String)pageContext.getParameter("nameCustomer");

      HashMap parameters=new HashMap();
      parameters.put("idCustomer",idCustomer);//
      Serializable[] methodParams={parameters};
      Class[] parameterType={parameters.getClass()};
      OAFormValueBean idOfCustomer=(OAFormValueBean)webBean.findChildRecursive("idCustomer");
      idOfCustomer.setText(pageContext,idCustomer);
      OAFormValueBean nameOfCustomer=(OAFormValueBean)webBean.findChildRecursive("nameCustomer");
      nameOfCustomer.setText(pageContext,nameCustomer);
      am.invokeMethod("personInfo",methodParams,parameterType);
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
      //跳转到购票页面
       String idCustomer=(String)pageContext.getParameter("idCustomer");
       String nameCustomer=(String)pageContext.getParameter("nameCustomer");
       HashMap parameter=new HashMap();
       parameter.put("idCustomer",idCustomer);//用于传递购票人姓名
       parameter.put("nameCustomer",nameCustomer);
      if(pageContext.getParameter("queryOrder")!=null) {
        pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/userPG",
                                       null,
                                       OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                       null,
                                       parameter,
                                       true, // retain AM
                                       OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
      }
      //跳转到个人信息页面
      if(pageContext.getParameter("infoOfOrder")!=null) {
        
        pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/orderedTicketPG",
                                       null,
                                       OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                       null,
                                       parameter,
                                       true, // retain AM
                                       OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
      }
  }

}
