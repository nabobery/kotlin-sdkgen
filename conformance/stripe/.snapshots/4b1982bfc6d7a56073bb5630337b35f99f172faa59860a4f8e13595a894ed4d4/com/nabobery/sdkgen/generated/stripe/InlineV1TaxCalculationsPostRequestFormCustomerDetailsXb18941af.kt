package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Details about the customer, including address and tax IDs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af(
  public val address: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db? = null,
  public val addressSource:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2? = null,
  public val ipAddress: String? = null,
  taxIds: List<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175>? = null,
  public val taxabilityOverride:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f? = null,
) {
  public val taxIds: List<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175>?
      = taxIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var address: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db? =
        null

    public var addressSource:
        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2? = null

    public var ipAddress: String? = null

    private var taxIdsValue:
        List<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175>? = null

    public var taxIds:
        List<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175>?
      get() = taxIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var taxabilityOverride:
        InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f? = null

    public fun build(): InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af = InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af(
      address = address,
      addressSource = addressSource,
      ipAddress = ipAddress,
      taxIds = taxIds,
      taxabilityOverride = taxabilityOverride,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af must be a JSON object")
      return InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressX2a6a22db>(it) },
        addressSource = rawObject["address_source"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2>(it) },
        ipAddress = rawObject["ip_address"]?.let { json.decodeFromJsonElement<String>(it) },
        taxIds = rawObject["tax_ids"]?.let { json.decodeFromJsonElement<List<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175>>(it) },
        taxabilityOverride = rawObject["taxability_override"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressSource?.let { put("address_source", json.encodeToJsonElement(it)) }
        value.ipAddress?.let { put("ip_address", it) }
        value.taxIds?.let { put("tax_ids", json.encodeToJsonElement(it)) }
        value.taxabilityOverride?.let { put("taxability_override", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af(block: InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af.Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af = InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af.build(block)
