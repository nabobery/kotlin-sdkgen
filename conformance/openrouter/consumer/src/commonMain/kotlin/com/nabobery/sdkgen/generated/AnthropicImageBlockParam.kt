package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class AnthropicImageBlockParamView(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val source: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource,
  public val type: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicImageBlockParam.
 */
@Serializable(with = AnthropicImageBlockParam.Serializer::class)
public class AnthropicImageBlockParam(
  public val source: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource,
  public val type: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType,
  public val cacheControl: AnthropicCacheControlDirective? = null,
) {
  public class Builder {
    private var sourceValue: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource? = null

    public var source: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public fun build(): AnthropicImageBlockParam {
      check(sourceValue != null) { "source is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicImageBlockParam(
        source = source,
        type = type,
        cacheControl = cacheControl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicImageBlockParam = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicImageBlockParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicImageBlockParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicImageBlockParam")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicImageBlockParam must be a JSON object")
      val source = json.decodeRequired<InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource>(raw, "source")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicImageBlockParamPropertiesType>(raw, "type")
      return AnthropicImageBlockParam(
        source = source,
        type = type,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicImageBlockParam) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicImageBlockParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("source", json.encodeToJsonElement(value.source))
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicImageBlockParam(block: AnthropicImageBlockParam.Builder.() -> Unit): AnthropicImageBlockParam =
  AnthropicImageBlockParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicImageBlockParam is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
