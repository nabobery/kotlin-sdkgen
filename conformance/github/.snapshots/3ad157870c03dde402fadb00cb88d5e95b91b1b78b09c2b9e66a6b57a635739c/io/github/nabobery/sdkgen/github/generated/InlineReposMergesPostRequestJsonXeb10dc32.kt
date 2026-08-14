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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1merges/post/requestBody/content/application~1json/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1merges/post/requestBody/content/application~1json/schem
 * a
 */
@Serializable(with = InlineReposMergesPostRequestJsonXeb10dc32.Serializer::class)
public class InlineReposMergesPostRequestJsonXeb10dc32(
  /**
   * The name of the base branch that the head will be merged into.
   */
  public val base: String,
  /**
   * The head to merge. This can be a branch name or a commit SHA1.
   */
  public val head: String,
  /**
   * Commit message to use for the merge commit. If omitted, a default message will be used.
   */
  public val commitMessage: String? = null,
) {
  public class Builder {
    private var baseValue: String? = null

    public var base: String
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue: String? = null

    public var head: String
      get() = requireNotNull(headValue) { "head is required" }
      set(`value`) {
        headValue = value
      }

    /**
     * Commit message to use for the merge commit. If omitted, a default message will be used.
     */
    public var commitMessage: String? = null

    public fun build(): InlineReposMergesPostRequestJsonXeb10dc32 {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      return InlineReposMergesPostRequestJsonXeb10dc32(
        base = base,
        head = head,
        commitMessage = commitMessage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposMergesPostRequestJsonXeb10dc32 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposMergesPostRequestJsonXeb10dc32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposMergesPostRequestJsonXeb10dc32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposMergesPostRequestJsonXeb10dc32")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposMergesPostRequestJsonXeb10dc32 must be a JSON object")
      val base = json.decodeRequired<String>(rawObject, "base")
      val head = json.decodeRequired<String>(rawObject, "head")
      return InlineReposMergesPostRequestJsonXeb10dc32(
        base = base,
        head = head,
        commitMessage = rawObject["commit_message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposMergesPostRequestJsonXeb10dc32) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposMergesPostRequestJsonXeb10dc32")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base", value.base)
        put("head", value.head)
        value.commitMessage?.let { put("commit_message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposMergesPostRequestJsonXeb10dc32(block: InlineReposMergesPostRequestJsonXeb10dc32.Builder.() -> Unit): InlineReposMergesPostRequestJsonXeb10dc32 = InlineReposMergesPostRequestJsonXeb10dc32.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposMergesPostRequestJsonXeb10dc32 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
