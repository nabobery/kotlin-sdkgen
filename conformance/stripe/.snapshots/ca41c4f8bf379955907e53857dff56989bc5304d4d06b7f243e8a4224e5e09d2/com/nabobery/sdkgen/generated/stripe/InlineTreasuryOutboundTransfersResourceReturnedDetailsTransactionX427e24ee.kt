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

public enum class InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeBranch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeNoMatchException(
  message: String,
) : InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeDecodingException(message)

internal data class InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeInspection(
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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_transfers_resource_returned_details/properties/tra
 * nsaction
 */
@Serializable(with = InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee.Serializer::class)
public class InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches:
      Set<InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeBranch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeBranch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee {
      val inspection = inspectInlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeNoMatchException("InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee(element: JsonElement): InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24eeInspection(
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
