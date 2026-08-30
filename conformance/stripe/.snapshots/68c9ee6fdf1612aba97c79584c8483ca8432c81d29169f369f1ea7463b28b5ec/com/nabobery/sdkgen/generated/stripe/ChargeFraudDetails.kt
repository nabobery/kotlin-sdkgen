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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ChargeFraudDetailsView(
  @SerialName("stripe_report")
  public val stripeReport: String? = null,
  @SerialName("user_report")
  public val userReport: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge_fraud_details
 */
@Serializable(with = ChargeFraudDetails.Serializer::class)
public class ChargeFraudDetails(
  /**
   * Assessments from Stripe. If set, the value is `fraudulent`.
   */
  public val stripeReport: String? = null,
  /**
   * Assessments reported by you. If set, possible values of are `safe` and `fraudulent`.
   */
  public val userReport: String? = null,
) {
  public class Builder {
    /**
     * Assessments from Stripe. If set, the value is `fraudulent`.
     */
    public var stripeReport: String? = null

    /**
     * Assessments reported by you. If set, possible values of are `safe` and `fraudulent`.
     */
    public var userReport: String? = null

    public fun build(): ChargeFraudDetails = ChargeFraudDetails(
      stripeReport = stripeReport,
      userReport = userReport,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChargeFraudDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChargeFraudDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChargeFraudDetails {
      val jsonDecoder = decoder.requireJsonDecoder("ChargeFraudDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChargeFraudDetails must be a JSON object")
      return ChargeFraudDetails(
        stripeReport = rawObject["stripe_report"]?.let { json.decodeFromJsonElement<String>(it) },
        userReport = rawObject["user_report"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChargeFraudDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("ChargeFraudDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.stripeReport?.let { put("stripe_report", it) }
        value.userReport?.let { put("user_report", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chargeFraudDetails(block: ChargeFraudDetails.Builder.() -> Unit): ChargeFraudDetails = ChargeFraudDetails.build(block)
