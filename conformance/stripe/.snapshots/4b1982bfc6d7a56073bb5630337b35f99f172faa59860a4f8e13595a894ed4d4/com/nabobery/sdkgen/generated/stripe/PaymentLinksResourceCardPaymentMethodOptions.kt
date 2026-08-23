package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentLinksResourceCardPaymentMethodOptionsView(
  public val restrictions:
      InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_card_payment_method_options
 */
@Serializable(with = PaymentLinksResourceCardPaymentMethodOptions.Serializer::class)
public class PaymentLinksResourceCardPaymentMethodOptions(
  /**
   * Restrictions to apply to the card payment method. For example, you can block specific card brands.
   */
  public val restrictions:
      InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4? = null,
) {
  public class Builder {
    /**
     * Restrictions to apply to the card payment method. For example, you can block specific card brands.
     */
    public var restrictions:
        InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4? = null

    public fun build(): PaymentLinksResourceCardPaymentMethodOptions = PaymentLinksResourceCardPaymentMethodOptions(
      restrictions = restrictions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCardPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceCardPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCardPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCardPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCardPaymentMethodOptions must be a JSON object")
      return PaymentLinksResourceCardPaymentMethodOptions(
        restrictions = rawObject["restrictions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceCardPaymentMethodOptionsRestrictionsX3913daa4?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCardPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCardPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceCardPaymentMethodOptions(block: PaymentLinksResourceCardPaymentMethodOptions.Builder.() -> Unit): PaymentLinksResourceCardPaymentMethodOptions = PaymentLinksResourceCardPaymentMethodOptions.build(block)
