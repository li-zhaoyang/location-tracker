package demo.domain;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@Data
@RequiredArgsConstructor
@Embeddable
public class MedicalInfo {
    private final long bfr;
    private final Long fmi;
}
