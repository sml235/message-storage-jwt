package dev.sml.messagestorage.security;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
public class JwtConfig {

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer_}")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60*1000}}")
    private long expiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;
}
