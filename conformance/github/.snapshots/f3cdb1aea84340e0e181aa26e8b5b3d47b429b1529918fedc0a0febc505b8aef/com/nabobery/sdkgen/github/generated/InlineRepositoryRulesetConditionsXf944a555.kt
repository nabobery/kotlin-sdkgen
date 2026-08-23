package com.nabobery.sdkgen.github.generated

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

public enum class InlineRepositoryRulesetConditionsXf944a555Branch {
  RepositoryRulesetConditions,
  OrgRulesetConditions,
}

public sealed class InlineRepositoryRulesetConditionsXf944a555DecodingException(
  message: String,
) : SerializationException(message)

public class InlineRepositoryRulesetConditionsXf944a555NoMatchException(
  message: String,
) : InlineRepositoryRulesetConditionsXf944a555DecodingException(message)

internal data class InlineRepositoryRulesetConditionsXf944a555Inspection(
  public val matchesRepositoryRulesetConditions: Boolean,
  public val matchesOrgRulesetConditions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesRepositoryRulesetConditions, matchesOrgRulesetConditions).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/conditions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/conditions
 */
@Serializable(with = InlineRepositoryRulesetConditionsXf944a555.Serializer::class)
public class InlineRepositoryRulesetConditionsXf944a555 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRepositoryRulesetConditionsXf944a555Inspection,
) {
  public val repositoryRulesetConditions: RepositoryRulesetConditionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRepositoryRulesetConditions) json.decodeFromJsonElement<RepositoryRulesetConditionsView>(raw) else null }

  public val orgRulesetConditions: OrgRulesetConditionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOrgRulesetConditions) json.decodeFromJsonElement<OrgRulesetConditionsView>(raw) else null }

  public val matchedBranches: Set<InlineRepositoryRulesetConditionsXf944a555Branch>
    get() = buildSet {
      if (inspection.matchesRepositoryRulesetConditions) add(InlineRepositoryRulesetConditionsXf944a555Branch.RepositoryRulesetConditions)
      if (inspection.matchesOrgRulesetConditions) add(InlineRepositoryRulesetConditionsXf944a555Branch.OrgRulesetConditions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRepositoryRulesetConditionsXf944a555 {
      val inspection = inspectInlineRepositoryRulesetConditionsXf944a555(raw)
      if (inspection.matchCount == 0) {
        throw InlineRepositoryRulesetConditionsXf944a555NoMatchException("InlineRepositoryRulesetConditionsXf944a555 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRepositoryRulesetConditionsXf944a555(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetConditionsXf944a555> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetConditionsXf944a555 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetConditionsXf944a555")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetConditionsXf944a555) {
      encoder.requireJsonEncoder("InlineRepositoryRulesetConditionsXf944a555").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRepositoryRulesetConditionsXf944a555(element: JsonElement): InlineRepositoryRulesetConditionsXf944a555Inspection {
  val raw = element as? JsonObject ?: return InlineRepositoryRulesetConditionsXf944a555Inspection(
    matchesRepositoryRulesetConditions = false,
    matchesOrgRulesetConditions = false,
    failures = listOf("RepositoryRulesetConditions: expected JSON object", "OrgRulesetConditions: expected JSON object"),
  )
  val matchesRepositoryRulesetConditions = true
  val matchesOrgRulesetConditions = true
  return InlineRepositoryRulesetConditionsXf944a555Inspection(
    matchesRepositoryRulesetConditions = matchesRepositoryRulesetConditions,
    matchesOrgRulesetConditions = matchesOrgRulesetConditions,
    failures = buildList {
      if (!matchesRepositoryRulesetConditions) add("RepositoryRulesetConditions: required properties  do not match their declared types")
      if (!matchesOrgRulesetConditions) add("OrgRulesetConditions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
