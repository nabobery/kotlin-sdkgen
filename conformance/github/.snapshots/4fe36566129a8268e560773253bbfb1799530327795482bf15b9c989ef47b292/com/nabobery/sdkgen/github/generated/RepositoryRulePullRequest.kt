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
 * Require all commits be made to a non-target branch and submitted via a pull request before they can be merged.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-pull-request
 */
@Serializable(with = RepositoryRulePullRequest.Serializer::class)
public class RepositoryRulePullRequest(
  public val type: InlineRepositoryRulePullRequestTypeX73e7678e,
  public val parameters: InlineRepositoryRulePullRequestParametersX345d67b5? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRulePullRequestTypeX73e7678e? = null

    public var type: InlineRepositoryRulePullRequestTypeX73e7678e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRulePullRequestParametersX345d67b5? = null

    public fun build(): RepositoryRulePullRequest {
      check(typeValue != null) { "type is required" }
      return RepositoryRulePullRequest(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRulePullRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRulePullRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRulePullRequest {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRulePullRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRulePullRequest must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRulePullRequestTypeX73e7678e>(rawObject, "type")
      return RepositoryRulePullRequest(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRulePullRequestParametersX345d67b5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRulePullRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRulePullRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRulePullRequest(block: RepositoryRulePullRequest.Builder.() -> Unit): RepositoryRulePullRequest = RepositoryRulePullRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRulePullRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
