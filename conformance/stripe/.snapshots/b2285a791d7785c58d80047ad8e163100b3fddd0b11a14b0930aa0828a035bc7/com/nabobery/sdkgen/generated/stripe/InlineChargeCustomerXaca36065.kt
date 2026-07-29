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

public enum class InlineChargeCustomerXaca36065Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineChargeCustomerXaca36065DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeCustomerXaca36065NoMatchException(
  message: String,
) : InlineChargeCustomerXaca36065DecodingException(message)

internal data class InlineChargeCustomerXaca36065Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * ID of the customer this charge is for if one exists.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/customer
 */
@Serializable(with = InlineChargeCustomerXaca36065.Serializer::class)
public class InlineChargeCustomerXaca36065 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeCustomerXaca36065Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineChargeCustomerXaca36065Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeCustomerXaca36065Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineChargeCustomerXaca36065Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineChargeCustomerXaca36065Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeCustomerXaca36065 {
      val inspection = inspectInlineChargeCustomerXaca36065(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeCustomerXaca36065NoMatchException("InlineChargeCustomerXaca36065 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeCustomerXaca36065(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineChargeCustomerXaca36065> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeCustomerXaca36065 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeCustomerXaca36065")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeCustomerXaca36065) {
      encoder.requireJsonEncoder("InlineChargeCustomerXaca36065").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeCustomerXaca36065(element: JsonElement): InlineChargeCustomerXaca36065Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineChargeCustomerXaca36065Inspection(
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
