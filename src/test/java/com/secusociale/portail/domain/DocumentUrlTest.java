package com.secusociale.portail.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.secusociale.portail.web.rest.TestUtil;

public class DocumentUrlTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(DocumentUrl.class);
        DocumentUrl documentUrl1 = new DocumentUrl();
        documentUrl1.setId(1L);
        DocumentUrl documentUrl2 = new DocumentUrl();
        documentUrl2.setId(documentUrl1.getId());
        assertThat(documentUrl1).isEqualTo(documentUrl2);
        documentUrl2.setId(2L);
        assertThat(documentUrl1).isNotEqualTo(documentUrl2);
        documentUrl1.setId(null);
        assertThat(documentUrl1).isNotEqualTo(documentUrl2);
    }
}
