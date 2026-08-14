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
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-event/properties/review/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-event/properties/review/properties/_links
 */
@Serializable(with = InlinePullRequestReviewEventReviewLinksX55683efe.Serializer::class)
public class InlinePullRequestReviewEventReviewLinksX55683efe(
  public val html: InlinePullRequestReviewEventReviewLinksHtmlXd07bb7d8,
  public val pullRequest: InlinePullRequestReviewEventReviewLinksPullRequestXce144fdf,
) {
  public class Builder {
    private var htmlValue: InlinePullRequestReviewEventReviewLinksHtmlXd07bb7d8? = null

    public var html: InlinePullRequestReviewEventReviewLinksHtmlXd07bb7d8
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue: InlinePullRequestReviewEventReviewLinksPullRequestXce144fdf? =
        null

    public var pullRequest: InlinePullRequestReviewEventReviewLinksPullRequestXce144fdf
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    public fun build(): InlinePullRequestReviewEventReviewLinksX55683efe {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      return InlinePullRequestReviewEventReviewLinksX55683efe(
        html = html,
        pullRequest = pullRequest,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewEventReviewLinksX55683efe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewEventReviewLinksX55683efe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewEventReviewLinksX55683efe {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewEventReviewLinksX55683efe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewEventReviewLinksX55683efe must be a JSON object")
      val html = json.decodeRequired<InlinePullRequestReviewEventReviewLinksHtmlXd07bb7d8>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlinePullRequestReviewEventReviewLinksPullRequestXce144fdf>(rawObject, "pull_request")
      return InlinePullRequestReviewEventReviewLinksX55683efe(
        html = html,
        pullRequest = pullRequest,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewEventReviewLinksX55683efe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewEventReviewLinksX55683efe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewEventReviewLinksX55683efe(block: InlinePullRequestReviewEventReviewLinksX55683efe.Builder.() -> Unit): InlinePullRequestReviewEventReviewLinksX55683efe = InlinePullRequestReviewEventReviewLinksX55683efe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewEventReviewLinksX55683efe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
