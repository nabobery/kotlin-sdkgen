package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

public sealed class UnionDecodingException(
  message: String,
) : SerializationException(message)

public class OneOfNoMatchException(
  message: String,
) : UnionDecodingException(message)

public class OneOfAmbiguityException(
  message: String,
) : UnionDecodingException(message)

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
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw OneOfNoMatchException("ChatContent matched 0 branches: expected JSON object")
      val matches = inspectChatContent(raw)
      if (matches.size == 0) {
        throw OneOfNoMatchException("ChatContent matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw OneOfAmbiguityException("ChatContent matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.text != null -> Text(text = requireNotNull(matches.text), raw = raw)
        matches.imageUrl != null -> Image(imageUrl = requireNotNull(matches.imageUrl), raw = raw)
        matches.audioData != null && matches.format != null -> Audio(audioData = requireNotNull(matches.audioData), format = requireNotNull(matches.format), raw = raw)
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
  public val imageUrl: String?,
  public val audioData: String?,
  public val format: String?,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (text != null) add("Text")
      if (imageUrl != null) add("Image")
      if (audioData != null && format != null) add("Audio")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatContent(raw: JsonObject): ChatContentInspection {
  val text = raw.stringValue("text")
  val imageUrl = raw.stringValue("image_url")
  val audioData = raw.stringValue("audio_data")
  val format = raw.stringValue("format")
  return ChatContentInspection(
    text = text,
    imageUrl = imageUrl,
    audioData = audioData,
    format = format,
    failures = buildList {
      if (text == null) add("Text: required properties 'text' must be strings")
      if (imageUrl == null) add("Image: required properties 'image_url' must be strings")
      if (audioData == null || format == null) add("Audio: required properties 'audio_data' and 'format' must be strings")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
