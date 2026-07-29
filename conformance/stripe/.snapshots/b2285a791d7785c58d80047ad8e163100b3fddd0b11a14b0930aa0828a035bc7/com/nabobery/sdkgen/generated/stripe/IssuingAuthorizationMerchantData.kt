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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_merchant_data
 */
@Serializable(with = IssuingAuthorizationMerchantData.Serializer::class)
public class IssuingAuthorizationMerchantData(
  /**
   * A categorization of the seller's type of business. See our [merchant categories
   * guide](https://docs.stripe.com/issuing/merchant-categories) for a list of possible values.
   */
  public val category: String,
  /**
   * The merchant category code for the seller’s business
   */
  public val categoryCode: String,
  /**
   * Identifier assigned to the seller by the card network. Different card networks may assign different network_id
   * fields to the same merchant.
   */
  public val networkId: String,
  /**
   * City where the seller is located
   */
  public val city: String? = null,
  /**
   * Country where the seller is located
   */
  public val country: String? = null,
  /**
   * Name of the seller
   */
  public val name: String? = null,
  /**
   * Postal code where the seller is located
   */
  public val postalCode: String? = null,
  /**
   * State where the seller is located
   */
  public val state: String? = null,
  /**
   * The seller's tax identification number. Currently populated for French merchants only.
   */
  public val taxId: String? = null,
  /**
   * An ID assigned by the seller to the location of the sale.
   */
  public val terminalId: String? = null,
  /**
   * URL provided by the merchant on a 3DS request
   */
  public val url: String? = null,
) {
  public class Builder {
    private var categoryValue: String? = null

    public var category: String
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    private var categoryCodeValue: String? = null

    public var categoryCode: String
      get() = requireNotNull(categoryCodeValue) { "categoryCode is required" }
      set(`value`) {
        categoryCodeValue = value
      }

    private var networkIdValue: String? = null

    public var networkId: String
      get() = requireNotNull(networkIdValue) { "networkId is required" }
      set(`value`) {
        networkIdValue = value
      }

    /**
     * City where the seller is located
     */
    public var city: String? = null

    /**
     * Country where the seller is located
     */
    public var country: String? = null

    /**
     * Name of the seller
     */
    public var name: String? = null

    /**
     * Postal code where the seller is located
     */
    public var postalCode: String? = null

    /**
     * State where the seller is located
     */
    public var state: String? = null

    /**
     * The seller's tax identification number. Currently populated for French merchants only.
     */
    public var taxId: String? = null

    /**
     * An ID assigned by the seller to the location of the sale.
     */
    public var terminalId: String? = null

    /**
     * URL provided by the merchant on a 3DS request
     */
    public var url: String? = null

    public fun build(): IssuingAuthorizationMerchantData {
      check(categoryValue != null) { "category is required" }
      check(categoryCodeValue != null) { "categoryCode is required" }
      check(networkIdValue != null) { "networkId is required" }
      return IssuingAuthorizationMerchantData(
        category = category,
        categoryCode = categoryCode,
        networkId = networkId,
        city = city,
        country = country,
        name = name,
        postalCode = postalCode,
        state = state,
        taxId = taxId,
        terminalId = terminalId,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationMerchantData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingAuthorizationMerchantData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationMerchantData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationMerchantData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationMerchantData must be a JSON object")
      val category = json.decodeRequired<String>(rawObject, "category")
      val categoryCode = json.decodeRequired<String>(rawObject, "category_code")
      val networkId = json.decodeRequired<String>(rawObject, "network_id")
      return IssuingAuthorizationMerchantData(
        category = category,
        categoryCode = categoryCode,
        networkId = networkId,
        city = rawObject["city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        postalCode = rawObject["postal_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        state = rawObject["state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        taxId = rawObject["tax_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        terminalId = rawObject["terminal_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationMerchantData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationMerchantData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("category", value.category)
        put("category_code", value.categoryCode)
        put("network_id", value.networkId)
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.name?.let { put("name", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
        value.taxId?.let { put("tax_id", it) }
        value.terminalId?.let { put("terminal_id", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationMerchantData(block: IssuingAuthorizationMerchantData.Builder.() -> Unit): IssuingAuthorizationMerchantData = IssuingAuthorizationMerchantData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingAuthorizationMerchantData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
