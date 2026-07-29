package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/after_completion/properties/redirect.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/after_completion/properties/redirect
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897 {
      check(urlValue != null) { "url is required" }
      return InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897(block: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897 = InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectX8bcd1897 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
