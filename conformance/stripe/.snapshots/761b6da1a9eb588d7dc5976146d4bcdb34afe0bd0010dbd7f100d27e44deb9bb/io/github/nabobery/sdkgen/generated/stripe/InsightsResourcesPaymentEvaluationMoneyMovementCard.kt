package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class InsightsResourcesPaymentEvaluationMoneyMovementCardView(
  @SerialName("customer_presence")
  public val customerPresence: InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55? = null,
  @SerialName("payment_type")
  public val paymentType:
      InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f? = null,
)

/**
 * Money Movement card details attached to this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_money_movement_card
 */
@Serializable(with = InsightsResourcesPaymentEvaluationMoneyMovementCard.Serializer::class)
public class InsightsResourcesPaymentEvaluationMoneyMovementCard(
  /**
   * Describes the presence of the customer during the payment.
   */
  public val customerPresence: InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55? = null,
  /**
   * Describes the type of payment.
   */
  public val paymentType:
      InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f? = null,
) {
  public class Builder {
    /**
     * Describes the presence of the customer during the payment.
     */
    public var customerPresence: InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55? = null

    /**
     * Describes the type of payment.
     */
    public var paymentType:
        InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f? = null

    public fun build(): InsightsResourcesPaymentEvaluationMoneyMovementCard = InsightsResourcesPaymentEvaluationMoneyMovementCard(
      customerPresence = customerPresence,
      paymentType = paymentType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationMoneyMovementCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationMoneyMovementCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationMoneyMovementCard {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationMoneyMovementCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationMoneyMovementCard must be a JSON object")
      return InsightsResourcesPaymentEvaluationMoneyMovementCard(
        customerPresence = rawObject["customer_presence"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInsightsResourcesPay7e0fCustomerPresenceXdbcd2d55?>(element) },
        paymentType = rawObject["payment_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInsightsResourcesPaymentEvaluationMoneyMovementCardPaymentTypeX8c235b7f?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationMoneyMovementCard) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationMoneyMovementCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerPresence?.let { put("customer_presence", json.encodeToJsonElement(it)) }
        value.paymentType?.let { put("payment_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationMoneyMovementCard(block: InsightsResourcesPaymentEvaluationMoneyMovementCard.Builder.() -> Unit): InsightsResourcesPaymentEvaluationMoneyMovementCard = InsightsResourcesPaymentEvaluationMoneyMovementCard.build(block)
