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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Branch {
  IssuingTransactionFleetData,
}

public sealed class InlineIssuingTransactionPurchaseDetailsFleetXf3299b90DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionPurchaseDetailsFleetXf3299b90NoMatchException(
  message: String,
) : InlineIssuingTransactionPurchaseDetailsFleetXf3299b90DecodingException(message)

internal data class InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Inspection(
  public val matchesIssuingTransactionFleetData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionFleetData).count { it }
}

/**
 * Fleet-specific information for transactions using Fleet cards.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_purchase_details/properties/fleet
 */
@Serializable(with = InlineIssuingTransactionPurchaseDetailsFleetXf3299b90.Serializer::class)
public class InlineIssuingTransactionPurchaseDetailsFleetXf3299b90 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Inspection,
) {
  public val issuingTransactionFleetData: IssuingTransactionFleetDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionFleetData) json.decodeFromJsonElement<IssuingTransactionFleetDataView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Branch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionFleetData) add(InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Branch.IssuingTransactionFleetData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionPurchaseDetailsFleetXf3299b90 {
      val inspection = inspectInlineIssuingTransactionPurchaseDetailsFleetXf3299b90(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionPurchaseDetailsFleetXf3299b90NoMatchException("InlineIssuingTransactionPurchaseDetailsFleetXf3299b90 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionPurchaseDetailsFleetXf3299b90(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionPurchaseDetailsFleetXf3299b90> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionPurchaseDetailsFleetXf3299b90 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionPurchaseDetailsFleetXf3299b90")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionPurchaseDetailsFleetXf3299b90) {
      encoder.requireJsonEncoder("InlineIssuingTransactionPurchaseDetailsFleetXf3299b90").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionPurchaseDetailsFleetXf3299b90(element: JsonElement): InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Inspection(
    matchesIssuingTransactionFleetData = false,
    failures = listOf("IssuingTransactionFleetData: expected JSON object"),
  )
  val matchesIssuingTransactionFleetData = true
  return InlineIssuingTransactionPurchaseDetailsFleetXf3299b90Inspection(
    matchesIssuingTransactionFleetData = matchesIssuingTransactionFleetData,
    failures = buildList {
      if (!matchesIssuingTransactionFleetData) add("IssuingTransactionFleetData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
