package oracle.apps.ak.tickets.server;

import oracle.apps.ak.tickets.schema.loginEOImpl;
import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class loginVORowImpl extends OAViewRowImpl {
    public static final int IDNUM = 0;
    public static final int LOGINNUM = 1;
    public static final int LOGINPASSWORD = 2;
    public static final int ENAME = 3;
    public static final int IDCARD = 4;
    public static final int PHONE = 5;
    public static final int LASTUPDATEDATE = 6;
    public static final int LASTUPDATEDBY = 7;
    public static final int CREATIONDATE = 8;
    public static final int CREATEDBY = 9;
    public static final int LASTUPDATELOGIN = 10;
    public static final int SEX = 11;
    public static final int IDENT = 12;

    /**This is the default constructor (do not remove)
     */
    public loginVORowImpl() {
    }

    /**Gets loginEO entity object.
     */
    public loginEOImpl getloginEO() {
        return (loginEOImpl)getEntity(0);
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

    /**Gets the attribute value for LOGINNUM using the alias name Loginnum
     */
    public String getLoginnum() {
        return (String) getAttributeInternal(LOGINNUM);
    }

    /**Sets <code>value</code> as attribute value for LOGINNUM using the alias name Loginnum
     */
    public void setLoginnum(String value) {
        setAttributeInternal(LOGINNUM, value);
    }

    /**Gets the attribute value for LOGINPASSWORD using the alias name Loginpassword
     */
    public String getLoginpassword() {
        return (String) getAttributeInternal(LOGINPASSWORD);
    }

    /**Sets <code>value</code> as attribute value for LOGINPASSWORD using the alias name Loginpassword
     */
    public void setLoginpassword(String value) {
        setAttributeInternal(LOGINPASSWORD, value);
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

    /**Gets the attribute value for IDCARD using the alias name Idcard
     */
    public String getIdcard() {
        return (String) getAttributeInternal(IDCARD);
    }

    /**Sets <code>value</code> as attribute value for IDCARD using the alias name Idcard
     */
    public void setIdcard(String value) {
        setAttributeInternal(IDCARD, value);
    }

    /**Gets the attribute value for PHONE using the alias name Phone
     */
    public Number getPhone() {
        return (Number) getAttributeInternal(PHONE);
    }

    /**Sets <code>value</code> as attribute value for PHONE using the alias name Phone
     */
    public void setPhone(Number value) {
        setAttributeInternal(PHONE, value);
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

    /**Gets the attribute value for SEX using the alias name Sex
     */
    public String getSex() {
        return (String) getAttributeInternal(SEX);
    }

    /**Sets <code>value</code> as attribute value for SEX using the alias name Sex
     */
    public void setSex(String value) {
        setAttributeInternal(SEX, value);
    }

    /**Gets the attribute value for IDENT using the alias name Ident
     */
    public String getIdent() {
        return (String) getAttributeInternal(IDENT);
    }

    /**Sets <code>value</code> as attribute value for IDENT using the alias name Ident
     */
    public void setIdent(String value) {
        setAttributeInternal(IDENT, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case IDNUM:
            return getIdnum();
        case LOGINNUM:
            return getLoginnum();
        case LOGINPASSWORD:
            return getLoginpassword();
        case ENAME:
            return getEname();
        case IDCARD:
            return getIdcard();
        case PHONE:
            return getPhone();
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
        case SEX:
            return getSex();
        case IDENT:
            return getIdent();
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
        case LOGINNUM:
            setLoginnum((String)value);
            return;
        case LOGINPASSWORD:
            setLoginpassword((String)value);
            return;
        case ENAME:
            setEname((String)value);
            return;
        case IDCARD:
            setIdcard((String)value);
            return;
        case PHONE:
            setPhone((Number)value);
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
        case SEX:
            setSex((String)value);
            return;
        case IDENT:
            setIdent((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}