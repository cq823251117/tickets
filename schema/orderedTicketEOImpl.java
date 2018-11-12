package oracle.apps.ak.tickets.schema;

import oracle.apps.fnd.framework.server.OADBTransaction;
import oracle.apps.fnd.framework.server.OAEntityDefImpl;
import oracle.apps.fnd.framework.server.OAEntityImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class orderedTicketEOImpl extends OAEntityImpl {
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

    private static OAEntityDefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
    public orderedTicketEOImpl() {
    }


    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = 
                    (OAEntityDefImpl)EntityDefImpl.findDefObject("oracle.apps.ak.tickets.schema.orderedTicketEO");
        }
        return mDefinitionObject;
    }

    /**Add attribute defaulting logic in this method.
     */
     public void create(AttributeList attributeList) {
         super.create(attributeList);
         OADBTransaction transaction=getOADBTransaction();
         Number idNum=transaction.getSequenceValue("FWK_TBX_EMPLOYEES_S");
         System.out.println("create go="+idNum);
         setIdnum(idNum);
     }

    /**Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**Add Entity validation code in this method.
     */
    protected void validateEntity() {
        super.validateEntity();
    }

    /**Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**Custom DML update/insert/delete logic here.
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }

    /**Gets the attribute value for Idnum, using the alias name Idnum
     */
    public Number getIdnum() {
        return (Number)getAttributeInternal(IDNUM);
    }

    /**Sets <code>value</code> as the attribute value for Idnum
     */
    public void setIdnum(Number value) {
        setAttributeInternal(IDNUM, value);
    }

    /**Gets the attribute value for Personid, using the alias name Personid
     */
    public Number getPersonid() {
        return (Number)getAttributeInternal(PERSONID);
    }

    /**Sets <code>value</code> as the attribute value for Personid
     */
    public void setPersonid(Number value) {
        setAttributeInternal(PERSONID, value);
    }

    /**Gets the attribute value for Trainid, using the alias name Trainid
     */
    public Number getTrainid() {
        return (Number)getAttributeInternal(TRAINID);
    }

    /**Sets <code>value</code> as the attribute value for Trainid
     */
    public void setTrainid(Number value) {
        setAttributeInternal(TRAINID, value);
    }

    /**Gets the attribute value for Trainname, using the alias name Trainname
     */
    public String getTrainname() {
        return (String)getAttributeInternal(TRAINNAME);
    }

    /**Sets <code>value</code> as the attribute value for Trainname
     */
    public void setTrainname(String value) {
        setAttributeInternal(TRAINNAME, value);
    }

    /**Gets the attribute value for Ename, using the alias name Ename
     */
    public String getEname() {
        return (String)getAttributeInternal(ENAME);
    }

    /**Sets <code>value</code> as the attribute value for Ename
     */
    public void setEname(String value) {
        setAttributeInternal(ENAME, value);
    }

    /**Gets the attribute value for Startstation, using the alias name Startstation
     */
    public String getStartstation() {
        return (String)getAttributeInternal(STARTSTATION);
    }

    /**Sets <code>value</code> as the attribute value for Startstation
     */
    public void setStartstation(String value) {
        setAttributeInternal(STARTSTATION, value);
    }

    /**Gets the attribute value for Endstation, using the alias name Endstation
     */
    public String getEndstation() {
        return (String)getAttributeInternal(ENDSTATION);
    }

    /**Sets <code>value</code> as the attribute value for Endstation
     */
    public void setEndstation(String value) {
        setAttributeInternal(ENDSTATION, value);
    }

    /**Gets the attribute value for Starttime, using the alias name Starttime
     */
    public Date getStarttime() {
        return (Date)getAttributeInternal(STARTTIME);
    }

    /**Sets <code>value</code> as the attribute value for Starttime
     */
    public void setStarttime(Date value) {
        setAttributeInternal(STARTTIME, value);
    }

    /**Gets the attribute value for Endtime, using the alias name Endtime
     */
    public Date getEndtime() {
        return (Date)getAttributeInternal(ENDTIME);
    }

    /**Sets <code>value</code> as the attribute value for Endtime
     */
    public void setEndtime(Date value) {
        setAttributeInternal(ENDTIME, value);
    }

    /**Gets the attribute value for Seatclass, using the alias name Seatclass
     */
    public String getSeatclass() {
        return (String)getAttributeInternal(SEATCLASS);
    }

    /**Sets <code>value</code> as the attribute value for Seatclass
     */
    public void setSeatclass(String value) {
        setAttributeInternal(SEATCLASS, value);
    }

    /**Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**Sets <code>value</code> as the attribute value for LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for CreationDate, using the alias name CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**Sets <code>value</code> as the attribute value for CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number)getAttributeInternal(LASTUPDATELOGIN);
    }

    /**Sets <code>value</code> as the attribute value for LastUpdateLogin
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

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number idnum) {
        return new Key(new Object[]{idnum});
    }
}
