package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class RepositoryRulesetConditionsView(
  @SerialName("ref_name")
  public val refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null,
)

/**
 * Parameters for a repository ruleset ref name condition
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions
 */
@Serializable(with = RepositoryRulesetConditions.Serializer::class)
public class RepositoryRulesetConditions(
  public val refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null,
) {
  public class Builder {
    public var refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null

    public fun build(): RepositoryRulesetConditions = RepositoryRulesetConditions(
      refName = refName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRulesetConditions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRulesetConditions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRulesetConditions {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRulesetConditions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRulesetConditions must be a JSON object")
      return RepositoryRulesetConditions(
        refName = rawObject["ref_name"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetConditionsRefNameX4b3789e8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRulesetConditions) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRulesetConditions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.refName?.let { put("ref_name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRulesetConditions(block: RepositoryRulesetConditions.Builder.() -> Unit): RepositoryRulesetConditions = RepositoryRulesetConditions.build(block)
