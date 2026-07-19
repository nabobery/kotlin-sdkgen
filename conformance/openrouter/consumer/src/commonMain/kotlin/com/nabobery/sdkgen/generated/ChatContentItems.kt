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

public sealed class ChatContentItemsDecodingException(
  message: String,
) : SerializationException(message)

public class ChatContentItemsNoMatchException(
  message: String,
) : ChatContentItemsDecodingException(message)

public class ChatContentItemsAmbiguityException(
  message: String,
) : ChatContentItemsDecodingException(message)

/**
 * Content part for chat completion messages
 */
@Serializable(with = ChatContentItems.Serializer::class)
public sealed interface ChatContentItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ChatContentText internal constructor(
    public val text: String,
    public val type: InlineComponentsSchemasChatContentTextPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String, type: InlineComponentsSchemasChatContentTextPropertiesType): ChatContentText =
        ChatContentText(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", "text")
        },
      )
    }
  }

  public class ChatContentImage internal constructor(
    public val imageUrl: InlineComponentsSchemasChatContentImagePropertiesImageUrl,
    public val type: InlineComponentsSchemasChatContentImagePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(imageUrl: InlineComponentsSchemasChatContentImagePropertiesImageUrl,
        type: InlineComponentsSchemasChatContentImagePropertiesType): ChatContentImage = ChatContentImage(
        imageUrl = imageUrl,
        type = type,
        raw = buildJsonObject {
          put("image_url", SdkJson.encodeToJsonElement(imageUrl))
          put("type", "image_url")
        },
      )
    }
  }

  public class ChatContentAudio internal constructor(
    public val inputAudio: InlineComponentsSchemasChatContentAudioPropertiesInputAudio,
    public val type: InlineComponentsSchemasChatContentAudioPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(inputAudio: InlineComponentsSchemasChatContentAudioPropertiesInputAudio,
        type: InlineComponentsSchemasChatContentAudioPropertiesType): ChatContentAudio = ChatContentAudio(
        inputAudio = inputAudio,
        type = type,
        raw = buildJsonObject {
          put("input_audio", SdkJson.encodeToJsonElement(inputAudio))
          put("type", "input_audio")
        },
      )
    }
  }

  public class LegacyChatContentVideo internal constructor(
    public val type: InlineComponentsSchemasLegacyChatContentVideoPropertiesType,
    public val videoUrl: LegacyChatContentVideoInput,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasLegacyChatContentVideoPropertiesType,
        videoUrl: LegacyChatContentVideoInput): LegacyChatContentVideo = LegacyChatContentVideo(
        type = type,
        videoUrl = videoUrl,
        raw = buildJsonObject {
          put("type", "input_video")
          put("video_url", SdkJson.encodeToJsonElement(videoUrl))
        },
      )
    }
  }

  public class ChatContentVideo internal constructor(
    public val type: InlineComponentsSchemasChatContentVideoPropertiesType,
    public val videoUrl: ChatContentVideoInput,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasChatContentVideoPropertiesType,
        videoUrl: ChatContentVideoInput): ChatContentVideo = ChatContentVideo(
        type = type,
        videoUrl = videoUrl,
        raw = buildJsonObject {
          put("type", "video_url")
          put("video_url", SdkJson.encodeToJsonElement(videoUrl))
        },
      )
    }
  }

  public class ChatContentFile internal constructor(
    public val `file`: InlineComponentsSchemasChatContentFilePropertiesFile,
    public val type: InlineComponentsSchemasChatContentFilePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(`file`: InlineComponentsSchemasChatContentFilePropertiesFile,
        type: InlineComponentsSchemasChatContentFilePropertiesType): ChatContentFile = ChatContentFile(
        file = file,
        type = type,
        raw = buildJsonObject {
          put("file", SdkJson.encodeToJsonElement(file))
          put("type", "file")
        },
      )
    }
  }

  public object Serializer : KSerializer<ChatContentItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentItems {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: expected JSON object")
      val matches = inspectChatContentItems(raw)
      if (matches.size == 0) {
        throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + matches.failures
          .joinToString("; "))
      }
      if (matches.size > 1) {
        throw ChatContentItemsAmbiguityException("ChatContentItems matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState4Matches && matches.textDecoded -> ChatContentText(text = requireNotNull(matches.text), type =
          requireNotNull(matches.typeState4), raw = raw)
        matches.typeState3Matches && matches.imageUrlDecoded -> ChatContentImage(imageUrl = requireNotNull(matches
          .imageUrl), type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState1Matches && matches.inputAudioDecoded -> ChatContentAudio(inputAudio = requireNotNull(matches
          .inputAudio), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState6Matches && matches.videoUrlState2Decoded -> LegacyChatContentVideo(type =
          requireNotNull(matches.typeState6), videoUrl = requireNotNull(matches.videoUrlState2), raw = raw)
        matches.typeState5Matches && matches.videoUrlState1Decoded -> ChatContentVideo(type = requireNotNull(matches
          .typeState5), videoUrl = requireNotNull(matches.videoUrlState1), raw = raw)
        matches.typeState2Matches && matches.fileDecoded -> ChatContentFile(file = requireNotNull(matches.file), type =
          requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentItems) {
      encoder.requireJsonEncoder("ChatContentItems").encodeJsonElement(value.raw)
    }
  }
}

private data class ChatContentItemsInspection(
  public val typeState4: InlineComponentsSchemasChatContentTextPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasChatContentImagePropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val imageUrl: InlineComponentsSchemasChatContentImagePropertiesImageUrl?,
  public val imageUrlDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasChatContentAudioPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val inputAudio: InlineComponentsSchemasChatContentAudioPropertiesInputAudio?,
  public val inputAudioDecoded: Boolean,
  public val typeState6: InlineComponentsSchemasLegacyChatContentVideoPropertiesType?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val videoUrlState2: LegacyChatContentVideoInput?,
  public val videoUrlState2Decoded: Boolean,
  public val typeState5: InlineComponentsSchemasChatContentVideoPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val videoUrlState1: ChatContentVideoInput?,
  public val videoUrlState1Decoded: Boolean,
  public val typeState2: InlineComponentsSchemasChatContentFilePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val `file`: InlineComponentsSchemasChatContentFilePropertiesFile?,
  public val fileDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState4Matches && textDecoded) add("ChatContentText")
      if (typeState3Matches && imageUrlDecoded) add("ChatContentImage")
      if (typeState1Matches && inputAudioDecoded) add("ChatContentAudio")
      if (typeState6Matches && videoUrlState2Decoded) add("LegacyChatContentVideo")
      if (typeState5Matches && videoUrlState1Decoded) add("ChatContentVideo")
      if (typeState2Matches && fileDecoded) add("ChatContentFile")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatContentItems(raw: JsonObject): ChatContentItemsInspection {
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentTextPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "text" && typeState4Decoded
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentImagePropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "image_url" && typeState3Decoded
  val imageUrlResult = raw["image_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentImagePropertiesImageUrl>(element) } }
  val imageUrl = imageUrlResult?.getOrNull()
  val imageUrlDecoded = imageUrlResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentAudioPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "input_audio" && typeState1Decoded
  val inputAudioResult = raw["input_audio"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentAudioPropertiesInputAudio>(element) } }
  val inputAudio = inputAudioResult?.getOrNull()
  val inputAudioDecoded = inputAudioResult?.isSuccess == true
  val typeState6Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasLegacyChatContentVideoPropertiesType>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = raw.stringValue("type") == "input_video" && typeState6Decoded
  val videoUrlState2Result = raw["video_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<LegacyChatContentVideoInput>(element) } }
  val videoUrlState2 = videoUrlState2Result?.getOrNull()
  val videoUrlState2Decoded = videoUrlState2Result?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentVideoPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = raw.stringValue("type") == "video_url" && typeState5Decoded
  val videoUrlState1Result = raw["video_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<ChatContentVideoInput>(element) } }
  val videoUrlState1 = videoUrlState1Result?.getOrNull()
  val videoUrlState1Decoded = videoUrlState1Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentFilePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "file" && typeState2Decoded
  val fileResult = raw["file"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatContentFilePropertiesFile>(element) } }
  val file = fileResult?.getOrNull()
  val fileDecoded = fileResult?.isSuccess == true
  return ChatContentItemsInspection(
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    text = text,
    textDecoded = textDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    imageUrl = imageUrl,
    imageUrlDecoded = imageUrlDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    inputAudio = inputAudio,
    inputAudioDecoded = inputAudioDecoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    videoUrlState2 = videoUrlState2,
    videoUrlState2Decoded = videoUrlState2Decoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    videoUrlState1 = videoUrlState1,
    videoUrlState1Decoded = videoUrlState1Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    file = file,
    fileDecoded = fileDecoded,
    failures = buildList {
      if (!typeState4Matches ||
        !textDecoded) add("ChatContentText: required properties 'type' and 'text' do not match their declared types")
      if (!typeState3Matches ||
        !imageUrlDecoded) add("ChatContentImage: required properties 'type' and 'image_url' do not match their " +
          "declared types")
      if (!typeState1Matches ||
        !inputAudioDecoded) add("ChatContentAudio: required properties 'type' and 'input_audio' do not match their " +
          "declared types")
      if (!typeState6Matches ||
        !videoUrlState2Decoded) add("LegacyChatContentVideo: required properties 'type' and 'video_url' do not match " +
          "their declared types")
      if (!typeState5Matches ||
        !videoUrlState1Decoded) add("ChatContentVideo: required properties 'type' and 'video_url' do not match their " +
          "declared types")
      if (!typeState2Matches ||
        !fileDecoded) add("ChatContentFile: required properties 'type' and 'file' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
