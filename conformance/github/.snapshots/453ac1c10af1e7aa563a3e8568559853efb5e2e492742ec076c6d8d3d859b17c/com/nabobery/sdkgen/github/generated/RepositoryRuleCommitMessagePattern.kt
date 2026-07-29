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
 * Parameters to be used for the commit_message_pattern rule
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-message-pattern
 */
@Serializable(with = RepositoryRuleCommitMessagePattern.Serializer::class)
public class RepositoryRuleCommitMessagePattern(
  public val type: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f,
  public val parameters: InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f? = null

    public var type: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba? = null

    public fun build(): RepositoryRuleCommitMessagePattern {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleCommitMessagePattern(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleCommitMessagePattern = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleCommitMessagePattern> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleCommitMessagePattern {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleCommitMessagePattern")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleCommitMessagePattern must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f>(rawObject, "type")
      return RepositoryRuleCommitMessagePattern(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleCommitMessagePatternParametersXb437b8ba>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleCommitMessagePattern) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleCommitMessagePattern")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleCommitMessagePattern(block: RepositoryRuleCommitMessagePattern.Builder.() -> Unit): RepositoryRuleCommitMessagePattern = RepositoryRuleCommitMessagePattern.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleCommitMessagePattern is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
