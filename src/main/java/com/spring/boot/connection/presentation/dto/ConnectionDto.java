package com.spring.boot.connection.presentation.dto;


import java.time.LocalDateTime;

public class ConnectionDto {

  private Long memberId;
  private Long targetMemberId;
  private LocalDateTime createdDate;

  public ConnectionDto(Long memberId, Long targetMemberId, LocalDateTime createdDate) {
    this.memberId = memberId;
    this.targetMemberId = targetMemberId;
    this.createdDate = createdDate;
  }
}
