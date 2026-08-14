package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A set of rules to apply when specified conditions are met.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset
 */
@Serializable(with = RepositoryRuleset.Serializer::class)
public class RepositoryRuleset(
  public val enforcement: RepositoryRuleEnforcement,
  /**
   * The ID of the ruleset
   */
  public val id: Int,
  /**
   * The name of the ruleset
   */
  public val name: String,
  /**
   * The name of the source
   */
  public val source: String,
  public val links: InlineRepositoryRulesetLinksXca1aefb2? = null,
  bypassActors: List<RepositoryRulesetBypassActor>? = null,
  public val conditions: InlineRepositoryRulesetConditionsXf944a555? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * The bypass type of the user making the API request for this ruleset. This field is only returned when
   * querying the repository-level endpoint.
   */
  public val currentUserCanBypass: InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd? = null,
  public val nodeId: String? = null,
  rules: List<RepositoryRule>? = null,
  /**
   * The type of the source of the ruleset
   */
  public val sourceType: InlineRepositoryRulesetSourceTypeX8d64e07a? = null,
  /**
   * The target of the ruleset
   */
  public val target: InlineRepositoryRulesetTargetX0b0a0c68? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
) {
  /**
   * The actors that can bypass the rules in this ruleset
   */
  public val bypassActors: List<RepositoryRulesetBypassActor>? =
      bypassActors?.let { collection0 -> collection0.toList() }

  public val rules: List<RepositoryRule>? = rules?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var enforcementValue: RepositoryRuleEnforcement? = null

    public var enforcement: RepositoryRuleEnforcement
      get() = requireNotNull(enforcementValue) { "enforcement is required" }
      set(`value`) {
        enforcementValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var sourceValue: String? = null

    public var source: String
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    public var links: InlineRepositoryRulesetLinksXca1aefb2? = null

    private var bypassActorsValue: List<RepositoryRulesetBypassActor>? = null

    /**
     * The actors that can bypass the rules in this ruleset
     */
    public var bypassActors: List<RepositoryRulesetBypassActor>?
      get() = bypassActorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        bypassActorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var conditions: InlineRepositoryRulesetConditionsXf944a555? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * The bypass type of the user making the API request for this ruleset. This field is only returned when
     * querying the repository-level endpoint.
     */
    public var currentUserCanBypass: InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd? = null

    public var nodeId: String? = null

    private var rulesValue: List<RepositoryRule>? = null

    public var rules: List<RepositoryRule>?
      get() = rulesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        rulesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The type of the source of the ruleset
     */
    public var sourceType: InlineRepositoryRulesetSourceTypeX8d64e07a? = null

    /**
     * The target of the ruleset
     */
    public var target: InlineRepositoryRulesetTargetX0b0a0c68? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): RepositoryRuleset {
      check(enforcementValue != null) { "enforcement is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(sourceValue != null) { "source is required" }
      return RepositoryRuleset(
        enforcement = enforcement,
        id = id,
        name = name,
        source = source,
        links = links,
        bypassActors = bypassActors,
        conditions = conditions,
        createdAt = createdAt,
        currentUserCanBypass = currentUserCanBypass,
        nodeId = nodeId,
        rules = rules,
        sourceType = sourceType,
        target = target,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleset = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleset> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleset {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleset")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleset must be a JSON object")
      val enforcement = json.decodeRequired<RepositoryRuleEnforcement>(rawObject, "enforcement")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val source = json.decodeRequired<String>(rawObject, "source")
      return RepositoryRuleset(
        enforcement = enforcement,
        id = id,
        name = name,
        source = source,
        links = rawObject["_links"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetLinksXca1aefb2>(it) },
        bypassActors = rawObject["bypass_actors"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetBypassActor>>(it) },
        conditions = rawObject["conditions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRepositoryRulesetConditionsXf944a555?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        currentUserCanBypass = rawObject["current_user_can_bypass"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        rules = rawObject["rules"]?.let { json.decodeFromJsonElement<List<RepositoryRule>>(it) },
        sourceType = rawObject["source_type"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetSourceTypeX8d64e07a>(it) },
        target = rawObject["target"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetTargetX0b0a0c68>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleset) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleset")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enforcement", json.encodeToJsonElement(value.enforcement))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("source", value.source)
        value.links?.let { put("_links", json.encodeToJsonElement(it)) }
        value.bypassActors?.let { put("bypass_actors", json.encodeToJsonElement(it)) }
        value.conditions?.let { put("conditions", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.currentUserCanBypass?.let { put("current_user_can_bypass", json.encodeToJsonElement(it)) }
        value.nodeId?.let { put("node_id", it) }
        value.rules?.let { put("rules", json.encodeToJsonElement(it)) }
        value.sourceType?.let { put("source_type", json.encodeToJsonElement(it)) }
        value.target?.let { put("target", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleset(block: RepositoryRuleset.Builder.() -> Unit): RepositoryRuleset = RepositoryRuleset.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleset is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
