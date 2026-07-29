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

public enum class InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Branch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryOutboundPaymentTransactionXdbbd9cc7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundPaymentTransactionXdbbd9cc7NoMatchException(
  message: String,
) : InlineTreasuryOutboundPaymentTransactionXdbbd9cc7DecodingException(message)

internal data class InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment/properties/transaction
 */
@Serializable(with = InlineTreasuryOutboundPaymentTransactionXdbbd9cc7.Serializer::class)
public class InlineTreasuryOutboundPaymentTransactionXdbbd9cc7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Branch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Branch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundPaymentTransactionXdbbd9cc7 {
      val inspection = inspectInlineTreasuryOutboundPaymentTransactionXdbbd9cc7(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundPaymentTransactionXdbbd9cc7NoMatchException("InlineTreasuryOutboundPaymentTransactionXdbbd9cc7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundPaymentTransactionXdbbd9cc7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryOutboundPaymentTransactionXdbbd9cc7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentTransactionXdbbd9cc7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundPaymentTransactionXdbbd9cc7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaymentTransactionXdbbd9cc7) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundPaymentTransactionXdbbd9cc7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundPaymentTransactionXdbbd9cc7(element: JsonElement): InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryOutboundPaymentTransactionXdbbd9cc7Inspection(
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
