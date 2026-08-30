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

public enum class InlineCreditNoteCustomerX5db14beaBranch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineCreditNoteCustomerX5db14beaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCreditNoteCustomerX5db14beaNoMatchException(
  message: String,
) : InlineCreditNoteCustomerX5db14beaDecodingException(message)

internal data class InlineCreditNoteCustomerX5db14beaInspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * ID of the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/customer
 */
@Serializable(with = InlineCreditNoteCustomerX5db14bea.Serializer::class)
public class InlineCreditNoteCustomerX5db14bea internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCreditNoteCustomerX5db14beaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineCreditNoteCustomerX5db14beaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCreditNoteCustomerX5db14beaBranch.Branch1)
      if (inspection.matchesCustomer) add(InlineCreditNoteCustomerX5db14beaBranch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineCreditNoteCustomerX5db14beaBranch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCreditNoteCustomerX5db14bea {
      val inspection = inspectInlineCreditNoteCustomerX5db14bea(raw)
      if (inspection.matchCount == 0) {
        throw InlineCreditNoteCustomerX5db14beaNoMatchException("InlineCreditNoteCustomerX5db14bea matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCreditNoteCustomerX5db14bea(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteCustomerX5db14bea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditNoteCustomerX5db14bea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNoteCustomerX5db14bea")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteCustomerX5db14bea) {
      encoder.requireJsonEncoder("InlineCreditNoteCustomerX5db14bea").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCreditNoteCustomerX5db14bea(element: JsonElement): InlineCreditNoteCustomerX5db14beaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineCreditNoteCustomerX5db14beaInspection(
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
