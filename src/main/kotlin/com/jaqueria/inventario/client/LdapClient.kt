package com.jaqueria.inventario.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.ldap.core.AttributesMapper
import org.springframework.ldap.core.LdapTemplate
import org.springframework.ldap.core.support.LdapContextSource
import org.springframework.ldap.query.LdapQuery
import org.springframework.ldap.query.LdapQueryBuilder
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.naming.directory.Attributes

/**
 * LDap Client
 */
@Component
class LdapClient {

    /**
     * LdapContextSource
     */
    private var ldapcontextSource: LdapContextSource? = LdapContextSource();

    /**
     * LDAP Urls
     */
    @Value("\${ldap.urls}")
    private lateinit var baseUrl: String

    /**
     * Ldap Base DN
     */
    @Value("\${ ldap.base.dn}")
    private lateinit var base: String

    /**
     * Ldap Username
     */
    @Value("\${ldap.username}")
    private lateinit var username: String

    /**
     * Ldap PAssword
     */
    @Value("\${ldap.password}")
    private lateinit var ldapPassword: String


    /**
     * Inicializacion de LDAP
     */
    @PostConstruct
    fun initContext() {
        this.ldapcontextSource?.setUrl(baseUrl)
        this.ldapcontextSource?.setBase(base)
        this.ldapcontextSource?.userDn = (username)
        this.ldapcontextSource?.password = (ldapPassword)
    }


    /**
     * OBtener el cliente para LDAP
     */
    private fun getClient():LdapTemplate    {
        return LdapTemplate(this.ldapcontextSource)
    }

    /**
     * Consulta LDAP para buscar un usuario
     */
    fun ldapSearch(uid: String): List<UserLDAP> {
        val lt = getClient ()
        return lt.search("","cn=${uid}",   UsuarioMapper())

    }

    /**
     * Clase para guardar la informacion de un usuario LDAP
     */
    data class UserLDAP(val cn:String,val firstname:String,val secondName:String);

    /**
     * Usuario MApper
     */
    class UsuarioMapper: AttributesMapper<UserLDAP> {

        override fun mapFromAttributes(attrs: Attributes?): UserLDAP {
                return UserLDAP(attrs?.get("cn") as String,attrs.get("sn") as String,attrs.get("sn") as String)
        }
    }
}




























    }