package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/0
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45(
  public val expMonth: Int,
  public val expYear: Int,
  public val number: String,
  public val cvc: String? = null,
  public val networks: InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f? = null,
) {
  public class Builder {
    private var expMonthValue: Int? = null

    public var expMonth: Int
      get() = requireNotNull(expMonthValue) { "expMonth is required" }
      set(`value`) {
        expMonthValue = value
      }

    private var expYearValue: Int? = null

    public var expYear: Int
      get() = requireNotNull(expYearValue) { "expYear is required" }
      set(`value`) {
        expYearValue = value
      }

    private var numberValue: String? = null

    public var number: String
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    public var cvc: String? = null

    public var networks: InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 {
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      check(numberValue != null) { "number is required" }
      return InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        cvc = cvc,
        networks = networks,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 must be a JSON object")
      val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
      val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
      val number = json.decodeRequired<String>(rawObject, "number")
      return InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        cvc = rawObject["cvc"]?.let { json.decodeFromJsonElement<String>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("exp_month", json.encodeToJsonElement(value.expMonth))
        put("exp_year", json.encodeToJsonElement(value.expYear))
        put("number", value.number)
        value.cvc?.let { put("cvc", it) }
        value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45(block: InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 = InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
