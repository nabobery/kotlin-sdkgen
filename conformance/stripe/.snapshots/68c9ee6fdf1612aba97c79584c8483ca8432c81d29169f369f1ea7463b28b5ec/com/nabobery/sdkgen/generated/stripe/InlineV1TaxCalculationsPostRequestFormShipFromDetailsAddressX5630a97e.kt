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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e(
  public val country: String,
  public val city:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf? = null,
  public val line1:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4? = null,
  public val line2:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158? = null,
  public val postalCode:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7? = null,
  public val state:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb? = null,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public var city: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf? =
        null

    public var line1: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4? =
        null

    public var line2: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158? =
        null

    public var postalCode:
        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7? = null

    public var state: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb? =
        null

    public fun build(): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e {
      check(countryValue != null) { "country is required" }
      return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e(
        country = country,
        city = city,
        line1 = line1,
        line2 = line2,
        postalCode = postalCode,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e(
        country = country,
        city = rawObject["city"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
        value.city?.let { put("city", json.encodeToJsonElement(it)) }
        value.line1?.let { put("line1", json.encodeToJsonElement(it)) }
        value.line2?.let { put("line2", json.encodeToJsonElement(it)) }
        value.postalCode?.let { put("postal_code", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e(block: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e.Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressX5630a97e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
