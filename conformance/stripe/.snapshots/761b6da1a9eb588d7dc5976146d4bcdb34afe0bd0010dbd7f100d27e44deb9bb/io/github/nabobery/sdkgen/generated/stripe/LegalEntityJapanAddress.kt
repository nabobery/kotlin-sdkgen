package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class LegalEntityJapanAddressView(
  public val city: String? = null,
  public val country: String? = null,
  public val line1: String? = null,
  public val line2: String? = null,
  @SerialName("postal_code")
  public val postalCode: String? = null,
  public val state: String? = null,
  public val town: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_japan_address
 */
@Serializable(with = LegalEntityJapanAddress.Serializer::class)
public class LegalEntityJapanAddress(
  /**
   * City/Ward.
   */
  public val city: String? = null,
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String? = null,
  /**
   * Block/Building number.
   */
  public val line1: String? = null,
  /**
   * Building details.
   */
  public val line2: String? = null,
  /**
   * ZIP or postal code.
   */
  public val postalCode: String? = null,
  /**
   * Prefecture.
   */
  public val state: String? = null,
  /**
   * Town/cho-me.
   */
  public val town: String? = null,
) {
  public class Builder {
    /**
     * City/Ward.
     */
    public var city: String? = null

    /**
     * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
     */
    public var country: String? = null

    /**
     * Block/Building number.
     */
    public var line1: String? = null

    /**
     * Building details.
     */
    public var line2: String? = null

    /**
     * ZIP or postal code.
     */
    public var postalCode: String? = null

    /**
     * Prefecture.
     */
    public var state: String? = null

    /**
     * Town/cho-me.
     */
    public var town: String? = null

    public fun build(): LegalEntityJapanAddress = LegalEntityJapanAddress(
      city = city,
      country = country,
      line1 = line1,
      line2 = line2,
      postalCode = postalCode,
      state = state,
      town = town,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityJapanAddress = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LegalEntityJapanAddress> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityJapanAddress {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityJapanAddress")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityJapanAddress must be a JSON object")
      return LegalEntityJapanAddress(
        city = rawObject["city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        line1 = rawObject["line1"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        line2 = rawObject["line2"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        postalCode = rawObject["postal_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        state = rawObject["state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        town = rawObject["town"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityJapanAddress) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityJapanAddress")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.line1?.let { put("line1", it) }
        value.line2?.let { put("line2", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
        value.town?.let { put("town", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun legalEntityJapanAddress(block: LegalEntityJapanAddress.Builder.() -> Unit): LegalEntityJapanAddress = LegalEntityJapanAddress.build(block)
