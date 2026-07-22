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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-author-email-pattern/properties/parameters.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-author-email-pattern/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c.Serializer::class)
public class InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c(
  /**
   * The operator to use for matching.
   */
  public val `operator`: InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4,
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
    private var operatorValue:
        InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4? = null

    public var `operator`: InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4
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

    public fun build(): InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c {
      check(operatorValue != null) { "operator is required" }
      check(patternValue != null) { "pattern is required" }
      return InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c(
        operator = operator,
        pattern = pattern,
        name = name,
        negate = negate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c must be a JSON object")
      val operator = json.decodeRequired<InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4>(rawObject, "operator")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      return InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c(
        operator = operator,
        pattern = pattern,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        negate = rawObject["negate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c")
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

public fun inlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c(block: InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c.Builder.() -> Unit): InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c = InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
