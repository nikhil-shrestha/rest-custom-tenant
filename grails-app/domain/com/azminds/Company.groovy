package com.azminds

import grails.gorm.MultiTenant

class Company implements MultiTenant<Company> {
  Company() {
    this.uuid = UUID.randomUUID().toString()
  }

  String uuid
  String companyName
  String companyDesc
  Date createdDate = new Date()
  String username

  static mapping = {
    tenantId name: 'username'
  }

  static constraints = {
    companyName nullable: false, blank: false
    companyDesc nullable: false, blank: false
    uuid nullable: false
    username nullable: true
  }
}
