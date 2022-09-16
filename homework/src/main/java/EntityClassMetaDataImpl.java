import mapper.EntityClassMetaData;
import org.flywaydb.core.api.logging.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EntityClassMetaDataImpl<T> implements EntityClassMetaData {
   private Object object;


    public EntityClassMetaDataImpl(Object object) {
        this.object = object.getClass();

    }

    @Override
    public String getName() {
     return object.getClass().getName();
    }

    @Override
    public Constructor getConstructor() {


        Constructor constructor = null;

        return  constructor;
    }

    @Override
    public Field getIdField() {

        return null;
    }

    @Override
    public List<Field> getAllFields() {

        Field[] fields=  this.object.getClass().getDeclaredFields();
        Method[] methods = this.object.getClass().getMethods();
      for(Field f : fields){
          System.out.println(f.getName());
      }

        List<Field> fieldList =  Arrays.stream(fields).toList();
       return  fieldList;

    }

    @Override
    public List<Field> getFieldsWithoutId() {
        return null;
    }
}
