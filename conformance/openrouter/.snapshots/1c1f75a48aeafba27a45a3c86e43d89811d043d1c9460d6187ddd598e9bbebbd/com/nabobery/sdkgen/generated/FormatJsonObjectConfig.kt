package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class FormatJsonObjectConfigView(
  public val type: InlineFormatJsonObjectConfigTypeXcd522ef8,
)

/**
 * JSON object response format
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FormatJsonObjectConfig
 */
@Serializable(with = FormatJsonObjectConfig.Serializer::class)
public class FormatJsonObjectConfig(
  public val type: InlineFormatJsonObjectConfigTypeXcd522ef8,
) {
  public class Builder {
    private var typeValue: InlineFormatJsonObjectConfigTypeXcd522ef8? = null

    public var type: InlineFormatJsonObjectConfigTypeXcd522ef8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FormatJsonObjectConfig {
      check(typeValue != null) { "type is required" }
      return FormatJsonObjectConfig(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FormatJsonObjectConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FormatJsonObjectConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FormatJsonObjectConfig {
      val jsonDecoder = decoder.requireJsonDecoder("FormatJsonObjectConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FormatJsonObjectConfig must be a JSON object")
      val type = json.decodeRequired<InlineFormatJsonObjectConfigTypeXcd522ef8>(rawObject, "type")
      return FormatJsonObjectConfig(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FormatJsonObjectConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("FormatJsonObjectConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun formatJsonObjectConfig(block: FormatJsonObjectConfig.Builder.() -> Unit): FormatJsonObjectConfig = FormatJsonObjectConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FormatJsonObjectConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
