package com.amituofo.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfiguration {
  private int maximum;
  private int minimum;
}
