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
public data class SourceOwnerView(
  public val address: InlineSourceOwnerAddressX25e060b2? = null,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
  @SerialName("verified_address")
  public val verifiedAddress: InlineSourceOwnerVerifiedAddressXc1a5a209? = null,
  @SerialName("verified_email")
  public val verifiedEmail: String? = null,
  @SerialName("verified_name")
  public val verifiedName: String? = null,
  @SerialName("verified_phone")
  public val verifiedPhone: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_owner
 */
@Serializable(with = SourceOwner.Serializer::class)
public class SourceOwner(
  /**
   * Owner's address.
   */
  public val address: InlineSourceOwnerAddressX25e060b2? = null,
  /**
   * Owner's email address.
   */
  public val email: String? = null,
  /**
   * Owner's full name.
   */
  public val name: String? = null,
  /**
   * Owner's phone number (including extension).
   */
  public val phone: String? = null,
  /**
   * Verified owner's address. Verified values are verified or provided by the payment method directly (and if
   * supported) at the time of authorization or settlement. They cannot be set or mutated.
   */
  public val verifiedAddress: InlineSourceOwnerVerifiedAddressXc1a5a209? = null,
  /**
   * Verified owner's email address. Verified values are verified or provided by the payment method directly (and if
   * supported) at the time of authorization or settlement. They cannot be set or mutated.
   */
  public val verifiedEmail: String? = null,
  /**
   * Verified owner's full name. Verified values are verified or provided by the payment method directly (and if
   * supported) at the time of authorization or settlement. They cannot be set or mutated.
   */
  public val verifiedName: String? = null,
  /**
   * Verified owner's phone number (including extension). Verified values are verified or provided by the payment method
   * directly (and if supported) at the time of authorization or settlement. They cannot be set or mutated.
   */
  public val verifiedPhone: String? = null,
) {
  public class Builder {
    /**
     * Owner's address.
     */
    public var address: InlineSourceOwnerAddressX25e060b2? = null

    /**
     * Owner's email address.
     */
    public var email: String? = null

    /**
     * Owner's full name.
     */
    public var name: String? = null

    /**
     * Owner's phone number (including extension).
     */
    public var phone: String? = null

    /**
     * Verified owner's address. Verified values are verified or provided by the payment method directly (and if
     * supported) at the time of authorization or settlement. They cannot be set or mutated.
     */
    public var verifiedAddress: InlineSourceOwnerVerifiedAddressXc1a5a209? = null

    /**
     * Verified owner's email address. Verified values are verified or provided by the payment method directly (and if
     * supported) at the time of authorization or settlement. They cannot be set or mutated.
     */
    public var verifiedEmail: String? = null

    /**
     * Verified owner's full name. Verified values are verified or provided by the payment method directly (and if
     * supported) at the time of authorization or settlement. They cannot be set or mutated.
     */
    public var verifiedName: String? = null

    /**
     * Verified owner's phone number (including extension). Verified values are verified or provided by the payment
     * method directly (and if supported) at the time of authorization or settlement. They cannot be set or mutated.
     */
    public var verifiedPhone: String? = null

    public fun build(): SourceOwner = SourceOwner(
      address = address,
      email = email,
      name = name,
      phone = phone,
      verifiedAddress = verifiedAddress,
      verifiedEmail = verifiedEmail,
      verifiedName = verifiedName,
      verifiedPhone = verifiedPhone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceOwner = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceOwner> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceOwner {
      val jsonDecoder = decoder.requireJsonDecoder("SourceOwner")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceOwner must be a JSON object")
      return SourceOwner(
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSourceOwnerAddressX25e060b2?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verifiedAddress = rawObject["verified_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSourceOwnerVerifiedAddressXc1a5a209?>(element) },
        verifiedEmail = rawObject["verified_email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verifiedName = rawObject["verified_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verifiedPhone = rawObject["verified_phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceOwner) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceOwner")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
        value.verifiedAddress?.let { put("verified_address", json.encodeToJsonElement(it)) }
        value.verifiedEmail?.let { put("verified_email", it) }
        value.verifiedName?.let { put("verified_name", it) }
        value.verifiedPhone?.let { put("verified_phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceOwner(block: SourceOwner.Builder.() -> Unit): SourceOwner = SourceOwner.build(block)
