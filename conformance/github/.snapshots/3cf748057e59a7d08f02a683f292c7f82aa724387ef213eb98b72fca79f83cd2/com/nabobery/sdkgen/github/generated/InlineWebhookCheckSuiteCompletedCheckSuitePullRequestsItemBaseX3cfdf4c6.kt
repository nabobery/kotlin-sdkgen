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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items/properties/base
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6.Serializer::class)
public class InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6(
  public val ref: String,
  public val repo: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseRepoX141503ae,
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
        InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseRepoX141503ae? = null

    public var repo: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseRepoX141503ae
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

    public fun build(): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseRepoX141503ae>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6")
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

public fun inlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6(block: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6.Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6 = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemBaseX3cfdf4c6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
