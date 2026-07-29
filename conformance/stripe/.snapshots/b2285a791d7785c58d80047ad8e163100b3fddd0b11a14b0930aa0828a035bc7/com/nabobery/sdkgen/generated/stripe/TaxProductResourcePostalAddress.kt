package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxProductResourcePostalAddressView(
  public val city: String? = null,
  public val country: String,
  public val line1: String? = null,
  public val line2: String? = null,
  @SerialName("postal_code")
  public val postalCode: String? = null,
  public val state: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_postal_address
 */
@Serializable(with = TaxProductResourcePostalAddress.Serializer::class)
public class TaxProductResourcePostalAddress(
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String,
  /**
   * City, district, suburb, town, or village.
   */
  public val city: String? = null,
  /**
   * Address line 1, such as the street, PO Box, or company name.
   */
  public val line1: String? = null,
  /**
   * Address line 2, such as the apartment, suite, unit, or building.
   */
  public val line2: String? = null,
  /**
   * ZIP or postal code.
   */
  public val postalCode: String? = null,
  /**
   * State/province as an [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) subdivision code, without country
   * prefix, such as "NY" or "TX".
   */
  public val state: String? = null,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    /**
     * City, district, suburb, town, or village.
     */
    public var city: String? = null

    /**
     * Address line 1, such as the street, PO Box, or company name.
     */
    public var line1: String? = null

    /**
     * Address line 2, such as the apartment, suite, unit, or building.
     */
    public var line2: String? = null

    /**
     * ZIP or postal code.
     */
    public var postalCode: String? = null

    /**
     * State/province as an [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) subdivision code, without country
     * prefix, such as "NY" or "TX".
     */
    public var state: String? = null

    public fun build(): TaxProductResourcePostalAddress {
      check(countryValue != null) { "country is required" }
      return TaxProductResourcePostalAddress(
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
    public fun build(block: Builder.() -> Unit): TaxProductResourcePostalAddress = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductResourcePostalAddress> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourcePostalAddress {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourcePostalAddress")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourcePostalAddress must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      return TaxProductResourcePostalAddress(
        country = country,
        city = rawObject["city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        line1 = rawObject["line1"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        line2 = rawObject["line2"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        postalCode = rawObject["postal_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        state = rawObject["state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourcePostalAddress) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourcePostalAddress")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
        value.city?.let { put("city", it) }
        value.line1?.let { put("line1", it) }
        value.line2?.let { put("line2", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourcePostalAddress(block: TaxProductResourcePostalAddress.Builder.() -> Unit): TaxProductResourcePostalAddress = TaxProductResourcePostalAddress.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourcePostalAddress is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
