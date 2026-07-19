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

/**
 * Closed non-discriminated oneOf. Exactly one branch must structurally match.
 */
@Serializable(with = ChatContent.Serializer::class)
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
      public fun of(text: String): Text = Text(
        text = text,
        raw = buildJsonObject {
          put("text", text)
        },
      )
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
      public fun of(imageUrl: String): Image = Image(
        imageUrl = imageUrl,
        raw = buildJsonObject {
          put("image_url", imageUrl)
        },
      )
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
      public fun of(audioData: String, format: String): Audio = Audio(
        audioData = audioData,
        format = format,
        raw = buildJsonObject {
          put("audio_data", audioData)
          put("format", format)
        },
      )
    }
  }

  public object Serializer : KSerializer<ChatContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContent {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContent")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw ChatContentNoMatchException("ChatContent matched 0 branches: expected JSON object")
      val matches = inspectChatContent(raw)
      if (matches.size == 0) {
        throw ChatContentNoMatchException("ChatContent matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw ChatContentAmbiguityException("ChatContent matched " + matches.size + " branches; expected exactly 1: " +
          matches.names.joinToString())
      }
      return when {
        matches.textDecoded -> Text(text = requireNotNull(matches.text), raw = raw)
        matches.imageUrlDecoded -> Image(imageUrl = requireNotNull(matches.imageUrl), raw = raw)
        matches.audioDataDecoded && matches.formatDecoded -> Audio(audioData = requireNotNull(matches.audioData),
          format = requireNotNull(matches.format), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: ChatContent) {
      encoder.requireJsonEncoder("ChatContent").encodeJsonElement(value.raw)
    }
  }
}

private data class ChatContentInspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val imageUrl: String?,
  public val imageUrlDecoded: Boolean,
  public val audioData: String?,
  public val audioDataDecoded: Boolean,
  public val format: String?,
  public val formatDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (textDecoded) add("Text")
      if (imageUrlDecoded) add("Image")
      if (audioDataDecoded && formatDecoded) add("Audio")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatContent(raw: JsonObject): ChatContentInspection {
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val imageUrlResult = raw["image_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val imageUrl = imageUrlResult?.getOrNull()
  val imageUrlDecoded = imageUrlResult?.isSuccess == true
  val audioDataResult = raw["audio_data"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val audioData = audioDataResult?.getOrNull()
  val audioDataDecoded = audioDataResult?.isSuccess == true
  val formatResult = raw["format"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val format = formatResult?.getOrNull()
  val formatDecoded = formatResult?.isSuccess == true
  return ChatContentInspection(
    text = text,
    textDecoded = textDecoded,
    imageUrl = imageUrl,
    imageUrlDecoded = imageUrlDecoded,
    audioData = audioData,
    audioDataDecoded = audioDataDecoded,
    format = format,
    formatDecoded = formatDecoded,
    failures = buildList {
      if (!textDecoded) add("Text: required properties 'text' do not match their declared types")
      if (!imageUrlDecoded) add("Image: required properties 'image_url' do not match their declared types")
      if (!audioDataDecoded ||
        !formatDecoded) add("Audio: required properties 'audio_data' and 'format' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
