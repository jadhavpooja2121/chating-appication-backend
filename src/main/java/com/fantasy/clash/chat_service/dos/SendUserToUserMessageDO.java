package com.fantasy.clash.chat_service.dos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendUserToUserMessageDO {
  private String otherUsername;
  private Long otherUserId;
  private String message;
}
