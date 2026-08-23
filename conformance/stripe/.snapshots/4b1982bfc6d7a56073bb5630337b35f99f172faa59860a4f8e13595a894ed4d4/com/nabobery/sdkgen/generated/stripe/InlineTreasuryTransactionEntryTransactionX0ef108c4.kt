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

public enum class InlineTreasuryTransactionEntryTransactionX0ef108c4Branch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryTransactionEntryTransactionX0ef108c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryTransactionEntryTransactionX0ef108c4NoMatchException(
  message: String,
) : InlineTreasuryTransactionEntryTransactionX0ef108c4DecodingException(message)

internal data class InlineTreasuryTransactionEntryTransactionX0ef108c4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTreasuryTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTreasuryTransaction).count { it }
}

/**
 * The Transaction associated with this object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction_entry/properties/transaction
 */
@Serializable(with = InlineTreasuryTransactionEntryTransactionX0ef108c4.Serializer::class)
public class InlineTreasuryTransactionEntryTransactionX0ef108c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryTransactionEntryTransactionX0ef108c4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryTransactionEntryTransactionX0ef108c4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryTransactionEntryTransactionX0ef108c4Branch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryTransactionEntryTransactionX0ef108c4Branch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryTransactionEntryTransactionX0ef108c4 {
      val inspection = inspectInlineTreasuryTransactionEntryTransactionX0ef108c4(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryTransactionEntryTransactionX0ef108c4NoMatchException("InlineTreasuryTransactionEntryTransactionX0ef108c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryTransactionEntryTransactionX0ef108c4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryTransactionEntryTransactionX0ef108c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionEntryTransactionX0ef108c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryTransactionEntryTransactionX0ef108c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionEntryTransactionX0ef108c4) {
      encoder.requireJsonEncoder("InlineTreasuryTransactionEntryTransactionX0ef108c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryTransactionEntryTransactionX0ef108c4(element: JsonElement): InlineTreasuryTransactionEntryTransactionX0ef108c4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryTransactionEntryTransactionX0ef108c4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTreasuryTransaction = matchesTreasuryTransaction,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTreasuryTransaction) add("TreasuryTransaction: value does not match TreasuryTransaction")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
