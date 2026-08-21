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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ShippingView(
  public val address: Address? = null,
  public val carrier: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
  @SerialName("tracking_number")
  public val trackingNumber: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping
 */
@Serializable(with = Shipping.Serializer::class)
public class Shipping(
  public val address: Address? = null,
  /**
   * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
   */
  public val carrier: String? = null,
  /**
   * Recipient name.
   */
  public val name: String? = null,
  /**
   * Recipient phone (including extension).
   */
  public val phone: String? = null,
  /**
   * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers were
   * generated for this purchase, please separate them with commas.
   */
  public val trackingNumber: String? = null,
) {
  public class Builder {
    public var address: Address? = null

    /**
     * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
     */
    public var carrier: String? = null

    /**
     * Recipient name.
     */
    public var name: String? = null

    /**
     * Recipient phone (including extension).
     */
    public var phone: String? = null

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers were
     * generated for this purchase, please separate them with commas.
     */
    public var trackingNumber: String? = null

    public fun build(): Shipping = Shipping(
      address = address,
      carrier = carrier,
      name = name,
      phone = phone,
      trackingNumber = trackingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Shipping = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Shipping> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Shipping {
      val jsonDecoder = decoder.requireJsonDecoder("Shipping")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Shipping must be a JSON object")
      return Shipping(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<Address>(it) },
        carrier = rawObject["carrier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        trackingNumber = rawObject["tracking_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Shipping) {
      val jsonEncoder = encoder.requireJsonEncoder("Shipping")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.carrier?.let { put("carrier", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
        value.trackingNumber?.let { put("tracking_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shipping(block: Shipping.Builder.() -> Unit): Shipping = Shipping.build(block)
