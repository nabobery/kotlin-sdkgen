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
 * Simulated data for the card payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1terminal~1readers~1{reader}~1present_payment_method/post/requ
 * estBody/content/application~1x-www-form-urlencoded/schema/properties/card
 */
@Serializable(with = InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7.Serializer::class)
public class InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7(
  public val expMonth: Int,
  public val expYear: Int,
  public val number: String,
  public val cvc: String? = null,
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

    public fun build(): InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7 {
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      check(numberValue != null) { "number is required" }
      return InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        cvc = cvc,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7 must be a JSON object")
      val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
      val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
      val number = json.decodeRequired<String>(rawObject, "number")
      return InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7(
        expMonth = expMonth,
        expYear = expYear,
        number = number,
        cvc = rawObject["cvc"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("exp_month", json.encodeToJsonElement(value.expMonth))
        put("exp_year", json.encodeToJsonElement(value.expYear))
        put("number", value.number)
        value.cvc?.let { put("cvc", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7(block: InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7.Builder.() -> Unit): InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7 = InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
