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

public enum class InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eBranch {
  IssuingAuthorizationAmountDetails,
}

public sealed class InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eNoMatchException(
  message: String,
) : InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eDecodingException(message)

internal data class InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eInspection(
  public val matchesIssuingAuthorizationAmountDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationAmountDetails).count { it }
}

/**
 * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
 * unit](https://docs.stripe.com/currencies#zero-decimal).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_pending_request/properties/amount_details
 */
@Serializable(with = InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e.Serializer::class)
public class InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eInspection,
) {
  public val issuingAuthorizationAmountDetails: IssuingAuthorizationAmountDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationAmountDetails) json.decodeFromJsonElement<IssuingAuthorizationAmountDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eBranch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationAmountDetails) add(InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eBranch.IssuingAuthorizationAmountDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e {
      val inspection = inspectInlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eNoMatchException("InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e(element: JsonElement): InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eInspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eInspection(
    matchesIssuingAuthorizationAmountDetails = false,
    failures = listOf("IssuingAuthorizationAmountDetails: expected JSON object"),
  )
  val matchesIssuingAuthorizationAmountDetails = true
  return InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6eInspection(
    matchesIssuingAuthorizationAmountDetails = matchesIssuingAuthorizationAmountDetails,
    failures = buildList {
      if (!matchesIssuingAuthorizationAmountDetails) add("IssuingAuthorizationAmountDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
