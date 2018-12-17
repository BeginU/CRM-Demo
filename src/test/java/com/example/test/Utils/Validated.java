package com.example.test.Utils;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Validated {

        public boolean isNotNull() default false;

        public String description() default "";
}
