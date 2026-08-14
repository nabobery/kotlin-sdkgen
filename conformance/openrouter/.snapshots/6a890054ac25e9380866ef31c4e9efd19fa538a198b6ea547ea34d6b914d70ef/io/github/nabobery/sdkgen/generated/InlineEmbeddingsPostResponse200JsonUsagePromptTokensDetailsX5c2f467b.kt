package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Per-modality token breakdown. Only present when the input contains 2+ modalities (e.g. text + image) and the upstream
 * provider returns modality-level usage data. Only non-zero modality counts are included.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/usage
 * /properties/prompt_tokens_details
 */
@Serializable(with = InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b.Serializer::class)
public class InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b(
  /**
   * Number of audio tokens in the input
   */
  public val audioTokens: Int? = null,
  /**
   * Number of file/document tokens in the input
   */
  public val fileTokens: Int? = null,
  /**
   * Number of image tokens in the input
   */
  public val imageTokens: Int? = null,
  /**
   * Number of text tokens in the input
   */
  public val textTokens: Int? = null,
  /**
   * Number of video tokens in the input
   */
  public val videoTokens: Int? = null,
) {
  public class Builder {
    /**
     * Number of audio tokens in the input
     */
    public var audioTokens: Int? = null

    /**
     * Number of file/document tokens in the input
     */
    public var fileTokens: Int? = null

    /**
     * Number of image tokens in the input
     */
    public var imageTokens: Int? = null

    /**
     * Number of text tokens in the input
     */
    public var textTokens: Int? = null

    /**
     * Number of video tokens in the input
     */
    public var videoTokens: Int? = null

    public fun build(): InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b = InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b(
      audioTokens = audioTokens,
      fileTokens = fileTokens,
      imageTokens = imageTokens,
      textTokens = textTokens,
      videoTokens = videoTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b must be a JSON object")
      return InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b(
        audioTokens = rawObject["audio_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        fileTokens = rawObject["file_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        imageTokens = rawObject["image_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        textTokens = rawObject["text_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        videoTokens = rawObject["video_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.audioTokens?.let { put("audio_tokens", json.encodeToJsonElement(it)) }
        value.fileTokens?.let { put("file_tokens", json.encodeToJsonElement(it)) }
        value.imageTokens?.let { put("image_tokens", json.encodeToJsonElement(it)) }
        value.textTokens?.let { put("text_tokens", json.encodeToJsonElement(it)) }
        value.videoTokens?.let { put("video_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b(block: InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b.Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b = InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b.build(block)
