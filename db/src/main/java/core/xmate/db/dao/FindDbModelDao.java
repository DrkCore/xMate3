package core.xmate.db.dao;

import java.util.List;

import core.xmate.db.DbException;
import core.xmate.db.DbManager;
import core.xmate.db.IDao;
import core.xmate.db.sqlite.SqlInfo;
import core.xmate.db.table.DbModel;

/**
 * 用于查找数据库模型的dao
 *
 * @author DrkCore
 * @since 2016年2月17日11:39:23
 */
public class FindDbModelDao implements IDao<SqlInfo, List<DbModel>> {

    @Override
    public List<DbModel> access(DbManager db, SqlInfo sqlInfo) throws DbException {
        return db.findDbModelAll(sqlInfo);
    }
}
