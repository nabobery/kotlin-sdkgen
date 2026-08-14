package io.github.nabobery.sdkgen.github.generated

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
 * Parameters for a repository ID condition
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-id-target
 */
@Serializable(with = RepositoryRulesetConditionsRepositoryIdTarget.Serializer::class)
public class RepositoryRulesetConditionsRepositoryIdTarget(
  public val repositoryId: InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2,
) {
  public class Builder {
    private var repositoryIdValue:
        InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2? = null

    public var repositoryId:
        InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    public fun build(): RepositoryRulesetConditionsRepositoryIdTarget {
      check(repositoryIdValue != null) { "repositoryId is required" }
      return RepositoryRulesetConditionsRepositoryIdTarget(
        repositoryId = repositoryId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRulesetConditionsRepositoryIdTarget = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRulesetConditionsRepositoryIdTarget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRulesetConditionsRepositoryIdTarget {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRulesetConditionsRepositoryIdTarget")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRulesetConditionsRepositoryIdTarget must be a JSON object")
      val repositoryId = json.decodeRequired<InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2>(rawObject, "repository_id")
      return RepositoryRulesetConditionsRepositoryIdTarget(
        repositoryId = repositoryId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRulesetConditionsRepositoryIdTarget) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRulesetConditionsRepositoryIdTarget")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRulesetConditionsRepositoryIdTarget(block: RepositoryRulesetConditionsRepositoryIdTarget.Builder.() -> Unit): RepositoryRulesetConditionsRepositoryIdTarget = RepositoryRulesetConditionsRepositoryIdTarget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRulesetConditionsRepositoryIdTarget is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
