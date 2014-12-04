package com.wordnik.swagger.models.properties;

import com.wordnik.swagger.models.Xml;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Property {
  Property title(String title);
  Property description(String description);
  Property defaultValue(String defaultValue);
  
  String getType();
  String getFormat();

  String getTitle();
  void setTitle(String title);

  String getDescription();
  void setDescription(String title);

  @JsonIgnore
  String getName();
  void setName(String name);
  
  @JsonIgnore
  String getDefaultValue();
  void setDefaultValue(String defaultValue);

  @JsonIgnore
  boolean getRequired();
  void setRequired(boolean required);

  @JsonIgnore
  boolean getReadOnly();
  void setReadOnly(boolean required); 

  String getExample();
  void setExample(String example);

  // @JsonIgnore
  void setPosition(Integer position);
  Integer getPosition();

  Xml getXml();
  void setXml(Xml xml);
}