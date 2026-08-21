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
 * Details of an rejected card outcome attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_rejected_card
 */
@Serializable(with = InsightsResourcesPaymentEvaluationRejectedCard.Serializer::class)
public class InsightsResourcesPaymentEvaluationRejectedCard(
  /**
   * Result of the address line 1 check.
   */
  public val addressLine1Check:
      InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275,
  /**
   * Indicates whether the cardholder provided a postal code and if it matched the cardholder’s billing address.
   */
  public val addressPostalCodeCheck: InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff,
  /**
   * Result of the CVC check.
   */
  public val cvcCheck: InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422,
  /**
   * Card issuer's reason for the network decline.
   */
  public val reason: InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa,
) {
  public class Builder {
    private var addressLine1CheckValue:
        InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275? = null

    public var addressLine1Check:
        InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275
      get() = requireNotNull(addressLine1CheckValue) { "addressLine1Check is required" }
      set(`value`) {
        addressLine1CheckValue = value
      }

    private var addressPostalCodeCheckValue:
        InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff? = null

    public var addressPostalCodeCheck: InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff
      get() = requireNotNull(addressPostalCodeCheckValue) { "addressPostalCodeCheck is required" }
      set(`value`) {
        addressPostalCodeCheckValue = value
      }

    private var cvcCheckValue:
        InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422? = null

    public var cvcCheck: InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422
      get() = requireNotNull(cvcCheckValue) { "cvcCheck is required" }
      set(`value`) {
        cvcCheckValue = value
      }

    private var reasonValue: InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa? =
        null

    public var reason: InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    public fun build(): InsightsResourcesPaymentEvaluationRejectedCard {
      check(addressLine1CheckValue != null) { "addressLine1Check is required" }
      check(addressPostalCodeCheckValue != null) { "addressPostalCodeCheck is required" }
      check(cvcCheckValue != null) { "cvcCheck is required" }
      check(reasonValue != null) { "reason is required" }
      return InsightsResourcesPaymentEvaluationRejectedCard(
        addressLine1Check = addressLine1Check,
        addressPostalCodeCheck = addressPostalCodeCheck,
        cvcCheck = cvcCheck,
        reason = reason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationRejectedCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationRejectedCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationRejectedCard {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationRejectedCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationRejectedCard must be a JSON object")
      val addressLine1Check = json.decodeRequired<InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275>(rawObject, "address_line1_check")
      val addressPostalCodeCheck = json.decodeRequired<InlineInsightsResourcesPayd3e6AddressPostalCodeCheckXc9bbccff>(rawObject, "address_postal_code_check")
      val cvcCheck = json.decodeRequired<InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422>(rawObject, "cvc_check")
      val reason = json.decodeRequired<InlineInsightsResourcesPaymentEvaluationRejectedCardReasonX717e3efa>(rawObject, "reason")
      return InsightsResourcesPaymentEvaluationRejectedCard(
        addressLine1Check = addressLine1Check,
        addressPostalCodeCheck = addressPostalCodeCheck,
        cvcCheck = cvcCheck,
        reason = reason,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationRejectedCard) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationRejectedCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address_line1_check", json.encodeToJsonElement(value.addressLine1Check))
        put("address_postal_code_check", json.encodeToJsonElement(value.addressPostalCodeCheck))
        put("cvc_check", json.encodeToJsonElement(value.cvcCheck))
        put("reason", json.encodeToJsonElement(value.reason))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationRejectedCard(block: InsightsResourcesPaymentEvaluationRejectedCard.Builder.() -> Unit): InsightsResourcesPaymentEvaluationRejectedCard = InsightsResourcesPaymentEvaluationRejectedCard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationRejectedCard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
