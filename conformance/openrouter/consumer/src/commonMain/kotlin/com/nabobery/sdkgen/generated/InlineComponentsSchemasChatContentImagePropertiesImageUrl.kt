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

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatContentImage/properties/image_url.
 */
@Serializable(with = InlineComponentsSchemasChatContentImagePropertiesImageUrl.Serializer::class)
public class InlineComponentsSchemasChatContentImagePropertiesImageUrl(
  /**
   * URL of the image (data: URLs supported)
   */
  public val url: String,
  /**
   * Image detail level for vision models. `original` is an OpenRouter extension (not in the OpenAI Chat Completions
   * spec) requesting true original-resolution media; it is downgraded to `high` for providers that lack an
   * original-resolution tier.
   */
  public val detail:
      InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail? = null,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * Image detail level for vision models. `original` is an OpenRouter extension (not in the OpenAI Chat Completions
     * spec) requesting true original-resolution media; it is downgraded to `high` for providers that lack an
     * original-resolution tier.
     */
    public var detail: InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail? =
        null

    public fun build(): InlineComponentsSchemasChatContentImagePropertiesImageUrl {
      check(urlValue != null) { "url is required" }
      return InlineComponentsSchemasChatContentImagePropertiesImageUrl(
        url = url,
        detail = detail,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatContentImagePropertiesImageUrl = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatContentImagePropertiesImageUrl> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatContentImagePropertiesImageUrl {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatContentImagePropertiesImageUrl")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatContentImagePropertiesImageUrl must be a JSON object")
      val url = json.decodeRequired<String>(raw, "url")
      return InlineComponentsSchemasChatContentImagePropertiesImageUrl(
        url = url,
        detail = raw["detail"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatContentImagePropertiesImageUrl) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatContentImagePropertiesImageUrl")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
        value.detail?.let { put("detail", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatContentImagePropertiesImageUrl(block: InlineComponentsSchemasChatContentImagePropertiesImageUrl.Builder.() -> Unit): InlineComponentsSchemasChatContentImagePropertiesImageUrl = InlineComponentsSchemasChatContentImagePropertiesImageUrl.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatContentImagePropertiesImageUrl is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
