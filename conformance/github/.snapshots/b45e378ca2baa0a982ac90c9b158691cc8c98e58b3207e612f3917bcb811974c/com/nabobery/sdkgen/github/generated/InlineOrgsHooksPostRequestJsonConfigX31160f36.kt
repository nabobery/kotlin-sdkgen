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
 * Key/value pairs to provide settings for this webhook.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks/post/requestBody/content/application~1json/schema/properties
 * /config
 */
@Serializable(with = InlineOrgsHooksPostRequestJsonConfigX31160f36.Serializer::class)
public class InlineOrgsHooksPostRequestJsonConfigX31160f36(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val contentType: String? = null,
  public val insecureSsl: WebhookConfigInsecureSsl? = null,
  public val password: String? = null,
  public val secret: String? = null,
  public val username: String? = null,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var contentType: String? = null

    public var insecureSsl: WebhookConfigInsecureSsl? = null

    public var password: String? = null

    public var secret: String? = null

    public var username: String? = null

    public fun build(): InlineOrgsHooksPostRequestJsonConfigX31160f36 {
      check(urlValue != null) { "url is required" }
      return InlineOrgsHooksPostRequestJsonConfigX31160f36(
        url = url,
        contentType = contentType,
        insecureSsl = insecureSsl,
        password = password,
        secret = secret,
        username = username,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsHooksPostRequestJsonConfigX31160f36 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsHooksPostRequestJsonConfigX31160f36> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsHooksPostRequestJsonConfigX31160f36 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsHooksPostRequestJsonConfigX31160f36")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsHooksPostRequestJsonConfigX31160f36 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineOrgsHooksPostRequestJsonConfigX31160f36(
        url = url,
        contentType = rawObject["content_type"]?.let { json.decodeFromJsonElement<String>(it) },
        insecureSsl = rawObject["insecure_ssl"]?.let { json.decodeFromJsonElement<WebhookConfigInsecureSsl>(it) },
        password = rawObject["password"]?.let { json.decodeFromJsonElement<String>(it) },
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
        username = rawObject["username"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsHooksPostRequestJsonConfigX31160f36) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsHooksPostRequestJsonConfigX31160f36")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
        value.contentType?.let { put("content_type", it) }
        value.insecureSsl?.let { put("insecure_ssl", json.encodeToJsonElement(it)) }
        value.password?.let { put("password", it) }
        value.secret?.let { put("secret", it) }
        value.username?.let { put("username", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsHooksPostRequestJsonConfigX31160f36(block: InlineOrgsHooksPostRequestJsonConfigX31160f36.Builder.() -> Unit): InlineOrgsHooksPostRequestJsonConfigX31160f36 = InlineOrgsHooksPostRequestJsonConfigX31160f36.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsHooksPostRequestJsonConfigX31160f36 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
