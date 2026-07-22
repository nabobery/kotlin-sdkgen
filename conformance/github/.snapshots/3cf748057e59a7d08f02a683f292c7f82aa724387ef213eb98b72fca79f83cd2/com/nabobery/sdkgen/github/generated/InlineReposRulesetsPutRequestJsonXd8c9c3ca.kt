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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1rulesets~1{ruleset_id}/put/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1rulesets~1{ruleset_id}/put/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineReposRulesetsPutRequestJsonXd8c9c3ca.Serializer::class)
public class InlineReposRulesetsPutRequestJsonXd8c9c3ca(
  /**
   * The actors that can bypass the rules in this ruleset
   */
  public val bypassActors: List<RepositoryRulesetBypassActor>? = null,
  public val conditions: RepositoryRulesetConditions? = null,
  public val enforcement: RepositoryRuleEnforcement? = null,
  /**
   * The name of the ruleset.
   */
  public val name: String? = null,
  /**
   * An array of rules within the ruleset.
   */
  public val rules: List<RepositoryRule>? = null,
  /**
   * The target of the ruleset
   */
  public val target: InlineReposRulesetsPutRequestJsonTargetX752a4651? = null,
) {
  public class Builder {
    /**
     * The actors that can bypass the rules in this ruleset
     */
    public var bypassActors: List<RepositoryRulesetBypassActor>? = null

    public var conditions: RepositoryRulesetConditions? = null

    public var enforcement: RepositoryRuleEnforcement? = null

    /**
     * The name of the ruleset.
     */
    public var name: String? = null

    /**
     * An array of rules within the ruleset.
     */
    public var rules: List<RepositoryRule>? = null

    /**
     * The target of the ruleset
     */
    public var target: InlineReposRulesetsPutRequestJsonTargetX752a4651? = null

    public fun build(): InlineReposRulesetsPutRequestJsonXd8c9c3ca = InlineReposRulesetsPutRequestJsonXd8c9c3ca(
      bypassActors = bypassActors,
      conditions = conditions,
      enforcement = enforcement,
      name = name,
      rules = rules,
      target = target,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposRulesetsPutRequestJsonXd8c9c3ca = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposRulesetsPutRequestJsonXd8c9c3ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposRulesetsPutRequestJsonXd8c9c3ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposRulesetsPutRequestJsonXd8c9c3ca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposRulesetsPutRequestJsonXd8c9c3ca must be a JSON object")
      return InlineReposRulesetsPutRequestJsonXd8c9c3ca(
        bypassActors = rawObject["bypass_actors"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetBypassActor>>(it) },
        conditions = rawObject["conditions"]?.let { json.decodeFromJsonElement<RepositoryRulesetConditions>(it) },
        enforcement = rawObject["enforcement"]?.let { json.decodeFromJsonElement<RepositoryRuleEnforcement>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        rules = rawObject["rules"]?.let { json.decodeFromJsonElement<List<RepositoryRule>>(it) },
        target = rawObject["target"]?.let { json.decodeFromJsonElement<InlineReposRulesetsPutRequestJsonTargetX752a4651>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposRulesetsPutRequestJsonXd8c9c3ca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposRulesetsPutRequestJsonXd8c9c3ca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bypassActors?.let { put("bypass_actors", json.encodeToJsonElement(it)) }
        value.conditions?.let { put("conditions", json.encodeToJsonElement(it)) }
        value.enforcement?.let { put("enforcement", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.rules?.let { put("rules", json.encodeToJsonElement(it)) }
        value.target?.let { put("target", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposRulesetsPutRequestJsonXd8c9c3ca(block: InlineReposRulesetsPutRequestJsonXd8c9c3ca.Builder.() -> Unit): InlineReposRulesetsPutRequestJsonXd8c9c3ca = InlineReposRulesetsPutRequestJsonXd8c9c3ca.build(block)
