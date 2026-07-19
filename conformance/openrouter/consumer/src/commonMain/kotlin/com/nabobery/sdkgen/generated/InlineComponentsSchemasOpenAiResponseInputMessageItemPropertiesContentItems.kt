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

public sealed class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsDecodingException(message)

public class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/content/items.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems.Serializer::class)
public sealed interface InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems {
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
  ) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String, type: InlineComponentsSchemasInputTextPropertiesType): InputText = InputText(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", "input_text")
        },
      )
    }
  }

  public class InputImage internal constructor(
    public val detail: InlineComponentsSchemasInputImagePropertiesDetail,
    public val type: InlineComponentsSchemasInputImagePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(detail: InlineComponentsSchemasInputImagePropertiesDetail,
        type: InlineComponentsSchemasInputImagePropertiesType): InputImage = InputImage(
        detail = detail,
        type = type,
        raw = buildJsonObject {
          put("detail", SdkJson.encodeToJsonElement(detail))
          put("type", "input_image")
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
  ) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasInputFilePropertiesType): InputFile = InputFile(
        type = type,
        raw = buildJsonObject {
          put("type", "input_file")
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
  ) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems {
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
          put("type", "input_audio")
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsNoMatchException("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsNoMatchException("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsAmbiguityException("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState4Matches && matches.textDecoded -> InputText(text = requireNotNull(matches.text), type =
          requireNotNull(matches.typeState4), raw = raw)
        matches.typeState3Matches && matches.detailDecoded -> InputImage(detail = requireNotNull(matches.detail),
          type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState2Matches -> InputFile(type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState1Matches && matches.inputAudioDecoded -> InputAudio(inputAudio = requireNotNull(matches
          .inputAudio), type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsInspection(
  public val typeState4: InlineComponentsSchemasInputTextPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasInputImagePropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val detail: InlineComponentsSchemasInputImagePropertiesDetail?,
  public val detailDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasInputFilePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val typeState1: InlineComponentsSchemasInputAudioPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val inputAudio: InlineComponentsSchemasInputAudioPropertiesInputAudio?,
  public val inputAudioDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState4Matches && textDecoded) add("InputText")
      if (typeState3Matches && detailDecoded) add("InputImage")
      if (typeState2Matches) add("InputFile")
      if (typeState1Matches && inputAudioDecoded) add("InputAudio")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItems(raw: JsonObject): InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsInspection {
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputTextPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "input_text" && typeState4Decoded
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "input_image" && typeState3Decoded
  val detailResult = raw["detail"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesDetail>(element) } }
  val detail = detailResult?.getOrNull()
  val detailDecoded = detailResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputFilePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "input_file" && typeState2Decoded
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputAudioPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "input_audio" && typeState1Decoded
  val inputAudioResult = raw["input_audio"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputAudioPropertiesInputAudio>(element) } }
  val inputAudio = inputAudioResult?.getOrNull()
  val inputAudioDecoded = inputAudioResult?.isSuccess == true
  return InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesContentItemsInspection(
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    text = text,
    textDecoded = textDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    detail = detail,
    detailDecoded = detailDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    inputAudio = inputAudio,
    inputAudioDecoded = inputAudioDecoded,
    failures = buildList {
      if (!typeState4Matches ||
        !textDecoded) add("InputText: required properties 'type' and 'text' do not match their declared types")
      if (!typeState3Matches ||
        !detailDecoded) add("InputImage: required properties 'type' and 'detail' do not match their declared types")
      if (!typeState2Matches) add("InputFile: required properties 'type' do not match their declared types")
      if (!typeState1Matches ||
        !inputAudioDecoded) add("InputAudio: required properties 'type' and 'input_audio' do not match their declared " +
          "types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
