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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/klarna/properties/dob.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/klarna/properties/dob
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80(
  public val day: Int,
  public val month: Int,
  public val year: Int,
) {
  public class Builder {
    private var dayValue: Int? = null

    public var day: Int
      get() = requireNotNull(dayValue) { "day is required" }
      set(`value`) {
        dayValue = value
      }

    private var monthValue: Int? = null

    public var month: Int
      get() = requireNotNull(monthValue) { "month is required" }
      set(`value`) {
        monthValue = value
      }

    private var yearValue: Int? = null

    public var year: Int
      get() = requireNotNull(yearValue) { "year is required" }
      set(`value`) {
        yearValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80 {
      check(dayValue != null) { "day is required" }
      check(monthValue != null) { "month is required" }
      check(yearValue != null) { "year is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80(
        day = day,
        month = month,
        year = year,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80 must be a JSON object")
      val day = json.decodeRequired<Int>(rawObject, "day")
      val month = json.decodeRequired<Int>(rawObject, "month")
      val year = json.decodeRequired<Int>(rawObject, "year")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80(
        day = day,
        month = month,
        year = year,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("day", json.encodeToJsonElement(value.day))
        put("month", json.encodeToJsonElement(value.month))
        put("year", json.encodeToJsonElement(value.year))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaDobXd17a8d80 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
