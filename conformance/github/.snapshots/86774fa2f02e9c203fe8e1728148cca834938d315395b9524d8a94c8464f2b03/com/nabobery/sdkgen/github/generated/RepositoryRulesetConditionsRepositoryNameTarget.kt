package com.nabobery.sdkgen.github.generated

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
 * Parameters for a repository name condition
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-name-target
 */
@Serializable(with = RepositoryRulesetConditionsRepositoryNameTarget.Serializer::class)
public class RepositoryRulesetConditionsRepositoryNameTarget(
  public val repositoryName:
      InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818,
) {
  public class Builder {
    private var repositoryNameValue:
        InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818? = null

    public var repositoryName:
        InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818
      get() = requireNotNull(repositoryNameValue) { "repositoryName is required" }
      set(`value`) {
        repositoryNameValue = value
      }

    public fun build(): RepositoryRulesetConditionsRepositoryNameTarget {
      check(repositoryNameValue != null) { "repositoryName is required" }
      return RepositoryRulesetConditionsRepositoryNameTarget(
        repositoryName = repositoryName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRulesetConditionsRepositoryNameTarget = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRulesetConditionsRepositoryNameTarget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRulesetConditionsRepositoryNameTarget {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRulesetConditionsRepositoryNameTarget")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRulesetConditionsRepositoryNameTarget must be a JSON object")
      val repositoryName = json.decodeRequired<InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818>(rawObject, "repository_name")
      return RepositoryRulesetConditionsRepositoryNameTarget(
        repositoryName = repositoryName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRulesetConditionsRepositoryNameTarget) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRulesetConditionsRepositoryNameTarget")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_name", json.encodeToJsonElement(value.repositoryName))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRulesetConditionsRepositoryNameTarget(block: RepositoryRulesetConditionsRepositoryNameTarget.Builder.() -> Unit): RepositoryRulesetConditionsRepositoryNameTarget = RepositoryRulesetConditionsRepositoryNameTarget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRulesetConditionsRepositoryNameTarget is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
