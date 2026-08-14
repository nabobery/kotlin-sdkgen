package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/references/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/references/items
 */
@Serializable(with = InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd.Serializer::class)
public class InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd {
      check(urlValue != null) { "url is required" }
      return InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd(block: InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd.Builder.() -> Unit): InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd = InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksSecurityAdvisoryReferencesItemXa2d114dd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
