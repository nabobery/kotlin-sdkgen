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
public data class InsightsResourcesPaymentEvaluationMoneyMovementDetailsView(
  public val card:
      InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496? = null,
  @SerialName("money_movement_type")
  public val moneyMovementType: InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461,
)

/**
 * Money Movement details attached to this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_money_movement_details
 */
@Serializable(with = InsightsResourcesPaymentEvaluationMoneyMovementDetails.Serializer::class)
public class InsightsResourcesPaymentEvaluationMoneyMovementDetails(
  /**
   * Describes the type of money movement. Currently only `card` is supported.
   */
  public val moneyMovementType: InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461,
  /**
   * Describes card money movement details for the payment evaluation.
   */
  public val card:
      InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496? = null,
) {
  public class Builder {
    private var moneyMovementTypeValue: InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461? =
        null

    public var moneyMovementType: InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461
      get() = requireNotNull(moneyMovementTypeValue) { "moneyMovementType is required" }
      set(`value`) {
        moneyMovementTypeValue = value
      }

    /**
     * Describes card money movement details for the payment evaluation.
     */
    public var card: InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496? =
        null

    public fun build(): InsightsResourcesPaymentEvaluationMoneyMovementDetails {
      check(moneyMovementTypeValue != null) { "moneyMovementType is required" }
      return InsightsResourcesPaymentEvaluationMoneyMovementDetails(
        moneyMovementType = moneyMovementType,
        card = card,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationMoneyMovementDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationMoneyMovementDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationMoneyMovementDetails {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationMoneyMovementDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationMoneyMovementDetails must be a JSON object")
      val moneyMovementType = json.decodeRequired<InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461>(rawObject, "money_movement_type")
      return InsightsResourcesPaymentEvaluationMoneyMovementDetails(
        moneyMovementType = moneyMovementType,
        card = rawObject["card"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationMoneyMovementDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationMoneyMovementDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("money_movement_type", json.encodeToJsonElement(value.moneyMovementType))
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationMoneyMovementDetails(block: InsightsResourcesPaymentEvaluationMoneyMovementDetails.Builder.() -> Unit): InsightsResourcesPaymentEvaluationMoneyMovementDetails = InsightsResourcesPaymentEvaluationMoneyMovementDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationMoneyMovementDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
