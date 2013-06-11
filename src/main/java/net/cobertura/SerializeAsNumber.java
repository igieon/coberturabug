package net.cobertura;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used on boolean field to serialize as number ('0','1') not as
 * (false,true)
 * 
 * @author David Ignjic
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Inherited()
@Documented
public @interface SerializeAsNumber {

}
