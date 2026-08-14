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

public enum class InlineTreasuryInboundTransferTransactionX08b12581Branch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryInboundTransferTransactionX08b12581DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryInboundTransferTransactionX08b12581NoMatchException(
  message: String,
) : InlineTreasuryInboundTransferTransactionX08b12581DecodingException(message)

internal data class InlineTreasuryInboundTransferTransactionX08b12581Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.inbound_transfer/properties/transaction
 */
@Serializable(with = InlineTreasuryInboundTransferTransactionX08b12581.Serializer::class)
public class InlineTreasuryInboundTransferTransactionX08b12581 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryInboundTransferTransactionX08b12581Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryInboundTransferTransactionX08b12581Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryInboundTransferTransactionX08b12581Branch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryInboundTransferTransactionX08b12581Branch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryInboundTransferTransactionX08b12581 {
      val inspection = inspectInlineTreasuryInboundTransferTransactionX08b12581(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryInboundTransferTransactionX08b12581NoMatchException("InlineTreasuryInboundTransferTransactionX08b12581 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryInboundTransferTransactionX08b12581(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryInboundTransferTransactionX08b12581> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryInboundTransferTransactionX08b12581 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryInboundTransferTransactionX08b12581")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryInboundTransferTransactionX08b12581) {
      encoder.requireJsonEncoder("InlineTreasuryInboundTransferTransactionX08b12581").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryInboundTransferTransactionX08b12581(element: JsonElement): InlineTreasuryInboundTransferTransactionX08b12581Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryInboundTransferTransactionX08b12581Inspection(
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
