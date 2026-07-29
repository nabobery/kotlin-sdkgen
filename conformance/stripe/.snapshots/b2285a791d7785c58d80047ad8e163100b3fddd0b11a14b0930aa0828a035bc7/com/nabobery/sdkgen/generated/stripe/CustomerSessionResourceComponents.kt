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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for the components supported by this Customer Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components
 */
@Serializable(with = CustomerSessionResourceComponents.Serializer::class)
public class CustomerSessionResourceComponents(
  public val buyButton: CustomerSessionResourceComponentsResourceBuyButton,
  public val customerSheet: CustomerSessionResourceComponentsResourceCustomerSheet,
  public val mobilePaymentElement: CustomerSessionResourceComponentsResourceMobilePaymentElement,
  public val paymentElement: CustomerSessionResourceComponentsResourcePaymentElement,
  public val pricingTable: CustomerSessionResourceComponentsResourcePricingTable,
) {
  public class Builder {
    private var buyButtonValue: CustomerSessionResourceComponentsResourceBuyButton? = null

    public var buyButton: CustomerSessionResourceComponentsResourceBuyButton
      get() = requireNotNull(buyButtonValue) { "buyButton is required" }
      set(`value`) {
        buyButtonValue = value
      }

    private var customerSheetValue: CustomerSessionResourceComponentsResourceCustomerSheet? = null

    public var customerSheet: CustomerSessionResourceComponentsResourceCustomerSheet
      get() = requireNotNull(customerSheetValue) { "customerSheet is required" }
      set(`value`) {
        customerSheetValue = value
      }

    private var mobilePaymentElementValue:
        CustomerSessionResourceComponentsResourceMobilePaymentElement? = null

    public var mobilePaymentElement: CustomerSessionResourceComponentsResourceMobilePaymentElement
      get() = requireNotNull(mobilePaymentElementValue) { "mobilePaymentElement is required" }
      set(`value`) {
        mobilePaymentElementValue = value
      }

    private var paymentElementValue: CustomerSessionResourceComponentsResourcePaymentElement? = null

    public var paymentElement: CustomerSessionResourceComponentsResourcePaymentElement
      get() = requireNotNull(paymentElementValue) { "paymentElement is required" }
      set(`value`) {
        paymentElementValue = value
      }

    private var pricingTableValue: CustomerSessionResourceComponentsResourcePricingTable? = null

    public var pricingTable: CustomerSessionResourceComponentsResourcePricingTable
      get() = requireNotNull(pricingTableValue) { "pricingTable is required" }
      set(`value`) {
        pricingTableValue = value
      }

    public fun build(): CustomerSessionResourceComponents {
      check(buyButtonValue != null) { "buyButton is required" }
      check(customerSheetValue != null) { "customerSheet is required" }
      check(mobilePaymentElementValue != null) { "mobilePaymentElement is required" }
      check(paymentElementValue != null) { "paymentElement is required" }
      check(pricingTableValue != null) { "pricingTable is required" }
      return CustomerSessionResourceComponents(
        buyButton = buyButton,
        customerSheet = customerSheet,
        mobilePaymentElement = mobilePaymentElement,
        paymentElement = paymentElement,
        pricingTable = pricingTable,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponents = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerSessionResourceComponents> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSessionResourceComponents {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponents")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSessionResourceComponents must be a JSON object")
      val buyButton = json.decodeRequired<CustomerSessionResourceComponentsResourceBuyButton>(rawObject, "buy_button")
      val customerSheet = json.decodeRequired<CustomerSessionResourceComponentsResourceCustomerSheet>(rawObject, "customer_sheet")
      val mobilePaymentElement = json.decodeRequired<CustomerSessionResourceComponentsResourceMobilePaymentElement>(rawObject, "mobile_payment_element")
      val paymentElement = json.decodeRequired<CustomerSessionResourceComponentsResourcePaymentElement>(rawObject, "payment_element")
      val pricingTable = json.decodeRequired<CustomerSessionResourceComponentsResourcePricingTable>(rawObject, "pricing_table")
      return CustomerSessionResourceComponents(
        buyButton = buyButton,
        customerSheet = customerSheet,
        mobilePaymentElement = mobilePaymentElement,
        paymentElement = paymentElement,
        pricingTable = pricingTable,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSessionResourceComponents) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponents")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("buy_button", json.encodeToJsonElement(value.buyButton))
        put("customer_sheet", json.encodeToJsonElement(value.customerSheet))
        put("mobile_payment_element", json.encodeToJsonElement(value.mobilePaymentElement))
        put("payment_element", json.encodeToJsonElement(value.paymentElement))
        put("pricing_table", json.encodeToJsonElement(value.pricingTable))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSessionResourceComponents(block: CustomerSessionResourceComponents.Builder.() -> Unit): CustomerSessionResourceComponents = CustomerSessionResourceComponents.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerSessionResourceComponents is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
