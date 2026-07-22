package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-id-target/properties/reposi
 * tory_id.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-id-target/properties/reposi
 * tory_id
 */
@Serializable(with = InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2.Serializer::class)
public class InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2(
  /**
   * The repository IDs that the ruleset applies to. One of these IDs must match for the condition to pass.
   */
  public val repositoryIds: List<Int>? = null,
) {
  public class Builder {
    /**
     * The repository IDs that the ruleset applies to. One of these IDs must match for the condition to pass.
     */
    public var repositoryIds: List<Int>? = null

    public fun build(): InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2 = InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2(
      repositoryIds = repositoryIds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2 must be a JSON object")
      return InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2(
        repositoryIds = rawObject["repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.repositoryIds?.let { put("repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2(block: InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2.Builder.() -> Unit): InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2 = InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2.build(block)
