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

public sealed class InlineComponentsSchemasInputMessageItemPropertiesContentItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasInputMessageItemPropertiesContentItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasInputMessageItemPropertiesContentItemsDecodingException(message)

public class InlineComponentsSchemasInputMessageItemPropertiesContentItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasInputMessageItemPropertiesContentItemsDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/content/items.
 */
@Serializable(with = InlineComponentsSchemasInputMessageItemPropertiesContentItems.Serializer::class)
public sealed interface InlineComponentsSchemasInputMessageItemPropertiesContentItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InputText internal constructor(
    public val text: String,
    public val type: InlineComponentsSchemasInputTextPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String, type: InlineComponentsSchemasInputTextPropertiesType): InputText = InputText(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasInputMessageItemPropertiesContentItemsOneOf1 internal constructor(
    public val detail: InlineComponentsSchemasInputImagePropertiesDetail,
    public val type: InlineComponentsSchemasInputImagePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(detail: InlineComponentsSchemasInputImagePropertiesDetail,
        type: InlineComponentsSchemasInputImagePropertiesType): InlineComponentsSchemasInputMessageItemPropertiesContentItemsOneOf1 = InlineComponentsSchemasInputMessageItemPropertiesContentItemsOneOf1(
        detail = detail,
        type = type,
        raw = buildJsonObject {
          put("detail", SdkJson.encodeToJsonElement(detail))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InputFile internal constructor(
    public val type: InlineComponentsSchemasInputFilePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasInputFilePropertiesType): InputFile = InputFile(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InputAudio internal constructor(
    public val inputAudio: InlineComponentsSchemasInputAudioPropertiesInputAudio,
    public val type: InlineComponentsSchemasInputAudioPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(inputAudio: InlineComponentsSchemasInputAudioPropertiesInputAudio,
        type: InlineComponentsSchemasInputAudioPropertiesType): InputAudio = InputAudio(
        inputAudio = inputAudio,
        type = type,
        raw = buildJsonObject {
          put("input_audio", SdkJson.encodeToJsonElement(inputAudio))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InputVideo internal constructor(
    public val type: InlineComponentsSchemasInputVideoPropertiesType,
    public val videoUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasInputVideoPropertiesType, videoUrl: String): InputVideo = InputVideo(
        type = type,
        videoUrl = videoUrl,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
          put("video_url", videoUrl)
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputMessageItemPropertiesContentItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputMessageItemPropertiesContentItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasInputMessageItemPropertiesContentItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasInputMessageItemPropertiesContentItemsNoMatchException("InlineComponentsSchemasInputMessageItemPropertiesContentItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasInputMessageItemPropertiesContentItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasInputMessageItemPropertiesContentItemsNoMatchException("InlineComponentsSchemasInputMessageItemPropertiesContentItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasInputMessageItemPropertiesContentItemsAmbiguityException("InlineComponentsSchemasInputMessageItemPropertiesContentItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.textDecoded && matches.typeState4Decoded -> InputText(text = requireNotNull(matches.text), type =
          requireNotNull(matches.typeState4), raw = raw)
        matches.detailDecoded && matches.typeState3Decoded ->
          InlineComponentsSchemasInputMessageItemPropertiesContentItemsOneOf1(detail = requireNotNull(matches.detail),
            type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState2Decoded -> InputFile(type = requireNotNull(matches.typeState2), raw = raw)
        matches.inputAudioDecoded && matches.typeState1Decoded -> InputAudio(inputAudio = requireNotNull(matches
          .inputAudio), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState5Decoded && matches.videoUrlDecoded -> InputVideo(type = requireNotNull(matches.typeState5),
          videoUrl = requireNotNull(matches.videoUrl), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputMessageItemPropertiesContentItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasInputMessageItemPropertiesContentItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasInputMessageItemPropertiesContentItemsInspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState4: InlineComponentsSchemasInputTextPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val detail: InlineComponentsSchemasInputImagePropertiesDetail?,
  public val detailDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasInputImagePropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState2: InlineComponentsSchemasInputFilePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val inputAudio: InlineComponentsSchemasInputAudioPropertiesInputAudio?,
  public val inputAudioDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasInputAudioPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState5: InlineComponentsSchemasInputVideoPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val videoUrl: String?,
  public val videoUrlDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (textDecoded && typeState4Decoded) add("InputText")
      if (detailDecoded && typeState3Decoded) add("InlineComponentsSchemasInputMessageItemPropertiesContentItemsOneOf1")
      if (typeState2Decoded) add("InputFile")
      if (inputAudioDecoded && typeState1Decoded) add("InputAudio")
      if (typeState5Decoded && videoUrlDecoded) add("InputVideo")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasInputMessageItemPropertiesContentItems(raw: JsonObject): InlineComponentsSchemasInputMessageItemPropertiesContentItemsInspection {
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputTextPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val detailResult = raw["detail"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesDetail>(element) } }
  val detail = detailResult?.getOrNull()
  val detailDecoded = detailResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputFilePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val inputAudioResult = raw["input_audio"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputAudioPropertiesInputAudio>(element) } }
  val inputAudio = inputAudioResult?.getOrNull()
  val inputAudioDecoded = inputAudioResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputAudioPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputVideoPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val videoUrlResult = raw["video_url"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val videoUrl = videoUrlResult?.getOrNull()
  val videoUrlDecoded = videoUrlResult?.isSuccess == true
  return InlineComponentsSchemasInputMessageItemPropertiesContentItemsInspection(
    text = text,
    textDecoded = textDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    detail = detail,
    detailDecoded = detailDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    inputAudio = inputAudio,
    inputAudioDecoded = inputAudioDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    videoUrl = videoUrl,
    videoUrlDecoded = videoUrlDecoded,
    failures = buildList {
      if (!textDecoded ||
        !typeState4Decoded) add("InputText: required properties 'text' and 'type' do not match their declared types")
      if (!detailDecoded ||
        !typeState3Decoded) add("InlineComponentsSchemasInputMessageItemPropertiesContentItemsOneOf1: required " +
          "properties 'detail' and 'type' do not match their declared types")
      if (!typeState2Decoded) add("InputFile: required properties 'type' do not match their declared types")
      if (!inputAudioDecoded ||
        !typeState1Decoded) add("InputAudio: required properties 'input_audio' and 'type' do not match their declared " +
          "types")
      if (!typeState5Decoded ||
        !videoUrlDecoded) add("InputVideo: required properties 'type' and 'video_url' do not match their declared " +
          "types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
