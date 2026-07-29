package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_three_d_secure.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_three_d_secure
 */
@Serializable(with = SourceTypeThreeDSecure.Serializer::class)
public class SourceTypeThreeDSecure(
  public val addressLine1Check: String? = null,
  public val addressZipCheck: String? = null,
  public val authenticated: Boolean? = null,
  public val brand: String? = null,
  public val card: String? = null,
  public val country: String? = null,
  public val customer: String? = null,
  public val cvcCheck: String? = null,
  public val dynamicLast4: String? = null,
  public val expMonth: Int? = null,
  public val expYear: Int? = null,
  public val fingerprint: String? = null,
  public val funding: String? = null,
  public val last4: String? = null,
  public val name: String? = null,
  public val threeDSecure: String? = null,
  public val tokenizationMethod: String? = null,
) {
  public class Builder {
    public var addressLine1Check: String? = null

    public var addressZipCheck: String? = null

    public var authenticated: Boolean? = null

    public var brand: String? = null

    public var card: String? = null

    public var country: String? = null

    public var customer: String? = null

    public var cvcCheck: String? = null

    public var dynamicLast4: String? = null

    public var expMonth: Int? = null

    public var expYear: Int? = null

    public var fingerprint: String? = null

    public var funding: String? = null

    public var last4: String? = null

    public var name: String? = null

    public var threeDSecure: String? = null

    public var tokenizationMethod: String? = null

    public fun build(): SourceTypeThreeDSecure = SourceTypeThreeDSecure(
      addressLine1Check = addressLine1Check,
      addressZipCheck = addressZipCheck,
      authenticated = authenticated,
      brand = brand,
      card = card,
      country = country,
      customer = customer,
      cvcCheck = cvcCheck,
      dynamicLast4 = dynamicLast4,
      expMonth = expMonth,
      expYear = expYear,
      fingerprint = fingerprint,
      funding = funding,
      last4 = last4,
      name = name,
      threeDSecure = threeDSecure,
      tokenizationMethod = tokenizationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeThreeDSecure = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceTypeThreeDSecure> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeThreeDSecure {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeThreeDSecure")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeThreeDSecure must be a JSON object")
      return SourceTypeThreeDSecure(
        addressLine1Check = rawObject["address_line1_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressZipCheck = rawObject["address_zip_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        authenticated = rawObject["authenticated"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        brand = rawObject["brand"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        card = rawObject["card"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        cvcCheck = rawObject["cvc_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        dynamicLast4 = rawObject["dynamic_last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expMonth = rawObject["exp_month"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        expYear = rawObject["exp_year"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { json.decodeFromJsonElement<String>(it) },
        funding = rawObject["funding"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        threeDSecure = rawObject["three_d_secure"]?.let { json.decodeFromJsonElement<String>(it) },
        tokenizationMethod = rawObject["tokenization_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeThreeDSecure) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeThreeDSecure")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.addressLine1Check?.let { put("address_line1_check", it) }
        value.addressZipCheck?.let { put("address_zip_check", it) }
        value.authenticated?.let { put("authenticated", json.encodeToJsonElement(it)) }
        value.brand?.let { put("brand", it) }
        value.card?.let { put("card", it) }
        value.country?.let { put("country", it) }
        value.customer?.let { put("customer", it) }
        value.cvcCheck?.let { put("cvc_check", it) }
        value.dynamicLast4?.let { put("dynamic_last4", it) }
        value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
        value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.funding?.let { put("funding", it) }
        value.last4?.let { put("last4", it) }
        value.name?.let { put("name", it) }
        value.threeDSecure?.let { put("three_d_secure", it) }
        value.tokenizationMethod?.let { put("tokenization_method", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeThreeDSecure(block: SourceTypeThreeDSecure.Builder.() -> Unit): SourceTypeThreeDSecure = SourceTypeThreeDSecure.build(block)
