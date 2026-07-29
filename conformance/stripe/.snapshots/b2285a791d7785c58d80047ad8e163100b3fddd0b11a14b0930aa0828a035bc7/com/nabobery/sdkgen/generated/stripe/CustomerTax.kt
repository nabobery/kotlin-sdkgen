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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_tax
 */
@Serializable(with = CustomerTax.Serializer::class)
public class CustomerTax(
  /**
   * Surfaces if automatic tax computation is possible given the current customer location information.
   */
  public val automaticTax: InlineCustomerTaxAutomaticTaxXf3aec264,
  /**
   * The tax calculation provider used for location resolution. Defaults to `stripe` when not using a [third-party
   * provider](/tax/third-party-apps).
   */
  public val provider: InlineCustomerTaxProviderX12c86023,
  /**
   * A recent IP address of the customer used for tax reporting and tax location inference.
   */
  public val ipAddress: String? = null,
  /**
   * The identified tax location of the customer.
   */
  public val location: InlineCustomerTaxLocationXdb64c412? = null,
) {
  public class Builder {
    private var automaticTaxValue: InlineCustomerTaxAutomaticTaxXf3aec264? = null

    public var automaticTax: InlineCustomerTaxAutomaticTaxXf3aec264
      get() = requireNotNull(automaticTaxValue) { "automaticTax is required" }
      set(`value`) {
        automaticTaxValue = value
      }

    private var providerValue: InlineCustomerTaxProviderX12c86023? = null

    public var provider: InlineCustomerTaxProviderX12c86023
      get() = requireNotNull(providerValue) { "provider is required" }
      set(`value`) {
        providerValue = value
      }

    /**
     * A recent IP address of the customer used for tax reporting and tax location inference.
     */
    public var ipAddress: String? = null

    /**
     * The identified tax location of the customer.
     */
    public var location: InlineCustomerTaxLocationXdb64c412? = null

    public fun build(): CustomerTax {
      check(automaticTaxValue != null) { "automaticTax is required" }
      check(providerValue != null) { "provider is required" }
      return CustomerTax(
        automaticTax = automaticTax,
        provider = provider,
        ipAddress = ipAddress,
        location = location,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerTax = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerTax {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerTax must be a JSON object")
      val automaticTax = json.decodeRequired<InlineCustomerTaxAutomaticTaxXf3aec264>(rawObject, "automatic_tax")
      val provider = json.decodeRequired<InlineCustomerTaxProviderX12c86023>(rawObject, "provider")
      return CustomerTax(
        automaticTax = automaticTax,
        provider = provider,
        ipAddress = rawObject["ip_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        location = rawObject["location"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerTaxLocationXdb64c412?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerTax) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("automatic_tax", json.encodeToJsonElement(value.automaticTax))
        put("provider", json.encodeToJsonElement(value.provider))
        value.ipAddress?.let { put("ip_address", it) }
        value.location?.let { put("location", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerTax(block: CustomerTax.Builder.() -> Unit): CustomerTax = CustomerTax.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerTax is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
