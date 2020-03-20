package com.secusociale.portail.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.secusociale.portail.web.rest.TestUtil;

public class RepresentantLegalTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(RepresentantLegal.class);
        RepresentantLegal representantLegal1 = new RepresentantLegal();
        representantLegal1.setId(1L);
        RepresentantLegal representantLegal2 = new RepresentantLegal();
        representantLegal2.setId(representantLegal1.getId());
        assertThat(representantLegal1).isEqualTo(representantLegal2);
        representantLegal2.setId(2L);
        assertThat(representantLegal1).isNotEqualTo(representantLegal2);
        representantLegal1.setId(null);
        assertThat(representantLegal1).isNotEqualTo(representantLegal2);
    }
}
