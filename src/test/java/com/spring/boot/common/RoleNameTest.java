package com.spring.boot.common;

import com.spring.boot.member.domain.role.RoleName;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class RoleNameTest {
    @Test
    public void Role_이름찾기(){
        Optional<RoleName> role = RoleName.of("admIn");
        assertTrue(role.isPresent());
        assertEquals(role.get(), RoleName.ADMIN);
    }

    @Test
    public void Role_이름찾기실패(){
        Optional<RoleName> role = RoleName.of("test");
        assertFalse(role.isPresent());
    }
}