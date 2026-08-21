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

public enum class InlineIssuingTransactionPurchaseDetailsXd6983dcaBranch {
  IssuingTransactionPurchaseDetails,
}

public sealed class InlineIssuingTransactionPurchaseDetailsXd6983dcaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionPurchaseDetailsXd6983dcaNoMatchException(
  message: String,
) : InlineIssuingTransactionPurchaseDetailsXd6983dcaDecodingException(message)

internal data class InlineIssuingTransactionPurchaseDetailsXd6983dcaInspection(
  public val matchesIssuingTransactionPurchaseDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionPurchaseDetails).count { it }
}

/**
 * Additional purchase information that is optionally provided by the merchant.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/purchase_details
 */
@Serializable(with = InlineIssuingTransactionPurchaseDetailsXd6983dca.Serializer::class)
public class InlineIssuingTransactionPurchaseDetailsXd6983dca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionPurchaseDetailsXd6983dcaInspection,
) {
  public val issuingTransactionPurchaseDetails: IssuingTransactionPurchaseDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionPurchaseDetails) json.decodeFromJsonElement<IssuingTransactionPurchaseDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionPurchaseDetailsXd6983dcaBranch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionPurchaseDetails) add(InlineIssuingTransactionPurchaseDetailsXd6983dcaBranch.IssuingTransactionPurchaseDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionPurchaseDetailsXd6983dca {
      val inspection = inspectInlineIssuingTransactionPurchaseDetailsXd6983dca(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionPurchaseDetailsXd6983dcaNoMatchException("InlineIssuingTransactionPurchaseDetailsXd6983dca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionPurchaseDetailsXd6983dca(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionPurchaseDetailsXd6983dca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionPurchaseDetailsXd6983dca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionPurchaseDetailsXd6983dca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionPurchaseDetailsXd6983dca) {
      encoder.requireJsonEncoder("InlineIssuingTransactionPurchaseDetailsXd6983dca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionPurchaseDetailsXd6983dca(element: JsonElement): InlineIssuingTransactionPurchaseDetailsXd6983dcaInspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionPurchaseDetailsXd6983dcaInspection(
    matchesIssuingTransactionPurchaseDetails = false,
    failures = listOf("IssuingTransactionPurchaseDetails: expected JSON object"),
  )
  val matchesIssuingTransactionPurchaseDetails = true
  return InlineIssuingTransactionPurchaseDetailsXd6983dcaInspection(
    matchesIssuingTransactionPurchaseDetails = matchesIssuingTransactionPurchaseDetails,
    failures = buildList {
      if (!matchesIssuingTransactionPurchaseDetails) add("IssuingTransactionPurchaseDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
