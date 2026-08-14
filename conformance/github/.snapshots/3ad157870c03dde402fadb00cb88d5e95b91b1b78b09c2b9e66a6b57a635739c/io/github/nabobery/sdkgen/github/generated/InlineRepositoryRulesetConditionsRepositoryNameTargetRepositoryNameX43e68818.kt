package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-name-target/properties/repo
 * sitory_name.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-name-target/properties/repo
 * sitory_name
 */
@Serializable(with = InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818.Serializer::class)
public class InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818(
  exclude: List<String>? = null,
  include: List<String>? = null,
  /**
   * Whether renaming of target repositories is prevented.
   */
  public val `protected`: Boolean? = null,
) {
  /**
   * Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
   */
  public val exclude: List<String>? = exclude?.let { collection0 -> collection0.toList() }

  /**
   * Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also
   * accepts `~ALL` to include all repositories.
   */
  public val include: List<String>? = include?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var excludeValue: List<String>? = null

    /**
     * Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
     */
    public var exclude: List<String>?
      get() = excludeValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludeValue = value?.let { collection0 -> collection0.toList() }
      }

    private var includeValue: List<String>? = null

    /**
     * Array of repository names or patterns to include. One of these patterns must match for the condition to pass.
     * Also accepts `~ALL` to include all repositories.
     */
    public var include: List<String>?
      get() = includeValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        includeValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether renaming of target repositories is prevented.
     */
    public var `protected`: Boolean? = null

    public fun build(): InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818 = InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818(
      exclude = exclude,
      include = include,
      protected = protected,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818 must be a JSON object")
      return InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818(
        exclude = rawObject["exclude"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        include = rawObject["include"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        protected = rawObject["protected"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.exclude?.let { put("exclude", json.encodeToJsonElement(it)) }
        value.include?.let { put("include", json.encodeToJsonElement(it)) }
        value.protected?.let { put("protected", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818(block: InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818.Builder.() -> Unit): InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818 = InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818.build(block)
