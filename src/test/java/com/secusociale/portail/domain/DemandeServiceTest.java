package com.secusociale.portail.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.secusociale.portail.web.rest.TestUtil;

public class DemandeServiceTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(DemandeService.class);
        DemandeService demandeService1 = new DemandeService();
        demandeService1.setId(1L);
        DemandeService demandeService2 = new DemandeService();
        demandeService2.setId(demandeService1.getId());
        assertThat(demandeService1).isEqualTo(demandeService2);
        demandeService2.setId(2L);
        assertThat(demandeService1).isNotEqualTo(demandeService2);
        demandeService1.setId(null);
        assertThat(demandeService1).isNotEqualTo(demandeService2);
    }
}
