package com.mohamed.abdi.book.emil;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    ACTIVATION_ACCOUNT("activate_account.html");

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
