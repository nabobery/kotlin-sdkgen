package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineDiscountCustomerX0a3ac123Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineDiscountCustomerX0a3ac123DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDiscountCustomerX0a3ac123NoMatchException(
  message: String,
) : InlineDiscountCustomerX0a3ac123DecodingException(message)

internal data class InlineDiscountCustomerX0a3ac123Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/discount/properties/customer
 */
@Serializable(with = InlineDiscountCustomerX0a3ac123.Serializer::class)
public class InlineDiscountCustomerX0a3ac123 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDiscountCustomerX0a3ac123Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineDiscountCustomerX0a3ac123Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDiscountCustomerX0a3ac123Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineDiscountCustomerX0a3ac123Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineDiscountCustomerX0a3ac123Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDiscountCustomerX0a3ac123 {
      val inspection = inspectInlineDiscountCustomerX0a3ac123(raw)
      if (inspection.matchCount == 0) {
        throw InlineDiscountCustomerX0a3ac123NoMatchException("InlineDiscountCustomerX0a3ac123 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDiscountCustomerX0a3ac123(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDiscountCustomerX0a3ac123> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDiscountCustomerX0a3ac123 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDiscountCustomerX0a3ac123")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDiscountCustomerX0a3ac123) {
      encoder.requireJsonEncoder("InlineDiscountCustomerX0a3ac123").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDiscountCustomerX0a3ac123(element: JsonElement): InlineDiscountCustomerX0a3ac123Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineDiscountCustomerX0a3ac123Inspection(
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
