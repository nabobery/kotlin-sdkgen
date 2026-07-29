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

public enum class InlineIssuingCardholderIndividualDobX7050b088Branch {
  IssuingCardholderIndividualDob,
}

public sealed class InlineIssuingCardholderIndividualDobX7050b088DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderIndividualDobX7050b088NoMatchException(
  message: String,
) : InlineIssuingCardholderIndividualDobX7050b088DecodingException(message)

internal data class InlineIssuingCardholderIndividualDobX7050b088Inspection(
  public val matchesIssuingCardholderIndividualDob: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardholderIndividualDob).count { it }
}

/**
 * The date of birth of this cardholder.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_individual/properties/dob
 */
@Serializable(with = InlineIssuingCardholderIndividualDobX7050b088.Serializer::class)
public class InlineIssuingCardholderIndividualDobX7050b088 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderIndividualDobX7050b088Inspection,
) {
  public val issuingCardholderIndividualDob: IssuingCardholderIndividualDobView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholderIndividualDob) json.decodeFromJsonElement<IssuingCardholderIndividualDobView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardholderIndividualDobX7050b088Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardholderIndividualDob) add(InlineIssuingCardholderIndividualDobX7050b088Branch.IssuingCardholderIndividualDob)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderIndividualDobX7050b088 {
      val inspection = inspectInlineIssuingCardholderIndividualDobX7050b088(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderIndividualDobX7050b088NoMatchException("InlineIssuingCardholderIndividualDobX7050b088 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderIndividualDobX7050b088(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderIndividualDobX7050b088> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderIndividualDobX7050b088 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderIndividualDobX7050b088")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderIndividualDobX7050b088) {
      encoder.requireJsonEncoder("InlineIssuingCardholderIndividualDobX7050b088").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderIndividualDobX7050b088(element: JsonElement): InlineIssuingCardholderIndividualDobX7050b088Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardholderIndividualDobX7050b088Inspection(
    matchesIssuingCardholderIndividualDob = false,
    failures = listOf("IssuingCardholderIndividualDob: expected JSON object"),
  )
  val matchesIssuingCardholderIndividualDob = true
  return InlineIssuingCardholderIndividualDobX7050b088Inspection(
    matchesIssuingCardholderIndividualDob = matchesIssuingCardholderIndividualDob,
    failures = buildList {
      if (!matchesIssuingCardholderIndividualDob) add("IssuingCardholderIndividualDob: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
