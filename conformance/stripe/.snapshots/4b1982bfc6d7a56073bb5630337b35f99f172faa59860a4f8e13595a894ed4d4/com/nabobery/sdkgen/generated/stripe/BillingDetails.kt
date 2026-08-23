package com.nabobery.sdkgen.generated.stripe

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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_details
 */
@Serializable(with = BillingDetails.Serializer::class)
public class BillingDetails(
  /**
   * Billing address.
   */
  public val address: InlineBillingDetailsAddressX0922cd53? = null,
  /**
   * Email address.
   */
  public val email: String? = null,
  /**
   * Full name.
   */
  public val name: String? = null,
  /**
   * Billing phone number (including extension).
   */
  public val phone: String? = null,
  /**
   * Taxpayer identification number. Used only for transactions between LATAM buyers and non-LATAM sellers.
   */
  public val taxId: String? = null,
) {
  public class Builder {
    /**
     * Billing address.
     */
    public var address: InlineBillingDetailsAddressX0922cd53? = null

    /**
     * Email address.
     */
    public var email: String? = null

    /**
     * Full name.
     */
    public var name: String? = null

    /**
     * Billing phone number (including extension).
     */
    public var phone: String? = null

    /**
     * Taxpayer identification number. Used only for transactions between LATAM buyers and non-LATAM sellers.
     */
    public var taxId: String? = null

    public fun build(): BillingDetails = BillingDetails(
      address = address,
      email = email,
      name = name,
      phone = phone,
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BillingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingDetails must be a JSON object")
      return BillingDetails(
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingDetailsAddressX0922cd53?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        taxId = rawObject["tax_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
        value.taxId?.let { put("tax_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingDetails(block: BillingDetails.Builder.() -> Unit): BillingDetails = BillingDetails.build(block)
