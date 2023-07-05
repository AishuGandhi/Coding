package javaannotations;

//Marker Annotations
//@override and @deprecated are marker annotations
public @interface FirstCustomAnnotation {
	int value() default 0;  
}
