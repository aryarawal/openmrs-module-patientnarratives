/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.patientnarratives.extension.html;

import org.openmrs.module.web.extension.LinkExt;

/**
 * This class defines the links that will appear on the Main Navigational Panel
 * (the green bar at Top along with the OpenMRS logo)
 */
public class GutterListExt extends LinkExt {

    public String getLabel() {
        return "Patient Narratives";
    }

    public String getUrl() {
        return "module/patientnarratives/patientNarrativesForm.form";
    }

    /**
     * Returns the required privilege in order to see this section. Can be a
     * comma delimited list of privileges. If the default empty string is
     * returned, only an authenticated user is required
     *
     * @return Privilege string
     */
    public String getRequiredPrivilege() {
        return "Add Patient Narratives";
    }

}


