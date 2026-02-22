//package pl.kayakplanner.app.domain.river.repository;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import pl.kayakplanner.app.domain.river.entity.River;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Testcontainers
//class RiverRepositoryInfraTest {
//
//    @Container
//    static PostgreSQLContainer<?> postgres =
//            new PostgreSQLContainer<>("postgres:16-alpine")
//                    .withDatabaseName("testdb")
//                    .withUsername("test")
//                    .withPassword("test");
//
//    @Autowired
//    private RiverRepository repository;
//
//    @Test
//    void shouldSaveAndLoadRiver() {
//        River river = River.builder()
//                .withName("Brda")
//                .withCountry("Poland")
//                .withDescription("Opis")
//                .withLengthKm(245.0)
//                .withRegion("Pomorskie")
//                .build();
//
//        repository.save(river);
//
//        assertThat(repository.findAll()).hasSize(1);
//    }
//}