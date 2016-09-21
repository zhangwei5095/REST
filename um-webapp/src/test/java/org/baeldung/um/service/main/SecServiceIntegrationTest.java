package org.baeldung.um.service.main;

import org.baeldung.common.persistence.model.INameableEntity;
import org.baeldung.test.common.service.AbstractServiceIntegrationTest;
import org.baeldung.um.spring.UmContextConfig;
import org.baeldung.um.spring.UmPersistenceJpaConfig;
import org.baeldung.um.spring.UmServiceConfig;
import org.baeldung.um.spring.UmClientConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UmPersistenceJpaConfig.class, UmServiceConfig.class, UmContextConfig.class, UmClientConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecServiceIntegrationTest<T extends INameableEntity> extends AbstractServiceIntegrationTest<T> {

    //

}
