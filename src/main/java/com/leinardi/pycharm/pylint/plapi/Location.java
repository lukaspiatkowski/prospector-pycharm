package com.leinardi.pycharm.pylint.plapi;

/**
 * Location part of a message returned by Prospector
 */

import com.squareup.moshi.Json;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Location {

    @Json(name = "path")
    private String path;
    @Json(name = "module")
    private String module;
    @Json(name = "function")
    private String function;
    @Json(name = "line")
    private int line;
    @Json(name = "character")
    private int character;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("path", path)
                .append("module", module)
                .append("function", function)
                .append("line", line)
                .append("character", character).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(path)
                .append(module)
                .append(function)
                .append(line)
                .append(character)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder()
                .append(path, rhs.path)
                .append(module, rhs.module)
                .append(function, rhs.function)
                .append(line, rhs.line)
                .append(character, rhs.character)
                .isEquals();
    }

}