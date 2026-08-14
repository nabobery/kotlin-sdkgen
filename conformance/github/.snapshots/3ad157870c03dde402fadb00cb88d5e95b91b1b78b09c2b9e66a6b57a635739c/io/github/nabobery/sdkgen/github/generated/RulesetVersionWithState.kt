package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ruleset-version-with-state.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ruleset-version-with-state
 */
@Serializable(with = RulesetVersionWithState.Serializer::class)
public class RulesetVersionWithState(
  /**
   * The actor who updated the ruleset
   */
  public val actor: InlineRulesetVersionActorX465fc6ea,
  /**
   * The state of the ruleset version
   */
  public val state: JsonObject,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * The ID of the previous version of the ruleset
   */
  public val versionId: Int,
) {
  public class Builder {
    private var actorValue: InlineRulesetVersionActorX465fc6ea? = null

    public var actor: InlineRulesetVersionActorX465fc6ea
      get() = requireNotNull(actorValue) { "actor is required" }
      set(`value`) {
        actorValue = value
      }

    private var stateValue: JsonObject? = null

    public var state: JsonObject
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var versionIdValue: Int? = null

    public var versionId: Int
      get() = requireNotNull(versionIdValue) { "versionId is required" }
      set(`value`) {
        versionIdValue = value
      }

    public fun build(): RulesetVersionWithState {
      check(actorValue != null) { "actor is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(versionIdValue != null) { "versionId is required" }
      return RulesetVersionWithState(
        actor = actor,
        state = state,
        updatedAt = updatedAt,
        versionId = versionId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RulesetVersionWithState = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RulesetVersionWithState> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RulesetVersionWithState {
      val jsonDecoder = decoder.requireJsonDecoder("RulesetVersionWithState")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RulesetVersionWithState must be a JSON object")
      val actor = json.decodeRequired<InlineRulesetVersionActorX465fc6ea>(rawObject, "actor")
      val state = json.decodeRequired<JsonObject>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val versionId = json.decodeRequired<Int>(rawObject, "version_id")
      return RulesetVersionWithState(
        actor = actor,
        state = state,
        updatedAt = updatedAt,
        versionId = versionId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RulesetVersionWithState) {
      val jsonEncoder = encoder.requireJsonEncoder("RulesetVersionWithState")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", json.encodeToJsonElement(value.actor))
        put("state", json.encodeToJsonElement(value.state))
        put("updated_at", value.updatedAt)
        put("version_id", json.encodeToJsonElement(value.versionId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rulesetVersionWithState(block: RulesetVersionWithState.Builder.() -> Unit): RulesetVersionWithState = RulesetVersionWithState.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RulesetVersionWithState is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
