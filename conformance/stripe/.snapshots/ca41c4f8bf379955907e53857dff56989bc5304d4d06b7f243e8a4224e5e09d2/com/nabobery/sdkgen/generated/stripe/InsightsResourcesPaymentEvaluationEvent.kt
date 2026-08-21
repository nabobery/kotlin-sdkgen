package com.nabobery.sdkgen.generated.stripe

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
 * Event reported for this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_event
 */
@Serializable(with = InsightsResourcesPaymentEvaluationEvent.Serializer::class)
public class InsightsResourcesPaymentEvaluationEvent(
  /**
   * Timestamp when the event occurred.
   */
  public val occurredAt: Int,
  /**
   * Indicates the type of event attached to the payment evaluation.
   */
  public val type: InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d,
  public val disputeOpened: InsightsResourcesPaymentEvaluationDisputeOpened? = null,
  public val earlyFraudWarningReceived:
      InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived? = null,
  public val refunded: InsightsResourcesPaymentEvaluationRefunded? = null,
  public val userInterventionRaised:
      InsightsResourcesPaymentEvaluationUserInterventionRaised? = null,
  public val userInterventionResolved:
      InsightsResourcesPaymentEvaluationUserInterventionResolved? = null,
) {
  public class Builder {
    private var occurredAtValue: Int? = null

    public var occurredAt: Int
      get() = requireNotNull(occurredAtValue) { "occurredAt is required" }
      set(`value`) {
        occurredAtValue = value
      }

    private var typeValue: InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d? = null

    public var type: InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var disputeOpened: InsightsResourcesPaymentEvaluationDisputeOpened? = null

    public var earlyFraudWarningReceived:
        InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived? = null

    public var refunded: InsightsResourcesPaymentEvaluationRefunded? = null

    public var userInterventionRaised: InsightsResourcesPaymentEvaluationUserInterventionRaised? =
        null

    public var userInterventionResolved: InsightsResourcesPaymentEvaluationUserInterventionResolved?
        = null

    public fun build(): InsightsResourcesPaymentEvaluationEvent {
      check(occurredAtValue != null) { "occurredAt is required" }
      check(typeValue != null) { "type is required" }
      return InsightsResourcesPaymentEvaluationEvent(
        occurredAt = occurredAt,
        type = type,
        disputeOpened = disputeOpened,
        earlyFraudWarningReceived = earlyFraudWarningReceived,
        refunded = refunded,
        userInterventionRaised = userInterventionRaised,
        userInterventionResolved = userInterventionResolved,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationEvent {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationEvent must be a JSON object")
      val occurredAt = json.decodeRequired<Int>(rawObject, "occurred_at")
      val type = json.decodeRequired<InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d>(rawObject, "type")
      return InsightsResourcesPaymentEvaluationEvent(
        occurredAt = occurredAt,
        type = type,
        disputeOpened = rawObject["dispute_opened"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationDisputeOpened>(it) },
        earlyFraudWarningReceived = rawObject["early_fraud_warning_received"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived>(it) },
        refunded = rawObject["refunded"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationRefunded>(it) },
        userInterventionRaised = rawObject["user_intervention_raised"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationUserInterventionRaised>(it) },
        userInterventionResolved = rawObject["user_intervention_resolved"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationUserInterventionResolved>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("occurred_at", json.encodeToJsonElement(value.occurredAt))
        put("type", json.encodeToJsonElement(value.type))
        value.disputeOpened?.let { put("dispute_opened", json.encodeToJsonElement(it)) }
        value.earlyFraudWarningReceived?.let { put("early_fraud_warning_received", json.encodeToJsonElement(it)) }
        value.refunded?.let { put("refunded", json.encodeToJsonElement(it)) }
        value.userInterventionRaised?.let { put("user_intervention_raised", json.encodeToJsonElement(it)) }
        value.userInterventionResolved?.let { put("user_intervention_resolved", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationEvent(block: InsightsResourcesPaymentEvaluationEvent.Builder.() -> Unit): InsightsResourcesPaymentEvaluationEvent = InsightsResourcesPaymentEvaluationEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
