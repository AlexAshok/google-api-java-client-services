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

package com.google.api.services.compute.model;

/**
 * Next free: 7
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PacketIntervals extends com.google.api.client.json.GenericJson {

  /**
   * Average observed inter-packet interval in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long avgMs;

  /**
   * From how long ago in the past these intervals were observed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String duration;

  /**
   * Maximum observed inter-packet interval in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxMs;

  /**
   * Minimum observed inter-packet interval in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minMs;

  /**
   * Number of inter-packet intervals from which these statistics were derived.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numIntervals;

  /**
   * The type of packets for which inter-packet intervals were computed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Average observed inter-packet interval in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAvgMs() {
    return avgMs;
  }

  /**
   * Average observed inter-packet interval in milliseconds.
   * @param avgMs avgMs or {@code null} for none
   */
  public PacketIntervals setAvgMs(java.lang.Long avgMs) {
    this.avgMs = avgMs;
    return this;
  }

  /**
   * From how long ago in the past these intervals were observed.
   * @return value or {@code null} for none
   */
  public java.lang.String getDuration() {
    return duration;
  }

  /**
   * From how long ago in the past these intervals were observed.
   * @param duration duration or {@code null} for none
   */
  public PacketIntervals setDuration(java.lang.String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Maximum observed inter-packet interval in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxMs() {
    return maxMs;
  }

  /**
   * Maximum observed inter-packet interval in milliseconds.
   * @param maxMs maxMs or {@code null} for none
   */
  public PacketIntervals setMaxMs(java.lang.Long maxMs) {
    this.maxMs = maxMs;
    return this;
  }

  /**
   * Minimum observed inter-packet interval in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinMs() {
    return minMs;
  }

  /**
   * Minimum observed inter-packet interval in milliseconds.
   * @param minMs minMs or {@code null} for none
   */
  public PacketIntervals setMinMs(java.lang.Long minMs) {
    this.minMs = minMs;
    return this;
  }

  /**
   * Number of inter-packet intervals from which these statistics were derived.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumIntervals() {
    return numIntervals;
  }

  /**
   * Number of inter-packet intervals from which these statistics were derived.
   * @param numIntervals numIntervals or {@code null} for none
   */
  public PacketIntervals setNumIntervals(java.lang.Long numIntervals) {
    this.numIntervals = numIntervals;
    return this;
  }

  /**
   * The type of packets for which inter-packet intervals were computed.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of packets for which inter-packet intervals were computed.
   * @param type type or {@code null} for none
   */
  public PacketIntervals setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public PacketIntervals set(String fieldName, Object value) {
    return (PacketIntervals) super.set(fieldName, value);
  }

  @Override
  public PacketIntervals clone() {
    return (PacketIntervals) super.clone();
  }

}
