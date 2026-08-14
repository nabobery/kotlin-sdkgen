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

/**
 * Enable automatic prompt caching. When set at the top level, the system automatically applies cache breakpoints to the
 * last cacheable block in the request. When set on an individual content block, it marks an explicit cache breakpoint;
 * block-level markers also work on OpenAI models that support explicit prompt caching — OpenRouter converts them to the
 * provider's native format.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheControlDirective
 */
@Serializable(with = AnthropicCacheControlDirective.Serializer::class)
public class AnthropicCacheControlDirective(
  public val type: InlineAnthropicCacheControlDirectiveTypeX1079002e,
  public val ttl: AnthropicCacheControlTtl? = null,
) {
  public class Builder {
    private var typeValue: InlineAnthropicCacheControlDirectiveTypeX1079002e? = null

    public var type: InlineAnthropicCacheControlDirectiveTypeX1079002e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var ttl: AnthropicCacheControlTtl? = null

    public fun build(): AnthropicCacheControlDirective {
      check(typeValue != null) { "type is required" }
      return AnthropicCacheControlDirective(
        type = type,
        ttl = ttl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCacheControlDirective = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCacheControlDirective> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCacheControlDirective {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCacheControlDirective")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCacheControlDirective must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicCacheControlDirectiveTypeX1079002e>(rawObject, "type")
      return AnthropicCacheControlDirective(
        type = type,
        ttl = rawObject["ttl"]?.let { json.decodeFromJsonElement<AnthropicCacheControlTtl>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCacheControlDirective) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCacheControlDirective")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.ttl?.let { put("ttl", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCacheControlDirective(block: AnthropicCacheControlDirective.Builder.() -> Unit): AnthropicCacheControlDirective = AnthropicCacheControlDirective.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCacheControlDirective is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
