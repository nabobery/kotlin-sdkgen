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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items/properties/head
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655.Serializer::class)
public class InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655(
  public val ref: String,
  public val repo: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe,
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
        InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe? = null

    public var repo: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe
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

    public fun build(): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655")
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

public fun inlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655(block: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655.Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655 = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadX2bf25655 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
