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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/pu
 * ll_requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/pu
 * ll_requests/items/properties/head
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802.Serializer::class)
public class InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802(
  public val ref: String,
  public val repo: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadRepoX06a20178,
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
        InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadRepoX06a20178? = null

    public var repo: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadRepoX06a20178
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

    public fun build(): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadRepoX06a20178>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802")
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

public fun inlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802(block: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802.Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802 = InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemHeadX7563e802 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
