package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location
 */
@Serializable(with = SecretScanningLocation.Serializer::class)
public class SecretScanningLocation(
  public val details: InlineSecretScanningLocationDetailsX8ba67cde? = null,
  /**
   * The location type. Because secrets may be found in different types of resources (ie. code, comments, issues, pull
   * requests, discussions), this field identifies the type of resource where the secret was found.
   */
  public val type: InlineSecretScanningLocationTypeX6977c1df? = null,
) {
  public class Builder {
    public var details: InlineSecretScanningLocationDetailsX8ba67cde? = null

    /**
     * The location type. Because secrets may be found in different types of resources (ie. code, comments, issues, pull
     * requests, discussions), this field identifies the type of resource where the secret was found.
     */
    public var type: InlineSecretScanningLocationTypeX6977c1df? = null

    public fun build(): SecretScanningLocation = SecretScanningLocation(
      details = details,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocation {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocation must be a JSON object")
      return SecretScanningLocation(
        details = rawObject["details"]?.let { json.decodeFromJsonElement<InlineSecretScanningLocationDetailsX8ba67cde>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineSecretScanningLocationTypeX6977c1df>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.details?.let { put("details", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocation(block: SecretScanningLocation.Builder.() -> Unit): SecretScanningLocation = SecretScanningLocation.build(block)
