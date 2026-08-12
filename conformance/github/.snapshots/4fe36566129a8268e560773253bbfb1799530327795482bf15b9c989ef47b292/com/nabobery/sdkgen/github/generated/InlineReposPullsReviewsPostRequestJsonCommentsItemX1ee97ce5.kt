package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews/post/requestBody/content/
 * application~1json/schema/properties/comments/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews/post/requestBody/content/
 * application~1json/schema/properties/comments/items
 */
@Serializable(with = InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5.Serializer::class)
public class InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5(
  /**
   * Text of the review comment.
   */
  public val body: String,
  /**
   * The relative path to the file that necessitates a review comment.
   */
  public val path: String,
  public val line: Int? = null,
  /**
   * The position in the diff where you want to add a review comment. Note this value is not the same as the line number
   * in the file. The `position` value equals the number of lines down from the first "@@" hunk header in the file you
   * want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The
   * position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of
   * a new file.
   */
  public val position: Int? = null,
  public val side: String? = null,
  public val startLine: Int? = null,
  public val startSide: String? = null,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    public var line: Int? = null

    /**
     * The position in the diff where you want to add a review comment. Note this value is not the same as the line
     * number in the file. The `position` value equals the number of lines down from the first "@@" hunk header in the
     * file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and
     * so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the
     * beginning of a new file.
     */
    public var position: Int? = null

    public var side: String? = null

    public var startLine: Int? = null

    public var startSide: String? = null

    public fun build(): InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5 {
      check(bodyValue != null) { "body is required" }
      check(pathValue != null) { "path is required" }
      return InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5(
        body = body,
        path = path,
        line = line,
        position = position,
        side = side,
        startLine = startLine,
        startSide = startSide,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5 must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val path = json.decodeRequired<String>(rawObject, "path")
      return InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5(
        body = body,
        path = path,
        line = rawObject["line"]?.let { json.decodeFromJsonElement<Int>(it) },
        position = rawObject["position"]?.let { json.decodeFromJsonElement<Int>(it) },
        side = rawObject["side"]?.let { json.decodeFromJsonElement<String>(it) },
        startLine = rawObject["start_line"]?.let { json.decodeFromJsonElement<Int>(it) },
        startSide = rawObject["start_side"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
        put("path", value.path)
        value.line?.let { put("line", json.encodeToJsonElement(it)) }
        value.position?.let { put("position", json.encodeToJsonElement(it)) }
        value.side?.let { put("side", it) }
        value.startLine?.let { put("start_line", json.encodeToJsonElement(it)) }
        value.startSide?.let { put("start_side", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5(block: InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5.Builder.() -> Unit): InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5 = InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsReviewsPostRequestJsonCommentsItemX1ee97ce5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
