package com.github.appreciated.app.layout.behaviour.left;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;

import java.io.IOException;

/**
 * Created by appreciated on 01.05.2017.
 * Edited By deyaeddin on 07.02.2018
 */

@JavaScript("vaadin://addons/app-layout/babel-helpers.js")
@JavaScript("vaadin://addons/app-layout/app-layout-es5-listener.js")
@JavaScript("frontend://bower_components/webcomponentsjs/webcomponents-lite.js")

@HtmlImport("frontend://bower_components/polymer/polymer.html")
@HtmlImport("frontend://bower_components/iron-icons/iron-icons.html")
@HtmlImport("frontend://bower_components/paper-icon-button/paper-icon-button.html")
@HtmlImport("frontend://bower_components/app-layout/app-toolbar/app-toolbar.html")
@HtmlImport("frontend://bower_components/app-layout/app-drawer/app-drawer.html")
@HtmlImport("frontend://bower_components/app-layout/app-drawer-layout/app-drawer-layout.html")
public class Left extends AbstractLeftAppLayout {

    public Left() throws IOException {
        super("left.html");
    }

    @Override
    public String getStyleName() {
        return "left";
    }
}
