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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments~1{comment_id}~1replies/p
 * ost/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments~1{comment_id}~1replies/p
 * ost/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad.Serializer::class)
public class InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad(
  /**
   * The text of the review comment.
   */
  public val body: String,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    public fun build(): InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad {
      check(bodyValue != null) { "body is required" }
      return InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      return InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad(block: InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad.Builder.() -> Unit): InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad = InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
