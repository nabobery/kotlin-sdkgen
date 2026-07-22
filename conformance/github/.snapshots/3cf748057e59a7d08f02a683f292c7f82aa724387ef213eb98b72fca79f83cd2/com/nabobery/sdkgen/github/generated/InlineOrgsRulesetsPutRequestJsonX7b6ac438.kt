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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1rulesets~1{ruleset_id}/put/requestBody/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1rulesets~1{ruleset_id}/put/requestBody/content/application~1json/s
 * chema
 */
@Serializable(with = InlineOrgsRulesetsPutRequestJsonX7b6ac438.Serializer::class)
public class InlineOrgsRulesetsPutRequestJsonX7b6ac438(
  /**
   * The actors that can bypass the rules in this ruleset
   */
  public val bypassActors: List<RepositoryRulesetBypassActor>? = null,
  public val conditions: OrgRulesetConditions? = null,
  public val enforcement: RepositoryRuleEnforcement? = null,
  /**
   * The name of the ruleset.
   */
  public val name: String? = null,
  /**
   * An array of rules within the ruleset.
   */
  public val rules: List<OrgRules>? = null,
  /**
   * The target of the ruleset
   */
  public val target: InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6? = null,
) {
  public class Builder {
    /**
     * The actors that can bypass the rules in this ruleset
     */
    public var bypassActors: List<RepositoryRulesetBypassActor>? = null

    public var conditions: OrgRulesetConditions? = null

    public var enforcement: RepositoryRuleEnforcement? = null

    /**
     * The name of the ruleset.
     */
    public var name: String? = null

    /**
     * An array of rules within the ruleset.
     */
    public var rules: List<OrgRules>? = null

    /**
     * The target of the ruleset
     */
    public var target: InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6? = null

    public fun build(): InlineOrgsRulesetsPutRequestJsonX7b6ac438 = InlineOrgsRulesetsPutRequestJsonX7b6ac438(
      bypassActors = bypassActors,
      conditions = conditions,
      enforcement = enforcement,
      name = name,
      rules = rules,
      target = target,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsRulesetsPutRequestJsonX7b6ac438 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsRulesetsPutRequestJsonX7b6ac438> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsRulesetsPutRequestJsonX7b6ac438 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsRulesetsPutRequestJsonX7b6ac438")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsRulesetsPutRequestJsonX7b6ac438 must be a JSON object")
      return InlineOrgsRulesetsPutRequestJsonX7b6ac438(
        bypassActors = rawObject["bypass_actors"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetBypassActor>>(it) },
        conditions = rawObject["conditions"]?.let { json.decodeFromJsonElement<OrgRulesetConditions>(it) },
        enforcement = rawObject["enforcement"]?.let { json.decodeFromJsonElement<RepositoryRuleEnforcement>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        rules = rawObject["rules"]?.let { json.decodeFromJsonElement<List<OrgRules>>(it) },
        target = rawObject["target"]?.let { json.decodeFromJsonElement<InlineOrgsRulesetsPutRequestJsonTargetXdc93c4c6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsRulesetsPutRequestJsonX7b6ac438) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsRulesetsPutRequestJsonX7b6ac438")
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

public fun inlineOrgsRulesetsPutRequestJsonX7b6ac438(block: InlineOrgsRulesetsPutRequestJsonX7b6ac438.Builder.() -> Unit): InlineOrgsRulesetsPutRequestJsonX7b6ac438 = InlineOrgsRulesetsPutRequestJsonX7b6ac438.build(block)
