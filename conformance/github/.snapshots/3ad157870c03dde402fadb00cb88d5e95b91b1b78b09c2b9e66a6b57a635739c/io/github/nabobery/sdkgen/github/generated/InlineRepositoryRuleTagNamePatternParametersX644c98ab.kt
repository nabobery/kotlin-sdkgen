package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-tag-name-pattern/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-tag-name-pattern/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleTagNamePatternParametersX644c98ab.Serializer::class)
public class InlineRepositoryRuleTagNamePatternParametersX644c98ab(
  /**
   * The operator to use for matching.
   */
  public val `operator`: InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e,
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
    private var operatorValue: InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e? = null

    public var `operator`: InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e
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

    public fun build(): InlineRepositoryRuleTagNamePatternParametersX644c98ab {
      check(operatorValue != null) { "operator is required" }
      check(patternValue != null) { "pattern is required" }
      return InlineRepositoryRuleTagNamePatternParametersX644c98ab(
        operator = operator,
        pattern = pattern,
        name = name,
        negate = negate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleTagNamePatternParametersX644c98ab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleTagNamePatternParametersX644c98ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleTagNamePatternParametersX644c98ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleTagNamePatternParametersX644c98ab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleTagNamePatternParametersX644c98ab must be a JSON object")
      val operator = json.decodeRequired<InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e>(rawObject, "operator")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      return InlineRepositoryRuleTagNamePatternParametersX644c98ab(
        operator = operator,
        pattern = pattern,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        negate = rawObject["negate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleTagNamePatternParametersX644c98ab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleTagNamePatternParametersX644c98ab")
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

public fun inlineRepositoryRuleTagNamePatternParametersX644c98ab(block: InlineRepositoryRuleTagNamePatternParametersX644c98ab.Builder.() -> Unit): InlineRepositoryRuleTagNamePatternParametersX644c98ab = InlineRepositoryRuleTagNamePatternParametersX644c98ab.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleTagNamePatternParametersX644c98ab is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
