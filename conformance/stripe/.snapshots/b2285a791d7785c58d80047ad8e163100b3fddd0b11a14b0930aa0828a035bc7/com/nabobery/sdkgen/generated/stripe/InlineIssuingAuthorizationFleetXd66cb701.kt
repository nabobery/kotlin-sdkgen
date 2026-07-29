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

public enum class InlineIssuingAuthorizationFleetXd66cb701Branch {
  IssuingAuthorizationFleetData,
}

public sealed class InlineIssuingAuthorizationFleetXd66cb701DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationFleetXd66cb701NoMatchException(
  message: String,
) : InlineIssuingAuthorizationFleetXd66cb701DecodingException(message)

internal data class InlineIssuingAuthorizationFleetXd66cb701Inspection(
  public val matchesIssuingAuthorizationFleetData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationFleetData).count { it }
}

/**
 * Fleet-specific information for authorizations using Fleet cards.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/fleet
 */
@Serializable(with = InlineIssuingAuthorizationFleetXd66cb701.Serializer::class)
public class InlineIssuingAuthorizationFleetXd66cb701 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationFleetXd66cb701Inspection,
) {
  public val issuingAuthorizationFleetData: IssuingAuthorizationFleetDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationFleetData) json.decodeFromJsonElement<IssuingAuthorizationFleetDataView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingAuthorizationFleetXd66cb701Branch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationFleetData) add(InlineIssuingAuthorizationFleetXd66cb701Branch.IssuingAuthorizationFleetData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationFleetXd66cb701 {
      val inspection = inspectInlineIssuingAuthorizationFleetXd66cb701(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationFleetXd66cb701NoMatchException("InlineIssuingAuthorizationFleetXd66cb701 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationFleetXd66cb701(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingAuthorizationFleetXd66cb701> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetXd66cb701 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationFleetXd66cb701")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFleetXd66cb701) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationFleetXd66cb701").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationFleetXd66cb701(element: JsonElement): InlineIssuingAuthorizationFleetXd66cb701Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationFleetXd66cb701Inspection(
    matchesIssuingAuthorizationFleetData = false,
    failures = listOf("IssuingAuthorizationFleetData: expected JSON object"),
  )
  val matchesIssuingAuthorizationFleetData = true
  return InlineIssuingAuthorizationFleetXd66cb701Inspection(
    matchesIssuingAuthorizationFleetData = matchesIssuingAuthorizationFleetData,
    failures = buildList {
      if (!matchesIssuingAuthorizationFleetData) add("IssuingAuthorizationFleetData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
