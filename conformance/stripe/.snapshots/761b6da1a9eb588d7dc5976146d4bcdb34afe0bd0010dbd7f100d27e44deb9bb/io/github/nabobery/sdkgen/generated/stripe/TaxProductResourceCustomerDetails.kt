package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_customer_details
 */
@Serializable(with = TaxProductResourceCustomerDetails.Serializer::class)
public class TaxProductResourceCustomerDetails(
  taxIds: List<TaxProductResourceCustomerDetailsResourceTaxId>,
  /**
   * The taxability override used for taxation.
   */
  public val taxabilityOverride: InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b,
  /**
   * The customer's postal address (for example, home or business location).
   */
  public val address: InlineTaxProductResourceCustomerDetailsAddressXdece9341? = null,
  /**
   * The type of customer address provided.
   */
  public val addressSource: InlineTaxProductResourceCustomerDetailsAddressSourceX64204034? = null,
  /**
   * The customer's IP address (IPv4 or IPv6).
   */
  public val ipAddress: String? = null,
) {
  /**
   * The customer's tax IDs (for example, EU VAT numbers).
   */
  public val taxIds: List<TaxProductResourceCustomerDetailsResourceTaxId> = taxIds.toList()

  public class Builder {
    private var taxIdsValue: List<TaxProductResourceCustomerDetailsResourceTaxId>? = null

    public var taxIds: List<TaxProductResourceCustomerDetailsResourceTaxId>
      get() = requireNotNull(taxIdsValue) { "taxIds is required" }.toList()
      set(`value`) {
        taxIdsValue = value.toList()
      }

    private var taxabilityOverrideValue:
        InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b? = null

    public var taxabilityOverride:
        InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b
      get() = requireNotNull(taxabilityOverrideValue) { "taxabilityOverride is required" }
      set(`value`) {
        taxabilityOverrideValue = value
      }

    /**
     * The customer's postal address (for example, home or business location).
     */
    public var address: InlineTaxProductResourceCustomerDetailsAddressXdece9341? = null

    /**
     * The type of customer address provided.
     */
    public var addressSource: InlineTaxProductResourceCustomerDetailsAddressSourceX64204034? = null

    /**
     * The customer's IP address (IPv4 or IPv6).
     */
    public var ipAddress: String? = null

    public fun build(): TaxProductResourceCustomerDetails {
      check(taxIdsValue != null) { "taxIds is required" }
      check(taxabilityOverrideValue != null) { "taxabilityOverride is required" }
      return TaxProductResourceCustomerDetails(
        taxIds = taxIds,
        taxabilityOverride = taxabilityOverride,
        address = address,
        addressSource = addressSource,
        ipAddress = ipAddress,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceCustomerDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceCustomerDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceCustomerDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceCustomerDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceCustomerDetails must be a JSON object")
      val taxIds = json.decodeRequired<List<TaxProductResourceCustomerDetailsResourceTaxId>>(rawObject, "tax_ids")
      val taxabilityOverride = json.decodeRequired<InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b>(rawObject, "taxability_override")
      return TaxProductResourceCustomerDetails(
        taxIds = taxIds,
        taxabilityOverride = taxabilityOverride,
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxProductResourceCustomerDetailsAddressXdece9341?>(element) },
        addressSource = rawObject["address_source"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxProductResourceCustomerDetailsAddressSourceX64204034?>(element) },
        ipAddress = rawObject["ip_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceCustomerDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceCustomerDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tax_ids", json.encodeToJsonElement(value.taxIds))
        put("taxability_override", json.encodeToJsonElement(value.taxabilityOverride))
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressSource?.let { put("address_source", json.encodeToJsonElement(it)) }
        value.ipAddress?.let { put("ip_address", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceCustomerDetails(block: TaxProductResourceCustomerDetails.Builder.() -> Unit): TaxProductResourceCustomerDetails = TaxProductResourceCustomerDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceCustomerDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
