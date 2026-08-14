package io.github.nabobery.sdkgen.github.generated

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
 * Key/value pairs to provide settings for this webhook.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1hooks/post/requestBody/content/application~1json/schema
 * /properties/config
 */
@Serializable(with = InlineReposHooksPostRequestJsonConfigX412f21f5.Serializer::class)
public class InlineReposHooksPostRequestJsonConfigX412f21f5(
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

    public fun build(): InlineReposHooksPostRequestJsonConfigX412f21f5 = InlineReposHooksPostRequestJsonConfigX412f21f5(
      contentType = contentType,
      insecureSsl = insecureSsl,
      secret = secret,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposHooksPostRequestJsonConfigX412f21f5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposHooksPostRequestJsonConfigX412f21f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposHooksPostRequestJsonConfigX412f21f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposHooksPostRequestJsonConfigX412f21f5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposHooksPostRequestJsonConfigX412f21f5 must be a JSON object")
      return InlineReposHooksPostRequestJsonConfigX412f21f5(
        contentType = rawObject["content_type"]?.let { json.decodeFromJsonElement<String>(it) },
        insecureSsl = rawObject["insecure_ssl"]?.let { json.decodeFromJsonElement<WebhookConfigInsecureSsl>(it) },
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposHooksPostRequestJsonConfigX412f21f5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposHooksPostRequestJsonConfigX412f21f5")
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

public fun inlineReposHooksPostRequestJsonConfigX412f21f5(block: InlineReposHooksPostRequestJsonConfigX412f21f5.Builder.() -> Unit): InlineReposHooksPostRequestJsonConfigX412f21f5 = InlineReposHooksPostRequestJsonConfigX412f21f5.build(block)
