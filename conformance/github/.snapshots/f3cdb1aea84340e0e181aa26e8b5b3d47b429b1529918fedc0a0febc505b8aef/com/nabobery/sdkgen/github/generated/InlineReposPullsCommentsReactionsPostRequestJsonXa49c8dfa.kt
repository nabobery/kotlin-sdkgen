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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1comments~1{comment_id}~1reactions/post/requestBo
 * dy/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1comments~1{comment_id}~1reactions/post/requestBo
 * dy/content/application~1json/schema
 */
@Serializable(with = InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa.Serializer::class)
public class InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa(
  /**
   * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the pull request
   * review comment.
   */
  public val content: InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc,
) {
  public class Builder {
    private var contentValue: InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc? =
        null

    public var content: InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    public fun build(): InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa {
      check(contentValue != null) { "content is required" }
      return InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa must be a JSON object")
      val content = json.decodeRequired<InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc>(rawObject, "content")
      return InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa(block: InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa.Builder.() -> Unit): InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa = InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
