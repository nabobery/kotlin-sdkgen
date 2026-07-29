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

public enum class InlineIssuingCardholderIndividualXb90844efBranch {
  IssuingCardholderIndividual,
}

public sealed class InlineIssuingCardholderIndividualXb90844efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderIndividualXb90844efNoMatchException(
  message: String,
) : InlineIssuingCardholderIndividualXb90844efDecodingException(message)

internal data class InlineIssuingCardholderIndividualXb90844efInspection(
  public val matchesIssuingCardholderIndividual: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardholderIndividual).count { it }
}

/**
 * Additional information about an `individual` cardholder.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/individual
 */
@Serializable(with = InlineIssuingCardholderIndividualXb90844ef.Serializer::class)
public class InlineIssuingCardholderIndividualXb90844ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderIndividualXb90844efInspection,
) {
  public val issuingCardholderIndividual: IssuingCardholderIndividualView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholderIndividual) json.decodeFromJsonElement<IssuingCardholderIndividualView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardholderIndividualXb90844efBranch>
    get() = buildSet {
      if (inspection.matchesIssuingCardholderIndividual) add(InlineIssuingCardholderIndividualXb90844efBranch.IssuingCardholderIndividual)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderIndividualXb90844ef {
      val inspection = inspectInlineIssuingCardholderIndividualXb90844ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderIndividualXb90844efNoMatchException("InlineIssuingCardholderIndividualXb90844ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderIndividualXb90844ef(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderIndividualXb90844ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderIndividualXb90844ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderIndividualXb90844ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderIndividualXb90844ef) {
      encoder.requireJsonEncoder("InlineIssuingCardholderIndividualXb90844ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderIndividualXb90844ef(element: JsonElement): InlineIssuingCardholderIndividualXb90844efInspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardholderIndividualXb90844efInspection(
    matchesIssuingCardholderIndividual = false,
    failures = listOf("IssuingCardholderIndividual: expected JSON object"),
  )
  val matchesIssuingCardholderIndividual = true
  return InlineIssuingCardholderIndividualXb90844efInspection(
    matchesIssuingCardholderIndividual = matchesIssuingCardholderIndividual,
    failures = buildList {
      if (!matchesIssuingCardholderIndividual) add("IssuingCardholderIndividual: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
