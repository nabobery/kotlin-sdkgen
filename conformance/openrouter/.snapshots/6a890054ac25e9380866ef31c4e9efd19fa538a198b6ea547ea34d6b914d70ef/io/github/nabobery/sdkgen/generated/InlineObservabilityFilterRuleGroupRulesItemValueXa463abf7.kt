package io.github.nabobery.sdkgen.generated

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

public enum class InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Branch {
  Branch1,
  Branch2,
}

public sealed class InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7NoMatchException(
  message: String,
) : InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7DecodingException(message)

internal data class InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Inspection(
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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/rules/items/properties/value
 */
@Serializable(with = InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7.Serializer::class)
public class InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val matchedBranches: Set<InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7 {
      val inspection = inspectInlineObservabilityFilterRuleGroupRulesItemValueXa463abf7(raw)
      if (inspection.matchCount == 0) {
        throw InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7NoMatchException("InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7) {
      encoder.requireJsonEncoder("InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineObservabilityFilterRuleGroupRulesItemValueXa463abf7(element: JsonElement): InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  return InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7Inspection(
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
