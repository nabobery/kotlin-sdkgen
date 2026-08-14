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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/billing/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/billing/properties/address
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f(
  public val city: String,
  public val country: String,
  public val line1: String,
  public val postalCode: String,
  public val line2: String? = null,
  public val state: String? = null,
) {
  public class Builder {
    private var cityValue: String? = null

    public var city: String
      get() = requireNotNull(cityValue) { "city is required" }
      set(`value`) {
        cityValue = value
      }

    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    private var line1Value: String? = null

    public var line1: String
      get() = requireNotNull(line1Value) { "line1 is required" }
      set(`value`) {
        line1Value = value
      }

    private var postalCodeValue: String? = null

    public var postalCode: String
      get() = requireNotNull(postalCodeValue) { "postalCode is required" }
      set(`value`) {
        postalCodeValue = value
      }

    public var line2: String? = null

    public var state: String? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f {
      check(cityValue != null) { "city is required" }
      check(countryValue != null) { "country is required" }
      check(line1Value != null) { "line1 is required" }
      check(postalCodeValue != null) { "postalCode is required" }
      return InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f(
        city = city,
        country = country,
        line1 = line1,
        postalCode = postalCode,
        line2 = line2,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f must be a JSON object")
      val city = json.decodeRequired<String>(rawObject, "city")
      val country = json.decodeRequired<String>(rawObject, "country")
      val line1 = json.decodeRequired<String>(rawObject, "line1")
      val postalCode = json.decodeRequired<String>(rawObject, "postal_code")
      return InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f(
        city = city,
        country = country,
        line1 = line1,
        postalCode = postalCode,
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("city", value.city)
        put("country", value.country)
        put("line1", value.line1)
        put("postal_code", value.postalCode)
        value.line2?.let { put("line2", it) }
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f(block: InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f = InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormBillingAddressX0545dc9f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
