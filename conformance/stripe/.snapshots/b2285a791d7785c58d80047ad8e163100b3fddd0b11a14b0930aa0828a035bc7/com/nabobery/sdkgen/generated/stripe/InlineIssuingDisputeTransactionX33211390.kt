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

public enum class InlineIssuingDisputeTransactionX33211390Branch {
  Branch1,
  IssuingTransaction,
}

public sealed class InlineIssuingDisputeTransactionX33211390DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingDisputeTransactionX33211390NoMatchException(
  message: String,
) : InlineIssuingDisputeTransactionX33211390DecodingException(message)

internal data class InlineIssuingDisputeTransactionX33211390Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingTransaction).count { it }
}

/**
 * The transaction being disputed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.dispute/properties/transaction
 */
@Serializable(with = InlineIssuingDisputeTransactionX33211390.Serializer::class)
public class InlineIssuingDisputeTransactionX33211390 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingDisputeTransactionX33211390Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingTransaction: IssuingTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransaction) json.decodeFromJsonElement<IssuingTransaction>(raw) else null }

  public val matchedBranches: Set<InlineIssuingDisputeTransactionX33211390Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingDisputeTransactionX33211390Branch.Branch1)
      if (inspection.matchesIssuingTransaction) add(InlineIssuingDisputeTransactionX33211390Branch.IssuingTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingDisputeTransactionX33211390 {
      val inspection = inspectInlineIssuingDisputeTransactionX33211390(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingDisputeTransactionX33211390NoMatchException("InlineIssuingDisputeTransactionX33211390 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingDisputeTransactionX33211390(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingDisputeTransactionX33211390> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingDisputeTransactionX33211390 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeTransactionX33211390")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingDisputeTransactionX33211390) {
      encoder.requireJsonEncoder("InlineIssuingDisputeTransactionX33211390").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingDisputeTransactionX33211390(element: JsonElement): InlineIssuingDisputeTransactionX33211390Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingTransaction = element.isJsonDecodable<IssuingTransaction>()
  return InlineIssuingDisputeTransactionX33211390Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingTransaction = matchesIssuingTransaction,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingTransaction) add("IssuingTransaction: value does not match IssuingTransaction")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
