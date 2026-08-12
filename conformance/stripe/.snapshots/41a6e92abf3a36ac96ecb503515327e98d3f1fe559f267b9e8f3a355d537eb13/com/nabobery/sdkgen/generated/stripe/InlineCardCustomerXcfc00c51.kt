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

public enum class InlineCardCustomerXcfc00c51Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineCardCustomerXcfc00c51DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCardCustomerXcfc00c51NoMatchException(
  message: String,
) : InlineCardCustomerXcfc00c51DecodingException(message)

internal data class InlineCardCustomerXcfc00c51Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The customer that this card belongs to. This attribute will not be in the card object if the card belongs to an
 * account or recipient instead.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card/properties/customer
 */
@Serializable(with = InlineCardCustomerXcfc00c51.Serializer::class)
public class InlineCardCustomerXcfc00c51 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCardCustomerXcfc00c51Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineCardCustomerXcfc00c51Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCardCustomerXcfc00c51Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineCardCustomerXcfc00c51Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineCardCustomerXcfc00c51Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCardCustomerXcfc00c51 {
      val inspection = inspectInlineCardCustomerXcfc00c51(raw)
      if (inspection.matchCount == 0) {
        throw InlineCardCustomerXcfc00c51NoMatchException("InlineCardCustomerXcfc00c51 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCardCustomerXcfc00c51(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCardCustomerXcfc00c51> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCardCustomerXcfc00c51 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCardCustomerXcfc00c51")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCardCustomerXcfc00c51) {
      encoder.requireJsonEncoder("InlineCardCustomerXcfc00c51").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCardCustomerXcfc00c51(element: JsonElement): InlineCardCustomerXcfc00c51Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineCardCustomerXcfc00c51Inspection(
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
