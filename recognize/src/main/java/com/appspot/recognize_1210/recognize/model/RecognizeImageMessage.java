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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-01-08 17:48:37 UTC)
 * on 2016-02-03 at 22:14:26 UTC 
 * Modify at your own risk.
 */

package com.appspot.recognize_1210.recognize.model;

/**
 * Model definition for RecognizeImageMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recognize. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RecognizeImageMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean correct;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("image_url")
  private java.lang.String imageUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCorrect() {
    return correct;
  }

  /**
   * @param correct correct or {@code null} for none
   */
  public RecognizeImageMessage setCorrect(java.lang.Boolean correct) {
    this.correct = correct;
    return this;
  }

  /**
   * @see #decodeImageUrl()
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**

   * @see #getImageUrl()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeImageUrl() {
    return com.google.api.client.util.Base64.decodeBase64(imageUrl);
  }

  /**
   * @see #encodeImageUrl()
   * @param imageUrl imageUrl or {@code null} for none
   */
  public RecognizeImageMessage setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**

   * @see #setImageUrl()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public RecognizeImageMessage encodeImageUrl(byte[] imageUrl) {
    this.imageUrl = com.google.api.client.util.Base64.encodeBase64URLSafeString(imageUrl);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public RecognizeImageMessage setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public RecognizeImageMessage set(String fieldName, Object value) {
    return (RecognizeImageMessage) super.set(fieldName, value);
  }

  @Override
  public RecognizeImageMessage clone() {
    return (RecognizeImageMessage) super.clone();
  }

}
