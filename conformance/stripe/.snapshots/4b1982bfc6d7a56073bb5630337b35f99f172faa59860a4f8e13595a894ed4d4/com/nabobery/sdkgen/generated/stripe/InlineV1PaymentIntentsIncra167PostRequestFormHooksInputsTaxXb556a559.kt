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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559(
  public val calculation:
      InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxCalculationXf8a8cff4,
) {
  public class Builder {
    private var calculationValue:
        InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxCalculationXf8a8cff4? = null

    public var calculation:
        InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxCalculationXf8a8cff4
      get() = requireNotNull(calculationValue) { "calculation is required" }
      set(`value`) {
        calculationValue = value
      }

    public fun build(): InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559 {
      check(calculationValue != null) { "calculation is required" }
      return InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559(
        calculation = calculation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559 must be a JSON object")
      val calculation = json.decodeRequired<InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxCalculationXf8a8cff4>(rawObject, "calculation")
      return InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559(
        calculation = calculation,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("calculation", json.encodeToJsonElement(value.calculation))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559(block: InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559.Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559 = InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxXb556a559 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
