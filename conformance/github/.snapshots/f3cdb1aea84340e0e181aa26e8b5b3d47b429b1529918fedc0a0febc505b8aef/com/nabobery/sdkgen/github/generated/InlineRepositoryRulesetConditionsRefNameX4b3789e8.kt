package com.nabobery.sdkgen.github.generated

import kotlin.String
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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions/properties/ref_name.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions/properties/ref_name
 */
@Serializable(with = InlineRepositoryRulesetConditionsRefNameX4b3789e8.Serializer::class)
public class InlineRepositoryRulesetConditionsRefNameX4b3789e8(
  exclude: List<String>? = null,
  include: List<String>? = null,
) {
  /**
   * Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
   */
  public val exclude: List<String>? = exclude?.let { collection0 -> collection0.toList() }

  /**
   * Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts
   * `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
   */
  public val include: List<String>? = include?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var excludeValue: List<String>? = null

    /**
     * Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
     */
    public var exclude: List<String>?
      get() = excludeValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludeValue = value?.let { collection0 -> collection0.toList() }
      }

    private var includeValue: List<String>? = null

    /**
     * Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also
     * accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
     */
    public var include: List<String>?
      get() = includeValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        includeValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineRepositoryRulesetConditionsRefNameX4b3789e8 = InlineRepositoryRulesetConditionsRefNameX4b3789e8(
      exclude = exclude,
      include = include,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulesetConditionsRefNameX4b3789e8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetConditionsRefNameX4b3789e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetConditionsRefNameX4b3789e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetConditionsRefNameX4b3789e8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulesetConditionsRefNameX4b3789e8 must be a JSON object")
      return InlineRepositoryRulesetConditionsRefNameX4b3789e8(
        exclude = rawObject["exclude"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        include = rawObject["include"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetConditionsRefNameX4b3789e8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulesetConditionsRefNameX4b3789e8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.exclude?.let { put("exclude", json.encodeToJsonElement(it)) }
        value.include?.let { put("include", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulesetConditionsRefNameX4b3789e8(block: InlineRepositoryRulesetConditionsRefNameX4b3789e8.Builder.() -> Unit): InlineRepositoryRulesetConditionsRefNameX4b3789e8 = InlineRepositoryRulesetConditionsRefNameX4b3789e8.build(block)
