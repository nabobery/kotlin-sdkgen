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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_completion_behavior_redirect
 */
@Serializable(with = PaymentLinksResourceCompletionBehaviorRedirect.Serializer::class)
public class PaymentLinksResourceCompletionBehaviorRedirect(
  /**
   * The URL the customer will be redirected to after the purchase is complete.
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

    public fun build(): PaymentLinksResourceCompletionBehaviorRedirect {
      check(urlValue != null) { "url is required" }
      return PaymentLinksResourceCompletionBehaviorRedirect(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCompletionBehaviorRedirect = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceCompletionBehaviorRedirect> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCompletionBehaviorRedirect {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCompletionBehaviorRedirect")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCompletionBehaviorRedirect must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return PaymentLinksResourceCompletionBehaviorRedirect(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCompletionBehaviorRedirect) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCompletionBehaviorRedirect")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceCompletionBehaviorRedirect(block: PaymentLinksResourceCompletionBehaviorRedirect.Builder.() -> Unit): PaymentLinksResourceCompletionBehaviorRedirect = PaymentLinksResourceCompletionBehaviorRedirect.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceCompletionBehaviorRedirect is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
