package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/hook/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/hook/properties/config
 */
@Serializable(with = InlineWebhookMetaDeletedHookConfigXe7072148.Serializer::class)
public class InlineWebhookMetaDeletedHookConfigXe7072148(
  public val contentType: InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3,
  public val insecureSsl: String,
  public val url: String,
  public val secret: String? = null,
) {
  public class Builder {
    private var contentTypeValue: InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3? = null

    public var contentType: InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3
      get() = requireNotNull(contentTypeValue) { "contentType is required" }
      set(`value`) {
        contentTypeValue = value
      }

    private var insecureSslValue: String? = null

    public var insecureSsl: String
      get() = requireNotNull(insecureSslValue) { "insecureSsl is required" }
      set(`value`) {
        insecureSslValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var secret: String? = null

    public fun build(): InlineWebhookMetaDeletedHookConfigXe7072148 {
      check(contentTypeValue != null) { "contentType is required" }
      check(insecureSslValue != null) { "insecureSsl is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookMetaDeletedHookConfigXe7072148(
        contentType = contentType,
        insecureSsl = insecureSsl,
        url = url,
        secret = secret,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMetaDeletedHookConfigXe7072148 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookMetaDeletedHookConfigXe7072148> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMetaDeletedHookConfigXe7072148 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMetaDeletedHookConfigXe7072148")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMetaDeletedHookConfigXe7072148 must be a JSON object")
      val contentType = json.decodeRequired<InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3>(rawObject, "content_type")
      val insecureSsl = json.decodeRequired<String>(rawObject, "insecure_ssl")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookMetaDeletedHookConfigXe7072148(
        contentType = contentType,
        insecureSsl = insecureSsl,
        url = url,
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMetaDeletedHookConfigXe7072148) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMetaDeletedHookConfigXe7072148")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_type", json.encodeToJsonElement(value.contentType))
        put("insecure_ssl", value.insecureSsl)
        put("url", value.url)
        value.secret?.let { put("secret", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMetaDeletedHookConfigXe7072148(block: InlineWebhookMetaDeletedHookConfigXe7072148.Builder.() -> Unit): InlineWebhookMetaDeletedHookConfigXe7072148 = InlineWebhookMetaDeletedHookConfigXe7072148.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMetaDeletedHookConfigXe7072148 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
