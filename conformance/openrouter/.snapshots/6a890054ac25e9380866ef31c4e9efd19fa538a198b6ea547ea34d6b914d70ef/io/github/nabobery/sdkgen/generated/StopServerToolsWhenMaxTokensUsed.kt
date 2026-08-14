package io.github.nabobery.sdkgen.generated

import kotlin.Int
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

/**
 * Stop once cumulative token usage across the loop exceeds this threshold.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenMaxTokensUsed
 */
@Serializable(with = StopServerToolsWhenMaxTokensUsed.Serializer::class)
public class StopServerToolsWhenMaxTokensUsed(
  public val maxTokens: Int,
  public val type: InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95,
) {
  public class Builder {
    private var maxTokensValue: Int? = null

    public var maxTokens: Int
      get() = requireNotNull(maxTokensValue) { "maxTokens is required" }
      set(`value`) {
        maxTokensValue = value
      }

    private var typeValue: InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95? = null

    public var type: InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): StopServerToolsWhenMaxTokensUsed {
      check(maxTokensValue != null) { "maxTokens is required" }
      check(typeValue != null) { "type is required" }
      return StopServerToolsWhenMaxTokensUsed(
        maxTokens = maxTokens,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StopServerToolsWhenMaxTokensUsed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StopServerToolsWhenMaxTokensUsed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StopServerToolsWhenMaxTokensUsed {
      val jsonDecoder = decoder.requireJsonDecoder("StopServerToolsWhenMaxTokensUsed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StopServerToolsWhenMaxTokensUsed must be a JSON object")
      val maxTokens = json.decodeRequired<Int>(rawObject, "max_tokens")
      val type = json.decodeRequired<InlineStopServerToolsWhenMaxTokensUsedTypeX6ee9fb95>(rawObject, "type")
      return StopServerToolsWhenMaxTokensUsed(
        maxTokens = maxTokens,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StopServerToolsWhenMaxTokensUsed) {
      val jsonEncoder = encoder.requireJsonEncoder("StopServerToolsWhenMaxTokensUsed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("max_tokens", json.encodeToJsonElement(value.maxTokens))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun stopServerToolsWhenMaxTokensUsed(block: StopServerToolsWhenMaxTokensUsed.Builder.() -> Unit): StopServerToolsWhenMaxTokensUsed = StopServerToolsWhenMaxTokensUsed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StopServerToolsWhenMaxTokensUsed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
