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

package com.google.api.services.pubsub.model;

/**
 * Request for the `Pull` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PullRequest extends com.google.api.client.json.GenericJson {

  /**
   * The maximum number of messages returned for this request. The Pub/Sub system may return fewer
   * than the number specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxMessages;

  /**
   * Optional. If this is specified as true the system will respond immediately even if it is not
   * able to return a message in the `Pull` response. Otherwise the system is allowed to wait until
   * at least one message is available rather than returning no messages. The client may cancel the
   * request if it does not wish to wait any longer for the response. Warning: setting this field to
   * `true` is discouraged because it adversely impacts the performance of `Pull` operations. We
   * recommend that users do not set this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnImmediately;

  /**
   * The maximum number of messages returned for this request. The Pub/Sub system may return fewer
   * than the number specified.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxMessages() {
    return maxMessages;
  }

  /**
   * The maximum number of messages returned for this request. The Pub/Sub system may return fewer
   * than the number specified.
   * @param maxMessages maxMessages or {@code null} for none
   */
  public PullRequest setMaxMessages(java.lang.Integer maxMessages) {
    this.maxMessages = maxMessages;
    return this;
  }

  /**
   * Optional. If this is specified as true the system will respond immediately even if it is not
   * able to return a message in the `Pull` response. Otherwise the system is allowed to wait until
   * at least one message is available rather than returning no messages. The client may cancel the
   * request if it does not wish to wait any longer for the response. Warning: setting this field to
   * `true` is discouraged because it adversely impacts the performance of `Pull` operations. We
   * recommend that users do not set this field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnImmediately() {
    return returnImmediately;
  }

  /**
   * Optional. If this is specified as true the system will respond immediately even if it is not
   * able to return a message in the `Pull` response. Otherwise the system is allowed to wait until
   * at least one message is available rather than returning no messages. The client may cancel the
   * request if it does not wish to wait any longer for the response. Warning: setting this field to
   * `true` is discouraged because it adversely impacts the performance of `Pull` operations. We
   * recommend that users do not set this field.
   * @param returnImmediately returnImmediately or {@code null} for none
   */
  public PullRequest setReturnImmediately(java.lang.Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
    return this;
  }

  @Override
  public PullRequest set(String fieldName, Object value) {
    return (PullRequest) super.set(fieldName, value);
  }

  @Override
  public PullRequest clone() {
    return (PullRequest) super.clone();
  }

}
