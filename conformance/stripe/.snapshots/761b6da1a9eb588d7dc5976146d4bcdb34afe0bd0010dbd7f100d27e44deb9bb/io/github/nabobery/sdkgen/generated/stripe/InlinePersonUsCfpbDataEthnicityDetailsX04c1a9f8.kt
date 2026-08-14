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

public enum class InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Branch {
  PersonEthnicityDetails,
}

public sealed class InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8NoMatchException(
  message: String,
) : InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8DecodingException(message)

internal data class InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Inspection(
  public val matchesPersonEthnicityDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPersonEthnicityDetails).count { it }
}

/**
 * The persons ethnicity details
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_us_cfpb_data/properties/ethnicity_details
 */
@Serializable(with = InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8.Serializer::class)
public class InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Inspection,
) {
  public val personEthnicityDetails: PersonEthnicityDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPersonEthnicityDetails) json.decodeFromJsonElement<PersonEthnicityDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Branch>
    get() = buildSet {
      if (inspection.matchesPersonEthnicityDetails) add(InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Branch.PersonEthnicityDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8 {
      val inspection = inspectInlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8(raw)
      if (inspection.matchCount == 0) {
        throw InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8NoMatchException("InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8) {
      encoder.requireJsonEncoder("InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8(element: JsonElement): InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Inspection {
  val raw = element as? JsonObject ?: return InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Inspection(
    matchesPersonEthnicityDetails = false,
    failures = listOf("PersonEthnicityDetails: expected JSON object"),
  )
  val matchesPersonEthnicityDetails = true
  return InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8Inspection(
    matchesPersonEthnicityDetails = matchesPersonEthnicityDetails,
    failures = buildList {
      if (!matchesPersonEthnicityDetails) add("PersonEthnicityDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
