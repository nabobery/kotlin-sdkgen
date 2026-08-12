package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Specify people, teams, or apps allowed to dismiss pull request reviews.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-dismissal-restriction
 */
@Serializable(with = RepositoryRuleParamsDismissalRestriction.Serializer::class)
public class RepositoryRuleParamsDismissalRestriction(
  /**
   * Whether to restrict review dismissal to specific actors.
   */
  public val enabled: Boolean,
  allowedActors: List<RepositoryRuleParamsActor>? = null,
) {
  /**
   * Specify people, teams, or apps allowed to dismiss pull request reviews.
   */
  public val allowedActors: List<RepositoryRuleParamsActor>? =
      allowedActors?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var allowedActorsValue: List<RepositoryRuleParamsActor>? = null

    /**
     * Specify people, teams, or apps allowed to dismiss pull request reviews.
     */
    public var allowedActors: List<RepositoryRuleParamsActor>?
      get() = allowedActorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedActorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): RepositoryRuleParamsDismissalRestriction {
      check(enabledValue != null) { "enabled is required" }
      return RepositoryRuleParamsDismissalRestriction(
        enabled = enabled,
        allowedActors = allowedActors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsDismissalRestriction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleParamsDismissalRestriction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsDismissalRestriction {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsDismissalRestriction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsDismissalRestriction must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return RepositoryRuleParamsDismissalRestriction(
        enabled = enabled,
        allowedActors = rawObject["allowed_actors"]?.let { json.decodeFromJsonElement<List<RepositoryRuleParamsActor>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsDismissalRestriction) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsDismissalRestriction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.allowedActors?.let { put("allowed_actors", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsDismissalRestriction(block: RepositoryRuleParamsDismissalRestriction.Builder.() -> Unit): RepositoryRuleParamsDismissalRestriction = RepositoryRuleParamsDismissalRestriction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsDismissalRestriction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
