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

package com.leinardi.pycharm.pylint.plapi;

/**
 * An issue as reported by the Pylint tool.
 */

import com.squareup.moshi.Json;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Issue {

    @Json(name = "source")
    private String source;
    @Json(name = "code")
    private String code;
    @Json(name = "location")
    private Location location;
    @Json(name = "message")
    private String message;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("source", source)
                .append("code", code)
                .append("location", location)
                .append("message", message).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(source)
                .append(code)
                .append(location)
                .append(message)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Issue)) {
            return false;
        }
        Issue rhs = ((Issue) other);
        return new EqualsBuilder()
                .append(source, rhs.source)
                .append(code, rhs.code)
                .append(location, rhs.location)
                .append(message, rhs.message)
                .isEquals();
    }

}
