package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-committer-email-pattern/properties/parameters.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-committer-email-pattern/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2.Serializer::class)
public class InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2(
  /**
   * The operator to use for matching.
   */
  public val `operator`: InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0,
  /**
   * The pattern to match with.
   */
  public val pattern: String,
  /**
   * How this rule appears when configuring it.
   */
  public val name: String? = null,
  /**
   * If true, the rule will fail if the pattern matches.
   */
  public val negate: Boolean? = null,
) {
  public class Builder {
    private var operatorValue: InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0?
        = null

    public var `operator`: InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0
      get() = requireNotNull(operatorValue) { "operator is required" }
      set(`value`) {
        operatorValue = value
      }

    private var patternValue: String? = null

    public var pattern: String
      get() = requireNotNull(patternValue) { "pattern is required" }
      set(`value`) {
        patternValue = value
      }

    /**
     * How this rule appears when configuring it.
     */
    public var name: String? = null

    /**
     * If true, the rule will fail if the pattern matches.
     */
    public var negate: Boolean? = null

    public fun build(): InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2 {
      check(operatorValue != null) { "operator is required" }
      check(patternValue != null) { "pattern is required" }
      return InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2(
        operator = operator,
        pattern = pattern,
        name = name,
        negate = negate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2 must be a JSON object")
      val operator = json.decodeRequired<InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0>(rawObject, "operator")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      return InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2(
        operator = operator,
        pattern = pattern,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        negate = rawObject["negate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("operator", json.encodeToJsonElement(value.operator))
        put("pattern", value.pattern)
        value.name?.let { put("name", it) }
        value.negate?.let { put("negate", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2(block: InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2.Builder.() -> Unit): InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2 = InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleCommitterEmailPatternParametersX4c2378b2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
