package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptionsView(
  public val card:
      PaymentFlowsPrivatePaymentMethodsCardPaymentIntentAmountDetailsLineItemPaymentMethodOptions? = null,
  @SerialName("card_present")
  public val cardPresent:
      PaymentFlowsPrivatePaymentMethodsCardPresentAmountDetailsLineItemPaymentMethodOptions? = null,
  public val klarna:
      PaymentFlowsPrivatePaymentMethodsKlarnaPaymentIntentAmountDetailsLineItemPaymentMethodOptions? = null,
  public val paypal:
      PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_resource_line_items_list_resource_line_
 * item_resource_payment_method_options
 */
@Serializable(with = PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions.Serializer::class)
public class PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions(
  public val card:
      PaymentFlowsPrivatePaymentMethodsCardPaymentIntentAmountDetailsLineItemPaymentMethodOptions? = null,
  public val cardPresent:
      PaymentFlowsPrivatePaymentMethodsCardPresentAmountDetailsLineItemPaymentMethodOptions? = null,
  public val klarna:
      PaymentFlowsPrivatePaymentMethodsKlarnaPaymentIntentAmountDetailsLineItemPaymentMethodOptions? = null,
  public val paypal:
      PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions? = null,
) {
  public class Builder {
    public var card:
        PaymentFlowsPrivatePaymentMethodsCardPaymentIntentAmountDetailsLineItemPaymentMethodOptions?
        = null

    public var cardPresent:
        PaymentFlowsPrivatePaymentMethodsCardPresentAmountDetailsLineItemPaymentMethodOptions? =
        null

    public var klarna:
        PaymentFlowsPrivatePaymentMethodsKlarnaPaymentIntentAmountDetailsLineItemPaymentMethodOptions?
        = null

    public var paypal:
        PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions? = null

    public fun build(): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions = PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions(
      card = card,
      cardPresent = cardPresent,
      klarna = klarna,
      paypal = paypal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions must be a JSON object")
      return PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsCardPaymentIntentAmountDetailsLineItemPaymentMethodOptions>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsCardPresentAmountDetailsLineItemPaymentMethodOptions>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsKlarnaPaymentIntentAmountDetailsLineItemPaymentMethodOptions>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsPaypalAmountDetailsLineItemPaymentMethodOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions(block: PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions.Builder.() -> Unit): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions = PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions.build(block)
