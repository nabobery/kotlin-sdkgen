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
 * Parameters for a repository property condition
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-property-target
 */
@Serializable(with = RepositoryRulesetConditionsRepositoryPropertyTarget.Serializer::class)
public class RepositoryRulesetConditionsRepositoryPropertyTarget(
  public val repositoryProperty: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba,
) {
  public class Builder {
    private var repositoryPropertyValue: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba?
        = null

    public var repositoryProperty: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba
      get() = requireNotNull(repositoryPropertyValue) { "repositoryProperty is required" }
      set(`value`) {
        repositoryPropertyValue = value
      }

    public fun build(): RepositoryRulesetConditionsRepositoryPropertyTarget {
      check(repositoryPropertyValue != null) { "repositoryProperty is required" }
      return RepositoryRulesetConditionsRepositoryPropertyTarget(
        repositoryProperty = repositoryProperty,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRulesetConditionsRepositoryPropertyTarget = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRulesetConditionsRepositoryPropertyTarget> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRulesetConditionsRepositoryPropertyTarget {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRulesetConditionsRepositoryPropertyTarget")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRulesetConditionsRepositoryPropertyTarget must be a JSON object")
      val repositoryProperty = json.decodeRequired<InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba>(rawObject, "repository_property")
      return RepositoryRulesetConditionsRepositoryPropertyTarget(
        repositoryProperty = repositoryProperty,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRulesetConditionsRepositoryPropertyTarget) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRulesetConditionsRepositoryPropertyTarget")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_property", json.encodeToJsonElement(value.repositoryProperty))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRulesetConditionsRepositoryPropertyTarget(block: RepositoryRulesetConditionsRepositoryPropertyTarget.Builder.() -> Unit): RepositoryRulesetConditionsRepositoryPropertyTarget = RepositoryRulesetConditionsRepositoryPropertyTarget.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRulesetConditionsRepositoryPropertyTarget is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
