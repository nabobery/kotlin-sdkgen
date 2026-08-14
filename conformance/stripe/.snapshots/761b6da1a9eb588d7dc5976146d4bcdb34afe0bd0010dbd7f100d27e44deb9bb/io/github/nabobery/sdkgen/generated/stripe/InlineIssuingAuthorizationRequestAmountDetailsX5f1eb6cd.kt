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

public enum class InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdBranch {
  IssuingAuthorizationAmountDetails,
}

public sealed class InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdNoMatchException(
  message: String,
) : InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdDecodingException(message)

internal data class InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdInspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_request/properties/amount_details
 */
@Serializable(with = InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd.Serializer::class)
public class InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdInspection,
) {
  public val issuingAuthorizationAmountDetails: IssuingAuthorizationAmountDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationAmountDetails) json.decodeFromJsonElement<IssuingAuthorizationAmountDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdBranch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationAmountDetails) add(InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdBranch.IssuingAuthorizationAmountDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd {
      val inspection = inspectInlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdNoMatchException("InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd(element: JsonElement): InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdInspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdInspection(
    matchesIssuingAuthorizationAmountDetails = false,
    failures = listOf("IssuingAuthorizationAmountDetails: expected JSON object"),
  )
  val matchesIssuingAuthorizationAmountDetails = true
  return InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cdInspection(
    matchesIssuingAuthorizationAmountDetails = matchesIssuingAuthorizationAmountDetails,
    failures = buildList {
      if (!matchesIssuingAuthorizationAmountDetails) add("IssuingAuthorizationAmountDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
