package com.secusociale.portail.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.secusociale.portail.web.rest.TestUtil;

public class DeclarationTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Declaration.class);
        Declaration declaration1 = new Declaration();
        declaration1.setId(1L);
        Declaration declaration2 = new Declaration();
        declaration2.setId(declaration1.getId());
        assertThat(declaration1).isEqualTo(declaration2);
        declaration2.setId(2L);
        assertThat(declaration1).isNotEqualTo(declaration2);
        declaration1.setId(null);
        assertThat(declaration1).isNotEqualTo(declaration2);
    }
}
