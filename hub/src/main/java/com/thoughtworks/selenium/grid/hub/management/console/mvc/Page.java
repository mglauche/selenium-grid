package com.thoughtworks.selenium.grid.hub.management.console.mvc;

import java.util.HashMap;

/**
 * Page to render.
 * Associates an HTML template with runtime assigns that can be resolved by the template.
 */
public class Page {

    private final String template;
    private final HashMap<String, Object> assigns;

    public Page(String template) {
        this.template = template;
        this.assigns = new HashMap<String, Object>();
    }

    public String template() {
        return template;
    }

    public HashMap<String, Object> assigns() {
        return assigns;
    }

    public void set(String name, Object value) {
        this.assigns.put(name, value);
    }

}

