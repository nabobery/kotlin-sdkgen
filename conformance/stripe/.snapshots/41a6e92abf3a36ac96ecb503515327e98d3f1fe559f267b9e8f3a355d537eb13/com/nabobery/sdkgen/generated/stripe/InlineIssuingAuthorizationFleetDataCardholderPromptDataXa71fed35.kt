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

public enum class InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Branch {
  IssuingAuthorizationFleetCardholderPromptData,
}

public sealed class InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35NoMatchException(
  message: String,
) : InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35DecodingException(message)

internal data class InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Inspection(
  public val matchesIssuingAuthorizationFleetCardholderPromptData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationFleetCardholderPromptData).count { it }
}

/**
 * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary depending on the
 * configuration of your physical fleet cards. Typical points of sale support only numeric entry.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_data/properties/cardholder_prompt_data
 */
@Serializable(with = InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35.Serializer::class)
public class InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Inspection,
) {
  public val issuingAuthorizationFleetCardholderPromptData:
      IssuingAuthorizationFleetCardholderPromptDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationFleetCardholderPromptData) json.decodeFromJsonElement<IssuingAuthorizationFleetCardholderPromptDataView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Branch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationFleetCardholderPromptData) add(InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Branch.IssuingAuthorizationFleetCardholderPromptData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35 {
      val inspection = inspectInlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35NoMatchException("InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35(element: JsonElement): InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Inspection(
    matchesIssuingAuthorizationFleetCardholderPromptData = false,
    failures = listOf("IssuingAuthorizationFleetCardholderPromptData: expected JSON object"),
  )
  val matchesIssuingAuthorizationFleetCardholderPromptData = true
  return InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35Inspection(
    matchesIssuingAuthorizationFleetCardholderPromptData = matchesIssuingAuthorizationFleetCardholderPromptData,
    failures = buildList {
      if (!matchesIssuingAuthorizationFleetCardholderPromptData) add("IssuingAuthorizationFleetCardholderPromptData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
