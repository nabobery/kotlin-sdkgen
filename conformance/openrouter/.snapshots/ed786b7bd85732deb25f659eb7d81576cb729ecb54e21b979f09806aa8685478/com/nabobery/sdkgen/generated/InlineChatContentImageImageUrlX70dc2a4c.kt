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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentImage/properties/image_url
 */
@Serializable(with = InlineChatContentImageImageUrlX70dc2a4c.Serializer::class)
public class InlineChatContentImageImageUrlX70dc2a4c(
  /**
   * URL of the image (data: URLs supported)
   */
  public val url: String,
  /**
   * Image detail level for vision models. `original` is an OpenRouter extension (not in the OpenAI Chat Completions
   * spec) requesting true original-resolution media; it is downgraded to `high` for providers that lack an
   * original-resolution tier.
   */
  public val detail: InlineChatContentImageImageUrlDetailX1fab6428? = null,
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
    public var detail: InlineChatContentImageImageUrlDetailX1fab6428? = null

    public fun build(): InlineChatContentImageImageUrlX70dc2a4c {
      check(urlValue != null) { "url is required" }
      return InlineChatContentImageImageUrlX70dc2a4c(
        url = url,
        detail = detail,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatContentImageImageUrlX70dc2a4c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatContentImageImageUrlX70dc2a4c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatContentImageImageUrlX70dc2a4c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatContentImageImageUrlX70dc2a4c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatContentImageImageUrlX70dc2a4c must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineChatContentImageImageUrlX70dc2a4c(
        url = url,
        detail = rawObject["detail"]?.let { json.decodeFromJsonElement<InlineChatContentImageImageUrlDetailX1fab6428>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatContentImageImageUrlX70dc2a4c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatContentImageImageUrlX70dc2a4c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
        value.detail?.let { put("detail", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatContentImageImageUrlX70dc2a4c(block: InlineChatContentImageImageUrlX70dc2a4c.Builder.() -> Unit): InlineChatContentImageImageUrlX70dc2a4c = InlineChatContentImageImageUrlX70dc2a4c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatContentImageImageUrlX70dc2a4c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
