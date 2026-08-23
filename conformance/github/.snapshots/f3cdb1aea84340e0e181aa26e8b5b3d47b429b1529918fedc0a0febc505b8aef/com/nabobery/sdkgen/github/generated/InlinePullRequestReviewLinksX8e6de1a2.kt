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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-review/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review/properties/_links
 */
@Serializable(with = InlinePullRequestReviewLinksX8e6de1a2.Serializer::class)
public class InlinePullRequestReviewLinksX8e6de1a2(
  public val html: InlinePullRequestReviewLinksHtmlXdc499324,
  public val pullRequest: InlinePullRequestReviewLinksPullRequestXd0e93a19,
) {
  public class Builder {
    private var htmlValue: InlinePullRequestReviewLinksHtmlXdc499324? = null

    public var html: InlinePullRequestReviewLinksHtmlXdc499324
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue: InlinePullRequestReviewLinksPullRequestXd0e93a19? = null

    public var pullRequest: InlinePullRequestReviewLinksPullRequestXd0e93a19
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    public fun build(): InlinePullRequestReviewLinksX8e6de1a2 {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      return InlinePullRequestReviewLinksX8e6de1a2(
        html = html,
        pullRequest = pullRequest,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewLinksX8e6de1a2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewLinksX8e6de1a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewLinksX8e6de1a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewLinksX8e6de1a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewLinksX8e6de1a2 must be a JSON object")
      val html = json.decodeRequired<InlinePullRequestReviewLinksHtmlXdc499324>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlinePullRequestReviewLinksPullRequestXd0e93a19>(rawObject, "pull_request")
      return InlinePullRequestReviewLinksX8e6de1a2(
        html = html,
        pullRequest = pullRequest,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewLinksX8e6de1a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewLinksX8e6de1a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewLinksX8e6de1a2(block: InlinePullRequestReviewLinksX8e6de1a2.Builder.() -> Unit): InlinePullRequestReviewLinksX8e6de1a2 = InlinePullRequestReviewLinksX8e6de1a2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewLinksX8e6de1a2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
