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
 * Parameters to be used for the commit_author_email_pattern rule
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-author-email-pattern
 */
@Serializable(with = RepositoryRuleCommitAuthorEmailPattern.Serializer::class)
public class RepositoryRuleCommitAuthorEmailPattern(
  public val type: InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6,
  public val parameters: InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6? = null

    public var type: InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c? = null

    public fun build(): RepositoryRuleCommitAuthorEmailPattern {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleCommitAuthorEmailPattern(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleCommitAuthorEmailPattern = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleCommitAuthorEmailPattern> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleCommitAuthorEmailPattern {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleCommitAuthorEmailPattern")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleCommitAuthorEmailPattern must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6>(rawObject, "type")
      return RepositoryRuleCommitAuthorEmailPattern(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleCommitAuthorEmailPatternParametersXe4a6bb6c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleCommitAuthorEmailPattern) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleCommitAuthorEmailPattern")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleCommitAuthorEmailPattern(block: RepositoryRuleCommitAuthorEmailPattern.Builder.() -> Unit): RepositoryRuleCommitAuthorEmailPattern = RepositoryRuleCommitAuthorEmailPattern.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleCommitAuthorEmailPattern is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
