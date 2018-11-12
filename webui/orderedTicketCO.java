/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package oracle.apps.ak.tickets.webui;

import com.sun.java.util.collections.HashMap;

import java.io.Serializable;

import javax.swing.JOptionPane;

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
public class orderedTicketCO extends OAControllerImpl
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
    //通过传入的用户主键判断具体的用户
    OAApplicationModule am=pageContext.getApplicationModule(webBean);
    String idCustomer=(String)pageContext.getParameter("idCustomer");
    String nameCustomer=(String)pageContext.getParameter("nameCustomer");
    HashMap parameters=new HashMap();
    parameters.put("idCustomer",idCustomer);//用于传递购票人姓名
    Serializable[] methodParams={parameters};
    Class[] parameterType={parameters.getClass()};
    OAFormValueBean idOfCustomer=(OAFormValueBean)webBean.findChildRecursive("idCustomer");
    idOfCustomer.setText(pageContext,idCustomer);
    OAFormValueBean nameOfCustomer=(OAFormValueBean)webBean.findChildRecursive("nameCustomer");
    nameOfCustomer.setText(pageContext,nameCustomer);
    am.invokeMethod("orderedTicket",methodParams,parameterType);
    
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
      HashMap parameter=new HashMap();
      parameter.put("idCustomer",idCustomer);
      parameter.put("nameCustomer",nameCustomer);
      //System.out.println("sssssssssssssssss    "+idCustomer+"  "+nameCustomer);
      //跳转到购票页面
      OAApplicationModule am=pageContext.getApplicationModule(webBean);
      String event=pageContext.getParameter(EVENT_PARAM);
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
      if(pageContext.getParameter("infoOfUser")!=null) {
        pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/personInfoPG",
                                       null,
                                       OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                       null,
                                       parameter,
                                       true, // retain AM
                                       OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
      }
      //退票
      if("backTic".equals(event)){
          String idNumBack=(String)pageContext.getParameter("idNumBack");
          String idTrain=(String)pageContext.getParameter("idTrain");
          String startStation=(String)pageContext.getParameter("startStation");
          String endStation=(String)pageContext.getParameter("endStation");
          String seatClass=(String)pageContext.getParameter("seatClass");
          
          HashMap parameters=new HashMap();
          parameters.put("idNum",idNumBack);
          parameters.put("idTrain",idTrain);
          parameters.put("startStation",startStation);
          parameters.put("endStation",endStation);
          parameters.put("seatClass",seatClass);
          Serializable[] methodParams={parameters};
          Class[] parameterType={parameters.getClass()};
          int res=JOptionPane.showConfirmDialog(null, "确定退票?", "confirm", JOptionPane.YES_NO_OPTION);
          System.out.println(res);
          if(res==JOptionPane.YES_OPTION){ 
               System.out.println("back="+idNumBack);
               am.invokeMethod("backTicket",methodParams,parameterType);
           }
          pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/orderedTicketPG",
                                        null,
                                        OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                        null,
                                        null,
                                        true, // retain AM
                                        OAWebBeanConstants.ADD_BREAD_CRUMB_NO);
      }
      //改签
      if("changeTicket".equals(event)){
          String idNumBack=(String)pageContext.getParameter("idNumBack");
          String idTrain=(String)pageContext.getParameter("idTrain");
          String startStation=(String)pageContext.getParameter("startStation");
          String endStation=(String)pageContext.getParameter("endStation");
          String seatClass=(String)pageContext.getParameter("seatClass");
          
          HashMap parameters=new HashMap();
          parameters.put("idNumChange",idNumBack);
          parameters.put("idTrainChange",idTrain);
          parameters.put("startStationChange",startStation);
          parameters.put("endStationChange",endStation);
          parameters.put("seatClassChange",seatClass);
          pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/userPG",
                                        null,
                                        OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                        null,
                                        parameters,
                                        true, // retain AM
                                        OAWebBeanConstants.ADD_BREAD_CRUMB_NO);
      }
  }

}
