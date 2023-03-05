package com.prototype.api.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("api.data")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PrototypeConfiguration {
    private String name;
    private String age;
}
