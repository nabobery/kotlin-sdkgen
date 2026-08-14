package io.github.nabobery.sdkgen.generated.stripe

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
 * Configuration for each component. At least 1 component must be enabled.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1(
  public val buyButton: InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717? = null,
  public val customerSheet:
      InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9? = null,
  public val mobilePaymentElement:
      InlineV1CustomerSessionsPostRequestFormComponentsMobilePaymentElementXb75feb83? = null,
  public val paymentElement:
      InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1? = null,
  public val pricingTable:
      InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db? = null,
) {
  public class Builder {
    public var buyButton: InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717? =
        null

    public var customerSheet:
        InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9? = null

    public var mobilePaymentElement:
        InlineV1CustomerSessionsPostRequestFormComponentsMobilePaymentElementXb75feb83? = null

    public var paymentElement:
        InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1? = null

    public var pricingTable: InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db?
        = null

    public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1 = InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1(
      buyButton = buyButton,
      customerSheet = customerSheet,
      mobilePaymentElement = mobilePaymentElement,
      paymentElement = paymentElement,
      pricingTable = pricingTable,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1 must be a JSON object")
      return InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1(
        buyButton = rawObject["buy_button"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717>(it) },
        customerSheet = rawObject["customer_sheet"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsCustomerSheetX34be08d9>(it) },
        mobilePaymentElement = rawObject["mobile_payment_element"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsMobilePaymentElementXb75feb83>(it) },
        paymentElement = rawObject["payment_element"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1>(it) },
        pricingTable = rawObject["pricing_table"]?.let { json.decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPricingTableX7aec27db>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyButton?.let { put("buy_button", json.encodeToJsonElement(it)) }
        value.customerSheet?.let { put("customer_sheet", json.encodeToJsonElement(it)) }
        value.mobilePaymentElement?.let { put("mobile_payment_element", json.encodeToJsonElement(it)) }
        value.paymentElement?.let { put("payment_element", json.encodeToJsonElement(it)) }
        value.pricingTable?.let { put("pricing_table", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1(block: InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1.Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1 = InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1.build(block)
