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
 * Request Copilot code review for new pull requests automatically if the author has access to Copilot code review and
 * their premium requests quota has not reached the limit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-copilot-code-review
 */
@Serializable(with = RepositoryRuleCopilotCodeReview.Serializer::class)
public class RepositoryRuleCopilotCodeReview(
  public val type: InlineRepositoryRuleCopilotCodeReviewTypeX9668c647,
  public val parameters: InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleCopilotCodeReviewTypeX9668c647? = null

    public var type: InlineRepositoryRuleCopilotCodeReviewTypeX9668c647
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df? = null

    public fun build(): RepositoryRuleCopilotCodeReview {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleCopilotCodeReview(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleCopilotCodeReview = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleCopilotCodeReview> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleCopilotCodeReview {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleCopilotCodeReview")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleCopilotCodeReview must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleCopilotCodeReviewTypeX9668c647>(rawObject, "type")
      return RepositoryRuleCopilotCodeReview(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleCopilotCodeReview) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleCopilotCodeReview")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleCopilotCodeReview(block: RepositoryRuleCopilotCodeReview.Builder.() -> Unit): RepositoryRuleCopilotCodeReview = RepositoryRuleCopilotCodeReview.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleCopilotCodeReview is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
