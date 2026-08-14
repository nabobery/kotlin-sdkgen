package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_after_completion
 */
@Serializable(with = PaymentLinksResourceAfterCompletion.Serializer::class)
public class PaymentLinksResourceAfterCompletion(
  /**
   * The specified behavior after the purchase is complete.
   */
  public val type: InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105,
  public val hostedConfirmation: PaymentLinksResourceCompletionBehaviorConfirmationPage? = null,
  public val redirect: PaymentLinksResourceCompletionBehaviorRedirect? = null,
) {
  public class Builder {
    private var typeValue: InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105? = null

    public var type: InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var hostedConfirmation: PaymentLinksResourceCompletionBehaviorConfirmationPage? = null

    public var redirect: PaymentLinksResourceCompletionBehaviorRedirect? = null

    public fun build(): PaymentLinksResourceAfterCompletion {
      check(typeValue != null) { "type is required" }
      return PaymentLinksResourceAfterCompletion(
        type = type,
        hostedConfirmation = hostedConfirmation,
        redirect = redirect,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceAfterCompletion = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceAfterCompletion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceAfterCompletion {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceAfterCompletion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceAfterCompletion must be a JSON object")
      val type = json.decodeRequired<InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105>(rawObject, "type")
      return PaymentLinksResourceAfterCompletion(
        type = type,
        hostedConfirmation = rawObject["hosted_confirmation"]?.let { json.decodeFromJsonElement<PaymentLinksResourceCompletionBehaviorConfirmationPage>(it) },
        redirect = rawObject["redirect"]?.let { json.decodeFromJsonElement<PaymentLinksResourceCompletionBehaviorRedirect>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceAfterCompletion) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceAfterCompletion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.hostedConfirmation?.let { put("hosted_confirmation", json.encodeToJsonElement(it)) }
        value.redirect?.let { put("redirect", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceAfterCompletion(block: PaymentLinksResourceAfterCompletion.Builder.() -> Unit): PaymentLinksResourceAfterCompletion = PaymentLinksResourceAfterCompletion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceAfterCompletion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
