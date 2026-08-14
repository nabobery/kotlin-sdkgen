package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7.Serializer::class)
public class InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7(
  public val moneyMovementType:
      InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472,
  public val card: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a? = null,
) {
  public class Builder {
    private var moneyMovementTypeValue:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472? = null

    public var moneyMovementType:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472
      get() = requireNotNull(moneyMovementTypeValue) { "moneyMovementType is required" }
      set(`value`) {
        moneyMovementTypeValue = value
      }

    public var card: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a? =
        null

    public fun build(): InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7 {
      check(moneyMovementTypeValue != null) { "moneyMovementType is required" }
      return InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7(
        moneyMovementType = moneyMovementType,
        card = card,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7 must be a JSON object")
      val moneyMovementType = json.decodeRequired<InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472>(rawObject, "money_movement_type")
      return InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7(
        moneyMovementType = moneyMovementType,
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("money_movement_type", json.encodeToJsonElement(value.moneyMovementType))
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7(block: InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7.Builder.() -> Unit): InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7 = InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementDetailsX1bb0eda7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
