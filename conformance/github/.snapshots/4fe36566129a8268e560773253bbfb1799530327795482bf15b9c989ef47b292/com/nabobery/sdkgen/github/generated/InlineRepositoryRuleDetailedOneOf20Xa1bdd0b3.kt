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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/19.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-detailed/oneOf/19
 */
@Serializable(with = InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3.Serializer::class)
public class InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3(
  public val type: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95,
  public val parameters: InlineRepositoryRuleFilePathRestrictionParametersX9758d294? = null,
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
    private var typeValue: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95? = null

    public var type: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleFilePathRestrictionParametersX9758d294? = null

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

    public fun build(): InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3 {
      check(typeValue != null) { "type is required" }
      return InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3(
        type = type,
        parameters = parameters,
        rulesetId = rulesetId,
        rulesetSource = rulesetSource,
        rulesetSourceType = rulesetSourceType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3 must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95>(rawObject, "type")
      return InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleFilePathRestrictionParametersX9758d294>(it) },
        rulesetId = rawObject["ruleset_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        rulesetSource = rawObject["ruleset_source"]?.let { json.decodeFromJsonElement<String>(it) },
        rulesetSourceType = rawObject["ruleset_source_type"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3")
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

public fun inlineRepositoryRuleDetailedOneOf20Xa1bdd0b3(block: InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3.Builder.() -> Unit): InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3 = InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleDetailedOneOf20Xa1bdd0b3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
