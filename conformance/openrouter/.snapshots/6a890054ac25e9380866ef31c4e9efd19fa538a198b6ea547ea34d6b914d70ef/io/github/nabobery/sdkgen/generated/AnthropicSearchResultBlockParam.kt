package io.github.nabobery.sdkgen.generated

import kotlin.ConsistentCopyVisibility
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

@ConsistentCopyVisibility
@Serializable
public data class AnthropicSearchResultBlockParamView internal constructor(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val citations: InlineAnthropicSearchResultBlockParamCitationsX123642f2? = null,
  public val content: List<AnthropicTextBlockParam>,
  public val source: String,
  public val title: String,
  public val type: InlineAnthropicSearchResultBlockParamTypeX2b91bce1,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam
 */
@Serializable(with = AnthropicSearchResultBlockParam.Serializer::class)
public class AnthropicSearchResultBlockParam(
  content: List<AnthropicTextBlockParam>,
  public val source: String,
  public val title: String,
  public val type: InlineAnthropicSearchResultBlockParamTypeX2b91bce1,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val citations: InlineAnthropicSearchResultBlockParamCitationsX123642f2? = null,
) {
  public val content: List<AnthropicTextBlockParam> = content.toList()

  public class Builder {
    private var contentValue: List<AnthropicTextBlockParam>? = null

    public var content: List<AnthropicTextBlockParam>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
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

    private var typeValue: InlineAnthropicSearchResultBlockParamTypeX2b91bce1? = null

    public var type: InlineAnthropicSearchResultBlockParamTypeX2b91bce1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var citations: InlineAnthropicSearchResultBlockParamCitationsX123642f2? = null

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

  internal object Serializer : KSerializer<AnthropicSearchResultBlockParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicSearchResultBlockParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicSearchResultBlockParam")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicSearchResultBlockParam must be a JSON object")
      val content = json.decodeRequired<List<AnthropicTextBlockParam>>(rawObject, "content")
      val source = json.decodeRequired<String>(rawObject, "source")
      val title = json.decodeRequired<String>(rawObject, "title")
      val type = json.decodeRequired<InlineAnthropicSearchResultBlockParamTypeX2b91bce1>(rawObject, "type")
      return AnthropicSearchResultBlockParam(
        content = content,
        source = source,
        title = title,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        citations = rawObject["citations"]?.let { json.decodeFromJsonElement<InlineAnthropicSearchResultBlockParamCitationsX123642f2>(it) },
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

public fun anthropicSearchResultBlockParam(block: AnthropicSearchResultBlockParam.Builder.() -> Unit): AnthropicSearchResultBlockParam = AnthropicSearchResultBlockParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicSearchResultBlockParam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
