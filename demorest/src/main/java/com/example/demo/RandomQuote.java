
package com.example.demo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RandomQuote implements Serializable {

    private String id;
    private String content;
    private String author;
    private List<String> tags;
    private String authorSlug;
    private Integer length;
    private String dateAdded;
    private String dateModified;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getAuthorSlug() {
        return authorSlug;
    }

    public void setAuthorSlug(String authorSlug) {
        this.authorSlug = authorSlug;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RandomQuote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null) ? "<null>" : this.content));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null) ? "<null>" : this.author));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("authorSlug");
        sb.append('=');
        sb.append(((this.authorSlug == null) ? "<null>" : this.authorSlug));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null) ? "<null>" : this.length));
        sb.append(',');
        sb.append("dateAdded");
        sb.append('=');
        sb.append(((this.dateAdded == null) ? "<null>" : this.dateAdded));
        sb.append(',');
        sb.append("dateModified");
        sb.append('=');
        sb.append(((this.dateModified == null) ? "<null>" : this.dateModified));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.authorSlug == null) ? 0 : this.authorSlug.hashCode()));
        result = ((result * 31) + ((this.author == null) ? 0 : this.author.hashCode()));
        result = ((result * 31) + ((this.length == null) ? 0 : this.length.hashCode()));
        result = ((result * 31) + ((this.dateModified == null) ? 0 : this.dateModified.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.content == null) ? 0 : this.content.hashCode()));
        result = ((result * 31) + ((this.dateAdded == null) ? 0 : this.dateAdded.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RandomQuote) == false) {
            return false;
        }
        RandomQuote rhs = ((RandomQuote) other);
        return ((((((((((this.authorSlug == rhs.authorSlug) || ((this.authorSlug != null) && this.authorSlug.equals(rhs.authorSlug))) && ((this.author == rhs.author) || ((this.author != null) && this.author.equals(rhs.author)))) && ((this.length == rhs.length) || ((this.length != null) && this.length.equals(rhs.length)))) && ((this.dateModified == rhs.dateModified) || ((this.dateModified != null) && this.dateModified.equals(rhs.dateModified)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.content == rhs.content) || ((this.content != null) && this.content.equals(rhs.content)))) && ((this.dateAdded == rhs.dateAdded) || ((this.dateAdded != null) && this.dateAdded.equals(rhs.dateAdded)))) && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))));
    }

}
