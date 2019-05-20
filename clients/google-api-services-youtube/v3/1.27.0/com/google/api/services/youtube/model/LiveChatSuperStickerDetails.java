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

package com.google.api.services.youtube.model;

/**
 * Model definition for LiveChatSuperStickerDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveChatSuperStickerDetails extends com.google.api.client.json.GenericJson {

  /**
   * A rendered string that displays the fund amount and currency to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String amountDisplayString;

  /**
   * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger amountMicros;

  /**
   * The currency in which the purchase was made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currency;

  /**
   * Information about the Super Sticker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SuperStickerMetadata superStickerMetadata;

  /**
   * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is
   * 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long tier;

  /**
   * A rendered string that displays the fund amount and currency to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getAmountDisplayString() {
    return amountDisplayString;
  }

  /**
   * A rendered string that displays the fund amount and currency to the user.
   * @param amountDisplayString amountDisplayString or {@code null} for none
   */
  public LiveChatSuperStickerDetails setAmountDisplayString(java.lang.String amountDisplayString) {
    this.amountDisplayString = amountDisplayString;
    return this;
  }

  /**
   * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAmountMicros() {
    return amountMicros;
  }

  /**
   * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
   * @param amountMicros amountMicros or {@code null} for none
   */
  public LiveChatSuperStickerDetails setAmountMicros(java.math.BigInteger amountMicros) {
    this.amountMicros = amountMicros;
    return this;
  }

  /**
   * The currency in which the purchase was made.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrency() {
    return currency;
  }

  /**
   * The currency in which the purchase was made.
   * @param currency currency or {@code null} for none
   */
  public LiveChatSuperStickerDetails setCurrency(java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Information about the Super Sticker.
   * @return value or {@code null} for none
   */
  public SuperStickerMetadata getSuperStickerMetadata() {
    return superStickerMetadata;
  }

  /**
   * Information about the Super Sticker.
   * @param superStickerMetadata superStickerMetadata or {@code null} for none
   */
  public LiveChatSuperStickerDetails setSuperStickerMetadata(SuperStickerMetadata superStickerMetadata) {
    this.superStickerMetadata = superStickerMetadata;
    return this;
  }

  /**
   * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is
   * 1.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTier() {
    return tier;
  }

  /**
   * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is
   * 1.
   * @param tier tier or {@code null} for none
   */
  public LiveChatSuperStickerDetails setTier(java.lang.Long tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public LiveChatSuperStickerDetails set(String fieldName, Object value) {
    return (LiveChatSuperStickerDetails) super.set(fieldName, value);
  }

  @Override
  public LiveChatSuperStickerDetails clone() {
    return (LiveChatSuperStickerDetails) super.clone();
  }

}