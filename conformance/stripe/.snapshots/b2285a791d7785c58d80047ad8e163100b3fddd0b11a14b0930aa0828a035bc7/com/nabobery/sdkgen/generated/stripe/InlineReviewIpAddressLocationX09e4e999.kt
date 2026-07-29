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

public enum class InlineReviewIpAddressLocationX09e4e999Branch {
  RadarReviewResourceLocation,
}

public sealed class InlineReviewIpAddressLocationX09e4e999DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReviewIpAddressLocationX09e4e999NoMatchException(
  message: String,
) : InlineReviewIpAddressLocationX09e4e999DecodingException(message)

internal data class InlineReviewIpAddressLocationX09e4e999Inspection(
  public val matchesRadarReviewResourceLocation: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesRadarReviewResourceLocation).count { it }
}

/**
 * Information related to the location of the payment. Note that this information is an approximation and attempts to
 * locate the nearest population center - it should not be used to determine a specific address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/review/properties/ip_address_location
 */
@Serializable(with = InlineReviewIpAddressLocationX09e4e999.Serializer::class)
public class InlineReviewIpAddressLocationX09e4e999 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReviewIpAddressLocationX09e4e999Inspection,
) {
  public val radarReviewResourceLocation: RadarReviewResourceLocationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRadarReviewResourceLocation) json.decodeFromJsonElement<RadarReviewResourceLocationView>(raw) else null }

  public val matchedBranches: Set<InlineReviewIpAddressLocationX09e4e999Branch>
    get() = buildSet {
      if (inspection.matchesRadarReviewResourceLocation) add(InlineReviewIpAddressLocationX09e4e999Branch.RadarReviewResourceLocation)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReviewIpAddressLocationX09e4e999 {
      val inspection = inspectInlineReviewIpAddressLocationX09e4e999(raw)
      if (inspection.matchCount == 0) {
        throw InlineReviewIpAddressLocationX09e4e999NoMatchException("InlineReviewIpAddressLocationX09e4e999 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReviewIpAddressLocationX09e4e999(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineReviewIpAddressLocationX09e4e999> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReviewIpAddressLocationX09e4e999 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReviewIpAddressLocationX09e4e999")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReviewIpAddressLocationX09e4e999) {
      encoder.requireJsonEncoder("InlineReviewIpAddressLocationX09e4e999").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReviewIpAddressLocationX09e4e999(element: JsonElement): InlineReviewIpAddressLocationX09e4e999Inspection {
  val raw = element as? JsonObject ?: return InlineReviewIpAddressLocationX09e4e999Inspection(
    matchesRadarReviewResourceLocation = false,
    failures = listOf("RadarReviewResourceLocation: expected JSON object"),
  )
  val matchesRadarReviewResourceLocation = true
  return InlineReviewIpAddressLocationX09e4e999Inspection(
    matchesRadarReviewResourceLocation = matchesRadarReviewResourceLocation,
    failures = buildList {
      if (!matchesRadarReviewResourceLocation) add("RadarReviewResourceLocation: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
