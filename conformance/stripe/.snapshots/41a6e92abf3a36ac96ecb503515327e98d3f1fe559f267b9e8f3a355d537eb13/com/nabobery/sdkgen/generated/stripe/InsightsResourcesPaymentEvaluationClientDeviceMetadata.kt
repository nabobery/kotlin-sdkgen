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
import kotlinx.serialization.json.put

/**
 * Client device metadata attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_client_device_metadata
 */
@Serializable(with = InsightsResourcesPaymentEvaluationClientDeviceMetadata.Serializer::class)
public class InsightsResourcesPaymentEvaluationClientDeviceMetadata(
  /**
   * ID for the Radar Session associated with the payment evaluation. A [Radar
   * Session](https://docs.stripe.com/radar/radar-session) is a snapshot of the browser metadata and device details that
   * help Radar make more accurate predictions on your payments.
   */
  public val radarSession: String,
) {
  public class Builder {
    private var radarSessionValue: String? = null

    public var radarSession: String
      get() = requireNotNull(radarSessionValue) { "radarSession is required" }
      set(`value`) {
        radarSessionValue = value
      }

    public fun build(): InsightsResourcesPaymentEvaluationClientDeviceMetadata {
      check(radarSessionValue != null) { "radarSession is required" }
      return InsightsResourcesPaymentEvaluationClientDeviceMetadata(
        radarSession = radarSession,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationClientDeviceMetadata = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationClientDeviceMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationClientDeviceMetadata {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationClientDeviceMetadata")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationClientDeviceMetadata must be a JSON object")
      val radarSession = json.decodeRequired<String>(rawObject, "radar_session")
      return InsightsResourcesPaymentEvaluationClientDeviceMetadata(
        radarSession = radarSession,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationClientDeviceMetadata) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationClientDeviceMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("radar_session", value.radarSession)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationClientDeviceMetadata(block: InsightsResourcesPaymentEvaluationClientDeviceMetadata.Builder.() -> Unit): InsightsResourcesPaymentEvaluationClientDeviceMetadata = InsightsResourcesPaymentEvaluationClientDeviceMetadata.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationClientDeviceMetadata is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
