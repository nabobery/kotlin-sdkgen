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

public enum class InlineTreasuryCreditReversalTransactionXa5ee8634Branch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryCreditReversalTransactionXa5ee8634DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryCreditReversalTransactionXa5ee8634NoMatchException(
  message: String,
) : InlineTreasuryCreditReversalTransactionXa5ee8634DecodingException(message)

internal data class InlineTreasuryCreditReversalTransactionXa5ee8634Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.credit_reversal/properties/transaction
 */
@Serializable(with = InlineTreasuryCreditReversalTransactionXa5ee8634.Serializer::class)
public class InlineTreasuryCreditReversalTransactionXa5ee8634 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryCreditReversalTransactionXa5ee8634Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryCreditReversalTransactionXa5ee8634Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryCreditReversalTransactionXa5ee8634Branch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryCreditReversalTransactionXa5ee8634Branch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryCreditReversalTransactionXa5ee8634 {
      val inspection = inspectInlineTreasuryCreditReversalTransactionXa5ee8634(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryCreditReversalTransactionXa5ee8634NoMatchException("InlineTreasuryCreditReversalTransactionXa5ee8634 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryCreditReversalTransactionXa5ee8634(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryCreditReversalTransactionXa5ee8634> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryCreditReversalTransactionXa5ee8634 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryCreditReversalTransactionXa5ee8634")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryCreditReversalTransactionXa5ee8634) {
      encoder.requireJsonEncoder("InlineTreasuryCreditReversalTransactionXa5ee8634").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryCreditReversalTransactionXa5ee8634(element: JsonElement): InlineTreasuryCreditReversalTransactionXa5ee8634Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryCreditReversalTransactionXa5ee8634Inspection(
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
