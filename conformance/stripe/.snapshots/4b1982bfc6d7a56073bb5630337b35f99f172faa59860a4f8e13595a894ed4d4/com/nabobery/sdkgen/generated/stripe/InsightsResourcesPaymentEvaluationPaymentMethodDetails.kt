package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class InsightsResourcesPaymentEvaluationPaymentMethodDetailsView(
  @SerialName("billing_details")
  public val billingDetails: InlineInsightsResourcesPayf203BillingDetailsX768b19d3? = null,
  @SerialName("payment_method")
  public val paymentMethod: InlineInsightsResourcesPayf203PaymentMethodX825d85ed,
)

/**
 * Payment method details attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_payment_method_details
 */
@Serializable(with = InsightsResourcesPaymentEvaluationPaymentMethodDetails.Serializer::class)
public class InsightsResourcesPaymentEvaluationPaymentMethodDetails(
  /**
   * The payment method used in this payment evaluation.
   */
  public val paymentMethod: InlineInsightsResourcesPayf203PaymentMethodX825d85ed,
  /**
   * Billing information associated with the payment evaluation.
   */
  public val billingDetails: InlineInsightsResourcesPayf203BillingDetailsX768b19d3? = null,
) {
  public class Builder {
    private var paymentMethodValue: InlineInsightsResourcesPayf203PaymentMethodX825d85ed? = null

    public var paymentMethod: InlineInsightsResourcesPayf203PaymentMethodX825d85ed
      get() = requireNotNull(paymentMethodValue) { "paymentMethod is required" }
      set(`value`) {
        paymentMethodValue = value
      }

    /**
     * Billing information associated with the payment evaluation.
     */
    public var billingDetails: InlineInsightsResourcesPayf203BillingDetailsX768b19d3? = null

    public fun build(): InsightsResourcesPaymentEvaluationPaymentMethodDetails {
      check(paymentMethodValue != null) { "paymentMethod is required" }
      return InsightsResourcesPaymentEvaluationPaymentMethodDetails(
        paymentMethod = paymentMethod,
        billingDetails = billingDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationPaymentMethodDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationPaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationPaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationPaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationPaymentMethodDetails must be a JSON object")
      val paymentMethod = json.decodeRequired<InlineInsightsResourcesPayf203PaymentMethodX825d85ed>(rawObject, "payment_method")
      return InsightsResourcesPaymentEvaluationPaymentMethodDetails(
        paymentMethod = paymentMethod,
        billingDetails = rawObject["billing_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInsightsResourcesPayf203BillingDetailsX768b19d3?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationPaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationPaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_method", json.encodeToJsonElement(value.paymentMethod))
        value.billingDetails?.let { put("billing_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationPaymentMethodDetails(block: InsightsResourcesPaymentEvaluationPaymentMethodDetails.Builder.() -> Unit): InsightsResourcesPaymentEvaluationPaymentMethodDetails = InsightsResourcesPaymentEvaluationPaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationPaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
