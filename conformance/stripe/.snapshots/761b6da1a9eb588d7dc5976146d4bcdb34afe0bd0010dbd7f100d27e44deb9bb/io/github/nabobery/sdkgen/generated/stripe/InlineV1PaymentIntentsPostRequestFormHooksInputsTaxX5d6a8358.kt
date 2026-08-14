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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/hooks/properties/inputs/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/hooks/properties/inputs/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358(
  public val calculation: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd,
) {
  public class Builder {
    private var calculationValue:
        InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd? = null

    public var calculation: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd
      get() = requireNotNull(calculationValue) { "calculation is required" }
      set(`value`) {
        calculationValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358 {
      check(calculationValue != null) { "calculation is required" }
      return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358(
        calculation = calculation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358 must be a JSON object")
      val calculation = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd>(rawObject, "calculation")
      return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358(
        calculation = calculation,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("calculation", json.encodeToJsonElement(value.calculation))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358(block: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358 = InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX5d6a8358 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
