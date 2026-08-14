package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-branch-name-pattern/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-branch-name-pattern/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleBranchNamePatternParametersX75220c8a.Serializer::class)
public class InlineRepositoryRuleBranchNamePatternParametersX75220c8a(
  /**
   * The operator to use for matching.
   */
  public val `operator`: InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744,
  /**
   * The pattern to match with.
   */
  public val pattern: String,
  /**
   * How this rule appears when configuring it.
   */
  public val name: String? = null,
  /**
   * If true, the rule will fail if the pattern matches.
   */
  public val negate: Boolean? = null,
) {
  public class Builder {
    private var operatorValue: InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744? =
        null

    public var `operator`: InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744
      get() = requireNotNull(operatorValue) { "operator is required" }
      set(`value`) {
        operatorValue = value
      }

    private var patternValue: String? = null

    public var pattern: String
      get() = requireNotNull(patternValue) { "pattern is required" }
      set(`value`) {
        patternValue = value
      }

    /**
     * How this rule appears when configuring it.
     */
    public var name: String? = null

    /**
     * If true, the rule will fail if the pattern matches.
     */
    public var negate: Boolean? = null

    public fun build(): InlineRepositoryRuleBranchNamePatternParametersX75220c8a {
      check(operatorValue != null) { "operator is required" }
      check(patternValue != null) { "pattern is required" }
      return InlineRepositoryRuleBranchNamePatternParametersX75220c8a(
        operator = operator,
        pattern = pattern,
        name = name,
        negate = negate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleBranchNamePatternParametersX75220c8a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleBranchNamePatternParametersX75220c8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleBranchNamePatternParametersX75220c8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleBranchNamePatternParametersX75220c8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleBranchNamePatternParametersX75220c8a must be a JSON object")
      val operator = json.decodeRequired<InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744>(rawObject, "operator")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      return InlineRepositoryRuleBranchNamePatternParametersX75220c8a(
        operator = operator,
        pattern = pattern,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        negate = rawObject["negate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleBranchNamePatternParametersX75220c8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleBranchNamePatternParametersX75220c8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("operator", json.encodeToJsonElement(value.operator))
        put("pattern", value.pattern)
        value.name?.let { put("name", it) }
        value.negate?.let { put("negate", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleBranchNamePatternParametersX75220c8a(block: InlineRepositoryRuleBranchNamePatternParametersX75220c8a.Builder.() -> Unit): InlineRepositoryRuleBranchNamePatternParametersX75220c8a = InlineRepositoryRuleBranchNamePatternParametersX75220c8a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleBranchNamePatternParametersX75220c8a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
