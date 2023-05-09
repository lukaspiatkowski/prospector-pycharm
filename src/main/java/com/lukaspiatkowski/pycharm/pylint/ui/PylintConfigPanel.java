/*
 * Copyright 2021 Roberto Leinardi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lukaspiatkowski.pycharm.pylint.ui;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextComponentAccessor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.components.JBTextField;
import com.lukaspiatkowski.pycharm.pylint.PylintBundle;
import com.lukaspiatkowski.pycharm.pylint.PylintConfigService;
import com.lukaspiatkowski.pycharm.pylint.plapi.PylintRunner;
import com.lukaspiatkowski.pycharm.pylint.util.Icons;
import com.lukaspiatkowski.pycharm.pylint.util.Notifications;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;

public class PylintConfigPanel {
    private JPanel rootPanel;

    public PylintConfigPanel(Project project) {
    }

    public JPanel getPanel() {
        return rootPanel;
    }

    @SuppressWarnings("unused")
    private void createUIComponents() {
    }
}
