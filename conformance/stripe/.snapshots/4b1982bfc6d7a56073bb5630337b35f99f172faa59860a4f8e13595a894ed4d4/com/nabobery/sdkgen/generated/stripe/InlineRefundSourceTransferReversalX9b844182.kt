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

public enum class InlineRefundSourceTransferReversalX9b844182Branch {
  Branch1,
  TransferReversal,
}

public sealed class InlineRefundSourceTransferReversalX9b844182DecodingException(
  message: String,
) : SerializationException(message)

public class InlineRefundSourceTransferReversalX9b844182NoMatchException(
  message: String,
) : InlineRefundSourceTransferReversalX9b844182DecodingException(message)

internal data class InlineRefundSourceTransferReversalX9b844182Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTransferReversal: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTransferReversal).count { it }
}

/**
 * The transfer reversal that's associated with the refund. Only present if the charge came from another Stripe account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/source_transfer_reversal
 */
@Serializable(with = InlineRefundSourceTransferReversalX9b844182.Serializer::class)
public class InlineRefundSourceTransferReversalX9b844182 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRefundSourceTransferReversalX9b844182Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val transferReversal: TransferReversal? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTransferReversal) json.decodeFromJsonElement<TransferReversal>(raw) else null }

  public val matchedBranches: Set<InlineRefundSourceTransferReversalX9b844182Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineRefundSourceTransferReversalX9b844182Branch.Branch1)
      if (inspection.matchesTransferReversal) add(InlineRefundSourceTransferReversalX9b844182Branch.TransferReversal)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRefundSourceTransferReversalX9b844182 {
      val inspection = inspectInlineRefundSourceTransferReversalX9b844182(raw)
      if (inspection.matchCount == 0) {
        throw InlineRefundSourceTransferReversalX9b844182NoMatchException("InlineRefundSourceTransferReversalX9b844182 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRefundSourceTransferReversalX9b844182(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineRefundSourceTransferReversalX9b844182> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRefundSourceTransferReversalX9b844182 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRefundSourceTransferReversalX9b844182")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRefundSourceTransferReversalX9b844182) {
      encoder.requireJsonEncoder("InlineRefundSourceTransferReversalX9b844182").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRefundSourceTransferReversalX9b844182(element: JsonElement): InlineRefundSourceTransferReversalX9b844182Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTransferReversal = element.isJsonDecodable<TransferReversal>()
  return InlineRefundSourceTransferReversalX9b844182Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTransferReversal = matchesTransferReversal,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTransferReversal) add("TransferReversal: value does not match TransferReversal")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
