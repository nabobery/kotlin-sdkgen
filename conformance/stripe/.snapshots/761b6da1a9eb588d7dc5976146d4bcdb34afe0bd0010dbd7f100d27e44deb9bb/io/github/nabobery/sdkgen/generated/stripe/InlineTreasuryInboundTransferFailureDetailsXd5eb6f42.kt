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

public enum class InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Branch {
  TreasuryInboundTransfersResourceFailureDetails,
}

public sealed class InlineTreasuryInboundTransferFailureDetailsXd5eb6f42DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryInboundTransferFailureDetailsXd5eb6f42NoMatchException(
  message: String,
) : InlineTreasuryInboundTransferFailureDetailsXd5eb6f42DecodingException(message)

internal data class InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Inspection(
  public val matchesTreasuryInboundTransfersResourceFailureDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryInboundTransfersResourceFailureDetails).count { it }
}

/**
 * Details about this InboundTransfer's failure. Only set when status is `failed`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.inbound_transfer/properties/failure_details
 */
@Serializable(with = InlineTreasuryInboundTransferFailureDetailsXd5eb6f42.Serializer::class)
public class InlineTreasuryInboundTransferFailureDetailsXd5eb6f42 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Inspection,
) {
  public val treasuryInboundTransfersResourceFailureDetails:
      TreasuryInboundTransfersResourceFailureDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryInboundTransfersResourceFailureDetails) json.decodeFromJsonElement<TreasuryInboundTransfersResourceFailureDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Branch>
    get() = buildSet {
      if (inspection.matchesTreasuryInboundTransfersResourceFailureDetails) add(InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Branch.TreasuryInboundTransfersResourceFailureDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryInboundTransferFailureDetailsXd5eb6f42 {
      val inspection = inspectInlineTreasuryInboundTransferFailureDetailsXd5eb6f42(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryInboundTransferFailureDetailsXd5eb6f42NoMatchException("InlineTreasuryInboundTransferFailureDetailsXd5eb6f42 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryInboundTransferFailureDetailsXd5eb6f42(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryInboundTransferFailureDetailsXd5eb6f42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryInboundTransferFailureDetailsXd5eb6f42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryInboundTransferFailureDetailsXd5eb6f42")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryInboundTransferFailureDetailsXd5eb6f42) {
      encoder.requireJsonEncoder("InlineTreasuryInboundTransferFailureDetailsXd5eb6f42").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryInboundTransferFailureDetailsXd5eb6f42(element: JsonElement): InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Inspection {
  val raw = element as? JsonObject ?: return InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Inspection(
    matchesTreasuryInboundTransfersResourceFailureDetails = false,
    failures = listOf("TreasuryInboundTransfersResourceFailureDetails: expected JSON object"),
  )
  val matchesTreasuryInboundTransfersResourceFailureDetails = raw["code"] != null
  return InlineTreasuryInboundTransferFailureDetailsXd5eb6f42Inspection(
    matchesTreasuryInboundTransfersResourceFailureDetails = matchesTreasuryInboundTransfersResourceFailureDetails,
    failures = buildList {
      if (!matchesTreasuryInboundTransfersResourceFailureDetails) add("TreasuryInboundTransfersResourceFailureDetails: required properties 'code' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
