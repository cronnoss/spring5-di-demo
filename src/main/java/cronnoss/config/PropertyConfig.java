package cronnoss.config;

import cronnoss.examplebeans.FakeDataSource;
import cronnoss.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${cronnoss.username}")
    String user;

    @Value("${cronnoss.password}")
    String password;

    @Value("${cronnoss.dburl}")
    String url;

    @Value("${cronnoss.jms.username}")
    String jmsUsername;

    @Value("${cronnoss.jms.password}")
    String jmsPassword;

    @Value("${cronnoss.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
