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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class AnthropicTextBlockParamView internal constructor(
  @SerialName("cache_control")
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val citations: List<InlineAnthropicTextBlockParamCitationsItemXa20bc77d>? = null,
  public val text: String,
  public val type: InlineAnthropicTextBlockParamTypeX2f8f666a,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlockParam.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlockParam
 */
@Serializable(with = AnthropicTextBlockParam.Serializer::class)
public class AnthropicTextBlockParam(
  public val text: String,
  public val type: InlineAnthropicTextBlockParamTypeX2f8f666a,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  citations: List<InlineAnthropicTextBlockParamCitationsItemXa20bc77d>? = null,
) {
  public val citations: List<InlineAnthropicTextBlockParamCitationsItemXa20bc77d>? =
      citations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineAnthropicTextBlockParamTypeX2f8f666a? = null

    public var type: InlineAnthropicTextBlockParamTypeX2f8f666a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    private var citationsValue: List<InlineAnthropicTextBlockParamCitationsItemXa20bc77d>? = null

    public var citations: List<InlineAnthropicTextBlockParamCitationsItemXa20bc77d>?
      get() = citationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        citationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): AnthropicTextBlockParam {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicTextBlockParam(
        text = text,
        type = type,
        cacheControl = cacheControl,
        citations = citations,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicTextBlockParam = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicTextBlockParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextBlockParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextBlockParam")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicTextBlockParam must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineAnthropicTextBlockParamTypeX2f8f666a>(rawObject, "type")
      return AnthropicTextBlockParam(
        text = text,
        type = type,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        citations = rawObject["citations"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineAnthropicTextBlockParamCitationsItemXa20bc77d>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextBlockParam) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicTextBlockParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.citations?.let { put("citations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicTextBlockParam(block: AnthropicTextBlockParam.Builder.() -> Unit): AnthropicTextBlockParam = AnthropicTextBlockParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicTextBlockParam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
