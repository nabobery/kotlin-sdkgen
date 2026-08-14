package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Details about the payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details
 */
@Serializable(with = InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1.Serializer::class)
public class InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1(
  public val amount: Int,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val paymentMethodDetails:
      InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f,
  public val description: String? = null,
  public val moneyMovementDetails:
      InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7? = null,
  public val shippingDetails:
      InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var paymentMethodDetailsValue:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f? = null

    public var paymentMethodDetails:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f
      get() = requireNotNull(paymentMethodDetailsValue) { "paymentMethodDetails is required" }
      set(`value`) {
        paymentMethodDetailsValue = value
      }

    public var description: String? = null

    public var moneyMovementDetails:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7? = null

    public var shippingDetails:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693? = null

    public var statementDescriptor: String? = null

    public fun build(): InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(paymentMethodDetailsValue != null) { "paymentMethodDetails is required" }
      return InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1(
        amount = amount,
        currency = currency,
        paymentMethodDetails = paymentMethodDetails,
        description = description,
        moneyMovementDetails = moneyMovementDetails,
        shippingDetails = shippingDetails,
        statementDescriptor = statementDescriptor,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val paymentMethodDetails = json.decodeRequired<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f>(rawObject, "payment_method_details")
      return InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1(
        amount = amount,
        currency = currency,
        paymentMethodDetails = paymentMethodDetails,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        moneyMovementDetails = rawObject["money_movement_details"]?.let { json.decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7>(it) },
        shippingDetails = rawObject["shipping_details"]?.let { json.decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("payment_method_details", json.encodeToJsonElement(value.paymentMethodDetails))
        value.description?.let { put("description", it) }
        value.moneyMovementDetails?.let { put("money_movement_details", json.encodeToJsonElement(it)) }
        value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1(block: InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1.Builder.() -> Unit): InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1 = InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1RadarPaymentEvaluationsPostRequestFormPaymentDetailsX8c8260d1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
