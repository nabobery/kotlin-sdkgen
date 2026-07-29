package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1merge/put/requestBody/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1merge/put/requestBody/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineReposPullsMergePutRequestJsonX82e311a9.Serializer::class)
public class InlineReposPullsMergePutRequestJsonX82e311a9(
  /**
   * Extra detail to append to automatic commit message.
   */
  public val commitMessage: String? = null,
  /**
   * Title for the automatic commit message.
   */
  public val commitTitle: String? = null,
  /**
   * The merge method to use.
   */
  public val mergeMethod: InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60? = null,
  /**
   * SHA that pull request head must match to allow merge.
   */
  public val sha: String? = null,
) {
  public class Builder {
    /**
     * Extra detail to append to automatic commit message.
     */
    public var commitMessage: String? = null

    /**
     * Title for the automatic commit message.
     */
    public var commitTitle: String? = null

    /**
     * The merge method to use.
     */
    public var mergeMethod: InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60? = null

    /**
     * SHA that pull request head must match to allow merge.
     */
    public var sha: String? = null

    public fun build(): InlineReposPullsMergePutRequestJsonX82e311a9 = InlineReposPullsMergePutRequestJsonX82e311a9(
      commitMessage = commitMessage,
      commitTitle = commitTitle,
      mergeMethod = mergeMethod,
      sha = sha,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsMergePutRequestJsonX82e311a9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPullsMergePutRequestJsonX82e311a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsMergePutRequestJsonX82e311a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsMergePutRequestJsonX82e311a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsMergePutRequestJsonX82e311a9 must be a JSON object")
      return InlineReposPullsMergePutRequestJsonX82e311a9(
        commitMessage = rawObject["commit_message"]?.let { json.decodeFromJsonElement<String>(it) },
        commitTitle = rawObject["commit_title"]?.let { json.decodeFromJsonElement<String>(it) },
        mergeMethod = rawObject["merge_method"]?.let { json.decodeFromJsonElement<InlineReposPullsMergePutRequestJsonMergeMethodXfac33c60>(it) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsMergePutRequestJsonX82e311a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsMergePutRequestJsonX82e311a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.commitMessage?.let { put("commit_message", it) }
        value.commitTitle?.let { put("commit_title", it) }
        value.mergeMethod?.let { put("merge_method", json.encodeToJsonElement(it)) }
        value.sha?.let { put("sha", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsMergePutRequestJsonX82e311a9(block: InlineReposPullsMergePutRequestJsonX82e311a9.Builder.() -> Unit): InlineReposPullsMergePutRequestJsonX82e311a9 = InlineReposPullsMergePutRequestJsonX82e311a9.build(block)
