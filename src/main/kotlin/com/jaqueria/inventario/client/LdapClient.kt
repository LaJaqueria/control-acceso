package com.jaqueria.inventario.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.ldap.core.AttributesMapper
import org.springframework.ldap.core.LdapTemplate
import org.springframework.ldap.core.support.LdapContextSource
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct


@Component
class LdapClient {

    @Value("\${ldap.url}")
    private var ldapUrl: String? = null;

    private var ldapcontextSource: LdapContextSource? = LdapContextSource();

    @Value("\${ldap.urls}")
    private lateinit var baseUrl: String

    @Value("\${ ldap.base.dn}")
    private lateinit var base: String

    @Value("\${ldap.username}")
    private lateinit var username: String

    @Value("\${ldap.password}")
    private lateinit var ldapPassword: String


    @PostConstruct
    fun initContext() {
        ldapcontextSource!!.setUrl(ldapUrl);
    }

    private fun contextSource(): LdapContextSource? {
        val contextSource = LdapContextSource()

        contextSource.setUrl(baseUrl)
        contextSource.setBase(base)
        contextSource.userDn = (username)
        contextSource.password = (ldapPassword)

        return contextSource
    }

    private fun getClient():LdapTemplate    {
        return LdapTemplate(this.ldapcontextSource)
    }

    fun ldapSearch(uid: String): List<String> {
        var lt = getClient ()
        lt.search("cn=${uid}",   attrs -> (String) attrs.get("cn").get()); )

        return emptyList()




























    }