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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineTreasuryOutboundTransferReturnedDetailsXab1a286eBranch {
  TreasuryOutboundTransfersResourceReturnedDetails,
}

public sealed class InlineTreasuryOutboundTransferReturnedDetailsXab1a286eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundTransferReturnedDetailsXab1a286eNoMatchException(
  message: String,
) : InlineTreasuryOutboundTransferReturnedDetailsXab1a286eDecodingException(message)

internal data class InlineTreasuryOutboundTransferReturnedDetailsXab1a286eInspection(
  public val matchesTreasuryOutboundTransfersResourceReturnedDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryOutboundTransfersResourceReturnedDetails).count { it }
}

/**
 * Details about a returned OutboundTransfer. Only set when the status is `returned`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_transfer/properties/returned_details
 */
@Serializable(with = InlineTreasuryOutboundTransferReturnedDetailsXab1a286e.Serializer::class)
public class InlineTreasuryOutboundTransferReturnedDetailsXab1a286e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryOutboundTransferReturnedDetailsXab1a286eInspection,
) {
  public val treasuryOutboundTransfersResourceReturnedDetails:
      TreasuryOutboundTransfersResourceReturnedDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryOutboundTransfersResourceReturnedDetails) json.decodeFromJsonElement<TreasuryOutboundTransfersResourceReturnedDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryOutboundTransferReturnedDetailsXab1a286eBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryOutboundTransfersResourceReturnedDetails) add(InlineTreasuryOutboundTransferReturnedDetailsXab1a286eBranch.TreasuryOutboundTransfersResourceReturnedDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundTransferReturnedDetailsXab1a286e {
      val inspection = inspectInlineTreasuryOutboundTransferReturnedDetailsXab1a286e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundTransferReturnedDetailsXab1a286eNoMatchException("InlineTreasuryOutboundTransferReturnedDetailsXab1a286e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundTransferReturnedDetailsXab1a286e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundTransferReturnedDetailsXab1a286e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTransferReturnedDetailsXab1a286e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundTransferReturnedDetailsXab1a286e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundTransferReturnedDetailsXab1a286e) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundTransferReturnedDetailsXab1a286e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundTransferReturnedDetailsXab1a286e(element: JsonElement): InlineTreasuryOutboundTransferReturnedDetailsXab1a286eInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryOutboundTransferReturnedDetailsXab1a286eInspection(
    matchesTreasuryOutboundTransfersResourceReturnedDetails = false,
    failures = listOf("TreasuryOutboundTransfersResourceReturnedDetails: expected JSON object"),
  )
  val matchesTreasuryOutboundTransfersResourceReturnedDetails = raw["code"] != null && raw["transaction"] != null
  return InlineTreasuryOutboundTransferReturnedDetailsXab1a286eInspection(
    matchesTreasuryOutboundTransfersResourceReturnedDetails = matchesTreasuryOutboundTransfersResourceReturnedDetails,
    failures = buildList {
      if (!matchesTreasuryOutboundTransfersResourceReturnedDetails) add("TreasuryOutboundTransfersResourceReturnedDetails: required properties 'code', 'transaction' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
