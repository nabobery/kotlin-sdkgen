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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineChargeOutcomeRuleXe4c798b7Branch {
  Branch1,
  Rule,
}

public sealed class InlineChargeOutcomeRuleXe4c798b7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeOutcomeRuleXe4c798b7NoMatchException(
  message: String,
) : InlineChargeOutcomeRuleXe4c798b7DecodingException(message)

internal data class InlineChargeOutcomeRuleXe4c798b7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesRule: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesRule).count { it }
}

/**
 * The ID of the Radar rule that matched the payment, if applicable.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge_outcome/properties/rule
 */
@Serializable(with = InlineChargeOutcomeRuleXe4c798b7.Serializer::class)
public class InlineChargeOutcomeRuleXe4c798b7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeOutcomeRuleXe4c798b7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val rule: Rule? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRule) json.decodeFromJsonElement<Rule>(raw) else null }

  public val matchedBranches: Set<InlineChargeOutcomeRuleXe4c798b7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeOutcomeRuleXe4c798b7Branch.Branch1)
      if (inspection.matchesRule) add(InlineChargeOutcomeRuleXe4c798b7Branch.Rule)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeOutcomeRuleXe4c798b7 {
      val inspection = inspectInlineChargeOutcomeRuleXe4c798b7(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeOutcomeRuleXe4c798b7NoMatchException("InlineChargeOutcomeRuleXe4c798b7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeOutcomeRuleXe4c798b7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChargeOutcomeRuleXe4c798b7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeOutcomeRuleXe4c798b7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeOutcomeRuleXe4c798b7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeOutcomeRuleXe4c798b7) {
      encoder.requireJsonEncoder("InlineChargeOutcomeRuleXe4c798b7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeOutcomeRuleXe4c798b7(element: JsonElement): InlineChargeOutcomeRuleXe4c798b7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesRule = element.isJsonDecodable<Rule>()
  return InlineChargeOutcomeRuleXe4c798b7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesRule = matchesRule,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesRule) add("Rule: value does not match Rule")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
