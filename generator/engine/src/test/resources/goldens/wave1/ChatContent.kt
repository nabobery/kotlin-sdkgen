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
import kotlinx.serialization.json.put

public sealed class ChatContentDecodingException(
  message: String,
) : SerializationException(message)

public class ChatContentNoMatchException(
  message: String,
) : ChatContentDecodingException(message)

public class ChatContentAmbiguityException(
  message: String,
) : ChatContentDecodingException(message)

public class ChatContentBranchValidationException(
  message: String,
) : ChatContentDecodingException(message)

/**
 * Closed non-discriminated oneOf. Exactly one branch must structurally match.
 */
@Serializable(with = ChatContentSerializer::class)
public sealed interface ChatContent {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class Text internal constructor(
    public val text: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String): Text {
        val raw = buildJsonObject {
          put("text", text)
        }
        val inspection = inspectChatContent(raw)
        if (inspection.size == 0) {
          throw ChatContentNoMatchException("ChatContent matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.textMatches) {
          throw ChatContentBranchValidationException("Text factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentAmbiguityException("ChatContent matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return Text(
          text = text,
          raw = raw,
        )
      }
    }
  }

  public class Image internal constructor(
    public val imageUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(imageUrl: String): Image {
        val raw = buildJsonObject {
          put("image_url", imageUrl)
        }
        val inspection = inspectChatContent(raw)
        if (inspection.size == 0) {
          throw ChatContentNoMatchException("ChatContent matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.imageMatches) {
          throw ChatContentBranchValidationException("Image factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentAmbiguityException("ChatContent matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return Image(
          imageUrl = imageUrl,
          raw = raw,
        )
      }
    }
  }

  public class Audio internal constructor(
    public val audioData: String,
    public val format: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContent {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(audioData: String, format: String): Audio {
        val raw = buildJsonObject {
          put("audio_data", audioData)
          put("format", format)
        }
        val inspection = inspectChatContent(raw)
        if (inspection.size == 0) {
          throw ChatContentNoMatchException("ChatContent matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.audioMatches) {
          throw ChatContentBranchValidationException("Audio factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentAmbiguityException("ChatContent matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return Audio(
          audioData = audioData,
          format = format,
          raw = raw,
        )
      }
    }
  }
}

internal object ChatContentSerializer : KSerializer<ChatContent> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): ChatContent {
    val jsonDecoder = decoder.requireJsonDecoder("ChatContent")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw ChatContentNoMatchException("ChatContent matched 0 branches: expected JSON object")
    val matches = inspectChatContent(rawObject)
    if (matches.size == 0) {
      throw ChatContentNoMatchException("ChatContent matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw ChatContentAmbiguityException("ChatContent matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.textMatches -> ChatContent.Text(text = requireNotNull(matches.text), raw = rawObject)
      matches.imageMatches -> ChatContent.Image(imageUrl = requireNotNull(matches.imageUrl), raw = rawObject)
      matches.audioMatches -> ChatContent.Audio(audioData = requireNotNull(matches.audioData), format = requireNotNull(matches.format), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: ChatContent) {
    encoder.requireJsonEncoder("ChatContent").encodeJsonElement(value.raw)
  }
}

internal data class ChatContentInspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val imageUrl: String?,
  public val imageUrlDecoded: Boolean,
  public val audioData: String?,
  public val audioDataDecoded: Boolean,
  public val format: String?,
  public val formatDecoded: Boolean,
  public val textMatches: Boolean,
  public val imageMatches: Boolean,
  public val audioMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (textMatches) add("Text")
      if (imageMatches) add("Image")
      if (audioMatches) add("Audio")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatContent(rawObject: JsonObject): ChatContentInspection {
  val textResult = rawObject["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val imageUrlResult = rawObject["image_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val imageUrl = imageUrlResult?.getOrNull()
  val imageUrlDecoded = imageUrlResult?.isSuccess == true
  val audioDataResult = rawObject["audio_data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val audioData = audioDataResult?.getOrNull()
  val audioDataDecoded = audioDataResult?.isSuccess == true
  val formatResult = rawObject["format"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val format = formatResult?.getOrNull()
  val formatDecoded = formatResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val textMatches = textDecoded
  val imageMatches = imageUrlDecoded
  val audioMatches = audioDataDecoded && formatDecoded
  return ChatContentInspection(
    text = text,
    textDecoded = textDecoded,
    imageUrl = imageUrl,
    imageUrlDecoded = imageUrlDecoded,
    audioData = audioData,
    audioDataDecoded = audioDataDecoded,
    format = format,
    formatDecoded = formatDecoded,
    textMatches = textMatches,
    imageMatches = imageMatches,
    audioMatches = audioMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!textMatches) add("Text: branch predicate did not match properties 'text'")
      if (!imageMatches) add("Image: branch predicate did not match properties 'image_url'")
      if (!audioMatches) add("Audio: branch predicate did not match properties 'audio_data' and 'format'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
