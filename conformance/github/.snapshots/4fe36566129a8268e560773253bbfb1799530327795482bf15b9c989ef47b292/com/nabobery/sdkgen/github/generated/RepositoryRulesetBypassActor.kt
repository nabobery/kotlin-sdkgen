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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An actor that can bypass rules in a ruleset
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-bypass-actor
 */
@Serializable(with = RepositoryRulesetBypassActor.Serializer::class)
public class RepositoryRulesetBypassActor(
  /**
   * The type of actor that can bypass a ruleset.
   */
  public val actorType: InlineRepositoryRulesetBypassActorActorTypeX416f9ce7,
  /**
   * The ID of the actor that can bypass a ruleset. Required for `Integration`, `RepositoryRole`, `Team`, and `User`
   * actor types. If `actor_type` is `OrganizationAdmin`, `actor_id` is ignored. If `actor_type` is `DeployKey`, this
   * should be null. `OrganizationAdmin` is not applicable for personal repositories.
   */
  public val actorId: Int? = null,
  /**
   * When the specified actor can bypass the ruleset. `pull_request` means that an actor can only bypass rules on pull
   * requests. `pull_request` is not applicable for the `DeployKey` actor type. Also, `pull_request` is only applicable
   * to branch rulesets. When `bypass_mode` is `exempt`, rules will not be run for that actor and a bypass audit entry
   * will not be created.
   */
  public val bypassMode: InlineRepositoryRulesetBypassActorBypassModeX3f3636f8? = null,
) {
  public class Builder {
    private var actorTypeValue: InlineRepositoryRulesetBypassActorActorTypeX416f9ce7? = null

    public var actorType: InlineRepositoryRulesetBypassActorActorTypeX416f9ce7
      get() = requireNotNull(actorTypeValue) { "actorType is required" }
      set(`value`) {
        actorTypeValue = value
      }

    /**
     * The ID of the actor that can bypass a ruleset. Required for `Integration`, `RepositoryRole`, `Team`, and `User`
     * actor types. If `actor_type` is `OrganizationAdmin`, `actor_id` is ignored. If `actor_type` is `DeployKey`, this
     * should be null. `OrganizationAdmin` is not applicable for personal repositories.
     */
    public var actorId: Int? = null

    /**
     * When the specified actor can bypass the ruleset. `pull_request` means that an actor can only bypass rules on pull
     * requests. `pull_request` is not applicable for the `DeployKey` actor type. Also, `pull_request` is only
     * applicable to branch rulesets. When `bypass_mode` is `exempt`, rules will not be run for that actor and a bypass
     * audit entry will not be created.
     */
    public var bypassMode: InlineRepositoryRulesetBypassActorBypassModeX3f3636f8? = null

    public fun build(): RepositoryRulesetBypassActor {
      check(actorTypeValue != null) { "actorType is required" }
      return RepositoryRulesetBypassActor(
        actorType = actorType,
        actorId = actorId,
        bypassMode = bypassMode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRulesetBypassActor = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRulesetBypassActor> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRulesetBypassActor {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRulesetBypassActor")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRulesetBypassActor must be a JSON object")
      val actorType = json.decodeRequired<InlineRepositoryRulesetBypassActorActorTypeX416f9ce7>(rawObject, "actor_type")
      return RepositoryRulesetBypassActor(
        actorType = actorType,
        actorId = rawObject["actor_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        bypassMode = rawObject["bypass_mode"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetBypassActorBypassModeX3f3636f8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRulesetBypassActor) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRulesetBypassActor")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor_type", json.encodeToJsonElement(value.actorType))
        value.actorId?.let { put("actor_id", json.encodeToJsonElement(it)) }
        value.bypassMode?.let { put("bypass_mode", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRulesetBypassActor(block: RepositoryRulesetBypassActor.Builder.() -> Unit): RepositoryRulesetBypassActor = RepositoryRulesetBypassActor.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRulesetBypassActor is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
