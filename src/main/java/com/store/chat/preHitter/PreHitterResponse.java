package com.store.chat.preHitter;

import com.store.chat.enums.MICROSERVICE;
import com.store.chat.enums.RESPONSE_TYPE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreHitterResponse {
    RESPONSE_TYPE responseType;
    MICROSERVICE microservice;
}
