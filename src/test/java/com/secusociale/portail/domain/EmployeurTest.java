package com.secusociale.portail.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.secusociale.portail.web.rest.TestUtil;

public class EmployeurTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Employeur.class);
        Employeur employeur1 = new Employeur();
        employeur1.setId(1L);
        Employeur employeur2 = new Employeur();
        employeur2.setId(employeur1.getId());
        assertThat(employeur1).isEqualTo(employeur2);
        employeur2.setId(2L);
        assertThat(employeur1).isNotEqualTo(employeur2);
        employeur1.setId(null);
        assertThat(employeur1).isNotEqualTo(employeur2);
    }
}
