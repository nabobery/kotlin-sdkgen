package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
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

/**
 * Payment Evaluations represent the risk lifecycle of an externally processed payment. It includes the Radar risk score
 * from Stripe, payment outcome taken by the merchant or processor, and any post transaction events, such as refunds or
 * disputes. See the [Radar API guide](/radar/multiprocessor) for integration steps.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.payment_evaluation
 */
@Serializable(with = RadarPaymentEvaluation.Serializer::class)
public class RadarPaymentEvaluation(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val createdAt: Int,
  events: List<InsightsResourcesPaymentEvaluationEvent>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineRadarPaymentEvaluationObjectValueX24d66021,
  /**
   * Recommended action based on the score of the `fraudulent_payment` signal. Possible values are `block`, `continue`
   * and `request_three_d_secure`.
   */
  public val recommendedAction: InlineRadarPaymentEvaluationRecommendedActionX5e34086d,
  public val signals: InsightsResourcesPaymentEvaluationSignals,
  public val clientDeviceMetadataDetails:
      InsightsResourcesPaymentEvaluationClientDeviceMetadata? = null,
  public val customerDetails: InsightsResourcesPaymentEvaluationCustomerDetails? = null,
  metadata: Map<String, String>? = null,
  /**
   * Indicates the final outcome for the payment evaluation.
   */
  public val outcome: InlineRadarPaymentEvaluationOutcomeX6e413009? = null,
  public val paymentDetails: InsightsResourcesPaymentEvaluationPaymentDetails? = null,
) {
  /**
   * Event information associated with the payment evaluation, such as refunds, dispute, early fraud warnings, or user
   * interventions.
   */
  public val events: List<InsightsResourcesPaymentEvaluationEvent> = events.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var createdAtValue: Int? = null

    public var createdAt: Int
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventsValue: List<InsightsResourcesPaymentEvaluationEvent>? = null

    public var events: List<InsightsResourcesPaymentEvaluationEvent>
      get() = requireNotNull(eventsValue) { "events is required" }.toList()
      set(`value`) {
        eventsValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineRadarPaymentEvaluationObjectValueX24d66021? = null

    public var objectValue: InlineRadarPaymentEvaluationObjectValueX24d66021
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var recommendedActionValue: InlineRadarPaymentEvaluationRecommendedActionX5e34086d? =
        null

    public var recommendedAction: InlineRadarPaymentEvaluationRecommendedActionX5e34086d
      get() = requireNotNull(recommendedActionValue) { "recommendedAction is required" }
      set(`value`) {
        recommendedActionValue = value
      }

    private var signalsValue: InsightsResourcesPaymentEvaluationSignals? = null

    public var signals: InsightsResourcesPaymentEvaluationSignals
      get() = requireNotNull(signalsValue) { "signals is required" }
      set(`value`) {
        signalsValue = value
      }

    public var clientDeviceMetadataDetails: InsightsResourcesPaymentEvaluationClientDeviceMetadata?
        = null

    public var customerDetails: InsightsResourcesPaymentEvaluationCustomerDetails? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Indicates the final outcome for the payment evaluation.
     */
    public var outcome: InlineRadarPaymentEvaluationOutcomeX6e413009? = null

    public var paymentDetails: InsightsResourcesPaymentEvaluationPaymentDetails? = null

    public fun build(): RadarPaymentEvaluation {
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsValue != null) { "events is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(recommendedActionValue != null) { "recommendedAction is required" }
      check(signalsValue != null) { "signals is required" }
      return RadarPaymentEvaluation(
        createdAt = createdAt,
        events = events,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        recommendedAction = recommendedAction,
        signals = signals,
        clientDeviceMetadataDetails = clientDeviceMetadataDetails,
        customerDetails = customerDetails,
        metadata = metadata,
        outcome = outcome,
        paymentDetails = paymentDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RadarPaymentEvaluation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RadarPaymentEvaluation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RadarPaymentEvaluation {
      val jsonDecoder = decoder.requireJsonDecoder("RadarPaymentEvaluation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RadarPaymentEvaluation must be a JSON object")
      val createdAt = json.decodeRequired<Int>(rawObject, "created_at")
      val events = json.decodeRequired<List<InsightsResourcesPaymentEvaluationEvent>>(rawObject, "events")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineRadarPaymentEvaluationObjectValueX24d66021>(rawObject, "object")
      val recommendedAction = json.decodeRequired<InlineRadarPaymentEvaluationRecommendedActionX5e34086d>(rawObject, "recommended_action")
      val signals = json.decodeRequired<InsightsResourcesPaymentEvaluationSignals>(rawObject, "signals")
      return RadarPaymentEvaluation(
        createdAt = createdAt,
        events = events,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        recommendedAction = recommendedAction,
        signals = signals,
        clientDeviceMetadataDetails = rawObject["client_device_metadata_details"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationClientDeviceMetadata>(it) },
        customerDetails = rawObject["customer_details"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationCustomerDetails>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        outcome = rawObject["outcome"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRadarPaymentEvaluationOutcomeX6e413009?>(element) },
        paymentDetails = rawObject["payment_details"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationPaymentDetails>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RadarPaymentEvaluation) {
      val jsonEncoder = encoder.requireJsonEncoder("RadarPaymentEvaluation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", json.encodeToJsonElement(value.createdAt))
        put("events", json.encodeToJsonElement(value.events))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("recommended_action", json.encodeToJsonElement(value.recommendedAction))
        put("signals", json.encodeToJsonElement(value.signals))
        value.clientDeviceMetadataDetails?.let { put("client_device_metadata_details", json.encodeToJsonElement(it)) }
        value.customerDetails?.let { put("customer_details", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.outcome?.let { put("outcome", json.encodeToJsonElement(it)) }
        value.paymentDetails?.let { put("payment_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun radarPaymentEvaluation(block: RadarPaymentEvaluation.Builder.() -> Unit): RadarPaymentEvaluation = RadarPaymentEvaluation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RadarPaymentEvaluation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
