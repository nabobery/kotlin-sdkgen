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
 * ll_requests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/pu
 * ll_requests/items/properties/base
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869.Serializer::class)
public class InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869(
  public val ref: String,
  public val repo: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseRepoXc7c4cf5b,
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
        InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseRepoXc7c4cf5b? = null

    public var repo: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseRepoXc7c4cf5b
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

    public fun build(): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseRepoXc7c4cf5b>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869")
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

public fun inlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869(block: InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869.Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869 = InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemBaseX49d60869 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
