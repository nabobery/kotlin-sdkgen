package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_device
 */
@Serializable(with = IssuingNetworkTokenDevice.Serializer::class)
public class IssuingNetworkTokenDevice(
  /**
   * An obfuscated ID derived from the device ID.
   */
  public val deviceFingerprint: String? = null,
  /**
   * The IP address of the device at provisioning time.
   */
  public val ipAddress: String? = null,
  /**
   * The geographic latitude/longitude coordinates of the device at provisioning time. The format is
   * [+-]decimal/[+-]decimal.
   */
  public val location: String? = null,
  /**
   * The name of the device used for tokenization.
   */
  public val name: String? = null,
  /**
   * The phone number of the device used for tokenization.
   */
  public val phoneNumber: String? = null,
  /**
   * The type of device used for tokenization.
   */
  public val type: InlineIssuingNetworkTokenDeviceTypeX0d97c801? = null,
) {
  public class Builder {
    /**
     * An obfuscated ID derived from the device ID.
     */
    public var deviceFingerprint: String? = null

    /**
     * The IP address of the device at provisioning time.
     */
    public var ipAddress: String? = null

    /**
     * The geographic latitude/longitude coordinates of the device at provisioning time. The format is
     * [+-]decimal/[+-]decimal.
     */
    public var location: String? = null

    /**
     * The name of the device used for tokenization.
     */
    public var name: String? = null

    /**
     * The phone number of the device used for tokenization.
     */
    public var phoneNumber: String? = null

    /**
     * The type of device used for tokenization.
     */
    public var type: InlineIssuingNetworkTokenDeviceTypeX0d97c801? = null

    public fun build(): IssuingNetworkTokenDevice = IssuingNetworkTokenDevice(
      deviceFingerprint = deviceFingerprint,
      ipAddress = ipAddress,
      location = location,
      name = name,
      phoneNumber = phoneNumber,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingNetworkTokenDevice = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingNetworkTokenDevice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingNetworkTokenDevice {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingNetworkTokenDevice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingNetworkTokenDevice must be a JSON object")
      return IssuingNetworkTokenDevice(
        deviceFingerprint = rawObject["device_fingerprint"]?.let { json.decodeFromJsonElement<String>(it) },
        ipAddress = rawObject["ip_address"]?.let { json.decodeFromJsonElement<String>(it) },
        location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phoneNumber = rawObject["phone_number"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineIssuingNetworkTokenDeviceTypeX0d97c801>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingNetworkTokenDevice) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingNetworkTokenDevice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.deviceFingerprint?.let { put("device_fingerprint", it) }
        value.ipAddress?.let { put("ip_address", it) }
        value.location?.let { put("location", it) }
        value.name?.let { put("name", it) }
        value.phoneNumber?.let { put("phone_number", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingNetworkTokenDevice(block: IssuingNetworkTokenDevice.Builder.() -> Unit): IssuingNetworkTokenDevice = IssuingNetworkTokenDevice.build(block)
