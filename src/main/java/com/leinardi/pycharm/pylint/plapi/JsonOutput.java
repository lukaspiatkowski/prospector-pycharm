package com.leinardi.pycharm.pylint.plapi;

/**
 * Json output returned by Prospector
 */

import com.squareup.moshi.Json;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

public class JsonOutput {

    // Ignore "summary" field

    @Json(name = "messages")
    private List<Issue> issues;

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("messages", issues).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(issues).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JsonOutput)) {
            return false;
        }
        JsonOutput rhs = ((JsonOutput) other);
        return new EqualsBuilder().append(issues, rhs.issues).isEquals();
    }

}
