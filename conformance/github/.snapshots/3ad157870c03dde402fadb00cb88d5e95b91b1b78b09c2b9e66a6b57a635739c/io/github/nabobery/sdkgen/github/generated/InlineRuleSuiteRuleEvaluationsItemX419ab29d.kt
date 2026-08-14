package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/rule_evaluations/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/rule_evaluations/items
 */
@Serializable(with = InlineRuleSuiteRuleEvaluationsItemX419ab29d.Serializer::class)
public class InlineRuleSuiteRuleEvaluationsItemX419ab29d(
  /**
   * The detailed failure message for the rule. Null if the rule passed.
   */
  public val details: String? = null,
  /**
   * The enforcement level of this rule source.
   */
  public val enforcement: InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856? = null,
  /**
   * The result of the evaluation of the individual rule.
   */
  public val result: InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f? = null,
  public val ruleSource: InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3? = null,
  /**
   * The type of rule.
   */
  public val ruleType: String? = null,
) {
  public class Builder {
    /**
     * The detailed failure message for the rule. Null if the rule passed.
     */
    public var details: String? = null

    /**
     * The enforcement level of this rule source.
     */
    public var enforcement: InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856? = null

    /**
     * The result of the evaluation of the individual rule.
     */
    public var result: InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f? = null

    public var ruleSource: InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3? = null

    /**
     * The type of rule.
     */
    public var ruleType: String? = null

    public fun build(): InlineRuleSuiteRuleEvaluationsItemX419ab29d = InlineRuleSuiteRuleEvaluationsItemX419ab29d(
      details = details,
      enforcement = enforcement,
      result = result,
      ruleSource = ruleSource,
      ruleType = ruleType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuiteRuleEvaluationsItemX419ab29d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRuleSuiteRuleEvaluationsItemX419ab29d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuiteRuleEvaluationsItemX419ab29d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuiteRuleEvaluationsItemX419ab29d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuiteRuleEvaluationsItemX419ab29d must be a JSON object")
      return InlineRuleSuiteRuleEvaluationsItemX419ab29d(
        details = rawObject["details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        enforcement = rawObject["enforcement"]?.let { json.decodeFromJsonElement<InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856>(it) },
        result = rawObject["result"]?.let { json.decodeFromJsonElement<InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f>(it) },
        ruleSource = rawObject["rule_source"]?.let { json.decodeFromJsonElement<InlineRuleSuiteRuleEvaluationsItemRuleSourceX770538f3>(it) },
        ruleType = rawObject["rule_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteRuleEvaluationsItemX419ab29d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuiteRuleEvaluationsItemX419ab29d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.details?.let { put("details", it) }
        value.enforcement?.let { put("enforcement", json.encodeToJsonElement(it)) }
        value.result?.let { put("result", json.encodeToJsonElement(it)) }
        value.ruleSource?.let { put("rule_source", json.encodeToJsonElement(it)) }
        value.ruleType?.let { put("rule_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuiteRuleEvaluationsItemX419ab29d(block: InlineRuleSuiteRuleEvaluationsItemX419ab29d.Builder.() -> Unit): InlineRuleSuiteRuleEvaluationsItemX419ab29d = InlineRuleSuiteRuleEvaluationsItemX419ab29d.build(block)
