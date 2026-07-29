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

public enum class InlinePersonUsCfpbDataRaceDetailsX44c61382Branch {
  PersonRaceDetails,
}

public sealed class InlinePersonUsCfpbDataRaceDetailsX44c61382DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePersonUsCfpbDataRaceDetailsX44c61382NoMatchException(
  message: String,
) : InlinePersonUsCfpbDataRaceDetailsX44c61382DecodingException(message)

internal data class InlinePersonUsCfpbDataRaceDetailsX44c61382Inspection(
  public val matchesPersonRaceDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPersonRaceDetails).count { it }
}

/**
 * The persons race details
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_us_cfpb_data/properties/race_details
 */
@Serializable(with = InlinePersonUsCfpbDataRaceDetailsX44c61382.Serializer::class)
public class InlinePersonUsCfpbDataRaceDetailsX44c61382 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePersonUsCfpbDataRaceDetailsX44c61382Inspection,
) {
  public val personRaceDetails: PersonRaceDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPersonRaceDetails) json.decodeFromJsonElement<PersonRaceDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePersonUsCfpbDataRaceDetailsX44c61382Branch>
    get() = buildSet {
      if (inspection.matchesPersonRaceDetails) add(InlinePersonUsCfpbDataRaceDetailsX44c61382Branch.PersonRaceDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePersonUsCfpbDataRaceDetailsX44c61382 {
      val inspection = inspectInlinePersonUsCfpbDataRaceDetailsX44c61382(raw)
      if (inspection.matchCount == 0) {
        throw InlinePersonUsCfpbDataRaceDetailsX44c61382NoMatchException("InlinePersonUsCfpbDataRaceDetailsX44c61382 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePersonUsCfpbDataRaceDetailsX44c61382(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePersonUsCfpbDataRaceDetailsX44c61382> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePersonUsCfpbDataRaceDetailsX44c61382 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePersonUsCfpbDataRaceDetailsX44c61382")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePersonUsCfpbDataRaceDetailsX44c61382) {
      encoder.requireJsonEncoder("InlinePersonUsCfpbDataRaceDetailsX44c61382").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePersonUsCfpbDataRaceDetailsX44c61382(element: JsonElement): InlinePersonUsCfpbDataRaceDetailsX44c61382Inspection {
  val raw = element as? JsonObject ?: return InlinePersonUsCfpbDataRaceDetailsX44c61382Inspection(
    matchesPersonRaceDetails = false,
    failures = listOf("PersonRaceDetails: expected JSON object"),
  )
  val matchesPersonRaceDetails = true
  return InlinePersonUsCfpbDataRaceDetailsX44c61382Inspection(
    matchesPersonRaceDetails = matchesPersonRaceDetails,
    failures = buildList {
      if (!matchesPersonRaceDetails) add("PersonRaceDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
