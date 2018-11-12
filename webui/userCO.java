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
import oracle.apps.fnd.framework.webui.beans.message.OAMessageStyledTextBean;
import oracle.apps.fnd.framework.webui.beans.message.OAMessageTextInputBean;

/**
 * Controller for ...
 */
public class userCO extends OAControllerImpl
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
      //获取改签页面传进来的信息
      String idNumChange=(String)pageContext.getParameter("idNumChange");
      String idTrainChange=(String)pageContext.getParameter("idTrainChange");
      String startStationChange=(String)pageContext.getParameter("startStationChange");
      String endStationChange=(String)pageContext.getParameter("endStationChange");
      String seatClassChange=(String)pageContext.getParameter("seatClassChange");
      //通过的formvalue隐形保存然后再传递给下一个页面,首先需要进行判断是否有改签信息传入

          OAFormValueBean idOfNumChange=(OAFormValueBean)webBean.findChildRecursive("idNumChange");
          idOfNumChange.setText(pageContext,idNumChange);
          OAFormValueBean idOfTrainChange=(OAFormValueBean)webBean.findChildRecursive("idTrainChange");
          idOfTrainChange.setText(pageContext,idTrainChange);      
          OAFormValueBean startOfStationChange=(OAFormValueBean)webBean.findChildRecursive("startStationChange");
          startOfStationChange.setText(pageContext,startStationChange);
          OAFormValueBean endOfStationChange=(OAFormValueBean)webBean.findChildRecursive("endStationChange");
          endOfStationChange.setText(pageContext,endStationChange);      
          OAFormValueBean seatOfClassChange=(OAFormValueBean)webBean.findChildRecursive("seatClassChange");
          seatOfClassChange.setText(pageContext,seatClassChange);
      
      //获取其它页面传进来的购票人的姓名
      String nameCustomer=(String)pageContext.getParameter("nameCustomer");
      String idCustomer=(String)pageContext.getParameter("idCustomer");
      System.out.println("nameCustomerddddddddddddddd="+nameCustomer+"  "+idCustomer);
      //通过的formvalue隐形保存然后再传递给下一个页面
      OAFormValueBean nameOfCustomer=(OAFormValueBean)webBean.findChildRecursive("nameCustomer");
      nameOfCustomer.setText(pageContext,nameCustomer);
      OAFormValueBean idOfCustomer=(OAFormValueBean)webBean.findChildRecursive("idCustomer");
      idOfCustomer.setText(pageContext,idCustomer);
  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
      //System.out.println("the Button of userPG was pressed");
      super.processFormRequest(pageContext, webBean);
      OAApplicationModule am=pageContext.getApplicationModule(webBean);
      if(pageContext.getParameter("query")!=null) {
        String placeOfDeparture = (String)pageContext.getParameter("placeOfDeparture");
        String placeOfDestination=(String)pageContext.getParameter("placeOfDestination");
        String timePlan=(String)pageContext.getParameter("timePlan");
        String nameCustomer=(String)pageContext.getParameter("nameCustomer");
        String idCustomer=(String)pageContext.getParameter("idCustomer");
          String idNumChange=(String)pageContext.getParameter("idNumChange");
          String idTrainChange=(String)pageContext.getParameter("idTrainChange");
          String startStationChange=(String)pageContext.getParameter("startStationChange");
          String endStationChange=(String)pageContext.getParameter("endStationChange");
          String seatClassChange=(String)pageContext.getParameter("seatClassChange");
        System.out.println("nameCustomer2="+nameCustomer);
        HashMap parameters=new HashMap();
        parameters.put("idCustomer",idCustomer);
        parameters.put("placeOfDeparture",placeOfDeparture);
        parameters.put("placeOfDestination",placeOfDestination);
        parameters.put("timePlan",timePlan);
        parameters.put("pageContext",pageContext);
        parameters.put("webBean",webBean);
        parameters.put("nameCustomer",nameCustomer);//用于传递购票人姓名
          parameters.put("idNumChange",idNumChange);
          parameters.put("idTrainChange",idTrainChange);
          parameters.put("startStationChange",startStationChange);
          parameters.put("endStationChange",endStationChange);
          parameters.put("seatClassChange",seatClassChange);
        Serializable[] methodParams={parameters};
        Class[] parameterType={parameters.getClass()};
        
        System.out.println("loginButton was pressed");
        //这种调用方式与java传统传统的调用方式的区别是什么
       am.invokeMethod("query",methodParams,parameterType);    

      }
      //跳转到已购车票页面
      if(pageContext.getParameter("infoOfOrder")!=null) {
        String idCustomer=(String)pageContext.getParameter("idCustomer");
        String nameCustomer=(String)pageContext.getParameter("nameCustomer");
        HashMap parameter=new HashMap();
        parameter.put("idCustomer",idCustomer);//用于传递购票人主键id
        parameter.put("nameCustomer",nameCustomer);//用于传递购票人姓名
        pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/orderedTicketPG",
                                       null,
                                       OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                       null,
                                       parameter,
                                       true, // retain AM
                                       OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
      }
      //跳转到个人信息页面
      if(pageContext.getParameter("infoOfUser")!=null) {
          String idCustomer=(String)pageContext.getParameter("idCustomer");
          String nameCustomer=(String)pageContext.getParameter("nameCustomer");
          HashMap parameter=new HashMap();
          parameter.put("idCustomer",idCustomer);//用于传递购票人主键id
          parameter.put("nameCustomer",nameCustomer);//用于传递购票人姓名
        pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/personInfoPG",
                                       null,
                                       OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                       null,
                                       parameter,
                                       true, // retain AM
                                       OAWebBeanConstants.ADD_BREAD_CRUMB_NO); 
      }
  }
  
  

}
