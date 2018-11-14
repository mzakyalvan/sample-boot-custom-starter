package com.tiket.poc.starter.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Service;

public class SampleBean {
  private RedisConnectionFactory connectionFactory;

  public SampleBean() {
    this.connectionFactory = connectionFactory;
  }

  @Autowired
  public void setConnectionFactory(RedisConnectionFactory connectionFactory) {
    this.connectionFactory = connectionFactory;
  }

  public RedisConnectionFactory getConnectionFactory() {
    return connectionFactory;
  }
}
