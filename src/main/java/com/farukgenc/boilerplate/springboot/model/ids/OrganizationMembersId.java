package com.farukgenc.boilerplate.springboot.model.ids;

import com.farukgenc.boilerplate.springboot.model.Organization;
import com.farukgenc.boilerplate.springboot.model.User;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Embeddable
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationMembersId implements Serializable {
    @Serial
    private static final long serialVersionUID = 761503947455170507L;

    private User user;
    private Organization organization;
}
