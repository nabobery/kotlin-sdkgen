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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-message-pattern/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-message-pattern/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba.Serializer::class)
public class InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba(
  /**
   * The operator to use for matching.
   */
  public val `operator`: InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a,
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
    private var operatorValue: InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a?
        = null

    public var `operator`: InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a
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

    public fun build(): InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba {
      check(operatorValue != null) { "operator is required" }
      check(patternValue != null) { "pattern is required" }
      return InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba(
        operator = operator,
        pattern = pattern,
        name = name,
        negate = negate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba must be a JSON object")
      val operator = json.decodeRequired<InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a>(rawObject, "operator")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      return InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba(
        operator = operator,
        pattern = pattern,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        negate = rawObject["negate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba")
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

public fun inlineRepositoryRuleCommitMessagePatternParametersXb437b8ba(block: InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba.Builder.() -> Unit): InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba = InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
