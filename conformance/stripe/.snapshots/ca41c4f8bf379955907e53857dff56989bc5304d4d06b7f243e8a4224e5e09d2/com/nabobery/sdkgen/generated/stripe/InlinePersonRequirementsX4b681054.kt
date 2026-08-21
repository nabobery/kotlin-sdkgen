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

public enum class InlinePersonRequirementsX4b681054Branch {
  PersonRequirements,
}

public sealed class InlinePersonRequirementsX4b681054DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePersonRequirementsX4b681054NoMatchException(
  message: String,
) : InlinePersonRequirementsX4b681054DecodingException(message)

internal data class InlinePersonRequirementsX4b681054Inspection(
  public val matchesPersonRequirements: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPersonRequirements).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/person/properties/requirements.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person/properties/requirements
 */
@Serializable(with = InlinePersonRequirementsX4b681054.Serializer::class)
public class InlinePersonRequirementsX4b681054 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePersonRequirementsX4b681054Inspection,
) {
  public val personRequirements: PersonRequirementsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPersonRequirements) json.decodeFromJsonElement<PersonRequirementsView>(raw) else null }

  public val matchedBranches: Set<InlinePersonRequirementsX4b681054Branch>
    get() = buildSet {
      if (inspection.matchesPersonRequirements) add(InlinePersonRequirementsX4b681054Branch.PersonRequirements)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePersonRequirementsX4b681054 {
      val inspection = inspectInlinePersonRequirementsX4b681054(raw)
      if (inspection.matchCount == 0) {
        throw InlinePersonRequirementsX4b681054NoMatchException("InlinePersonRequirementsX4b681054 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePersonRequirementsX4b681054(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePersonRequirementsX4b681054> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePersonRequirementsX4b681054 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePersonRequirementsX4b681054")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePersonRequirementsX4b681054) {
      encoder.requireJsonEncoder("InlinePersonRequirementsX4b681054").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePersonRequirementsX4b681054(element: JsonElement): InlinePersonRequirementsX4b681054Inspection {
  val raw = element as? JsonObject ?: return InlinePersonRequirementsX4b681054Inspection(
    matchesPersonRequirements = false,
    failures = listOf("PersonRequirements: expected JSON object"),
  )
  val matchesPersonRequirements = raw["currently_due"].isStringArray() && raw["errors"] != null && raw["eventually_due"].isStringArray() && raw["past_due"].isStringArray() && raw["pending_verification"].isStringArray()
  return InlinePersonRequirementsX4b681054Inspection(
    matchesPersonRequirements = matchesPersonRequirements,
    failures = buildList {
      if (!matchesPersonRequirements) add("PersonRequirements: required properties 'currently_due', 'errors', 'eventually_due', 'past_due', 'pending_verification' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
