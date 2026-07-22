package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Metadata for a required status checks rule evaluation result.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite-required-status-checks
 */
@Serializable(with = RuleSuiteRequiredStatusChecks.Serializer::class)
public class RuleSuiteRequiredStatusChecks(
  /**
   * The status checks associated with the rule evaluation.
   */
  public val checks: List<InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba>? = null,
) {
  public class Builder {
    /**
     * The status checks associated with the rule evaluation.
     */
    public var checks: List<InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba>? = null

    public fun build(): RuleSuiteRequiredStatusChecks = RuleSuiteRequiredStatusChecks(
      checks = checks,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RuleSuiteRequiredStatusChecks = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RuleSuiteRequiredStatusChecks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RuleSuiteRequiredStatusChecks {
      val jsonDecoder = decoder.requireJsonDecoder("RuleSuiteRequiredStatusChecks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RuleSuiteRequiredStatusChecks must be a JSON object")
      return RuleSuiteRequiredStatusChecks(
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<List<InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RuleSuiteRequiredStatusChecks) {
      val jsonEncoder = encoder.requireJsonEncoder("RuleSuiteRequiredStatusChecks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun ruleSuiteRequiredStatusChecks(block: RuleSuiteRequiredStatusChecks.Builder.() -> Unit): RuleSuiteRequiredStatusChecks = RuleSuiteRequiredStatusChecks.build(block)
