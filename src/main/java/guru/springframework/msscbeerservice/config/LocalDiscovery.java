package guru.springframework.msscbeerservice.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jt on 3/7/20.
 */
@Profile("local-discovery")
@EnableDiscoveryClient
@Configuration
public class LocalDiscovery {
}
