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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoiceCustomerX09737939Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineInvoiceCustomerX09737939DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceCustomerX09737939NoMatchException(
  message: String,
) : InlineInvoiceCustomerX09737939DecodingException(message)

internal data class InlineInvoiceCustomerX09737939Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The ID of the customer to bill.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/customer
 */
@Serializable(with = InlineInvoiceCustomerX09737939.Serializer::class)
public class InlineInvoiceCustomerX09737939 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceCustomerX09737939Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceCustomerX09737939Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceCustomerX09737939Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineInvoiceCustomerX09737939Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineInvoiceCustomerX09737939Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceCustomerX09737939 {
      val inspection = inspectInlineInvoiceCustomerX09737939(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceCustomerX09737939NoMatchException("InlineInvoiceCustomerX09737939 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceCustomerX09737939(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceCustomerX09737939> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceCustomerX09737939 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceCustomerX09737939")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceCustomerX09737939) {
      encoder.requireJsonEncoder("InlineInvoiceCustomerX09737939").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceCustomerX09737939(element: JsonElement): InlineInvoiceCustomerX09737939Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineInvoiceCustomerX09737939Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    matchesDeletedCustomer = matchesDeletedCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
      if (!matchesDeletedCustomer) add("DeletedCustomer: value does not match DeletedCustomer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
