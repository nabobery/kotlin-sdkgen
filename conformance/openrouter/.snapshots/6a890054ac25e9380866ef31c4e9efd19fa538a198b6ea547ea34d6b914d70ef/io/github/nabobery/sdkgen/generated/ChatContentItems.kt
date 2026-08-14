package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
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

public class ChatContentItemsBranchValidationException(
  message: String,
) : ChatContentItemsDecodingException(message)

/**
 * Content part for chat completion messages
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentItems
 */
@Serializable(with = ChatContentItemsSerializer::class)
public sealed interface ChatContentItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ChatContentText internal constructor(
    public val text: String,
    public val type: InlineChatContentTextTypeX3d55d141,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String, type: InlineChatContentTextTypeX3d55d141): ChatContentText {
        val raw = buildJsonObject {
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectChatContentItems(raw)
        if (inspection.size == 0) {
          throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatContentTextMatches) {
          throw ChatContentItemsBranchValidationException("ChatContentText factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentItemsAmbiguityException("ChatContentItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatContentText(
          text = text,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ChatContentImage internal constructor(
    public val imageUrl: InlineChatContentImageImageUrlX70dc2a4c,
    public val type: InlineChatContentImageTypeXff3cc541,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(imageUrl: InlineChatContentImageImageUrlX70dc2a4c, type: InlineChatContentImageTypeXff3cc541): ChatContentImage {
        val raw = buildJsonObject {
          put("image_url", SdkJson.encodeToJsonElement(imageUrl))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectChatContentItems(raw)
        if (inspection.size == 0) {
          throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatContentImageMatches) {
          throw ChatContentItemsBranchValidationException("ChatContentImage factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentItemsAmbiguityException("ChatContentItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatContentImage(
          imageUrl = imageUrl,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ChatContentAudio internal constructor(
    public val inputAudio: InlineChatContentAudioInputAudioX180d6f32,
    public val type: InlineChatContentAudioTypeXb902f56b,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(inputAudio: InlineChatContentAudioInputAudioX180d6f32, type: InlineChatContentAudioTypeXb902f56b): ChatContentAudio {
        val raw = buildJsonObject {
          put("input_audio", SdkJson.encodeToJsonElement(inputAudio))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectChatContentItems(raw)
        if (inspection.size == 0) {
          throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatContentAudioMatches) {
          throw ChatContentItemsBranchValidationException("ChatContentAudio factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentItemsAmbiguityException("ChatContentItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatContentAudio(
          inputAudio = inputAudio,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class LegacyChatContentVideo internal constructor(
    public val type: InlineLegacyChatContentVideoTypeX8ec04550,
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
      public fun of(type: InlineLegacyChatContentVideoTypeX8ec04550, videoUrl: LegacyChatContentVideoInput): LegacyChatContentVideo {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
          put("video_url", SdkJson.encodeToJsonElement(videoUrl))
        }
        val inspection = inspectChatContentItems(raw)
        if (inspection.size == 0) {
          throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.legacyChatContentVideoMatches) {
          throw ChatContentItemsBranchValidationException("LegacyChatContentVideo factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentItemsAmbiguityException("ChatContentItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return LegacyChatContentVideo(
          type = type,
          videoUrl = videoUrl,
          raw = raw,
        )
      }
    }
  }

  public class ChatContentVideo internal constructor(
    public val type: InlineChatContentVideoTypeXd2a2f632,
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
      public fun of(type: InlineChatContentVideoTypeXd2a2f632, videoUrl: ChatContentVideoInput): ChatContentVideo {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
          put("video_url", SdkJson.encodeToJsonElement(videoUrl))
        }
        val inspection = inspectChatContentItems(raw)
        if (inspection.size == 0) {
          throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatContentVideoMatches) {
          throw ChatContentItemsBranchValidationException("ChatContentVideo factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentItemsAmbiguityException("ChatContentItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatContentVideo(
          type = type,
          videoUrl = videoUrl,
          raw = raw,
        )
      }
    }
  }

  public class ChatContentFile internal constructor(
    public val `file`: InlineChatContentFileFileX4b8c677a,
    public val type: InlineChatContentFileTypeX2b25f967,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ChatContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(`file`: InlineChatContentFileFileX4b8c677a, type: InlineChatContentFileTypeX2b25f967): ChatContentFile {
        val raw = buildJsonObject {
          put("file", SdkJson.encodeToJsonElement(file))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectChatContentItems(raw)
        if (inspection.size == 0) {
          throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.chatContentFileMatches) {
          throw ChatContentItemsBranchValidationException("ChatContentFile factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ChatContentItemsAmbiguityException("ChatContentItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ChatContentFile(
          file = file,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object ChatContentItemsSerializer : KSerializer<ChatContentItems> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): ChatContentItems {
    val jsonDecoder = decoder.requireJsonDecoder("ChatContentItems")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: expected JSON object")
    val matches = inspectChatContentItems(rawObject)
    if (matches.size == 0) {
      throw ChatContentItemsNoMatchException("ChatContentItems matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw ChatContentItemsAmbiguityException("ChatContentItems matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.chatContentTextMatches -> ChatContentItems.ChatContentText(text = requireNotNull(matches.text), type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.chatContentImageMatches -> ChatContentItems.ChatContentImage(imageUrl = requireNotNull(matches.imageUrl), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.chatContentAudioMatches -> ChatContentItems.ChatContentAudio(inputAudio = requireNotNull(matches.inputAudio), type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.legacyChatContentVideoMatches -> ChatContentItems.LegacyChatContentVideo(type = requireNotNull(matches.typeState11), videoUrl = requireNotNull(matches.videoUrlState2), raw = rawObject)
      matches.chatContentVideoMatches -> ChatContentItems.ChatContentVideo(type = requireNotNull(matches.typeState9), videoUrl = requireNotNull(matches.videoUrlState1), raw = rawObject)
      matches.chatContentFileMatches -> ChatContentItems.ChatContentFile(file = requireNotNull(matches.file), type = requireNotNull(matches.typeState3), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: ChatContentItems) {
    encoder.requireJsonEncoder("ChatContentItems").encodeJsonElement(value.raw)
  }
}

internal data class ChatContentItemsInspection(
  public val typeState7: InlineChatContentTextTypeX3d55d141?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState8: InlineChatContentTextTypeX3d55d141?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val typeState5: InlineChatContentImageTypeXff3cc541?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val imageUrl: InlineChatContentImageImageUrlX70dc2a4c?,
  public val imageUrlDecoded: Boolean,
  public val typeState6: InlineChatContentImageTypeXff3cc541?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState1: InlineChatContentAudioTypeXb902f56b?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val inputAudio: InlineChatContentAudioInputAudioX180d6f32?,
  public val inputAudioDecoded: Boolean,
  public val typeState2: InlineChatContentAudioTypeXb902f56b?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val typeState11: InlineLegacyChatContentVideoTypeX8ec04550?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val typeState12: InlineLegacyChatContentVideoTypeX8ec04550?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val videoUrlState2: LegacyChatContentVideoInput?,
  public val videoUrlState2Decoded: Boolean,
  public val typeState9: InlineChatContentVideoTypeXd2a2f632?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val typeState10: InlineChatContentVideoTypeXd2a2f632?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val videoUrlState1: ChatContentVideoInput?,
  public val videoUrlState1Decoded: Boolean,
  public val typeState3: InlineChatContentFileTypeX2b25f967?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val `file`: InlineChatContentFileFileX4b8c677a?,
  public val fileDecoded: Boolean,
  public val typeState4: InlineChatContentFileTypeX2b25f967?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val chatContentTextMatches: Boolean,
  public val chatContentImageMatches: Boolean,
  public val chatContentAudioMatches: Boolean,
  public val legacyChatContentVideoMatches: Boolean,
  public val chatContentVideoMatches: Boolean,
  public val chatContentFileMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (chatContentTextMatches) add("ChatContentText")
      if (chatContentImageMatches) add("ChatContentImage")
      if (chatContentAudioMatches) add("ChatContentAudio")
      if (legacyChatContentVideoMatches) add("LegacyChatContentVideo")
      if (chatContentVideoMatches) add("ChatContentVideo")
      if (chatContentFileMatches) add("ChatContentFile")
    }

  public val size: Int
    get() = names.size
}

private fun inspectChatContentItems(rawObject: JsonObject): ChatContentItemsInspection {
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentTextTypeX3d55d141>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "text") && typeState7Decoded
  val textResult = rawObject["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentTextTypeX3d55d141>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "text") && typeState8Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentImageTypeXff3cc541>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "image_url") && typeState5Decoded
  val imageUrlResult = rawObject["image_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentImageImageUrlX70dc2a4c>(element) } }
  val imageUrl = imageUrlResult?.getOrNull()
  val imageUrlDecoded = imageUrlResult?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentImageTypeXff3cc541>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "image_url") && typeState6Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentAudioTypeXb902f56b>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "input_audio") && typeState1Decoded
  val inputAudioResult = rawObject["input_audio"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentAudioInputAudioX180d6f32>(element) } }
  val inputAudio = inputAudioResult?.getOrNull()
  val inputAudioDecoded = inputAudioResult?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentAudioTypeXb902f56b>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "input_audio") && typeState2Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineLegacyChatContentVideoTypeX8ec04550>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "input_video") && typeState11Decoded
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineLegacyChatContentVideoTypeX8ec04550>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "input_video") && typeState12Decoded
  val videoUrlState2Result = rawObject["video_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<LegacyChatContentVideoInput>(element) } }
  val videoUrlState2 = videoUrlState2Result?.getOrNull()
  val videoUrlState2Decoded = videoUrlState2Result?.isSuccess == true
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentVideoTypeXd2a2f632>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "video_url") && typeState9Decoded
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentVideoTypeXd2a2f632>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "video_url") && typeState10Decoded
  val videoUrlState1Result = rawObject["video_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ChatContentVideoInput>(element) } }
  val videoUrlState1 = videoUrlState1Result?.getOrNull()
  val videoUrlState1Decoded = videoUrlState1Result?.isSuccess == true
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentFileTypeX2b25f967>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "file") && typeState3Decoded
  val fileResult = rawObject["file"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentFileFileX4b8c677a>(element) } }
  val file = fileResult?.getOrNull()
  val fileDecoded = fileResult?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineChatContentFileTypeX2b25f967>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "file") && typeState4Decoded
  val rawEmpty = rawObject.isEmpty()
  val chatContentTextMatches = matchesChatContentItemsChatContentTextBranch(rawObject) && (typeState7Matches)
  val chatContentImageMatches = matchesChatContentItemsChatContentImageBranch(rawObject) && (typeState5Matches)
  val chatContentAudioMatches = matchesChatContentItemsChatContentAudioBranch(rawObject) && (typeState1Matches)
  val legacyChatContentVideoMatches = matchesChatContentItemsLegacyChatContentVideoBranch(rawObject) && (typeState11Matches)
  val chatContentVideoMatches = matchesChatContentItemsChatContentVideoBranch(rawObject) && (typeState9Matches)
  val chatContentFileMatches = matchesChatContentItemsChatContentFileBranch(rawObject) && (typeState3Matches)
  return ChatContentItemsInspection(
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    text = text,
    textDecoded = textDecoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    imageUrl = imageUrl,
    imageUrlDecoded = imageUrlDecoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    inputAudio = inputAudio,
    inputAudioDecoded = inputAudioDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    videoUrlState2 = videoUrlState2,
    videoUrlState2Decoded = videoUrlState2Decoded,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    videoUrlState1 = videoUrlState1,
    videoUrlState1Decoded = videoUrlState1Decoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    file = file,
    fileDecoded = fileDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    chatContentTextMatches = chatContentTextMatches,
    chatContentImageMatches = chatContentImageMatches,
    chatContentAudioMatches = chatContentAudioMatches,
    legacyChatContentVideoMatches = legacyChatContentVideoMatches,
    chatContentVideoMatches = chatContentVideoMatches,
    chatContentFileMatches = chatContentFileMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!chatContentTextMatches) add("ChatContentText: branch predicate did not match properties 'type'")
      if (!chatContentImageMatches) add("ChatContentImage: branch predicate did not match properties 'type'")
      if (!chatContentAudioMatches) add("ChatContentAudio: branch predicate did not match properties 'type'")
      if (!legacyChatContentVideoMatches) add("LegacyChatContentVideo: branch predicate did not match properties 'type'")
      if (!chatContentVideoMatches) add("ChatContentVideo: branch predicate did not match properties 'type'")
      if (!chatContentFileMatches) add("ChatContentFile: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesChatContentItemsChatContentTextBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("text") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cache_control"]?.let { property -> ((property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("type") && ((property as JsonObject)["ttl"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"5m\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"1h\"")))) } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ephemeral\"")))) } ?: true)))) && property is JsonObject) } ?: true) && ((rawObject as JsonObject)["prompt_cache_breakpoint"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("mode") && ((property as JsonObject)["mode"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"explicit\"")))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"text\"")))) } ?: true))))

private fun matchesChatContentItemsChatContentImageBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("image_url") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["image_url"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("url") && ((property as JsonObject)["detail"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"original\"")))) } ?: true) && ((property as JsonObject)["url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_url\"")))) } ?: true))))

private fun matchesChatContentItemsChatContentAudioBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("input_audio") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["input_audio"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("data") && (property as JsonObject).containsKey("format") && ((property as JsonObject)["data"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["format"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"input_audio\"")))) } ?: true))))

private fun matchesChatContentItemsLegacyChatContentVideoBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && (rawObject as JsonObject).containsKey("video_url") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"input_video\"")))) } ?: true) && ((rawObject as JsonObject)["video_url"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("url") && ((property as JsonObject)["url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true))))

private fun matchesChatContentItemsChatContentVideoBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && (rawObject as JsonObject).containsKey("video_url") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"video_url\"")))) } ?: true) && ((rawObject as JsonObject)["video_url"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("url") && ((property as JsonObject)["url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true))))

private fun matchesChatContentItemsChatContentFileBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("file") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["file"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["file_data"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["file_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["filename"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"file\"")))) } ?: true))))

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
