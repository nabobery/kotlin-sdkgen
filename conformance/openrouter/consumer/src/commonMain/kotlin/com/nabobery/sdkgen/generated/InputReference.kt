package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InputReferenceDecodingException(
  message: String,
) : SerializationException(message)

public class InputReferenceNoMatchException(
  message: String,
) : InputReferenceDecodingException(message)

public class InputReferenceAmbiguityException(
  message: String,
) : InputReferenceDecodingException(message)

/**
 * A reference asset used to guide video generation. Image references are supported by all providers; audio and video
 * references are only honored by providers that support them (currently BytePlus Seedance 2.0).
 */
@Serializable(with = InputReference.Serializer::class)
public sealed interface InputReference {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ContentPartImage internal constructor(
    public val imageUrl: InlineComponentsSchemasContentPartImagePropertiesImageUrl,
    public val type: InlineComponentsSchemasContentPartImagePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InputReference {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(imageUrl: InlineComponentsSchemasContentPartImagePropertiesImageUrl,
        type: InlineComponentsSchemasContentPartImagePropertiesType): ContentPartImage = ContentPartImage(
        imageUrl = imageUrl,
        type = type,
        raw = buildJsonObject {
          put("image_url", SdkJson.encodeToJsonElement(imageUrl))
          put("type", "image_url")
        },
      )
    }
  }

  public class ContentPartAudio internal constructor(
    public val audioUrl: InlineComponentsSchemasContentPartAudioPropertiesAudioUrl,
    public val type: InlineComponentsSchemasContentPartAudioPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InputReference {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(audioUrl: InlineComponentsSchemasContentPartAudioPropertiesAudioUrl,
        type: InlineComponentsSchemasContentPartAudioPropertiesType): ContentPartAudio = ContentPartAudio(
        audioUrl = audioUrl,
        type = type,
        raw = buildJsonObject {
          put("audio_url", SdkJson.encodeToJsonElement(audioUrl))
          put("type", "audio_url")
        },
      )
    }
  }

  public class ContentPartVideo internal constructor(
    public val type: InlineComponentsSchemasContentPartVideoPropertiesType,
    public val videoUrl: InlineComponentsSchemasContentPartVideoPropertiesVideoUrl,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InputReference {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasContentPartVideoPropertiesType,
        videoUrl: InlineComponentsSchemasContentPartVideoPropertiesVideoUrl): ContentPartVideo = ContentPartVideo(
        type = type,
        videoUrl = videoUrl,
        raw = buildJsonObject {
          put("type", "video_url")
          put("video_url", SdkJson.encodeToJsonElement(videoUrl))
        },
      )
    }
  }

  public object Serializer : KSerializer<InputReference> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputReference {
      val jsonDecoder = decoder.requireJsonDecoder("InputReference")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InputReferenceNoMatchException("InputReference matched 0 branches: expected JSON object")
      val matches = inspectInputReference(raw)
      if (matches.size == 0) {
        throw InputReferenceNoMatchException("InputReference matched 0 branches: " + matches.failures
          .joinToString("; "))
      }
      if (matches.size > 1) {
        throw InputReferenceAmbiguityException("InputReference matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState2Matches && matches.imageUrlDecoded -> ContentPartImage(imageUrl = requireNotNull(matches
          .imageUrl), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState1Matches && matches.audioUrlDecoded -> ContentPartAudio(audioUrl = requireNotNull(matches
          .audioUrl), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState3Matches && matches.videoUrlDecoded -> ContentPartVideo(type = requireNotNull(matches
          .typeState3), videoUrl = requireNotNull(matches.videoUrl), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InputReference) {
      encoder.requireJsonEncoder("InputReference").encodeJsonElement(value.raw)
    }
  }
}

private data class InputReferenceInspection(
  public val typeState2: InlineComponentsSchemasContentPartImagePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val imageUrl: InlineComponentsSchemasContentPartImagePropertiesImageUrl?,
  public val imageUrlDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasContentPartAudioPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val audioUrl: InlineComponentsSchemasContentPartAudioPropertiesAudioUrl?,
  public val audioUrlDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasContentPartVideoPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val videoUrl: InlineComponentsSchemasContentPartVideoPropertiesVideoUrl?,
  public val videoUrlDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState2Matches && imageUrlDecoded) add("ContentPartImage")
      if (typeState1Matches && audioUrlDecoded) add("ContentPartAudio")
      if (typeState3Matches && videoUrlDecoded) add("ContentPartVideo")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInputReference(raw: JsonObject): InputReferenceInspection {
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartImagePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "image_url" && typeState2Decoded
  val imageUrlResult = raw["image_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartImagePropertiesImageUrl>(element) } }
  val imageUrl = imageUrlResult?.getOrNull()
  val imageUrlDecoded = imageUrlResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartAudioPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "audio_url" && typeState1Decoded
  val audioUrlResult = raw["audio_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartAudioPropertiesAudioUrl>(element) } }
  val audioUrl = audioUrlResult?.getOrNull()
  val audioUrlDecoded = audioUrlResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartVideoPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "video_url" && typeState3Decoded
  val videoUrlResult = raw["video_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartVideoPropertiesVideoUrl>(element) } }
  val videoUrl = videoUrlResult?.getOrNull()
  val videoUrlDecoded = videoUrlResult?.isSuccess == true
  return InputReferenceInspection(
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    imageUrl = imageUrl,
    imageUrlDecoded = imageUrlDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    audioUrl = audioUrl,
    audioUrlDecoded = audioUrlDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    videoUrl = videoUrl,
    videoUrlDecoded = videoUrlDecoded,
    failures = buildList {
      if (!typeState2Matches ||
        !imageUrlDecoded) add("ContentPartImage: required properties 'type' and 'image_url' do not match their " +
          "declared types")
      if (!typeState1Matches ||
        !audioUrlDecoded) add("ContentPartAudio: required properties 'type' and 'audio_url' do not match their " +
          "declared types")
      if (!typeState3Matches ||
        !videoUrlDecoded) add("ContentPartVideo: required properties 'type' and 'video_url' do not match their " +
          "declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
