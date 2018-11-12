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
import oracle.apps.fnd.framework.webui.beans.message.OAMessageTextInputBean;

/**
 * Controller for ...
 */
public class trainDetailCO extends OAControllerImpl
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
    //获取改签的信息
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
    
    String idNum=(String)pageContext.getParameter("idNum");
    String trainName=(String)pageContext.getParameter("trainName");
    String startStation=(String)pageContext.getParameter("startStation");
    String endStation=(String)pageContext.getParameter("endStation");
    String startTime=(String)pageContext.getParameter("startTime");
    String endTime=(String)pageContext.getParameter("endTime");
    String allTime=(String)pageContext.getParameter("allTime");
    String nameCustomer=(String)pageContext.getParameter("nameCustomer");
    String idCustomer=(String)pageContext.getParameter("idCustomer");
    
    OAMessageTextInputBean nameOfTrain=(OAMessageTextInputBean)webBean.findChildRecursive("nameTrain");
    nameOfTrain.setText(pageContext,trainName);
    OAMessageTextInputBean StartStation=(OAMessageTextInputBean)webBean.findChildRecursive("startStation");
    StartStation.setText(pageContext,startStation);
    OAMessageTextInputBean EndStation=(OAMessageTextInputBean)webBean.findChildRecursive("endStation");
    EndStation.setText(pageContext,endStation);
    OAMessageTextInputBean StartTime=(OAMessageTextInputBean)webBean.findChildRecursive("startTime");
    StartTime.setText(pageContext,startTime);
    OAMessageTextInputBean EndTime=(OAMessageTextInputBean)webBean.findChildRecursive("endTime");
    EndTime.setText(pageContext,endTime);
    OAMessageTextInputBean AllTime=(OAMessageTextInputBean)webBean.findChildRecursive("allTime");
    AllTime.setText(pageContext,allTime);
    OAFormValueBean namecustomer=(OAFormValueBean)webBean.findChildRecursive("nameCustomer");
    namecustomer.setText(pageContext,nameCustomer);
    OAFormValueBean idOfTrain=(OAFormValueBean)webBean.findChildRecursive("idOfTrain");
    idOfTrain.setText(pageContext,idNum);
    OAFormValueBean namecustomer2=(OAFormValueBean)webBean.findChildRecursive("nameOfTrain");
    namecustomer2.setText(pageContext,trainName);
    OAFormValueBean idcustomer=(OAFormValueBean)webBean.findChildRecursive("idCustomer");
    idcustomer.setText(pageContext,idCustomer);
  
    HashMap parameters=new HashMap();
    Serializable[] methodParams={parameters};
    Class[] parameterType={parameters.getClass()};
    parameters.put("idNum",idNum);
    parameters.put("startStation",startStation);
    parameters.put("endStation",endStation);  
    am.invokeMethod("detail",methodParams,parameterType);
      
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
    OAApplicationModule am=pageContext.getApplicationModule(webBean);
    
    //获取购买车票的人的姓名
    String nameCustomer=(String)pageContext.getParameter("nameCustomer");//购票人
    //System.out.println("nameCustomer of form="+nameCustomer);
    HashMap parameter=new HashMap();
    parameter.put("nameCustomer",nameCustomer);
    
    String event=pageContext.getParameter(EVENT_PARAM);
    
    //改签信息
     String idNumChange=(String)pageContext.getParameter("idNumChange");
     String idTrainChange=(String)pageContext.getParameter("idTrainChange");
     String startStationChange=(String)pageContext.getParameter("startStationChange");
     String endStationChange=(String)pageContext.getParameter("endStationChange");
     String seatClassChange=(String)pageContext.getParameter("seatClassChange");
      HashMap parameters2=new HashMap();
      parameters2.put("idNum",idNumChange);//用于购买的车票的类型
      parameters2.put("idTrain",idTrainChange);
      parameters2.put("startStation",startStationChange);
      parameters2.put("endStation",endStationChange);
      parameters2.put("seatClass",seatClassChange);
      Serializable[] methodParams2={parameters2};
      Class[] parameterType2={parameters2.getClass()};

    //将车的id，出发站，终点站传入
    String idCustomer=(String)pageContext.getParameter("idCustomer");//人id
    String train=(String)pageContext.getParameter("nameOfTrain");//车次名
    String startStation=(String)pageContext.getParameter("startStation");//出发站
    String endStation=(String)pageContext.getParameter("endStation");//终点站
    String idOfTrain=(String)pageContext.getParameter("idOfTrain");//车id
    String startTime=(String)pageContext.getParameter("startTime");//出发时间
    String endTime=(String)pageContext.getParameter("endTime");//到达时间
    System.out.println("startStion of form="+idCustomer+" "+endTime+" "+train);
    String serial=(String)pageContext.getParameter("serial");//座位信息  
    HashMap parameters=new HashMap();
    parameters.put("serial",serial);//用于购买的车票的类型
    parameters.put("startStation",startStation);
    parameters.put("endStation",endStation);
    parameters.put("idOfTrain",idOfTrain);
    parameters.put("nameTrain",train);
    parameters.put("startTime",startTime);
    parameters.put("endTime",endTime);
    parameters.put("idCustomer",idCustomer);
    parameters.put("nameCustomer",nameCustomer);
    Serializable[] methodParams={parameters};
    Class[] parameterType={parameters.getClass()};
    parameter.put("idCustomer",idCustomer);
    if("purchase".equals(event)){
        if(!idNumChange.equals("")&&idNumChange!=null){
           int res=JOptionPane.showConfirmDialog(null, "确定改签?", "confirm", JOptionPane.YES_NO_OPTION);
           if(res==JOptionPane.YES_OPTION){ 
             //改签时退掉原先的票,首先需要判断是否有改签数据传入进来
             
                 am.invokeMethod("backTicket",methodParams2,parameterType2);
                 //purchaseTicket方法将被购买的车票总数减少
                 am.invokeMethod("purchaseTicket",methodParams,parameterType);
                 
                 //saveOrderedTicket用于将购票信息保存到数据苦衷
                 am.invokeMethod("saveOrderedTicket",methodParams,parameterType);
                 //am.invokeMethod("apply",methodParams,parameterType);
                 pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/ticketToOrderPG",
                                               null,
                                               OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                               null,
                                               parameter,
                                               true, // retain AM
                                               OAWebBeanConstants.ADD_BREAD_CRUMB_NO);
             }
         }else{
        
        int res2=JOptionPane.showConfirmDialog(null, "确定购票?", "confirm", JOptionPane.YES_NO_OPTION);
        if(res2==JOptionPane.YES_OPTION){ 
              //purchaseTicket方法将被购买的车票总数减少
              am.invokeMethod("purchaseTicket",methodParams,parameterType);
              
              //saveOrderedTicket用于将购票信息保存到数据苦衷
              am.invokeMethod("saveOrderedTicket",methodParams,parameterType);
              //am.invokeMethod("apply",methodParams,parameterType);
              pageContext.forwardImmediately("OA.jsp?page=/oracle/apps/ak/tickets/webui/ticketToOrderPG",
                                            null,
                                            OAWebBeanConstants.KEEP_MENU_CONTEXT,
                                            null,
                                            parameter,
                                            true, // retain AM
                                            OAWebBeanConstants.ADD_BREAD_CRUMB_NO);
         }
         }
        
    }
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
