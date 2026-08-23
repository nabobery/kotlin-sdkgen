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

public enum class InlineDeletedDiscountCustomerXb94f9519Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineDeletedDiscountCustomerXb94f9519DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDeletedDiscountCustomerXb94f9519NoMatchException(
  message: String,
) : InlineDeletedDiscountCustomerXb94f9519DecodingException(message)

internal data class InlineDeletedDiscountCustomerXb94f9519Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The ID of the customer associated with this discount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_discount/properties/customer
 */
@Serializable(with = InlineDeletedDiscountCustomerXb94f9519.Serializer::class)
public class InlineDeletedDiscountCustomerXb94f9519 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDeletedDiscountCustomerXb94f9519Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineDeletedDiscountCustomerXb94f9519Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDeletedDiscountCustomerXb94f9519Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineDeletedDiscountCustomerXb94f9519Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineDeletedDiscountCustomerXb94f9519Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDeletedDiscountCustomerXb94f9519 {
      val inspection = inspectInlineDeletedDiscountCustomerXb94f9519(raw)
      if (inspection.matchCount == 0) {
        throw InlineDeletedDiscountCustomerXb94f9519NoMatchException("InlineDeletedDiscountCustomerXb94f9519 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDeletedDiscountCustomerXb94f9519(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedDiscountCustomerXb94f9519> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDeletedDiscountCustomerXb94f9519 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDeletedDiscountCustomerXb94f9519")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDeletedDiscountCustomerXb94f9519) {
      encoder.requireJsonEncoder("InlineDeletedDiscountCustomerXb94f9519").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDeletedDiscountCustomerXb94f9519(element: JsonElement): InlineDeletedDiscountCustomerXb94f9519Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineDeletedDiscountCustomerXb94f9519Inspection(
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
