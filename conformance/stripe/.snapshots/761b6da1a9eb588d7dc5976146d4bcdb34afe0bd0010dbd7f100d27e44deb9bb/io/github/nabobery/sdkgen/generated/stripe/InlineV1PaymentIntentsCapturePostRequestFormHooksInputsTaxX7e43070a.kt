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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a(
  public val calculation:
      InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264,
) {
  public class Builder {
    private var calculationValue:
        InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264? = null

    public var calculation:
        InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264
      get() = requireNotNull(calculationValue) { "calculation is required" }
      set(`value`) {
        calculationValue = value
      }

    public fun build(): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a {
      check(calculationValue != null) { "calculation is required" }
      return InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a(
        calculation = calculation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a must be a JSON object")
      val calculation = json.decodeRequired<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxCalculationXb4d8e264>(rawObject, "calculation")
      return InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a(
        calculation = calculation,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("calculation", json.encodeToJsonElement(value.calculation))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a(block: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a.Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a = InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxX7e43070a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
