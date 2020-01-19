package com.azminds

import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.services.Service
import groovy.transform.CompileStatic

@CompileStatic
@CurrentTenant
@Service(Company)
interface CompanyService {

    Company get(Serializable id)

    List<Company> list(Map args)

    Long count()

    void delete(Serializable id)

    Company save(Company company)

}