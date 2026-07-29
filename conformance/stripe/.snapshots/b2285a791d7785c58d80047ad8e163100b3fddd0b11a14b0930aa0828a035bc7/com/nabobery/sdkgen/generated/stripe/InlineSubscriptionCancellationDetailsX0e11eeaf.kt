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

public enum class InlineSubscriptionCancellationDetailsX0e11eeafBranch {
  CancellationDetails,
}

public sealed class InlineSubscriptionCancellationDetailsX0e11eeafDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionCancellationDetailsX0e11eeafNoMatchException(
  message: String,
) : InlineSubscriptionCancellationDetailsX0e11eeafDecodingException(message)

internal data class InlineSubscriptionCancellationDetailsX0e11eeafInspection(
  public val matchesCancellationDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCancellationDetails).count { it }
}

/**
 * Details about why this subscription was cancelled
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/cancellation_details
 */
@Serializable(with = InlineSubscriptionCancellationDetailsX0e11eeaf.Serializer::class)
public class InlineSubscriptionCancellationDetailsX0e11eeaf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionCancellationDetailsX0e11eeafInspection,
) {
  public val cancellationDetails: CancellationDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCancellationDetails) json.decodeFromJsonElement<CancellationDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionCancellationDetailsX0e11eeafBranch>
    get() = buildSet {
      if (inspection.matchesCancellationDetails) add(InlineSubscriptionCancellationDetailsX0e11eeafBranch.CancellationDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionCancellationDetailsX0e11eeaf {
      val inspection = inspectInlineSubscriptionCancellationDetailsX0e11eeaf(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionCancellationDetailsX0e11eeafNoMatchException("InlineSubscriptionCancellationDetailsX0e11eeaf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionCancellationDetailsX0e11eeaf(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionCancellationDetailsX0e11eeaf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionCancellationDetailsX0e11eeaf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionCancellationDetailsX0e11eeaf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionCancellationDetailsX0e11eeaf) {
      encoder.requireJsonEncoder("InlineSubscriptionCancellationDetailsX0e11eeaf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionCancellationDetailsX0e11eeaf(element: JsonElement): InlineSubscriptionCancellationDetailsX0e11eeafInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionCancellationDetailsX0e11eeafInspection(
    matchesCancellationDetails = false,
    failures = listOf("CancellationDetails: expected JSON object"),
  )
  val matchesCancellationDetails = true
  return InlineSubscriptionCancellationDetailsX0e11eeafInspection(
    matchesCancellationDetails = matchesCancellationDetails,
    failures = buildList {
      if (!matchesCancellationDetails) add("CancellationDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
