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

public enum class InlinePromotionCodeCustomerX64b32b82Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlinePromotionCodeCustomerX64b32b82DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePromotionCodeCustomerX64b32b82NoMatchException(
  message: String,
) : InlinePromotionCodeCustomerX64b32b82DecodingException(message)

internal data class InlinePromotionCodeCustomerX64b32b82Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The customer who can use this promotion code.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_code/properties/customer
 */
@Serializable(with = InlinePromotionCodeCustomerX64b32b82.Serializer::class)
public class InlinePromotionCodeCustomerX64b32b82 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePromotionCodeCustomerX64b32b82Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlinePromotionCodeCustomerX64b32b82Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePromotionCodeCustomerX64b32b82Branch.Branch1)
      if (inspection.matchesCustomer) add(InlinePromotionCodeCustomerX64b32b82Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlinePromotionCodeCustomerX64b32b82Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePromotionCodeCustomerX64b32b82 {
      val inspection = inspectInlinePromotionCodeCustomerX64b32b82(raw)
      if (inspection.matchCount == 0) {
        throw InlinePromotionCodeCustomerX64b32b82NoMatchException("InlinePromotionCodeCustomerX64b32b82 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePromotionCodeCustomerX64b32b82(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePromotionCodeCustomerX64b32b82> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePromotionCodeCustomerX64b32b82 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePromotionCodeCustomerX64b32b82")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePromotionCodeCustomerX64b32b82) {
      encoder.requireJsonEncoder("InlinePromotionCodeCustomerX64b32b82").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePromotionCodeCustomerX64b32b82(element: JsonElement): InlinePromotionCodeCustomerX64b32b82Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlinePromotionCodeCustomerX64b32b82Inspection(
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
