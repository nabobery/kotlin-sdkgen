package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1rulesets/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1rulesets/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsRulesetsPostRequestJsonXcdbb0136.Serializer::class)
public class InlineOrgsRulesetsPostRequestJsonXcdbb0136(
  public val enforcement: RepositoryRuleEnforcement,
  /**
   * The name of the ruleset.
   */
  public val name: String,
  bypassActors: List<RepositoryRulesetBypassActor>? = null,
  public val conditions: OrgRulesetConditions? = null,
  rules: List<OrgRules>? = null,
  /**
   * The target of the ruleset
   */
  public val target: InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc? = null,
) {
  /**
   * The actors that can bypass the rules in this ruleset
   */
  public val bypassActors: List<RepositoryRulesetBypassActor>? =
      bypassActors?.let { collection0 -> collection0.toList() }

  /**
   * An array of rules within the ruleset.
   */
  public val rules: List<OrgRules>? = rules?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var enforcementValue: RepositoryRuleEnforcement? = null

    public var enforcement: RepositoryRuleEnforcement
      get() = requireNotNull(enforcementValue) { "enforcement is required" }
      set(`value`) {
        enforcementValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var bypassActorsValue: List<RepositoryRulesetBypassActor>? = null

    /**
     * The actors that can bypass the rules in this ruleset
     */
    public var bypassActors: List<RepositoryRulesetBypassActor>?
      get() = bypassActorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        bypassActorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var conditions: OrgRulesetConditions? = null

    private var rulesValue: List<OrgRules>? = null

    /**
     * An array of rules within the ruleset.
     */
    public var rules: List<OrgRules>?
      get() = rulesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        rulesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The target of the ruleset
     */
    public var target: InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc? = null

    public fun build(): InlineOrgsRulesetsPostRequestJsonXcdbb0136 {
      check(enforcementValue != null) { "enforcement is required" }
      check(nameValue != null) { "name is required" }
      return InlineOrgsRulesetsPostRequestJsonXcdbb0136(
        enforcement = enforcement,
        name = name,
        bypassActors = bypassActors,
        conditions = conditions,
        rules = rules,
        target = target,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsRulesetsPostRequestJsonXcdbb0136 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsRulesetsPostRequestJsonXcdbb0136> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsRulesetsPostRequestJsonXcdbb0136 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsRulesetsPostRequestJsonXcdbb0136")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsRulesetsPostRequestJsonXcdbb0136 must be a JSON object")
      val enforcement = json.decodeRequired<RepositoryRuleEnforcement>(rawObject, "enforcement")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsRulesetsPostRequestJsonXcdbb0136(
        enforcement = enforcement,
        name = name,
        bypassActors = rawObject["bypass_actors"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetBypassActor>>(it) },
        conditions = rawObject["conditions"]?.let { json.decodeFromJsonElement<OrgRulesetConditions>(it) },
        rules = rawObject["rules"]?.let { json.decodeFromJsonElement<List<OrgRules>>(it) },
        target = rawObject["target"]?.let { json.decodeFromJsonElement<InlineOrgsRulesetsPostRequestJsonTargetX6b7b3afc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsRulesetsPostRequestJsonXcdbb0136) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsRulesetsPostRequestJsonXcdbb0136")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enforcement", json.encodeToJsonElement(value.enforcement))
        put("name", value.name)
        value.bypassActors?.let { put("bypass_actors", json.encodeToJsonElement(it)) }
        value.conditions?.let { put("conditions", json.encodeToJsonElement(it)) }
        value.rules?.let { put("rules", json.encodeToJsonElement(it)) }
        value.target?.let { put("target", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsRulesetsPostRequestJsonXcdbb0136(block: InlineOrgsRulesetsPostRequestJsonXcdbb0136.Builder.() -> Unit): InlineOrgsRulesetsPostRequestJsonXcdbb0136 = InlineOrgsRulesetsPostRequestJsonXcdbb0136.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsRulesetsPostRequestJsonXcdbb0136 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
