package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
public data class AnthropicSearchResultBlockParamView(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val citations:
      InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations? = null,
  public val content: List<AnthropicTextBlockParam>,
  public val source: String,
  public val title: String,
  public val type: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam.
 */
@Serializable(with = AnthropicSearchResultBlockParam.Serializer::class)
public class AnthropicSearchResultBlockParam(
  content: List<AnthropicTextBlockParam>,
  public val source: String,
  public val title: String,
  public val type: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val citations:
      InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations? = null,
) {
  public val content: List<AnthropicTextBlockParam> = content.toList()

  public class Builder {
    private var contentValue: List<AnthropicTextBlockParam>? = null

    public var content: List<AnthropicTextBlockParam>
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var sourceValue: String? = null

    public var source: String
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType? =
        null

    public var type: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var citations: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations?
        = null

    public fun build(): AnthropicSearchResultBlockParam {
      check(contentValue != null) { "content is required" }
      check(sourceValue != null) { "source is required" }
      check(titleValue != null) { "title is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicSearchResultBlockParam(
        content = content,
        source = source,
        title = title,
        type = type,
        cacheControl = cacheControl,
        citations = citations,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicSearchResultBlockParam = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicSearchResultBlockParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicSearchResultBlockParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicSearchResultBlockParam")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicSearchResultBlockParam must be a JSON object")
      val content = json.decodeRequired<List<AnthropicTextBlockParam>>(raw, "content")
      val source = json.decodeRequired<String>(raw, "source")
      val title = json.decodeRequired<String>(raw, "title")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType>(raw, "type")
      return AnthropicSearchResultBlockParam(
        content = content,
        source = source,
        title = title,
        type = type,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        citations = raw["citations"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicSearchResultBlockParam) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicSearchResultBlockParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("source", value.source)
        put("title", value.title)
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.citations?.let { put("citations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicSearchResultBlockParam(block: AnthropicSearchResultBlockParam.Builder.() ->
  Unit): AnthropicSearchResultBlockParam = AnthropicSearchResultBlockParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicSearchResultBlockParam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
