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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/22.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/22
 */
@Serializable(with = InlineRepositoryRuleDetailedOneOf23X0a253f56.Serializer::class)
public class InlineRepositoryRuleDetailedOneOf23X0a253f56(
  public val type: InlineRepositoryRuleMaxFileSizeTypeX8cf07814,
  public val parameters: InlineRepositoryRuleMaxFileSizeParametersX338e3dd0? = null,
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
    private var typeValue: InlineRepositoryRuleMaxFileSizeTypeX8cf07814? = null

    public var type: InlineRepositoryRuleMaxFileSizeTypeX8cf07814
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleMaxFileSizeParametersX338e3dd0? = null

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

    public fun build(): InlineRepositoryRuleDetailedOneOf23X0a253f56 {
      check(typeValue != null) { "type is required" }
      return InlineRepositoryRuleDetailedOneOf23X0a253f56(
        type = type,
        parameters = parameters,
        rulesetId = rulesetId,
        rulesetSource = rulesetSource,
        rulesetSourceType = rulesetSourceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf23X0a253f56 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleDetailedOneOf23X0a253f56> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleDetailedOneOf23X0a253f56 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleDetailedOneOf23X0a253f56")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf23X0a253f56 must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleMaxFileSizeTypeX8cf07814>(rawObject, "type")
      return InlineRepositoryRuleDetailedOneOf23X0a253f56(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleMaxFileSizeParametersX338e3dd0>(it) },
        rulesetId = rawObject["ruleset_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        rulesetSource = rawObject["ruleset_source"]?.let { json.decodeFromJsonElement<String>(it) },
        rulesetSourceType = rawObject["ruleset_source_type"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleDetailedOneOf23X0a253f56) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleDetailedOneOf23X0a253f56")
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

public fun inlineRepositoryRuleDetailedOneOf23X0a253f56(block: InlineRepositoryRuleDetailedOneOf23X0a253f56.Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf23X0a253f56 = InlineRepositoryRuleDetailedOneOf23X0a253f56.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf23X0a253f56 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
