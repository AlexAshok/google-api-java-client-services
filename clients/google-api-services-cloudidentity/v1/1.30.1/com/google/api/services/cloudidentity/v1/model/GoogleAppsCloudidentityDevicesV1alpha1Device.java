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

package com.google.api.services.cloudidentity.v1.model;

/**
 * Resource representing a Device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCloudidentityDevicesV1alpha1Device extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Attributes specific to Android devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCloudidentityDevicesV1alpha1AndroidAttributes androidSpecificAttributes;

  /**
   * Asset tag of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetTag;

  /**
   * Output only. Device brand. Example: Samsung.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brand;

  /**
   * Output only. Represents whether the Device is compromised.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compromisedState;

  /**
   * Output only. When the Company-Owned device was imported. This field is empty for BYOD devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Type of device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceType;

  /**
   * Output only. IMEI number of device if GSM device; empty otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imei;

  /**
   * Most recent time when device synced with this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastSyncTime;

  /**
   * Output only. Management state of the device
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementState;

  /**
   * Output only. Device manufacturer. Example: Motorola.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manufacturer;

  /**
   * Output only. MEID number of device if CDMA device; empty otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String meid;

  /**
   * Output only. Model name of device. Example: Pixel 3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device
   * in format: `devices/{device_id}`, where device_id is the unique id assigned to the Device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Mobile or network operator of device, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkOperator;

  /**
   * Output only. OS version of the device. Example: Android 8.1.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osVersion;

  /**
   * Whether the device is owned by the company or an individual
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ownerType;

  /**
   * Output only. OS release version. Example: 6.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String releaseVersion;

  /**
   * Serial Number of device. Example: HT82V1A01076.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serialNumber;

  /**
   * WiFi MAC addresses of device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> wifiMacAddresses;

  /**
   * Output only. Attributes specific to Android devices.
   * @return value or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1AndroidAttributes getAndroidSpecificAttributes() {
    return androidSpecificAttributes;
  }

  /**
   * Output only. Attributes specific to Android devices.
   * @param androidSpecificAttributes androidSpecificAttributes or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setAndroidSpecificAttributes(GoogleAppsCloudidentityDevicesV1alpha1AndroidAttributes androidSpecificAttributes) {
    this.androidSpecificAttributes = androidSpecificAttributes;
    return this;
  }

  /**
   * Asset tag of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetTag() {
    return assetTag;
  }

  /**
   * Asset tag of the device.
   * @param assetTag assetTag or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setAssetTag(java.lang.String assetTag) {
    this.assetTag = assetTag;
    return this;
  }

  /**
   * Output only. Device brand. Example: Samsung.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * Output only. Device brand. Example: Samsung.
   * @param brand brand or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setBrand(java.lang.String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Output only. Represents whether the Device is compromised.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompromisedState() {
    return compromisedState;
  }

  /**
   * Output only. Represents whether the Device is compromised.
   * @param compromisedState compromisedState or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setCompromisedState(java.lang.String compromisedState) {
    this.compromisedState = compromisedState;
    return this;
  }

  /**
   * Output only. When the Company-Owned device was imported. This field is empty for BYOD devices.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. When the Company-Owned device was imported. This field is empty for BYOD devices.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Type of device.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceType() {
    return deviceType;
  }

  /**
   * Output only. Type of device.
   * @param deviceType deviceType or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setDeviceType(java.lang.String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Output only. IMEI number of device if GSM device; empty otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.String getImei() {
    return imei;
  }

  /**
   * Output only. IMEI number of device if GSM device; empty otherwise.
   * @param imei imei or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setImei(java.lang.String imei) {
    this.imei = imei;
    return this;
  }

  /**
   * Most recent time when device synced with this service.
   * @return value or {@code null} for none
   */
  public String getLastSyncTime() {
    return lastSyncTime;
  }

  /**
   * Most recent time when device synced with this service.
   * @param lastSyncTime lastSyncTime or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setLastSyncTime(String lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
    return this;
  }

  /**
   * Output only. Management state of the device
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementState() {
    return managementState;
  }

  /**
   * Output only. Management state of the device
   * @param managementState managementState or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setManagementState(java.lang.String managementState) {
    this.managementState = managementState;
    return this;
  }

  /**
   * Output only. Device manufacturer. Example: Motorola.
   * @return value or {@code null} for none
   */
  public java.lang.String getManufacturer() {
    return manufacturer;
  }

  /**
   * Output only. Device manufacturer. Example: Motorola.
   * @param manufacturer manufacturer or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setManufacturer(java.lang.String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Output only. MEID number of device if CDMA device; empty otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.String getMeid() {
    return meid;
  }

  /**
   * Output only. MEID number of device if CDMA device; empty otherwise.
   * @param meid meid or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setMeid(java.lang.String meid) {
    this.meid = meid;
    return this;
  }

  /**
   * Output only. Model name of device. Example: Pixel 3.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Output only. Model name of device. Example: Pixel 3.
   * @param model model or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device
   * in format: `devices/{device_id}`, where device_id is the unique id assigned to the Device.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device
   * in format: `devices/{device_id}`, where device_id is the unique id assigned to the Device.
   * @param name name or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Mobile or network operator of device, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkOperator() {
    return networkOperator;
  }

  /**
   * Output only. Mobile or network operator of device, if available.
   * @param networkOperator networkOperator or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setNetworkOperator(java.lang.String networkOperator) {
    this.networkOperator = networkOperator;
    return this;
  }

  /**
   * Output only. OS version of the device. Example: Android 8.1.0.
   * @return value or {@code null} for none
   */
  public java.lang.String getOsVersion() {
    return osVersion;
  }

  /**
   * Output only. OS version of the device. Example: Android 8.1.0.
   * @param osVersion osVersion or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setOsVersion(java.lang.String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Whether the device is owned by the company or an individual
   * @return value or {@code null} for none
   */
  public java.lang.String getOwnerType() {
    return ownerType;
  }

  /**
   * Whether the device is owned by the company or an individual
   * @param ownerType ownerType or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setOwnerType(java.lang.String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

  /**
   * Output only. OS release version. Example: 6.0.
   * @return value or {@code null} for none
   */
  public java.lang.String getReleaseVersion() {
    return releaseVersion;
  }

  /**
   * Output only. OS release version. Example: 6.0.
   * @param releaseVersion releaseVersion or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setReleaseVersion(java.lang.String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

  /**
   * Serial Number of device. Example: HT82V1A01076.
   * @return value or {@code null} for none
   */
  public java.lang.String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Serial Number of device. Example: HT82V1A01076.
   * @param serialNumber serialNumber or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setSerialNumber(java.lang.String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * WiFi MAC addresses of device.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWifiMacAddresses() {
    return wifiMacAddresses;
  }

  /**
   * WiFi MAC addresses of device.
   * @param wifiMacAddresses wifiMacAddresses or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1Device setWifiMacAddresses(java.util.List<java.lang.String> wifiMacAddresses) {
    this.wifiMacAddresses = wifiMacAddresses;
    return this;
  }

  @Override
  public GoogleAppsCloudidentityDevicesV1alpha1Device set(String fieldName, Object value) {
    return (GoogleAppsCloudidentityDevicesV1alpha1Device) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCloudidentityDevicesV1alpha1Device clone() {
    return (GoogleAppsCloudidentityDevicesV1alpha1Device) super.clone();
  }

}
