package oracle.apps.ak.tickets.server;

import oracle.apps.fnd.framework.server.OAViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class loginVOImpl extends OAViewObjectImpl {
    /**This is the default constructor (do not remove)
     */
    public loginVOImpl() {
    }
    public void executeQueryPara(String whereClause){
        setWhereClause(null);
        setWhereClauseParams(null);
        setWhereClause(whereClause.toString());
        //System.out.println(this.getQuery());
        executeQuery();
    }
}
