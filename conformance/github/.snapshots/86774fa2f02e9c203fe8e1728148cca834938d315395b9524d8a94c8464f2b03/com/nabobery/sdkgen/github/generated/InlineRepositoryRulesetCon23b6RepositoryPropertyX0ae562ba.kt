package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-property-target/properties/
 * repository_property.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-property-target/properties/
 * repository_property
 */
@Serializable(with = InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba.Serializer::class)
public class InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba(
  exclude: List<RepositoryRulesetConditionsRepositoryPropertySpec>? = null,
  include: List<RepositoryRulesetConditionsRepositoryPropertySpec>? = null,
) {
  /**
   * The repository properties and values to exclude. The condition will not pass if any of these properties match.
   */
  public val exclude: List<RepositoryRulesetConditionsRepositoryPropertySpec>? =
      exclude?.let { collection0 -> collection0.toList() }

  /**
   * The repository properties and values to include. All of these properties must match for the condition to pass.
   */
  public val include: List<RepositoryRulesetConditionsRepositoryPropertySpec>? =
      include?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var excludeValue: List<RepositoryRulesetConditionsRepositoryPropertySpec>? = null

    /**
     * The repository properties and values to exclude. The condition will not pass if any of these properties match.
     */
    public var exclude: List<RepositoryRulesetConditionsRepositoryPropertySpec>?
      get() = excludeValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludeValue = value?.let { collection0 -> collection0.toList() }
      }

    private var includeValue: List<RepositoryRulesetConditionsRepositoryPropertySpec>? = null

    /**
     * The repository properties and values to include. All of these properties must match for the condition to pass.
     */
    public var include: List<RepositoryRulesetConditionsRepositoryPropertySpec>?
      get() = includeValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        includeValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba = InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba(
      exclude = exclude,
      include = include,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba must be a JSON object")
      return InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba(
        exclude = rawObject["exclude"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetConditionsRepositoryPropertySpec>>(it) },
        include = rawObject["include"]?.let { json.decodeFromJsonElement<List<RepositoryRulesetConditionsRepositoryPropertySpec>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.exclude?.let { put("exclude", json.encodeToJsonElement(it)) }
        value.include?.let { put("include", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba(block: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba.Builder.() -> Unit): InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba = InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba.build(block)
