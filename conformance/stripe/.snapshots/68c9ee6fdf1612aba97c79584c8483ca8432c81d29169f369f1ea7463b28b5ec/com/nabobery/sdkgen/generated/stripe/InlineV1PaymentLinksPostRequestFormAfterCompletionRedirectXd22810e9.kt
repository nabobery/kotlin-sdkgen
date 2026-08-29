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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/after_completion/properties/redirect.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/after_completion/properties/redirect
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9 {
      check(urlValue != null) { "url is required" }
      return InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9(block: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9 = InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
