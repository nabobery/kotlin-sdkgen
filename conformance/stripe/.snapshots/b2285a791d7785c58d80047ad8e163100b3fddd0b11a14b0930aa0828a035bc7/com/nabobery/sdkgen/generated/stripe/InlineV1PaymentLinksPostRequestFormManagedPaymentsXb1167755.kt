package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Settings for Managed Payments for this Payment Link and resulting [CheckoutSessions](/api/checkout/sessions/object),
 * [PaymentIntents](/api/payment_intents/object), [Invoices](/api/invoices/object), and
 * [Subscriptions](/api/subscriptions/object).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/managed_payments
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755 = InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755(block: InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755 = InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755.build(block)
