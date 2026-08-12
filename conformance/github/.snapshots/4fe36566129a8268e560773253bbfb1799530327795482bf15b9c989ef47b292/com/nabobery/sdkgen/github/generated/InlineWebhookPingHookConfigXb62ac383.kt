package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-ping/properties/hook/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-ping/properties/hook/properties/config
 */
@Serializable(with = InlineWebhookPingHookConfigXb62ac383.Serializer::class)
public class InlineWebhookPingHookConfigXb62ac383(
  public val contentType: String? = null,
  public val insecureSsl: WebhookConfigInsecureSsl? = null,
  public val secret: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    public var contentType: String? = null

    public var insecureSsl: WebhookConfigInsecureSsl? = null

    public var secret: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): InlineWebhookPingHookConfigXb62ac383 = InlineWebhookPingHookConfigXb62ac383(
      contentType = contentType,
      insecureSsl = insecureSsl,
      secret = secret,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPingHookConfigXb62ac383 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPingHookConfigXb62ac383> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPingHookConfigXb62ac383 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPingHookConfigXb62ac383")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPingHookConfigXb62ac383 must be a JSON object")
      return InlineWebhookPingHookConfigXb62ac383(
        contentType = rawObject["content_type"]?.let { json.decodeFromJsonElement<String>(it) },
        insecureSsl = rawObject["insecure_ssl"]?.let { json.decodeFromJsonElement<WebhookConfigInsecureSsl>(it) },
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPingHookConfigXb62ac383) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPingHookConfigXb62ac383")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.contentType?.let { put("content_type", it) }
        value.insecureSsl?.let { put("insecure_ssl", json.encodeToJsonElement(it)) }
        value.secret?.let { put("secret", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPingHookConfigXb62ac383(block: InlineWebhookPingHookConfigXb62ac383.Builder.() -> Unit): InlineWebhookPingHookConfigXb62ac383 = InlineWebhookPingHookConfigXb62ac383.build(block)
