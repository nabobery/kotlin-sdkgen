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
 * The historical version of a ruleset
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ruleset-version
 */
@Serializable(with = RulesetVersion.Serializer::class)
public class RulesetVersion(
  /**
   * The actor who updated the ruleset
   */
  public val actor: InlineRulesetVersionActorX465fc6ea,
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

    public fun build(): RulesetVersion {
      check(actorValue != null) { "actor is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(versionIdValue != null) { "versionId is required" }
      return RulesetVersion(
        actor = actor,
        updatedAt = updatedAt,
        versionId = versionId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RulesetVersion = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RulesetVersion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RulesetVersion {
      val jsonDecoder = decoder.requireJsonDecoder("RulesetVersion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RulesetVersion must be a JSON object")
      val actor = json.decodeRequired<InlineRulesetVersionActorX465fc6ea>(rawObject, "actor")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val versionId = json.decodeRequired<Int>(rawObject, "version_id")
      return RulesetVersion(
        actor = actor,
        updatedAt = updatedAt,
        versionId = versionId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RulesetVersion) {
      val jsonEncoder = encoder.requireJsonEncoder("RulesetVersion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", json.encodeToJsonElement(value.actor))
        put("updated_at", value.updatedAt)
        put("version_id", json.encodeToJsonElement(value.versionId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rulesetVersion(block: RulesetVersion.Builder.() -> Unit): RulesetVersion = RulesetVersion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RulesetVersion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
