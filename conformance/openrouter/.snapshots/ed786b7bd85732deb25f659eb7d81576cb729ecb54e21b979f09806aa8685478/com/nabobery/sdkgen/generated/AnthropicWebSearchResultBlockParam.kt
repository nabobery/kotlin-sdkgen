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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResultBlockParam.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResultBlockParam
 */
@Serializable(with = AnthropicWebSearchResultBlockParam.Serializer::class)
public class AnthropicWebSearchResultBlockParam(
  public val encryptedContent: String,
  public val title: String,
  public val type: InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd,
  public val url: String,
  public val pageAge: String? = null,
) {
  public class Builder {
    private var encryptedContentValue: String? = null

    public var encryptedContent: String
      get() = requireNotNull(encryptedContentValue) { "encryptedContent is required" }
      set(`value`) {
        encryptedContentValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var typeValue: InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd? = null

    public var type: InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var pageAge: String? = null

    public fun build(): AnthropicWebSearchResultBlockParam {
      check(encryptedContentValue != null) { "encryptedContent is required" }
      check(titleValue != null) { "title is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return AnthropicWebSearchResultBlockParam(
        encryptedContent = encryptedContent,
        title = title,
        type = type,
        url = url,
        pageAge = pageAge,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicWebSearchResultBlockParam = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicWebSearchResultBlockParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebSearchResultBlockParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebSearchResultBlockParam")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicWebSearchResultBlockParam must be a JSON object")
      val encryptedContent = json.decodeRequired<String>(rawObject, "encrypted_content")
      val title = json.decodeRequired<String>(rawObject, "title")
      val type = json.decodeRequired<InlineAnthropicWebSearchResultBlockParamTypeX4ccf75bd>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return AnthropicWebSearchResultBlockParam(
        encryptedContent = encryptedContent,
        title = title,
        type = type,
        url = url,
        pageAge = rawObject["page_age"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebSearchResultBlockParam) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicWebSearchResultBlockParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_content", value.encryptedContent)
        put("title", value.title)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
        value.pageAge?.let { put("page_age", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicWebSearchResultBlockParam(block: AnthropicWebSearchResultBlockParam.Builder.() -> Unit): AnthropicWebSearchResultBlockParam = AnthropicWebSearchResultBlockParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicWebSearchResultBlockParam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
