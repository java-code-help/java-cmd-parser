package org.tomino.cmdline.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation for defining a name of a command or option.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Name {
    String name() default "";

    String shortName() default "";

    String description() default "";
}
