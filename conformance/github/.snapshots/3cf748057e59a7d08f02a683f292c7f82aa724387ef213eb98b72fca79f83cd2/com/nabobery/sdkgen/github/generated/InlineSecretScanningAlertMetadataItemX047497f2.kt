package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-metadata/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-metadata/items
 */
@Serializable(with = InlineSecretScanningAlertMetadataItemX047497f2.Serializer::class)
public class InlineSecretScanningAlertMetadataItemX047497f2(
  /**
   * The metadata key.
   */
  public val key: String,
  /**
   * The metadata value.
   */
  public val `value`: String,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineSecretScanningAlertMetadataItemX047497f2 {
      check(keyValue != null) { "key is required" }
      check(valueValue != null) { "value is required" }
      return InlineSecretScanningAlertMetadataItemX047497f2(
        key = key,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecretScanningAlertMetadataItemX047497f2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecretScanningAlertMetadataItemX047497f2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecretScanningAlertMetadataItemX047497f2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecretScanningAlertMetadataItemX047497f2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecretScanningAlertMetadataItemX047497f2 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineSecretScanningAlertMetadataItemX047497f2(
        key = key,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningAlertMetadataItemX047497f2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecretScanningAlertMetadataItemX047497f2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecretScanningAlertMetadataItemX047497f2(block: InlineSecretScanningAlertMetadataItemX047497f2.Builder.() -> Unit): InlineSecretScanningAlertMetadataItemX047497f2 = InlineSecretScanningAlertMetadataItemX047497f2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSecretScanningAlertMetadataItemX047497f2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
