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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/pull
 * _requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/pull
 * _requests/items/properties/head
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340.Serializer::class)
public class InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340(
  public val ref: String,
  public val repo: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadRepoXc8b19677,
  public val sha: String,
) {
  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repoValue:
        InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadRepoXc8b19677? = null

    public var repo: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadRepoXc8b19677
      get() = requireNotNull(repoValue) { "repo is required" }
      set(`value`) {
        repoValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    public fun build(): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadRepoXc8b19677>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ref", value.ref)
        put("repo", json.encodeToJsonElement(value.repo))
        put("sha", value.sha)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340(block: InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340.Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340 = InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRequestedCheckSuitePullRequestsItemHeadXf8fc9340 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
