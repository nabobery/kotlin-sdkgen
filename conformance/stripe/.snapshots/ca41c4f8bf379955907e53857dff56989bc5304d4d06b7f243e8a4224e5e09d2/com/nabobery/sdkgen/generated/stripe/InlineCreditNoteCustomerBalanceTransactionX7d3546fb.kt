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

public enum class InlineCreditNoteCustomerBalanceTransactionX7d3546fbBranch {
  Branch1,
  CustomerBalanceTransaction,
}

public sealed class InlineCreditNoteCustomerBalanceTransactionX7d3546fbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCreditNoteCustomerBalanceTransactionX7d3546fbNoMatchException(
  message: String,
) : InlineCreditNoteCustomerBalanceTransactionX7d3546fbDecodingException(message)

internal data class InlineCreditNoteCustomerBalanceTransactionX7d3546fbInspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomerBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomerBalanceTransaction).count { it }
}

/**
 * Customer balance transaction related to this credit note.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/customer_balance_transaction
 */
@Serializable(with = InlineCreditNoteCustomerBalanceTransactionX7d3546fb.Serializer::class)
public class InlineCreditNoteCustomerBalanceTransactionX7d3546fb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCreditNoteCustomerBalanceTransactionX7d3546fbInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customerBalanceTransaction: CustomerBalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomerBalanceTransaction) json.decodeFromJsonElement<CustomerBalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineCreditNoteCustomerBalanceTransactionX7d3546fbBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCreditNoteCustomerBalanceTransactionX7d3546fbBranch.Branch1)
      if (inspection.matchesCustomerBalanceTransaction) add(InlineCreditNoteCustomerBalanceTransactionX7d3546fbBranch.CustomerBalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCreditNoteCustomerBalanceTransactionX7d3546fb {
      val inspection = inspectInlineCreditNoteCustomerBalanceTransactionX7d3546fb(raw)
      if (inspection.matchCount == 0) {
        throw InlineCreditNoteCustomerBalanceTransactionX7d3546fbNoMatchException("InlineCreditNoteCustomerBalanceTransactionX7d3546fb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCreditNoteCustomerBalanceTransactionX7d3546fb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteCustomerBalanceTransactionX7d3546fb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditNoteCustomerBalanceTransactionX7d3546fb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNoteCustomerBalanceTransactionX7d3546fb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteCustomerBalanceTransactionX7d3546fb) {
      encoder.requireJsonEncoder("InlineCreditNoteCustomerBalanceTransactionX7d3546fb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCreditNoteCustomerBalanceTransactionX7d3546fb(element: JsonElement): InlineCreditNoteCustomerBalanceTransactionX7d3546fbInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomerBalanceTransaction = element.isJsonDecodable<CustomerBalanceTransaction>()
  return InlineCreditNoteCustomerBalanceTransactionX7d3546fbInspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomerBalanceTransaction = matchesCustomerBalanceTransaction,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomerBalanceTransaction) add("CustomerBalanceTransaction: value does not match CustomerBalanceTransaction")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
