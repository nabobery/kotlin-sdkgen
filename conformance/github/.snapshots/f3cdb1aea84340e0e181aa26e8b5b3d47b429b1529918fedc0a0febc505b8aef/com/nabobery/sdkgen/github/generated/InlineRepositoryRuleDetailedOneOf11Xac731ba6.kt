package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/10.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/10
 */
@Serializable(with = InlineRepositoryRuleDetailedOneOf11Xac731ba6.Serializer::class)
public class InlineRepositoryRuleDetailedOneOf11Xac731ba6(
  public val type: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f,
  public val parameters: InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba? = null,
  /**
   * The ID of the ruleset that includes this rule.
   */
  public val rulesetId: Int? = null,
  /**
   * The name of the source of the ruleset that includes this rule.
   */
  public val rulesetSource: String? = null,
  /**
   * The type of source for the ruleset that includes this rule.
   */
  public val rulesetSourceType: InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f? = null

    public var type: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba? = null

    /**
     * The ID of the ruleset that includes this rule.
     */
    public var rulesetId: Int? = null

    /**
     * The name of the source of the ruleset that includes this rule.
     */
    public var rulesetSource: String? = null

    /**
     * The type of source for the ruleset that includes this rule.
     */
    public var rulesetSourceType: InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590? = null

    public fun build(): InlineRepositoryRuleDetailedOneOf11Xac731ba6 {
      check(typeValue != null) { "type is required" }
      return InlineRepositoryRuleDetailedOneOf11Xac731ba6(
        type = type,
        parameters = parameters,
        rulesetId = rulesetId,
        rulesetSource = rulesetSource,
        rulesetSourceType = rulesetSourceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf11Xac731ba6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleDetailedOneOf11Xac731ba6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleDetailedOneOf11Xac731ba6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleDetailedOneOf11Xac731ba6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf11Xac731ba6 must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f>(rawObject, "type")
      return InlineRepositoryRuleDetailedOneOf11Xac731ba6(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba>(it) },
        rulesetId = rawObject["ruleset_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        rulesetSource = rawObject["ruleset_source"]?.let { json.decodeFromJsonElement<String>(it) },
        rulesetSourceType = rawObject["ruleset_source_type"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleDetailedOneOf11Xac731ba6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleDetailedOneOf11Xac731ba6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
        value.rulesetId?.let { put("ruleset_id", json.encodeToJsonElement(it)) }
        value.rulesetSource?.let { put("ruleset_source", it) }
        value.rulesetSourceType?.let { put("ruleset_source_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleDetailedOneOf11Xac731ba6(block: InlineRepositoryRuleDetailedOneOf11Xac731ba6.Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf11Xac731ba6 = InlineRepositoryRuleDetailedOneOf11Xac731ba6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf11Xac731ba6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
