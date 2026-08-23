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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/2
 */
@Serializable(with = InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3.Serializer::class)
public class InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3(
  public val type: InlineRepositoryRuleDeletionTypeXff5dcc76,
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
    private var typeValue: InlineRepositoryRuleDeletionTypeXff5dcc76? = null

    public var type: InlineRepositoryRuleDeletionTypeXff5dcc76
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

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

    public fun build(): InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3 {
      check(typeValue != null) { "type is required" }
      return InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3(
        type = type,
        rulesetId = rulesetId,
        rulesetSource = rulesetSource,
        rulesetSourceType = rulesetSourceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3 must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleDeletionTypeXff5dcc76>(rawObject, "type")
      return InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3(
        type = type,
        rulesetId = rawObject["ruleset_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        rulesetSource = rawObject["ruleset_source"]?.let { json.decodeFromJsonElement<String>(it) },
        rulesetSourceType = rawObject["ruleset_source_type"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.rulesetId?.let { put("ruleset_id", json.encodeToJsonElement(it)) }
        value.rulesetSource?.let { put("ruleset_source", it) }
        value.rulesetSourceType?.let { put("ruleset_source_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleDetailedOneOf3Xcb1bb9f3(block: InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3.Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3 = InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf3Xcb1bb9f3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
