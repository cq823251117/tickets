package oracle.apps.ak.tickets.server;

import oracle.apps.ak.tickets.schema.orderedTicketEOImpl;
import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class orderedTicketVORowImpl extends OAViewRowImpl {
    public static final int IDNUM = 0;
    public static final int PERSONID = 1;
    public static final int TRAINID = 2;
    public static final int TRAINNAME = 3;
    public static final int ENAME = 4;
    public static final int STARTSTATION = 5;
    public static final int ENDSTATION = 6;
    public static final int STARTTIME = 7;
    public static final int ENDTIME = 8;
    public static final int SEATCLASS = 9;
    public static final int LASTUPDATEDATE = 10;
    public static final int LASTUPDATEDBY = 11;
    public static final int CREATIONDATE = 12;
    public static final int CREATEDBY = 13;
    public static final int LASTUPDATELOGIN = 14;

    /**This is the default constructor (do not remove)
     */
    public orderedTicketVORowImpl() {
    }

    /**Gets orderedTicketEO entity object.
     */
    public orderedTicketEOImpl getorderedTicketEO() {
        return (orderedTicketEOImpl)getEntity(0);
    }

    /**Gets the attribute value for IDNUM using the alias name Idnum
     */
    public Number getIdnum() {
        return (Number) getAttributeInternal(IDNUM);
    }

    /**Sets <code>value</code> as attribute value for IDNUM using the alias name Idnum
     */
    public void setIdnum(Number value) {
        setAttributeInternal(IDNUM, value);
    }

    /**Gets the attribute value for PERSONID using the alias name Personid
     */
    public Number getPersonid() {
        return (Number) getAttributeInternal(PERSONID);
    }

    /**Sets <code>value</code> as attribute value for PERSONID using the alias name Personid
     */
    public void setPersonid(Number value) {
        setAttributeInternal(PERSONID, value);
    }

    /**Gets the attribute value for TRAINID using the alias name Trainid
     */
    public Number getTrainid() {
        return (Number) getAttributeInternal(TRAINID);
    }

    /**Sets <code>value</code> as attribute value for TRAINID using the alias name Trainid
     */
    public void setTrainid(Number value) {
        setAttributeInternal(TRAINID, value);
    }

    /**Gets the attribute value for TRAINNAME using the alias name Trainname
     */
    public String getTrainname() {
        return (String) getAttributeInternal(TRAINNAME);
    }

    /**Sets <code>value</code> as attribute value for TRAINNAME using the alias name Trainname
     */
    public void setTrainname(String value) {
        setAttributeInternal(TRAINNAME, value);
    }

    /**Gets the attribute value for ENAME using the alias name Ename
     */
    public String getEname() {
        return (String) getAttributeInternal(ENAME);
    }

    /**Sets <code>value</code> as attribute value for ENAME using the alias name Ename
     */
    public void setEname(String value) {
        setAttributeInternal(ENAME, value);
    }

    /**Gets the attribute value for STARTSTATION using the alias name Startstation
     */
    public String getStartstation() {
        return (String) getAttributeInternal(STARTSTATION);
    }

    /**Sets <code>value</code> as attribute value for STARTSTATION using the alias name Startstation
     */
    public void setStartstation(String value) {
        setAttributeInternal(STARTSTATION, value);
    }

    /**Gets the attribute value for ENDSTATION using the alias name Endstation
     */
    public String getEndstation() {
        return (String) getAttributeInternal(ENDSTATION);
    }

    /**Sets <code>value</code> as attribute value for ENDSTATION using the alias name Endstation
     */
    public void setEndstation(String value) {
        setAttributeInternal(ENDSTATION, value);
    }

    /**Gets the attribute value for STARTTIME using the alias name Starttime
     */
    public Date getStarttime() {
        return (Date) getAttributeInternal(STARTTIME);
    }

    /**Sets <code>value</code> as attribute value for STARTTIME using the alias name Starttime
     */
    public void setStarttime(Date value) {
        setAttributeInternal(STARTTIME, value);
    }

    /**Gets the attribute value for ENDTIME using the alias name Endtime
     */
    public Date getEndtime() {
        return (Date) getAttributeInternal(ENDTIME);
    }

    /**Sets <code>value</code> as attribute value for ENDTIME using the alias name Endtime
     */
    public void setEndtime(Date value) {
        setAttributeInternal(ENDTIME, value);
    }

    /**Gets the attribute value for SEATCLASS using the alias name Seatclass
     */
    public String getSeatclass() {
        return (String) getAttributeInternal(SEATCLASS);
    }

    /**Sets <code>value</code> as attribute value for SEATCLASS using the alias name Seatclass
     */
    public void setSeatclass(String value) {
        setAttributeInternal(SEATCLASS, value);
    }

    /**Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for CREATION_DATE using the alias name CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**Gets the attribute value for CREATED_BY using the alias name CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case IDNUM:
            return getIdnum();
        case PERSONID:
            return getPersonid();
        case TRAINID:
            return getTrainid();
        case TRAINNAME:
            return getTrainname();
        case ENAME:
            return getEname();
        case STARTSTATION:
            return getStartstation();
        case ENDSTATION:
            return getEndstation();
        case STARTTIME:
            return getStarttime();
        case ENDTIME:
            return getEndtime();
        case SEATCLASS:
            return getSeatclass();
        case LASTUPDATEDATE:
            return getLastUpdateDate();
        case LASTUPDATEDBY:
            return getLastUpdatedBy();
        case CREATIONDATE:
            return getCreationDate();
        case CREATEDBY:
            return getCreatedBy();
        case LASTUPDATELOGIN:
            return getLastUpdateLogin();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case IDNUM:
            setIdnum((Number)value);
            return;
        case PERSONID:
            setPersonid((Number)value);
            return;
        case TRAINID:
            setTrainid((Number)value);
            return;
        case TRAINNAME:
            setTrainname((String)value);
            return;
        case ENAME:
            setEname((String)value);
            return;
        case STARTSTATION:
            setStartstation((String)value);
            return;
        case ENDSTATION:
            setEndstation((String)value);
            return;
        case STARTTIME:
            setStarttime((Date)value);
            return;
        case ENDTIME:
            setEndtime((Date)value);
            return;
        case SEATCLASS:
            setSeatclass((String)value);
            return;
        case LASTUPDATEDATE:
            setLastUpdateDate((Date)value);
            return;
        case LASTUPDATEDBY:
            setLastUpdatedBy((Number)value);
            return;
        case CREATIONDATE:
            setCreationDate((Date)value);
            return;
        case CREATEDBY:
            setCreatedBy((Number)value);
            return;
        case LASTUPDATELOGIN:
            setLastUpdateLogin((Number)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
