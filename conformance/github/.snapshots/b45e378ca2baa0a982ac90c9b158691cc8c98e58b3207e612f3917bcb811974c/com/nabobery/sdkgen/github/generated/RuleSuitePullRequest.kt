package com.nabobery.sdkgen.github.generated

import kotlin.Unit
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
 * Metadata for a pull request rule evaluation result.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite-pull-request
 */
@Serializable(with = RuleSuitePullRequest.Serializer::class)
public class RuleSuitePullRequest(
  /**
   * The pull request associated with the rule evaluation.
   */
  public val pullRequest: InlineRuleSuitePullRequestPullRequestX2e7d19fe? = null,
) {
  public class Builder {
    /**
     * The pull request associated with the rule evaluation.
     */
    public var pullRequest: InlineRuleSuitePullRequestPullRequestX2e7d19fe? = null

    public fun build(): RuleSuitePullRequest = RuleSuitePullRequest(
      pullRequest = pullRequest,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RuleSuitePullRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RuleSuitePullRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RuleSuitePullRequest {
      val jsonDecoder = decoder.requireJsonDecoder("RuleSuitePullRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RuleSuitePullRequest must be a JSON object")
      return RuleSuitePullRequest(
        pullRequest = rawObject["pull_request"]?.let { json.decodeFromJsonElement<InlineRuleSuitePullRequestPullRequestX2e7d19fe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RuleSuitePullRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("RuleSuitePullRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.pullRequest?.let { put("pull_request", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun ruleSuitePullRequest(block: RuleSuitePullRequest.Builder.() -> Unit): RuleSuitePullRequest = RuleSuitePullRequest.build(block)
