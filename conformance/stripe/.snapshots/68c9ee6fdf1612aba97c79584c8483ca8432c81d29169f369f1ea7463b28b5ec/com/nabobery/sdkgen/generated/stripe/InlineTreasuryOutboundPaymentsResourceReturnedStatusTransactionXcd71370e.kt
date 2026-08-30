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

public enum class InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eBranch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eNoMatchException(
  message: String,
) : InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eDecodingException(message)

internal data class InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_payments_resource_returned_status/properties/trans
 * action
 */
@Serializable(with = InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e.Serializer::class)
public class InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches:
      Set<InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eBranch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eBranch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e {
      val inspection = inspectInlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eNoMatchException("InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e(element: JsonElement): InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370eInspection(
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
