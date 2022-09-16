import mapper.EntityClassMetaData;
import mapper.EntitySQLMetaData;

public class EntitySQLMetaDataImpl implements EntitySQLMetaData {
    private EntityClassMetaDataImpl entityClassMetaData;

    public EntitySQLMetaDataImpl(EntityClassMetaData entityClassMetaDataClient) {
        this.entityClassMetaData = entityClassMetaData;
    }

    @Override
    public String getSelectAllSql() {




        return null;
    }

    @Override
    public String getSelectByIdSql() {
        return null;
    }

    @Override
    public String getInsertSql() {

        return null;
    }

    @Override
    public String getUpdateSql() {
        return null;
    }




}
