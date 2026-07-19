package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueNoMatchException(
  message: String,
) : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueDecodingException(message)

internal data class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/rules/items/properties/value
 * .
 */
@Serializable(with = InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue
  .Serializer::class)
public class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<Double>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesBranch1) add(InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueBranch.Branch1)
      if (inspection
























































                                                                                                                        .matchesBranch2) add(InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue {
      val inspection =
        inspectInlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueNoMatchException("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue(element: JsonElement): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  return InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValueInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
