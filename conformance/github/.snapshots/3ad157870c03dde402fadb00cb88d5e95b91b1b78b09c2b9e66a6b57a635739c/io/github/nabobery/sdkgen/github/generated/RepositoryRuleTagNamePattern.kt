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
 * Parameters to be used for the tag_name_pattern rule
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-tag-name-pattern
 */
@Serializable(with = RepositoryRuleTagNamePattern.Serializer::class)
public class RepositoryRuleTagNamePattern(
  public val type: InlineRepositoryRuleTagNamePatternTypeXe99b8e74,
  public val parameters: InlineRepositoryRuleTagNamePatternParametersX644c98ab? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleTagNamePatternTypeXe99b8e74? = null

    public var type: InlineRepositoryRuleTagNamePatternTypeXe99b8e74
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleTagNamePatternParametersX644c98ab? = null

    public fun build(): RepositoryRuleTagNamePattern {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleTagNamePattern(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleTagNamePattern = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleTagNamePattern> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleTagNamePattern {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleTagNamePattern")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleTagNamePattern must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleTagNamePatternTypeXe99b8e74>(rawObject, "type")
      return RepositoryRuleTagNamePattern(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleTagNamePatternParametersX644c98ab>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleTagNamePattern) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleTagNamePattern")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleTagNamePattern(block: RepositoryRuleTagNamePattern.Builder.() -> Unit): RepositoryRuleTagNamePattern = RepositoryRuleTagNamePattern.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleTagNamePattern is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
