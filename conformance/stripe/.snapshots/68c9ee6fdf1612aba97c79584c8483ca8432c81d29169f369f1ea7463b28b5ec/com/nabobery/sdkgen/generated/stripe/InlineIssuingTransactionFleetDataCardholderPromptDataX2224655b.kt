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

public enum class InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bBranch {
  IssuingTransactionFleetCardholderPromptData,
}

public sealed class InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bNoMatchException(
  message: String,
) : InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bDecodingException(message)

internal data class InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bInspection(
  public val matchesIssuingTransactionFleetCardholderPromptData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionFleetCardholderPromptData).count { it }
}

/**
 * Answers to prompts presented to cardholder at point of sale.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_data/properties/cardholder_prompt_data
 */
@Serializable(with = InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b.Serializer::class)
public class InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bInspection,
) {
  public val issuingTransactionFleetCardholderPromptData:
      IssuingTransactionFleetCardholderPromptDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionFleetCardholderPromptData) json.decodeFromJsonElement<IssuingTransactionFleetCardholderPromptDataView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bBranch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionFleetCardholderPromptData) add(InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bBranch.IssuingTransactionFleetCardholderPromptData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b {
      val inspection = inspectInlineIssuingTransactionFleetDataCardholderPromptDataX2224655b(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bNoMatchException("InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b) {
      encoder.requireJsonEncoder("InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionFleetDataCardholderPromptDataX2224655b(element: JsonElement): InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bInspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bInspection(
    matchesIssuingTransactionFleetCardholderPromptData = false,
    failures = listOf("IssuingTransactionFleetCardholderPromptData: expected JSON object"),
  )
  val matchesIssuingTransactionFleetCardholderPromptData = true
  return InlineIssuingTransactionFleetDataCardholderPromptDataX2224655bInspection(
    matchesIssuingTransactionFleetCardholderPromptData = matchesIssuingTransactionFleetCardholderPromptData,
    failures = buildList {
      if (!matchesIssuingTransactionFleetCardholderPromptData) add("IssuingTransactionFleetCardholderPromptData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
