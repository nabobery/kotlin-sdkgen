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

public enum class InlineIssuingTransactionAmountDetailsX1f1f12caBranch {
  IssuingTransactionAmountDetails,
}

public sealed class InlineIssuingTransactionAmountDetailsX1f1f12caDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionAmountDetailsX1f1f12caNoMatchException(
  message: String,
) : InlineIssuingTransactionAmountDetailsX1f1f12caDecodingException(message)

internal data class InlineIssuingTransactionAmountDetailsX1f1f12caInspection(
  public val matchesIssuingTransactionAmountDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionAmountDetails).count { it }
}

/**
 * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
 * unit](https://docs.stripe.com/currencies#zero-decimal).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/amount_details
 */
@Serializable(with = InlineIssuingTransactionAmountDetailsX1f1f12ca.Serializer::class)
public class InlineIssuingTransactionAmountDetailsX1f1f12ca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionAmountDetailsX1f1f12caInspection,
) {
  public val issuingTransactionAmountDetails: IssuingTransactionAmountDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionAmountDetails) json.decodeFromJsonElement<IssuingTransactionAmountDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionAmountDetailsX1f1f12caBranch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionAmountDetails) add(InlineIssuingTransactionAmountDetailsX1f1f12caBranch.IssuingTransactionAmountDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionAmountDetailsX1f1f12ca {
      val inspection = inspectInlineIssuingTransactionAmountDetailsX1f1f12ca(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionAmountDetailsX1f1f12caNoMatchException("InlineIssuingTransactionAmountDetailsX1f1f12ca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionAmountDetailsX1f1f12ca(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingTransactionAmountDetailsX1f1f12ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionAmountDetailsX1f1f12ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionAmountDetailsX1f1f12ca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionAmountDetailsX1f1f12ca) {
      encoder.requireJsonEncoder("InlineIssuingTransactionAmountDetailsX1f1f12ca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionAmountDetailsX1f1f12ca(element: JsonElement): InlineIssuingTransactionAmountDetailsX1f1f12caInspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionAmountDetailsX1f1f12caInspection(
    matchesIssuingTransactionAmountDetails = false,
    failures = listOf("IssuingTransactionAmountDetails: expected JSON object"),
  )
  val matchesIssuingTransactionAmountDetails = true
  return InlineIssuingTransactionAmountDetailsX1f1f12caInspection(
    matchesIssuingTransactionAmountDetails = matchesIssuingTransactionAmountDetails,
    failures = buildList {
      if (!matchesIssuingTransactionAmountDetails) add("IssuingTransactionAmountDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
