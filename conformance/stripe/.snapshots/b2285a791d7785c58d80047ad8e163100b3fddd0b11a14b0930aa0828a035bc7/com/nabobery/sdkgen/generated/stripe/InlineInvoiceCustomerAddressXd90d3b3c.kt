package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoiceCustomerAddressXd90d3b3cBranch {
  Address,
}

public sealed class InlineInvoiceCustomerAddressXd90d3b3cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceCustomerAddressXd90d3b3cNoMatchException(
  message: String,
) : InlineInvoiceCustomerAddressXd90d3b3cDecodingException(message)

internal data class InlineInvoiceCustomerAddressXd90d3b3cInspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * The customer's address. Until the invoice is finalized, this field will equal `customer.address`. Once the invoice is
 * finalized, this field will no longer be updated.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/customer_address
 */
@Serializable(with = InlineInvoiceCustomerAddressXd90d3b3c.Serializer::class)
public class InlineInvoiceCustomerAddressXd90d3b3c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceCustomerAddressXd90d3b3cInspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceCustomerAddressXd90d3b3cBranch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlineInvoiceCustomerAddressXd90d3b3cBranch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceCustomerAddressXd90d3b3c {
      val inspection = inspectInlineInvoiceCustomerAddressXd90d3b3c(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceCustomerAddressXd90d3b3cNoMatchException("InlineInvoiceCustomerAddressXd90d3b3c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceCustomerAddressXd90d3b3c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceCustomerAddressXd90d3b3c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceCustomerAddressXd90d3b3c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceCustomerAddressXd90d3b3c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceCustomerAddressXd90d3b3c) {
      encoder.requireJsonEncoder("InlineInvoiceCustomerAddressXd90d3b3c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceCustomerAddressXd90d3b3c(element: JsonElement): InlineInvoiceCustomerAddressXd90d3b3cInspection {
  val raw = element as? JsonObject ?: return InlineInvoiceCustomerAddressXd90d3b3cInspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlineInvoiceCustomerAddressXd90d3b3cInspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
