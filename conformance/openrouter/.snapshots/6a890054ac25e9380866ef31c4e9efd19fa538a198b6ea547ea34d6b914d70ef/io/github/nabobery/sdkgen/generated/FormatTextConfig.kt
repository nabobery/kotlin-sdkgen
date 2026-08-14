package io.github.nabobery.sdkgen.generated

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
public data class FormatTextConfigView(
  public val type: InlineFormatTextConfigTypeX219eccdd,
)

/**
 * Plain text response format
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FormatTextConfig
 */
@Serializable(with = FormatTextConfig.Serializer::class)
public class FormatTextConfig(
  public val type: InlineFormatTextConfigTypeX219eccdd,
) {
  public class Builder {
    private var typeValue: InlineFormatTextConfigTypeX219eccdd? = null

    public var type: InlineFormatTextConfigTypeX219eccdd
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FormatTextConfig {
      check(typeValue != null) { "type is required" }
      return FormatTextConfig(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FormatTextConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FormatTextConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FormatTextConfig {
      val jsonDecoder = decoder.requireJsonDecoder("FormatTextConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FormatTextConfig must be a JSON object")
      val type = json.decodeRequired<InlineFormatTextConfigTypeX219eccdd>(rawObject, "type")
      return FormatTextConfig(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FormatTextConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("FormatTextConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun formatTextConfig(block: FormatTextConfig.Builder.() -> Unit): FormatTextConfig = FormatTextConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FormatTextConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
