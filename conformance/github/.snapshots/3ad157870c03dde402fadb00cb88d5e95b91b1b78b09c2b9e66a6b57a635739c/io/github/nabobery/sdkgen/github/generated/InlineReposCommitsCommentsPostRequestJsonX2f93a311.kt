package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1commits~1{commit_sha}~1comments/post/requestBody/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1commits~1{commit_sha}~1comments/post/requestBody/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineReposCommitsCommentsPostRequestJsonX2f93a311.Serializer::class)
public class InlineReposCommitsCommentsPostRequestJsonX2f93a311(
  /**
   * The contents of the comment.
   */
  public val body: String,
  /**
   * **Closing down notice**. Use **position** parameter instead. Line number in the file to comment on.
   */
  public val line: Int? = null,
  /**
   * Relative path of the file to comment on.
   */
  public val path: String? = null,
  /**
   * Line index in the diff to comment on.
   */
  public val position: Int? = null,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    /**
     * **Closing down notice**. Use **position** parameter instead. Line number in the file to comment on.
     */
    public var line: Int? = null

    /**
     * Relative path of the file to comment on.
     */
    public var path: String? = null

    /**
     * Line index in the diff to comment on.
     */
    public var position: Int? = null

    public fun build(): InlineReposCommitsCommentsPostRequestJsonX2f93a311 {
      check(bodyValue != null) { "body is required" }
      return InlineReposCommitsCommentsPostRequestJsonX2f93a311(
        body = body,
        line = line,
        path = path,
        position = position,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCommitsCommentsPostRequestJsonX2f93a311 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCommitsCommentsPostRequestJsonX2f93a311> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCommitsCommentsPostRequestJsonX2f93a311 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCommitsCommentsPostRequestJsonX2f93a311")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCommitsCommentsPostRequestJsonX2f93a311 must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      return InlineReposCommitsCommentsPostRequestJsonX2f93a311(
        body = body,
        line = rawObject["line"]?.let { json.decodeFromJsonElement<Int>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        position = rawObject["position"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCommitsCommentsPostRequestJsonX2f93a311) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCommitsCommentsPostRequestJsonX2f93a311")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
        value.line?.let { put("line", json.encodeToJsonElement(it)) }
        value.path?.let { put("path", it) }
        value.position?.let { put("position", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCommitsCommentsPostRequestJsonX2f93a311(block: InlineReposCommitsCommentsPostRequestJsonX2f93a311.Builder.() -> Unit): InlineReposCommitsCommentsPostRequestJsonX2f93a311 = InlineReposCommitsCommentsPostRequestJsonX2f93a311.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCommitsCommentsPostRequestJsonX2f93a311 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
