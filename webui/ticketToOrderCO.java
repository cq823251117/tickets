/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package oracle.apps.ak.tickets.webui;

import com.sun.java.util.collections.HashMap;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.OAWebBeanConstants;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.form.OAFormValueBean;
import oracle.apps.fnd.framework.webui.beans.message.OAMessageTextInputBean;

/**
 * Controller for ...
 */
public class ticketToOrderCO extends OAControllerImpl
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
    //设置购票人
    String nameCustomer=(String)pageContext.getParameter("nameCustomer");
    OAMessageTextInputBean nameOfCustomer=(OAMessageTextInputBean)webBean.findChildRecursive("nameCustomer");
    nameOfCustomer.setText(pageContext,nameCustomer);
    
    String idCustomer=(String)pageContext.getParameter("idCustomer");
    OAFormValueBean idOfCustomer=(OAFormValueBean)webBean.findChildRecursive("idCustomer");
    idOfCustomer.setText(pageContext,idCustomer);
    
    //设置座位类型
    String serial=(String)pageContext.getParameter("serial");
    
    int serial2=Integer.parseInt(serial);
    OAMessageTextInputBean Serial=(OAMessageTextInputBean)webBean.findChildRecursive("serial");
    if(serial2==1){
        System.out.println("nameCustomer of ticketco1="+serial);
        Serial.setText(pageContext,"二等座");
    }
    if(serial2==2){
        System.out.println("nameCustomer of ticketco2="+serial);
        Serial.setText(pageContext,"一等座");
    }
    if(serial2==3){
        System.out.println("nameCustomer of ticketco3="+serial);
       Serial.setText(pageContext,"商务座");
    }
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
       String idCustomer=pageContext.getParameter("idCustomer");
       String nameCustomer=pageContext.getParameter("nameCustomer");
       HashMap parameter2=new HashMap();
       parameter2.put("idCustomer",idCustomer);
       parameter2.put("nameCustomer",nameCustomer);
       //System.out.println("sssssssssssssssss    "+idCustomer+"  "+nameCustomer);
       //跳转到购票页面
       if(pageContext.getParameter("queryOrder")!=null) {
         pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/userPG",
                                        null,
                                        OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                        null,
                                        parameter2,
                                        true, // retain AM
                                        OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
       }
       //跳转到个人信息页面
       if(pageContext.getParameter("infoOfUser")!=null) {
         pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/personInfoPG",
                                        null,
                                        OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                        null,
                                        parameter2,
                                        true, // retain AM
                                        OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
       }
       //跳转到已购车票页面
       if(pageContext.getParameter("infoOfOrder")!=null) {
         pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/orderedTicketPG",
                                        null,
                                        OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                        null,
                                        parameter2,
                                        true, // retain AM
                                        OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
       }
  }

}
