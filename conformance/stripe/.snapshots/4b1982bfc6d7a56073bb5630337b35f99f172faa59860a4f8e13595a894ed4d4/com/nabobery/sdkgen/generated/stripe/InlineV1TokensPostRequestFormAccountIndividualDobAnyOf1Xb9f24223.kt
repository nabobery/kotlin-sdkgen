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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/dob/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/dob/anyOf/0
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223(
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

    public fun build(): InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 {
      check(dayValue != null) { "day is required" }
      check(monthValue != null) { "month is required" }
      check(yearValue != null) { "year is required" }
      return InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223(
        day = day,
        month = month,
        year = year,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 must be a JSON object")
      val day = json.decodeRequired<Int>(rawObject, "day")
      val month = json.decodeRequired<Int>(rawObject, "month")
      val year = json.decodeRequired<Int>(rawObject, "year")
      return InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223(
        day = day,
        month = month,
        year = year,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223")
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

public fun inlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223(block: InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 = InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
