/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * The response message for GroupsService.ListGroups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListGroupsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The `Group`s under the specified `parent`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Group> groups;

  static {
    // hack to force ProGuard to consider Group used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Group.class);
  }

  /**
   * A continuation token to retrieve the next page of results, or empty if there are no more
   * results available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The `Group`s under the specified `parent`.
   * @return value or {@code null} for none
   */
  public java.util.List<Group> getGroups() {
    return groups;
  }

  /**
   * The `Group`s under the specified `parent`.
   * @param groups groups or {@code null} for none
   */
  public ListGroupsResponse setGroups(java.util.List<Group> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * A continuation token to retrieve the next page of results, or empty if there are no more
   * results available.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A continuation token to retrieve the next page of results, or empty if there are no more
   * results available.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListGroupsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListGroupsResponse set(String fieldName, Object value) {
    return (ListGroupsResponse) super.set(fieldName, value);
  }

  @Override
  public ListGroupsResponse clone() {
    return (ListGroupsResponse) super.clone();
  }

}
