package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class RadarReviewResourceLocationView(
  public val city: String? = null,
  public val country: String? = null,
  public val latitude: Double? = null,
  public val longitude: Double? = null,
  public val region: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar_review_resource_location
 */
@Serializable(with = RadarReviewResourceLocation.Serializer::class)
public class RadarReviewResourceLocation(
  /**
   * The city where the payment originated.
   */
  public val city: String? = null,
  /**
   * Two-letter ISO code representing the country where the payment originated.
   */
  public val country: String? = null,
  /**
   * The geographic latitude where the payment originated.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val latitude: Double? = null,
  /**
   * The geographic longitude where the payment originated.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val longitude: Double? = null,
  /**
   * The state/county/province/region where the payment originated.
   */
  public val region: String? = null,
) {
  public class Builder {
    /**
     * The city where the payment originated.
     */
    public var city: String? = null

    /**
     * Two-letter ISO code representing the country where the payment originated.
     */
    public var country: String? = null

    /**
     * The geographic latitude where the payment originated.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var latitude: Double? = null

    /**
     * The geographic longitude where the payment originated.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var longitude: Double? = null

    /**
     * The state/county/province/region where the payment originated.
     */
    public var region: String? = null

    public fun build(): RadarReviewResourceLocation = RadarReviewResourceLocation(
      city = city,
      country = country,
      latitude = latitude,
      longitude = longitude,
      region = region,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RadarReviewResourceLocation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RadarReviewResourceLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RadarReviewResourceLocation {
      val jsonDecoder = decoder.requireJsonDecoder("RadarReviewResourceLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RadarReviewResourceLocation must be a JSON object")
      return RadarReviewResourceLocation(
        city = rawObject["city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        latitude = rawObject["latitude"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        longitude = rawObject["longitude"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        region = rawObject["region"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RadarReviewResourceLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("RadarReviewResourceLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.latitude?.let { put("latitude", json.encodeToJsonElement(it)) }
        value.longitude?.let { put("longitude", json.encodeToJsonElement(it)) }
        value.region?.let { put("region", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun radarReviewResourceLocation(block: RadarReviewResourceLocation.Builder.() -> Unit): RadarReviewResourceLocation = RadarReviewResourceLocation.build(block)
