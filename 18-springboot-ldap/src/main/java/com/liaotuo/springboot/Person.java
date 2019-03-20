package com.liaotuo.springboot;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

/**
 * @author 18070959
 * @date 2019-03-20 11:41 AM
 * @description
 **/
@Entry(base = "ou=people,dc=liaotuo,dc=com", objectClasses = "inetOrgPerson")
public class Person {
    @Id
    private Integer id;
    @DnAttribute(value = "uid", index = 3)
    private String uid;
    @Attribute(name = "cn")
    private String commonName;
    @Attribute(name = "sn")
    private String suerName;
    private String userPassword;

}