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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class AnthropicDocumentBlockParamView(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val citations:
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations? = null,
  public val context: String? = null,
  public val source: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource,
  public val title: String? = null,
  public val type: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam.
 */
@Serializable(with = AnthropicDocumentBlockParam.Serializer::class)
public class AnthropicDocumentBlockParam(
  public val source: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource,
  public val type: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val citations:
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations? = null,
  public val context: String? = null,
  public val title: String? = null,
) {
  public class Builder {
    private var sourceValue: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource? =
        null

    public var source: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var citations: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations? =
        null

    public var context: String? = null

    public var title: String? = null

    public fun build(): AnthropicDocumentBlockParam {
      check(sourceValue != null) { "source is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicDocumentBlockParam(
        source = source,
        type = type,
        cacheControl = cacheControl,
        citations = citations,
        context = context,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicDocumentBlockParam = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicDocumentBlockParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicDocumentBlockParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicDocumentBlockParam")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicDocumentBlockParam must be a JSON object")
      val source = json.decodeRequired<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource>(raw,
        "source")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType>(raw, "type")
      return AnthropicDocumentBlockParam(
        source = source,
        type = type,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        citations = raw["citations"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations?>(element) },
        context = raw["context"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        title = raw["title"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicDocumentBlockParam) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicDocumentBlockParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("source", json.encodeToJsonElement(value.source))
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.citations?.let { put("citations", json.encodeToJsonElement(it)) }
        value.context?.let { put("context", it) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicDocumentBlockParam(block: AnthropicDocumentBlockParam.Builder.() ->
  Unit): AnthropicDocumentBlockParam = AnthropicDocumentBlockParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicDocumentBlockParam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
